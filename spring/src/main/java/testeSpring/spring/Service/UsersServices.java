package testeSpring.spring.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import testeSpring.spring.Entity.Users;
import testeSpring.spring.Repository.UsersRepository;

@Service
public class UsersServices {

	@Autowired
	private UsersRepository repository;

	
	public List<Users> findAll() {
		
		return repository.findAll();
	
	}
	public Users findById(Long id) {
		Optional<Users> obj = repository.findById(id);
		return obj.get();
	}
}
