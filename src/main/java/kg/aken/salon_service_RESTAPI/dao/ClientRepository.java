package kg.aken.salon_service_RESTAPI.dao;

import kg.aken.salon_service_RESTAPI.models.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
