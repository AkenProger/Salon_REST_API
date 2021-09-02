package kg.aken.salon_service_RESTAPI.mappers;

import kg.aken.salon_service_RESTAPI.models.dtos.SalonDto;
import kg.aken.salon_service_RESTAPI.models.entities.Salon;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface SalonMapper extends BaseMapper<SalonDto, Salon> {
    SalonMapper SALON_MAPPER = Mappers.getMapper(SalonMapper.class);
}
