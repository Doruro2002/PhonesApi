package services.service.ServiceImpl;

import dao.entities.Phone;
import dao.repositories.PhoneRepository;
import org.springframework.stereotype.Service;
import services.dtos.PhoneDto;
import services.mappers.PhoneMapper;
import services.service.PhoneManager;

import java.util.ArrayList;
import java.util.List;

@Service
public class PhoneManagerImpl implements PhoneManager {
    PhoneRepository phoneRepository;
    @Override
    public PhoneDto createPhone(PhoneDto phoneDto) {
        Phone phone = PhoneMapper.fromPhoneDtoToPhone(phoneDto);
        Phone phoneSaved = phoneRepository.save(phone);
        return PhoneMapper.fromPhoneToPhoneDto(phoneSaved);
    }

    @Override
    public List<PhoneDto> getPhoneByModel(String model) {
        List<Phone> phonesReturned = phoneRepository.findByModel(model);
        return PhoneMapper.fromPhonesToPhonesDto(phonesReturned);
    }
    @Override
    public List<PhoneDto> getPhoneByModelAndPrice(String model,double price) {
        List<Phone> phonesReturned = phoneRepository.findByModelAndPrice(model,price);
        return PhoneMapper.fromPhonesToPhonesDto(phonesReturned);
    }

    @Override
    public List<PhoneDto> getAllPhone() {
        List<Phone> phonesReturned = phoneRepository.findAll();
        return PhoneMapper.fromPhonesToPhonesDto(phonesReturned);
    }

}