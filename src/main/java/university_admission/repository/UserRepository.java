package university_admission.repository;

import org.springframework.data.repository.CrudRepository;

import university_admission.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
