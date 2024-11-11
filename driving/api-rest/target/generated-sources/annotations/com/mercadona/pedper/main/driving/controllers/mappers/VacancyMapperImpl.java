package com.mercadona.pedper.main.driving.controllers.mappers;

import com.mercadona.pedper.main.api.dto.CandidateResourceDTO;
import com.mercadona.pedper.main.api.dto.VacancyCandidateResourceDTO;
import com.mercadona.pedper.main.api.dto.VacancyResourceDTO;
import com.mercadona.pedper.main.domain.Employee;
import com.mercadona.pedper.main.domain.Vacancy;
import com.mercadona.pedper.main.domain.VacancyCandidate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-10T17:45:04+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.3 (Homebrew)"
)
@Component
public class VacancyMapperImpl implements VacancyMapper {

    @Override
    public VacancyResourceDTO toVacancyResourceDTO(Vacancy vacancy) {
        if ( vacancy == null ) {
            return null;
        }

        VacancyResourceDTO.VacancyResourceDTOBuilder vacancyResourceDTO = VacancyResourceDTO.builder();

        vacancyResourceDTO.id( vacancy.getId() );
        if ( vacancy.getStartDate() != null ) {
            vacancyResourceDTO.startDate( DateTimeFormatter.ISO_LOCAL_DATE.format( vacancy.getStartDate() ) );
        }
        if ( vacancy.getEndDate() != null ) {
            vacancyResourceDTO.endDate( DateTimeFormatter.ISO_LOCAL_DATE.format( vacancy.getEndDate() ) );
        }
        if ( vacancy.getOnboardingDate() != null ) {
            vacancyResourceDTO.onboardingDate( DateTimeFormatter.ISO_LOCAL_DATE.format( vacancy.getOnboardingDate() ) );
        }
        vacancyResourceDTO.candidates( vacancyCandidateListToVacancyCandidateResourceDTOList( vacancy.getCandidates() ) );

        return vacancyResourceDTO.build();
    }

    @Override
    public Vacancy toVacancy(VacancyResourceDTO vacancyResourceDTO) {
        if ( vacancyResourceDTO == null ) {
            return null;
        }

        Vacancy.VacancyBuilder vacancy = Vacancy.builder();

        vacancy.id( vacancyResourceDTO.getId() );
        if ( vacancyResourceDTO.getStartDate() != null ) {
            vacancy.startDate( LocalDate.parse( vacancyResourceDTO.getStartDate() ) );
        }
        if ( vacancyResourceDTO.getEndDate() != null ) {
            vacancy.endDate( LocalDate.parse( vacancyResourceDTO.getEndDate() ) );
        }
        if ( vacancyResourceDTO.getOnboardingDate() != null ) {
            vacancy.onboardingDate( LocalDate.parse( vacancyResourceDTO.getOnboardingDate() ) );
        }
        vacancy.candidates( vacancyCandidateResourceDTOListToVacancyCandidateList( vacancyResourceDTO.getCandidates() ) );

        return vacancy.build();
    }

    protected CandidateResourceDTO employeeToCandidateResourceDTO(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        CandidateResourceDTO.CandidateResourceDTOBuilder candidateResourceDTO = CandidateResourceDTO.builder();

        candidateResourceDTO.employeeId( employee.getEmployeeId() );
        candidateResourceDTO.managedGroupId( employee.getManagedGroupId() );
        candidateResourceDTO.name( employee.getName() );

        return candidateResourceDTO.build();
    }

    protected VacancyCandidateResourceDTO vacancyCandidateToVacancyCandidateResourceDTO(VacancyCandidate vacancyCandidate) {
        if ( vacancyCandidate == null ) {
            return null;
        }

        VacancyCandidateResourceDTO.VacancyCandidateResourceDTOBuilder vacancyCandidateResourceDTO = VacancyCandidateResourceDTO.builder();

        vacancyCandidateResourceDTO.candidate( employeeToCandidateResourceDTO( vacancyCandidate.getCandidate() ) );
        if ( vacancyCandidate.getCreatedDate() != null ) {
            vacancyCandidateResourceDTO.createdDate( DateTimeFormatter.ISO_LOCAL_DATE.format( vacancyCandidate.getCreatedDate() ) );
        }

        return vacancyCandidateResourceDTO.build();
    }

    protected List<VacancyCandidateResourceDTO> vacancyCandidateListToVacancyCandidateResourceDTOList(List<VacancyCandidate> list) {
        if ( list == null ) {
            return null;
        }

        List<VacancyCandidateResourceDTO> list1 = new ArrayList<VacancyCandidateResourceDTO>( list.size() );
        for ( VacancyCandidate vacancyCandidate : list ) {
            list1.add( vacancyCandidateToVacancyCandidateResourceDTO( vacancyCandidate ) );
        }

        return list1;
    }

    protected Employee candidateResourceDTOToEmployee(CandidateResourceDTO candidateResourceDTO) {
        if ( candidateResourceDTO == null ) {
            return null;
        }

        Employee.EmployeeBuilder employee = Employee.builder();

        employee.employeeId( candidateResourceDTO.getEmployeeId() );
        employee.managedGroupId( candidateResourceDTO.getManagedGroupId() );
        employee.name( candidateResourceDTO.getName() );

        return employee.build();
    }

    protected VacancyCandidate vacancyCandidateResourceDTOToVacancyCandidate(VacancyCandidateResourceDTO vacancyCandidateResourceDTO) {
        if ( vacancyCandidateResourceDTO == null ) {
            return null;
        }

        VacancyCandidate.VacancyCandidateBuilder vacancyCandidate = VacancyCandidate.builder();

        vacancyCandidate.candidate( candidateResourceDTOToEmployee( vacancyCandidateResourceDTO.getCandidate() ) );
        if ( vacancyCandidateResourceDTO.getCreatedDate() != null ) {
            vacancyCandidate.createdDate( LocalDate.parse( vacancyCandidateResourceDTO.getCreatedDate() ) );
        }

        return vacancyCandidate.build();
    }

    protected List<VacancyCandidate> vacancyCandidateResourceDTOListToVacancyCandidateList(List<VacancyCandidateResourceDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<VacancyCandidate> list1 = new ArrayList<VacancyCandidate>( list.size() );
        for ( VacancyCandidateResourceDTO vacancyCandidateResourceDTO : list ) {
            list1.add( vacancyCandidateResourceDTOToVacancyCandidate( vacancyCandidateResourceDTO ) );
        }

        return list1;
    }
}
