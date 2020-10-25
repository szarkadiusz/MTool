package pl.MTool;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiRestColtroller {

    private static int count = 0;

    @RequestMapping(method = RequestMethod.GET, path = "/api/hello")
    public String hello() {
        return "Siema! " + (++count);
    }


}
