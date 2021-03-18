package in.edac.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.edac.User;

public interface UserRepository  extends JpaRepository<User,Integer> {

	@Query("select s from User s where emailId=?1 and password=?2")
	User findByEmailIdAndPassword(String emailId, String password);

}
