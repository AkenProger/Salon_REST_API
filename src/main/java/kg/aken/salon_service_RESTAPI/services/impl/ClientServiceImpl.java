package kg.aken.salon_service_RESTAPI.services.impl;

import kg.aken.salon_service_RESTAPI.dao.ClientRepository;
import kg.aken.salon_service_RESTAPI.mappers.ClientMapper;
import kg.aken.salon_service_RESTAPI.models.dtos.ClientDto;
import kg.aken.salon_service_RESTAPI.models.entities.Client;
import kg.aken.salon_service_RESTAPI.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;
    private ClientMapper clientMapper = ClientMapper.CLIENT_MAPPER;

    @Override
    public ClientDto save(ClientDto clientDto) {
        return clientMapper.toDto(clientRepository.save(clientMapper.toEntity(clientDto)));
    }

    @Override
    public ClientDto update(ClientDto clientDto) {
        return null;
    }

    @Override
    public List<ClientDto> findAll() {
        return clientMapper.toDtoList(clientRepository.findAll());
    }

    @Override
    public ClientDto findById(Long id) {
        Client client = clientRepository.findById(id).orElseThrow(() -> new RuntimeException("Не найден такой клиен!"));
        return clientMapper.toDto(client);
    }

    @Override
    public ClientDto deActiveById(Long id) {
        return null;
    }
}
