package kg.aken.salon_service_RESTAPI.mappers;

import kg.aken.salon_service_RESTAPI.models.dtos.MasterWorkDayDto;
import kg.aken.salon_service_RESTAPI.models.entities.MasterWorkDay;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface MasterWorkDayMapper extends BaseMapper<MasterWorkDayDto, MasterWorkDay> {
    MasterWorkDayMapper MASTER_WORK_DAY_MAPPER = Mappers.getMapper(MasterWorkDayMapper.class);
}
