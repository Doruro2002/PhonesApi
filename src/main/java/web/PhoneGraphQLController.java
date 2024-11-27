package web;

import dao.entities.Phone;
import dao.repositories.PhoneRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import services.dtos.PhoneDto;
import services.mappers.PhoneMapper;
import services.service.PhoneManager;

import java.util.List;


@Controller
public class PhoneGraphQLController {
    PhoneManager phoneManager;

    public PhoneDto savePhone(PhoneDto phone){
        return phoneManager.createPhone(phone);
    }
    public List<PhoneDto> getPhoneByModel(String model){
        return phoneManager.getPhoneByModel(model);
    }
    public List<PhoneDto> getPhoneByModelAndPrice(String model, double price){
        return phoneManager.getPhoneByModelAndPrice(model, price);
    }
    public List<PhoneDto> getAllPhones(){
        return phoneManager.getAllPhones();
    }
    public void deletePhone(PhoneDto phone){
        phoneManager.deletePhone(phone);
    }
}
