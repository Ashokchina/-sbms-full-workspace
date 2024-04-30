package ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ashokit.entity.Role;

public interface RoleRepo extends JpaRepository<Role, Integer> {

}
