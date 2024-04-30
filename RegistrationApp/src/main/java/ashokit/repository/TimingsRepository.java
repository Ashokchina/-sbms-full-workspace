package ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ashokit.entity.Timings;

public interface TimingsRepository extends JpaRepository<Timings, Long> {

}
