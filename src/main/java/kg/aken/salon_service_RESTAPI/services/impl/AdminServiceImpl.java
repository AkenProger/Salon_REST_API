package kg.aken.salon_service_RESTAPI.services.impl;

import kg.aken.salon_service_RESTAPI.dao.AdminRepository;
import kg.aken.salon_service_RESTAPI.mappers.AdminMapper;
import kg.aken.salon_service_RESTAPI.models.dtos.AdminDto;
import kg.aken.salon_service_RESTAPI.models.entities.Admin;
import kg.aken.salon_service_RESTAPI.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepository adminRepository;
    private AdminMapper adminMapper = AdminMapper.ADMIN_MAPPER;

    @Override
    public AdminDto save(AdminDto adminDto) {
        return adminMapper.toDto(adminRepository.save(adminMapper.toEntity(adminDto)));
    }

    @Override
    public AdminDto update(AdminDto adminDto) {
        if (!adminRepository.existsById(adminDto.getId()))
            throw new RuntimeException("Админ не найден!");
        Admin admin = adminMapper.toEntity(adminDto);
        admin = adminRepository.save(admin);
        return adminMapper.toDto(admin);
    }

    @Override
    public List<AdminDto> findAll() {
        return adminMapper.toDtoList(adminRepository.findAll());
    }

    @Override
    public AdminDto findById(Long id) {
        Admin admin = adminRepository.findById(id).orElseThrow(() -> new RuntimeException("Не найден админ"));
        return adminMapper.toDto(admin);
    }

    @Override
    public AdminDto deActiveById(Long id) {
        return null;
    }
}
