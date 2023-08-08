package za.co.nornet.ecommerce.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Gateway")
public class Test {

    @GetMapping
    public String hello(){
        return "Hello World";
    }
}
