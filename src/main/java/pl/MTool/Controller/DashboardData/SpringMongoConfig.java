package pl.MTool.Controller.DashboardData;

import com.mongodb.client.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;

@Configuration
public class SpringMongoConfig extends AbstractMongoConfiguration
{
    @Bean
    public GridFsTemplate gridFsTemplate() throws Exception
    { 
        return new GridFsTemplate(mongoDbFactory(), mappingMongoConverter());
    }

    @Override
    protected String getDatabaseName()
    {
        return "MToolDB";
    }

    @Override
    @Bean
    public Mongo mongo() throws Exception
    {
        return new MongoClient("localhost" , 27017 );
    }

    public @Bean
    MongoTemplate mongoTemplate() throws Exception
    {
        return new MongoTemplate(mongo(), getDatabaseName());
    }
}