package tech.getarrays.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.getarrays.employeemanager.model.Employee;
import tech.getarrays.employeemanager.model.FreedomHappienes;
import tech.getarrays.employeemanager.repository.FreedomHappienesRepository;

import java.util.List;

@Service
public class FreedomHappienesService {

    private final FreedomHappienesRepository freedomHappienesRepository;

    @Autowired
    public FreedomHappienesService(FreedomHappienesRepository freedomHappienesRepository) {
        this.freedomHappienesRepository = freedomHappienesRepository;
    }

    public List<FreedomHappienes> saveAllStudent(List<FreedomHappienes> freedomHappienesList) {
        List<FreedomHappienes> response = (List<FreedomHappienes>) freedomHappienesRepository.saveAll(freedomHappienesList);
        return response;
    }


}
