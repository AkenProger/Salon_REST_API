package kg.aken.salon_service_RESTAPI.services.impl;

import kg.aken.salon_service_RESTAPI.dao.MasterRepository;
import kg.aken.salon_service_RESTAPI.mappers.MasterMapper;
import kg.aken.salon_service_RESTAPI.models.dtos.MasterDto;
import kg.aken.salon_service_RESTAPI.models.entities.Master;
import kg.aken.salon_service_RESTAPI.services.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MasterServiceImpl implements MasterService {
    @Autowired
    private MasterRepository masterRepository;
    private MasterMapper masterMapper = MasterMapper.MASTER_MAPPER;

    @Override
    public MasterDto save(MasterDto masterDto) {
        return masterMapper.toDto(masterRepository.save(masterMapper.toEntity(masterDto)));
    }

    @Override
    public MasterDto update(MasterDto masterDto) {
        return null;
    }

    @Override
    public List<MasterDto> findAll() {
        return masterMapper.toDtoList(masterRepository.findAll());
    }

    @Override
    public MasterDto findById(Long id) {
        Master master = masterRepository.findById(id).orElseThrow(()-> new RuntimeException("Не найден такой мастер!"));
        return masterMapper.toDto(master);
    }

    @Override
    public MasterDto deActiveById(Long id) {
        return null;
    }
}
