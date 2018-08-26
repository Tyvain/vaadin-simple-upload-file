package nc.unc.importparcoursup.commons.repositories;

import org.springframework.data.repository.CrudRepository;

import nc.unc.importparcoursup.commons.model.StudentHistory;

public interface StudentHistoryRepository extends CrudRepository<StudentHistory, Long> {
    public StudentHistory findFirstByOrderByJobExecutionDateDesc();
}