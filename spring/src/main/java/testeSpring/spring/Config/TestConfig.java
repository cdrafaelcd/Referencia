package testeSpring.spring.Config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import testeSpring.spring.Entity.Users;
import testeSpring.spring.Repository.UsersRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UsersRepository usersRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Users u1 = new Users(null, "Maria Brown", "maria@gmail.com", "988888888", "993456"); 
		Users u2 = new Users(null, "Alex Green", "alex@gmail.com", "977777777", "895456"); 
		Users u3 = new Users(null, "Green", "green@gmail.com", "977777777", "12345656"); 
		Users u4 = new Users(null, "Joao", "joao@gmail.com", "9777", "12101056"); 
		
		usersRepository.saveAll(Arrays.asList(u1, u2, u3, u4));
		
	}
	
	
}
