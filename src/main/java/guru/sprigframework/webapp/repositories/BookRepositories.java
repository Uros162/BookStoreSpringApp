package guru.sprigframework.webapp.repositories;

import guru.sprigframework.webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepositories extends CrudRepository<Book,Long> {
}
