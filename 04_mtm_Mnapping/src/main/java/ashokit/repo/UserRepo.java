package ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ashokit.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
