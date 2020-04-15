package DA;

import org.springframework.data.jpa.repository.JpaRepository;

import Models.User;



public interface UserInterface extends JpaRepository<User, Long> {
	

}