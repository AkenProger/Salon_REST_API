package kg.aken.salon_service_RESTAPI.services.impl;

import kg.aken.salon_service_RESTAPI.dao.SalonRepository;
import kg.aken.salon_service_RESTAPI.mappers.SalonMapper;
import kg.aken.salon_service_RESTAPI.models.dtos.SalonDto;
import kg.aken.salon_service_RESTAPI.models.entities.Admin;
import kg.aken.salon_service_RESTAPI.models.entities.Salon;
import kg.aken.salon_service_RESTAPI.services.SalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SalonServiceImpl implements SalonService {
    @Autowired
    SalonRepository salonRepository;

    SalonMapper salonMapper = SalonMapper.SALON_MAPPER;

    @Override
    public SalonDto save(SalonDto salonDto) {
        return salonMapper.toDto(salonRepository.save(salonMapper.toEntity(salonDto)));
    }

    @Override
    public SalonDto update(SalonDto salonDto) {
        return null;
    }

    @Override
    public List<SalonDto> findAll() {
        return salonMapper.toDtoList(salonRepository.findAll());
    }

    @Override
    public SalonDto findById(Long id) {
        Salon salon = salonRepository.findById(id).orElseThrow(()-> new RuntimeException("Салон не найден!"));
        return salonMapper.toDto(salon);
    }

    @Override
    public SalonDto deActiveById(Long id) {
        return null;
    }
}
