package kg.aken.salon_service_RESTAPI.mappers;

import kg.aken.salon_service_RESTAPI.models.dtos.MasterDto;
import kg.aken.salon_service_RESTAPI.models.entities.Master;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface MasterMapper extends BaseMapper<MasterDto, Master>{
    MasterMapper MASTER_MAPPER = Mappers.getMapper(MasterMapper.class);
}