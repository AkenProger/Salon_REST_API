package kg.aken.salon_service_RESTAPI.controllers.v1;

import kg.aken.salon_service_RESTAPI.controllers.BaseCrudController;
import kg.aken.salon_service_RESTAPI.models.dtos.PhoneDto;
import kg.aken.salon_service_RESTAPI.services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/phones")
public class PhoneController implements BaseCrudController<PhoneDto, Long> {
    @Autowired
    private PhoneService phoneService;

    @Override
    public PhoneDto save(PhoneDto phoneDto) {
        return phoneService.save(phoneDto);
    }

    @Override
    public PhoneDto update(PhoneDto phoneDto) {
        return null;
    }

    @Override
    public PhoneDto findById(Long aLong) {
        return phoneService.findById(aLong);
    }

    @Override
    public List<PhoneDto> findAll() {
        return phoneService.findAll();
    }

    @Override
    public PhoneDto deactivate(Long aLong) {
        return null;
    }
}
