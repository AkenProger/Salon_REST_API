package kg.aken.salon_service_RESTAPI.mappers;

import kg.aken.salon_service_RESTAPI.models.dtos.PhoneDto;
import kg.aken.salon_service_RESTAPI.models.entities.Phone;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface PhoneMapper extends BaseMapper<PhoneDto, Phone> {
    PhoneMapper PHONE_MAPPER = Mappers.getMapper(PhoneMapper.class);
}
