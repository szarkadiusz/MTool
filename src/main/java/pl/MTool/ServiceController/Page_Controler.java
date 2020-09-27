package pl.MTool.ServiceController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.pi4j.io.gpio.*;

@Controller
public class Page_Controler {

    @GetMapping("/")
    public String getIndexPage(){
        return "index";
    }
}
