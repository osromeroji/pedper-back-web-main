package com.mercadona.pedper.main.driven.repositories.mappers;

import com.mercadona.pedper.main.domain.Employee;
import com.mercadona.pedper.main.domain.Vacancy;
import com.mercadona.pedper.main.domain.VacancyCandidate;
import com.mercadona.pedper.main.driven.repositories.models.EmployeeMO;
import com.mercadona.pedper.main.driven.repositories.models.VacancyCandidatesMO;
import com.mercadona.pedper.main.driven.repositories.models.VacancyMO;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-10T17:45:03+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.3 (Homebrew)"
)
@Component
public class VacancyMOMapperImpl implements VacancyMOMapper {

    @Override
    public Vacancy fromModel(VacancyMO vacancyMO) {
        if ( vacancyMO == null ) {
            return null;
        }

        Vacancy.VacancyBuilder vacancy = Vacancy.builder();

        vacancy.id( vacancyMO.getId() );
        vacancy.startDate( vacancyMO.getStartDate() );
        vacancy.endDate( vacancyMO.getEndDate() );
        vacancy.onboardingDate( vacancyMO.getOnboardingDate() );
        vacancy.candidates( vacancyCandidatesMOSetToVacancyCandidateList( vacancyMO.getCandidates() ) );

        return vacancy.build();
    }

    @Override
    public VacancyMO toModel(Vacancy vacancy) {
        if ( vacancy == null ) {
            return null;
        }

        VacancyMO.VacancyMOBuilder vacancyMO = VacancyMO.builder();

        vacancyMO.id( vacancy.getId() );
        vacancyMO.startDate( vacancy.getStartDate() );
        vacancyMO.endDate( vacancy.getEndDate() );
        vacancyMO.onboardingDate( vacancy.getOnboardingDate() );
        vacancyMO.candidates( vacancyCandidateListToVacancyCandidatesMOSet( vacancy.getCandidates() ) );

        return vacancyMO.build();
    }

    protected Employee employeeMOToEmployee(EmployeeMO employeeMO) {
        if ( employeeMO == null ) {
            return null;
        }

        Employee.EmployeeBuilder employee = Employee.builder();

        employee.employeeId( employeeMO.getEmployeeId() );
        employee.managedGroupId( employeeMO.getManagedGroupId() );
        employee.name( employeeMO.getName() );

        return employee.build();
    }

    protected VacancyCandidate vacancyCandidatesMOToVacancyCandidate(VacancyCandidatesMO vacancyCandidatesMO) {
        if ( vacancyCandidatesMO == null ) {
            return null;
        }

        VacancyCandidate.VacancyCandidateBuilder vacancyCandidate = VacancyCandidate.builder();

        vacancyCandidate.candidate( employeeMOToEmployee( vacancyCandidatesMO.getCandidate() ) );
        vacancyCandidate.createdDate( vacancyCandidatesMO.getCreatedDate() );

        return vacancyCandidate.build();
    }

    protected List<VacancyCandidate> vacancyCandidatesMOSetToVacancyCandidateList(Set<VacancyCandidatesMO> set) {
        if ( set == null ) {
            return null;
        }

        List<VacancyCandidate> list = new ArrayList<VacancyCandidate>( set.size() );
        for ( VacancyCandidatesMO vacancyCandidatesMO : set ) {
            list.add( vacancyCandidatesMOToVacancyCandidate( vacancyCandidatesMO ) );
        }

        return list;
    }

    protected EmployeeMO employeeToEmployeeMO(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeMO.EmployeeMOBuilder employeeMO = EmployeeMO.builder();

        employeeMO.employeeId( employee.getEmployeeId() );
        employeeMO.managedGroupId( employee.getManagedGroupId() );
        employeeMO.name( employee.getName() );

        return employeeMO.build();
    }

    protected VacancyCandidatesMO vacancyCandidateToVacancyCandidatesMO(VacancyCandidate vacancyCandidate) {
        if ( vacancyCandidate == null ) {
            return null;
        }

        VacancyCandidatesMO.VacancyCandidatesMOBuilder vacancyCandidatesMO = VacancyCandidatesMO.builder();

        vacancyCandidatesMO.candidate( employeeToEmployeeMO( vacancyCandidate.getCandidate() ) );
        vacancyCandidatesMO.createdDate( vacancyCandidate.getCreatedDate() );

        return vacancyCandidatesMO.build();
    }

    protected Set<VacancyCandidatesMO> vacancyCandidateListToVacancyCandidatesMOSet(List<VacancyCandidate> list) {
        if ( list == null ) {
            return null;
        }

        Set<VacancyCandidatesMO> set = new LinkedHashSet<VacancyCandidatesMO>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( VacancyCandidate vacancyCandidate : list ) {
            set.add( vacancyCandidateToVacancyCandidatesMO( vacancyCandidate ) );
        }

        return set;
    }
}
