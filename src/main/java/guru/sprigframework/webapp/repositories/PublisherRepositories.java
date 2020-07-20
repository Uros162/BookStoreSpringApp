package guru.sprigframework.webapp.repositories;

import guru.sprigframework.webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepositories extends CrudRepository<Publisher,Long> {
}
