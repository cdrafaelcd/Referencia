package testeSpring.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import testeSpring.spring.Entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
	

}
