package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Searchkey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchkeyRepository extends CrudRepository<Searchkey,Long> {
}
