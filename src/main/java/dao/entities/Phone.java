package dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "phone")
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
