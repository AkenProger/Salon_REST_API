package kg.aken.salon_service_RESTAPI.controllers.v1;

import kg.aken.salon_service_RESTAPI.controllers.BaseCrudController;
import kg.aken.salon_service_RESTAPI.models.dtos.MasterWorkDayDto;
import kg.aken.salon_service_RESTAPI.services.MasterWorkDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/masterWorkDay")
public class MasterWorkDayController implements BaseCrudController<MasterWorkDayDto, Long> {

    @Autowired
    private MasterWorkDayService masterWorkDayService;

    @Override
    public MasterWorkDayDto save(MasterWorkDayDto masterWorkDayDto) {
        return masterWorkDayService.save(masterWorkDayDto);
    }

    @Override
    public MasterWorkDayDto update(MasterWorkDayDto masterWorkDayDto) {
        return null;
    }

    @Override
    public MasterWorkDayDto findById(Long aLong) {
        return masterWorkDayService.findById(aLong);
    }

    @Override
    public List<MasterWorkDayDto> findAll() {
        return masterWorkDayService.findAll();
    }

    @Override
    public MasterWorkDayDto deactivate(Long aLong) {
        return null;
    }
}
