package services.dtos;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
public class PhoneDto {
    Long id_Phone;
    String model;
    String color;
    String IMEI;
    double price;
}
