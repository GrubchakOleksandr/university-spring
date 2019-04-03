package university_admission.repository;

import org.springframework.data.repository.CrudRepository;

import university_admission.domain.Entrant;

public interface EntrantRepository extends CrudRepository<Entrant, Long> {

}
