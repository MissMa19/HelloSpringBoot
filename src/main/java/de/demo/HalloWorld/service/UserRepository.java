package de.demo.HalloWorld.service;



import de.demo.HalloWorld.models.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDetail, Long> {
}