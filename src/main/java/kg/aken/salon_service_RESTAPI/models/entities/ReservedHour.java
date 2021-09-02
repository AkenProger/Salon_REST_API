package kg.aken.salon_service_RESTAPI.models.entities;

import kg.aken.salon_service_RESTAPI.enums.*;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Data
@Table(name = "reserved_hours")
public class ReservedHour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @ManyToOne
    @JoinColumn(name = "masterwork_day_id")
    private MasterWorkDay masterWorkDay;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    @Enumerated(EnumType.STRING)
    private ReservedStatus reservedStatus;
    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

}
