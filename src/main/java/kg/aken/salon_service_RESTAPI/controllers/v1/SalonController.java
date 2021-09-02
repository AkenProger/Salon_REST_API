package kg.aken.salon_service_RESTAPI.controllers.v1;

import kg.aken.salon_service_RESTAPI.controllers.BaseCrudController;
import kg.aken.salon_service_RESTAPI.models.dtos.SalonDto;
import kg.aken.salon_service_RESTAPI.services.SalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/salons")
public class SalonController implements BaseCrudController<SalonDto, Long> {

    @Autowired
    private SalonService salonService;

    @Override
    public SalonDto save(SalonDto salonDto) {
        return salonService.save(salonDto);
    }

    @Override
    public SalonDto update(SalonDto salonDto) {
        return null;
    }

    @Override
    public SalonDto findById(Long aLong) {
        return salonService.findById(aLong);
    }

    @Override
    public List<SalonDto> findAll() {
        return salonService.findAll();
    }

    @Override
    public SalonDto deactivate(Long aLong) {
        return null;
    }
}
