package ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ashokit.entity.Authour;

public interface AuthourRepo extends JpaRepository<Authour, Integer> {

}
