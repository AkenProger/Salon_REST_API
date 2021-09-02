package kg.aken.salon_service_RESTAPI.services.impl;

import kg.aken.salon_service_RESTAPI.dao.ReservedHourRepository;
import kg.aken.salon_service_RESTAPI.enums.ReservedStatus;
import kg.aken.salon_service_RESTAPI.mappers.ReservedHourMapper;
import kg.aken.salon_service_RESTAPI.models.Responce;
import kg.aken.salon_service_RESTAPI.models.dtos.ReservedHourDto;
import kg.aken.salon_service_RESTAPI.models.inputs.InputReservedHour;
import kg.aken.salon_service_RESTAPI.services.AdminService;
import kg.aken.salon_service_RESTAPI.services.ClientService;
import kg.aken.salon_service_RESTAPI.services.MasterWorkDayService;
import kg.aken.salon_service_RESTAPI.services.ReservedHourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReservedHourServiceImpl implements ReservedHourService {
    ReservedHourMapper reservedHourMapper = ReservedHourMapper.RESERVED_HOUR_MAPPER;
    @Autowired
    private ReservedHourRepository reservedHourRepository;
    @Autowired
    private AdminService adminService;
    @Autowired
    private ClientService clientService;
    @Autowired
    private MasterWorkDayService masterWorkDayService;

    private ReservedHourDto saveOrder(InputReservedHour inputReservedHour) {
        ReservedHourDto reservedHourDto = new ReservedHourDto();
        reservedHourDto.setAdminDto(adminService.findById(inputReservedHour.getAdminId()));
        reservedHourDto.setClientDto(clientService.findById(inputReservedHour.getClientId()));
        reservedHourDto.setMasterWorkDayDto(masterWorkDayService.findById(inputReservedHour.getWorkDayId()));
        reservedHourDto.setStartTime(inputReservedHour.getStartTime());
        reservedHourDto.setEndTime(inputReservedHour.getEndTime());
        reservedHourDto.setReservedStatus(ReservedStatus.NEW);
        return reservedHourDto;
    }

    @Override
    public ReservedHourDto save(ReservedHourDto reservedHourDto) {
        return null;
    }

    @Override
    public ReservedHourDto update(ReservedHourDto reservedHourDto) {
        return null;
    }

    @Override
    public List<ReservedHourDto> findAll() {
        return null;
    }

    @Override
    public ReservedHourDto findById(Long id) {
        return null;
    }

    @Override
    public ReservedHourDto deActiveById(Long id) {
        return null;
    }

    @Override
    public Responce saveReserving(InputReservedHour inputReservedHour) {

        return null;

    }

    @Override
    public boolean searchFreeTime(List<ReservedHourDto> reservedHourDtoList, LocalDateTime startTime, LocalDateTime endTime) {
        return reservedHourDtoList.stream().anyMatch(x -> (x.getEndTime().isAfter(startTime)));
    }

}
