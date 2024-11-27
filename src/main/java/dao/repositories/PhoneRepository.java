package dao.repositories;

import dao.entities.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
    List<Phone> findByModel(String model);
    List<Phone> findByModelAndPrice(String model,double price);
}
