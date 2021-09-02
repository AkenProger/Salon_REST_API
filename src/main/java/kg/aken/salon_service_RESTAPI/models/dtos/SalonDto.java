package kg.aken.salon_service_RESTAPI.models.dtos;

import lombok.Data;

import javax.persistence.*;

@Data
public class SalonDto {
    private Long id;
    private String name;
    private boolean active;
}
