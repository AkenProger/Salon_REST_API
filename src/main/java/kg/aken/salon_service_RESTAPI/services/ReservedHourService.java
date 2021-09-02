package kg.aken.salon_service_RESTAPI.services;

import kg.aken.salon_service_RESTAPI.models.Responce;
import kg.aken.salon_service_RESTAPI.models.dtos.ReservedHourDto;
import kg.aken.salon_service_RESTAPI.models.inputs.InputReservedHour;
import java.util.List;
import java.time.LocalDateTime;

public interface ReservedHourService extends BaseCrudService<ReservedHourDto, Long> {
    Responce saveReserving(InputReservedHour inputReservedHour);

    boolean searchFreeTime(List<ReservedHourDto> reservedHourDtoList, LocalDateTime startTime, LocalDateTime endTime);


}