package kg.aken.salon_service_RESTAPI.models.entities;

import kg.aken.salon_service_RESTAPI.enums.*;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "admins")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String login;
    private String password;
    @Enumerated(EnumType.STRING)
    private AdminStatus adminStatus;
}
