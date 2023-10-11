package ie.atu.lab4_2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @PostMapping("/confirm")
    public String registerUser(@RequestBody UserDetails userDetails){
        return "Confirmed";
    }
}
