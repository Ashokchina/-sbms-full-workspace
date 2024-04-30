package ashokit.service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ashokit.entity.Role;
import ashokit.entity.User;
import ashokit.repo.RoleRepo;
import ashokit.repo.UserRepo;
@Service
public class UserRoleService {
	@Autowired
private RoleRepo roleRepo;
	@Autowired
private UserRepo userRepo;
	public void saveUserWithRoles() {
		Role r1 = new Role();
		r1.setRoleName("Devloper");
		Role r2 = new Role();
		r2.setRoleName("Admin");
		User user = new User();
		user.setUname("Ashok");
		user.setGender("Male");
		user.setDob(LocalDate.now().minusYears(20));
		user.setRoles(Arrays.asList(r1,r2));
		userRepo.save(user);
	}
	public void getUser(int id) {
		Optional<User> findById = userRepo.findById(id);

	}

	public void getRole(int id) {
		Optional<Role> findById = roleRepo.findById(id);

	}
}
