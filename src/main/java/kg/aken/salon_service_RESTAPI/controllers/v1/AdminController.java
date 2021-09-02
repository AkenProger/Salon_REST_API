package kg.aken.salon_service_RESTAPI.controllers.v1;

import kg.aken.salon_service_RESTAPI.controllers.BaseCrudController;
import kg.aken.salon_service_RESTAPI.models.dtos.AdminDto;
import kg.aken.salon_service_RESTAPI.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/admin")
public class AdminController implements BaseCrudController<AdminDto, Long> {

    @Autowired
    private AdminService adminService;

    @Override
    public AdminDto save(AdminDto adminDto) {
        return adminService.save(adminDto);
    }

    @Override
    public AdminDto update(AdminDto adminDto) {
        return adminService.update(adminDto);
    }

    @Override
    public AdminDto findById(Long aLong) {
        return adminService.findById(aLong);
    }

    @Override
    public List<AdminDto> findAll() {
        return adminService.findAll();
    }

    @Override
    public AdminDto deactivate(Long aLong) {
        return null;
    }
}
