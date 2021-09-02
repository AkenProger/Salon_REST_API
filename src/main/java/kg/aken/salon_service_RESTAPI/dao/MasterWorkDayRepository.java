package kg.aken.salon_service_RESTAPI.dao;

import kg.aken.salon_service_RESTAPI.models.entities.MasterWorkDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterWorkDayRepository extends JpaRepository<MasterWorkDay, Long> {

}
