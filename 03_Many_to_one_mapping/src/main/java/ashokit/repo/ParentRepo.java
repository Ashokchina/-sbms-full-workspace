package ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ashokit.entity.Parent;

public interface ParentRepo extends JpaRepository<Parent, Integer> {

}
