package kg.aken.salon_service_RESTAPI.controllers.v1;

import kg.aken.salon_service_RESTAPI.controllers.BaseCrudController;
import kg.aken.salon_service_RESTAPI.models.Responce;
import kg.aken.salon_service_RESTAPI.models.dtos.ReservedHourDto;
import kg.aken.salon_service_RESTAPI.models.inputs.InputReservedHour;
import kg.aken.salon_service_RESTAPI.services.ReservedHourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/reservedHour")
public class ReservedHourController implements BaseCrudController<ReservedHourDto, Long> {
    @Autowired
    private ReservedHourService reservedHourService;


    @PostMapping("/reservingMaster")
    Responce orderSave(@RequestBody InputReservedHour inputReservedHour) {
        return null;
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
    public ReservedHourDto findById(Long aLong) {
        return reservedHourService.findById(aLong);
    }

    @Override
    public List<ReservedHourDto> findAll() {
        return reservedHourService.findAll();
    }

    @Override
    public ReservedHourDto deactivate(Long aLong) {
        return null;
    }
}
