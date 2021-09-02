package kg.aken.salon_service_RESTAPI.controllers.v1;

import kg.aken.salon_service_RESTAPI.controllers.BaseCrudController;
import kg.aken.salon_service_RESTAPI.models.dtos.ClientDto;
import kg.aken.salon_service_RESTAPI.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/clients")
public class ClientController implements BaseCrudController<ClientDto, Long> {
    @Autowired
    private ClientService clientService;

    @Override
    public ClientDto save(ClientDto clientDto) {
        return clientService.save(clientDto);
    }

    @Override
    public ClientDto update(ClientDto clientDto) {
        return clientService.update(clientDto);
    }

    @Override
    public ClientDto findById(Long aLong) {
        return clientService.findById(aLong);
    }

    @Override
    public List<ClientDto> findAll() {
        return clientService.findAll();
    }

    @Override
    public ClientDto deactivate(Long aLong) {
        return null;
    }
}
