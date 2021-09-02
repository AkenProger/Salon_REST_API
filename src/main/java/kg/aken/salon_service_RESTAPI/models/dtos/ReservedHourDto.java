package kg.aken.salon_service_RESTAPI.models.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import kg.aken.salon_service_RESTAPI.enums.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReservedHourDto {
    private Long id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="dd-MM-yyyy HH:mm:ss")
    private LocalDateTime startTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="dd-MM-yyyy HH:mm:ss")
    private LocalDateTime endTime;
    private MasterWorkDayDto masterWorkDayDto;
    private ClientDto clientDto;
    private ReservedStatus reservedStatus;
    private AdminDto adminDto;

}
