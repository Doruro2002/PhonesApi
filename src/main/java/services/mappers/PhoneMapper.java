package services.mappers;

import dao.entities.Phone;
import org.modelmapper.ModelMapper;
import services.dtos.PhoneDto;

import java.util.List;
import java.util.stream.Collectors;

public class PhoneMapper {
    static ModelMapper modelMapper = new ModelMapper();
    public static Phone fromPhoneDtoToPhone(PhoneDto phoneDto) {
        return modelMapper.map(phoneDto, Phone.class);
    }
    public static  PhoneDto fromPhoneToPhoneDto(Phone phone) {
        return modelMapper.map(phone, PhoneDto.class);
    }

    public static List<PhoneDto> fromPhonesToPhonesDto(List<Phone> phones) {
        return phones.stream().map(PhoneMapper::fromPhoneToPhoneDto).collect(Collectors.toList());
    }
}
