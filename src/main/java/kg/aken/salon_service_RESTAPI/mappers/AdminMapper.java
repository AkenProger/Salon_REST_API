package kg.aken.salon_service_RESTAPI.mappers;

import kg.aken.salon_service_RESTAPI.mappers.BaseMapper;
import kg.aken.salon_service_RESTAPI.models.dtos.AdminDto;
import kg.aken.salon_service_RESTAPI.models.entities.Admin;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AdminMapper extends BaseMapper<AdminDto, Admin> {
   AdminMapper ADMIN_MAPPER = Mappers.getMapper(AdminMapper.class);
}
