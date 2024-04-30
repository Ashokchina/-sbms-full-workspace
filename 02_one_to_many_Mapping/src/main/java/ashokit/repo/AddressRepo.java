package ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ashokit.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
