package kg.aken.salon_service_RESTAPI.mappers;

import kg.aken.salon_service_RESTAPI.mappers.BaseMapper;
import kg.aken.salon_service_RESTAPI.models.dtos.ReservedHourDto;
import kg.aken.salon_service_RESTAPI.models.entities.ReservedHour;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface ReservedHourMapper extends BaseMapper<ReservedHourDto, ReservedHour> {
    ReservedHourMapper RESERVED_HOUR_MAPPER = Mappers.getMapper(ReservedHourMapper.class);
}
