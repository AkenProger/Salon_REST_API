package kg.aken.salon_service_RESTAPI.models.entities;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "masters")
public class Master {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
