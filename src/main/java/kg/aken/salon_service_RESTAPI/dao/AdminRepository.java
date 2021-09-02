package kg.aken.salon_service_RESTAPI.dao;

import kg.aken.salon_service_RESTAPI.models.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
}
