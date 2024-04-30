package ashokit.entity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ashokit.entity.ContactusEntity;

@Repository
public interface ContactRepo  extends JpaRepository<ContactusEntity, Integer>{
}
