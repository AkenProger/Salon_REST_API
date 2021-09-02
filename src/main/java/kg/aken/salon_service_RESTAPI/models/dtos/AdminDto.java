package kg.aken.salon_service_RESTAPI.models.dtos;

import kg.aken.salon_service_RESTAPI.enums.*;
import lombok.Data;

import javax.persistence.*;

@Data
public class AdminDto {

    private Long id;
    private String name;
    private String login;
    private String password;
    private AdminStatus adminStatus;
}
