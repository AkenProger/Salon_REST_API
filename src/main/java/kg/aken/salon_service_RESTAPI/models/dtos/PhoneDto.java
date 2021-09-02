package kg.aken.salon_service_RESTAPI.models.dtos;
import lombok.Data;

import javax.persistence.*;

@Data
public class PhoneDto {
    private Long id;
    private String phone;
    private BranchDto branch;
}
