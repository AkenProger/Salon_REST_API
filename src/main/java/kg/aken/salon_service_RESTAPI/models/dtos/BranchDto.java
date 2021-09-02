package kg.aken.salon_service_RESTAPI.models.dtos;

import lombok.Data;

import javax.persistence.*;

@Data
public class BranchDto {

    private Long id;
    private String address;
    private double lat;
    private double lon;
    private boolean active;
    private SalonDto salon;
}
