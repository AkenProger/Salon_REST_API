package kg.aken.salon_service_RESTAPI.models.dtos;
import lombok.Data;

@Data
public class ClientDto {
    private Long id;
    private String name;
    private String phone;
    private Long pin;
}
