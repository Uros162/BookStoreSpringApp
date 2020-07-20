package guru.sprigframework.webapp.repositories;

import guru.sprigframework.webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepositories extends CrudRepository<Author,Long> {
}
