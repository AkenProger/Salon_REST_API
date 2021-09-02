package kg.aken.salon_service_RESTAPI.mappers;
import java.util.List;

public interface BaseMapper <DTO, ENTITY> {
    DTO toDto(ENTITY entity);
    ENTITY toEntity(DTO dto);
    List<DTO> toDtoList(List<ENTITY> entities);
    List<ENTITY> toEntityList(List<DTO> dtoList);


}
