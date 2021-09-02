package kg.aken.salon_service_RESTAPI.services.impl;

import kg.aken.salon_service_RESTAPI.dao.BranchRepository;
import kg.aken.salon_service_RESTAPI.mappers.BranchMapper;
import kg.aken.salon_service_RESTAPI.models.dtos.BranchDto;
import kg.aken.salon_service_RESTAPI.models.entities.Branch;
import kg.aken.salon_service_RESTAPI.services.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BranchServiceImpl implements BranchService {

    @Autowired
    private BranchRepository branchRepository;
    private BranchMapper branchMapper = BranchMapper.BRANCH_MAPPER;

    @Override
    public BranchDto save(BranchDto branchDto) {
        Branch branch = branchMapper.toEntity(branchDto);
        branch = branchRepository.save(branch);
        return branchMapper.toDto(branch);
    }

    @Override
    public BranchDto update(BranchDto branchDto) {
        return null;
    }

    @Override
    public List<BranchDto> findAll() {
        return branchMapper.toDtoList(branchRepository.findAll());
    }

    @Override
    public BranchDto findById(Long id) {
       Branch branch = branchRepository.findById(id).orElseThrow(()-> new RuntimeException("Филиал не найден!"));
       return branchMapper.toDto(branch);
    }

    @Override
    public BranchDto deActiveById(Long id) {
        return null;
    }
}
