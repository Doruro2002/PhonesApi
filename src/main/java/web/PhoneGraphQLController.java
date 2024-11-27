package web;

import dao.entities.Phone;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import services.dtos.PhoneDto;


@Controller
public class PhoneGraphQLController {
public ResponseEntity<PhoneDto> savePhone(PhoneDto phoneDto) {

}

}
