package pl.MTool.Login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;

@Controller
public class LoginPageController implements WebMvcConfigurer {


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/dashboard").setViewName("dashboard");
    }

    @GetMapping("/")
    public String showForm(LoginForm loginForm) {
        return "index";
    }

    @PostMapping("/")
    public String checkPersonInfo(@Valid LoginForm loginForm, BindingResult bindingResult, Model model) {

        model.addAttribute("password", loginForm.getPassword());
        model.addAttribute("email", loginForm.getEmail());

        if (loginForm.getPassword().equals("admin") && loginForm.getEmail().equals("admin@pl.pl")){
             return "dashboard";
        }
//        if (bindingResult.hasErrors()) {
//            return "index";
//        }

        return "loginMistake";
    }

    @PostMapping("/loginMistake")
    public String redirectFromLoginMistakeToIndex() {

        return "index";
    }




}

