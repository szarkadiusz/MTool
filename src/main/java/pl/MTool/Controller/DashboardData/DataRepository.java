package pl.MTool.Controller.DashboardData;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DataRepository extends MongoRepository <DashboardData,String> {

}
