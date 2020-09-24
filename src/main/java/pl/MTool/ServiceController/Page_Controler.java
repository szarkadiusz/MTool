package pl.MTool.ServiceController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Page_Controler {


    @GetMapping("/")
    public String getIndexPage(){
        return "index";
    }
}
