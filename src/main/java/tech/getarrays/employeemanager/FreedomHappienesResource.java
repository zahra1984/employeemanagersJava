package tech.getarrays.employeemanager;

import org.springframework.web.bind.annotation.*;
import tech.getarrays.employeemanager.model.FreedomHappienes;
import tech.getarrays.employeemanager.service.FreedomHappienesService;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/freedomHappienes")
public class FreedomHappienesResource {

    private final FreedomHappienesService freedomHappienesService;

    public FreedomHappienesResource(FreedomHappienesService freedomHappienesService) {
        this.freedomHappienesService = freedomHappienesService;
    }

    @RequestMapping(value = "/saveall", method = RequestMethod.POST)
    @CrossOrigin(origins = "http://localhost:4200")
    @ResponseBody
    @Transactional
    public List<FreedomHappienes> saveAllFreedomHappienes(@RequestBody List<FreedomHappienes> freedomHappienesList) {
        List<FreedomHappienes> studentResponse = (List<FreedomHappienes>) freedomHappienesService.saveAllStudent(freedomHappienesList);
        return studentResponse;
    }
}
