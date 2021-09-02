package kg.aken.salon_service_RESTAPI.dao;

import kg.aken.salon_service_RESTAPI.models.entities.Salon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalonRepository extends JpaRepository<Salon, Long> {
}
