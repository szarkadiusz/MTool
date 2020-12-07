package pl.MTool.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectMongoReposiitory extends MongoRepository<Object, String> {
}
