package kg.aken.salon_service_RESTAPI.mappers;

import kg.aken.salon_service_RESTAPI.models.dtos.BranchDto;
import kg.aken.salon_service_RESTAPI.models.entities.Branch;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BranchMapper extends BaseMapper<BranchDto, Branch> {
    BranchMapper BRANCH_MAPPER = Mappers.getMapper(BranchMapper.class);
}
