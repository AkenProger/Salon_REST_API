package kg.aken.salon_service_RESTAPI.models.entities;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "phones")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String phone;
    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;
}
