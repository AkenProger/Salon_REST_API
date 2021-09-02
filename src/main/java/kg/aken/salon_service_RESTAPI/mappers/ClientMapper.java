package kg.aken.salon_service_RESTAPI.mappers;

import kg.aken.salon_service_RESTAPI.models.dtos.ClientDto;
import kg.aken.salon_service_RESTAPI.models.entities.Client;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface ClientMapper extends BaseMapper<ClientDto, Client> {
    ClientMapper CLIENT_MAPPER = Mappers.getMapper(ClientMapper.class);
}
