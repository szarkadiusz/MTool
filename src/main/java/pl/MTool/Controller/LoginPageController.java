package pl.MTool.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginPageController {

    @GetMapping("/")
    public String getLoginPage(){
        return "index";
    }
}

