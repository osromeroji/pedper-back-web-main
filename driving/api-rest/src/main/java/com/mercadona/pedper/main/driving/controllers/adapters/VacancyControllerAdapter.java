package com.mercadona.pedper.main.driving.controllers.adapters;

import com.mercadona.pedper.main.api.dto.ExampleResourceResponseDTO;
import com.mercadona.pedper.main.api.dto.VacancyResourceDTO;
import com.mercadona.pedper.main.api.dto.VacancyResourceResponseDTO;
import com.mercadona.pedper.main.application.ports.driving.VacancyServicePort;
import com.mercadona.pedper.main.driving.controllers.mappers.VacancyMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping
@Slf4j
public class VacancyControllerAdapter implements VacanciesApi{
  private final VacancyServicePort vacancyServicePort;
  private final VacancyMapper vacancyMapper;

  @Override
  public ResponseEntity<ExampleResourceResponseDTO> createVacancy(VacancyResourceDTO vacancyResourceDTO) {
    var vacancy = vacancyMapper.toVacancy(vacancyResourceDTO);

    vacancyServicePort.createVacancy(vacancy);

    return new ResponseEntity<>(HttpStatus.CREATED);
  }

  @Override
  public ResponseEntity<VacancyResourceResponseDTO> getVacancy(Long id) {
    var vacancyResponse = vacancyServicePort.getVacancy(id);

    return ResponseEntity.ok(VacancyResourceResponseDTO
      .builder()
      .data(vacancyMapper.toVacancyResourceDTO(vacancyResponse))
      .build());
  }
}
