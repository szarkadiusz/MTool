package pl.MTool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import pl.MTool.Controller.DashboardData.DashboardData;
import pl.MTool.Controller.DashboardData.DataRepository;

@SpringBootApplication
public class MToolApplication extends SpringBootServletInitializer implements CommandLineRunner {

    @Autowired
    private DataRepository dataRepository;


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder){
        return springApplicationBuilder.sources(MToolApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(MToolApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        DashboardData dashboardData = new DashboardData(1,"st1","12-12-2200",true,12);
dataRepository.save(dashboardData);
    }


}
