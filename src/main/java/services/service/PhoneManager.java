package services.service;

import jakarta.websocket.server.ServerEndpoint;
import services.dtos.PhoneDto;

import java.util.List;

public interface PhoneManager {
    public PhoneDto createPhone(PhoneDto phone);
    public List<PhoneDto> getPhoneByModel(String model);
    public List<PhoneDto> getPhoneByModelAndPrice(String model, double price);
    public List<PhoneDto> getAllPhones();
    public void deletePhone(PhoneDto phone);
}
