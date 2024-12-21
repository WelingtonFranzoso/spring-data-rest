package franzoso.spring_data_rest.api;

import franzoso.spring_data_rest.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;

@RepositoryRestResource(path = "users", collectionResourceRel = "users")
public interface UserRestRepository extends CrudRepository<User, UUID>, PagingAndSortingRepository<User, UUID> {

    List<User> findByName(@RequestParam("name") String name);

    @Override
    @RestResource(exported = false)
    void deleteById(UUID uuid);
}
