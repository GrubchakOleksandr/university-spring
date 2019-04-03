package university_admission.repository;

import org.springframework.data.repository.CrudRepository;

import university_admission.domain.Faculty;

public interface FacultyRepository extends CrudRepository<Faculty, Long> {

}
