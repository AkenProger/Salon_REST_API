package kg.aken.salon_service_RESTAPI.services.impl;

import kg.aken.salon_service_RESTAPI.dao.BranchRepository;
import kg.aken.salon_service_RESTAPI.dao.PhoneRepository;
import kg.aken.salon_service_RESTAPI.mappers.BranchMapper;
import kg.aken.salon_service_RESTAPI.mappers.PhoneMapper;
import kg.aken.salon_service_RESTAPI.models.dtos.PhoneDto;
import kg.aken.salon_service_RESTAPI.models.entities.Phone;
import kg.aken.salon_service_RESTAPI.services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    private PhoneRepository phoneRepository;
    private PhoneMapper phoneMapper = PhoneMapper.PHONE_MAPPER;
    private BranchMapper branchMapper = BranchMapper.BRANCH_MAPPER;
    @Override
    public PhoneDto save(PhoneDto phoneDto) {
        Phone phoneDto1 = new Phone();
        phoneDto1.setPhone(phoneDto.getPhone());
        phoneDto1.setBranch(branchMapper.toEntity(phoneDto.getBranch()));
        phoneDto1 = phoneRepository.save(phoneDto1);
        return phoneMapper.toDto(phoneDto1);
    }

    @Override
    public PhoneDto update(PhoneDto phoneDto) {
        return null;
    }

    @Override
    public List<PhoneDto> findAll() {
        return phoneMapper.toDtoList(phoneRepository.findAll());
    }

    @Override
    public PhoneDto findById(Long id) {
        Phone phone = phoneRepository.findById(id).orElseThrow(()-> new RuntimeException("Не найден этот телефон!"));
        return phoneMapper.toDto(phone);
    }

    @Override
    public PhoneDto deActiveById(Long id) {
        return null;
    }
}
