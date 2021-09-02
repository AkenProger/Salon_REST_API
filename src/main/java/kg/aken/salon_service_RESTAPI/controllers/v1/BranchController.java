package kg.aken.salon_service_RESTAPI.controllers.v1;

import kg.aken.salon_service_RESTAPI.controllers.BaseCrudController;
import kg.aken.salon_service_RESTAPI.models.dtos.BranchDto;
import kg.aken.salon_service_RESTAPI.services.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/branches")
public class BranchController implements BaseCrudController<BranchDto, Long> {
    @Autowired
    BranchService branchService;

    @Override
    public BranchDto save(BranchDto branchDto) {
        return branchService.save(branchDto);
    }

    @Override
    public BranchDto update(BranchDto branchDto) {
        return branchService.update(branchDto);
    }

    @Override
    public BranchDto findById(Long aLong) {
        return branchService.findById(aLong);
    }

    @Override
    public List<BranchDto> findAll() {
        return branchService.findAll();
    }

    @Override
    public BranchDto deactivate(Long aLong) {
        return null;
    }
}
