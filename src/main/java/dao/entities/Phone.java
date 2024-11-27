package dao.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_Phone;
    String model;
    String color;
    String IMEI;
    double price;


}
