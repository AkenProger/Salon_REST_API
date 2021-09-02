package kg.aken.salon_service_RESTAPI.services.impl;

import kg.aken.salon_service_RESTAPI.dao.MasterWorkDayRepository;
import kg.aken.salon_service_RESTAPI.mappers.BranchMapper;
import kg.aken.salon_service_RESTAPI.mappers.MasterWorkDayMapper;
import kg.aken.salon_service_RESTAPI.models.dtos.MasterWorkDayDto;
import kg.aken.salon_service_RESTAPI.models.entities.MasterWorkDay;
import kg.aken.salon_service_RESTAPI.services.AdminService;
import kg.aken.salon_service_RESTAPI.services.BranchService;
import kg.aken.salon_service_RESTAPI.services.MasterService;
import kg.aken.salon_service_RESTAPI.services.MasterWorkDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MasterWorkDayServiceImpl implements MasterWorkDayService {
    @Autowired
    private MasterService masterService;
    @Autowired
    private AdminService adminService;
    @Autowired
    private BranchService branchService;

    @Autowired
    private MasterWorkDayRepository masterWorkDayRepository;
    private MasterWorkDayMapper masterWorkDayMapper = MasterWorkDayMapper.MASTER_WORK_DAY_MAPPER;


    @Override
    public MasterWorkDayDto save(MasterWorkDayDto masterWorkDayDto) {
        MasterWorkDayDto masterWorkDayDto1 = new MasterWorkDayDto();
        masterWorkDayDto1.setMaster(masterService.findById(masterWorkDayDto.getId()));
        masterWorkDayDto1.setAdmin(adminService.findById(masterWorkDayDto.getId()));
        masterWorkDayDto1.setBranch(branchService.findById(masterWorkDayDto.getId()));
        masterWorkDayDto1.setStartTime(masterWorkDayDto.getStartTime());
        masterWorkDayDto1.setEndTime(masterWorkDayDto.getEndTime());
        return masterWorkDayMapper.toDto(masterWorkDayRepository.save(masterWorkDayMapper.toEntity(masterWorkDayDto1)));
    }

    @Override
    public MasterWorkDayDto update(MasterWorkDayDto masterWorkDayDto) {
        return null;
    }

    @Override
    public List<MasterWorkDayDto> findAll() {
        return masterWorkDayMapper.toDtoList(masterWorkDayRepository.findAll());
    }

    @Override
    public MasterWorkDayDto findById(Long id) {
        MasterWorkDay masterWorkDay = masterWorkDayRepository.findById(id).orElseThrow(()-> new RuntimeException("Не найден рабочий день!"));
        return masterWorkDayMapper.toDto(masterWorkDay);
    }

    @Override
    public MasterWorkDayDto deActiveById(Long id) {
        return null;
    }
}
