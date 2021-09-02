package kg.aken.salon_service_RESTAPI.controllers.v1;
import kg.aken.salon_service_RESTAPI.controllers.BaseCrudController;
import kg.aken.salon_service_RESTAPI.models.dtos.MasterDto;
import kg.aken.salon_service_RESTAPI.services.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/masters")
public class MasterController implements BaseCrudController<MasterDto, Long> {

    @Autowired
    private MasterService masterService;

    @Override
    public MasterDto save(MasterDto masterDto) {
        return masterService.save(masterDto);
    }

    @Override
    public MasterDto update(MasterDto masterDto) {
        return masterService.update(masterDto);
    }

    @Override
    public MasterDto findById(Long aLong) {
        return masterService.findById(aLong);
    }

    @Override
    public List<MasterDto> findAll() {
        return masterService.findAll();
    }

    @Override
    public MasterDto deactivate(Long aLong) {
        return null;
    }
}
