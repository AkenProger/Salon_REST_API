package kg.aken.salon_service_RESTAPI.models.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "branches")
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address;
    private double lat;
    private double lon;
    private boolean active;
    @ManyToOne
    @JoinColumn(name = "salon_id")
    private Salon salon;
}
