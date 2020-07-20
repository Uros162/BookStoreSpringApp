package guru.sprigframework.webapp.Bootsrap;

import guru.sprigframework.webapp.domain.Author;
import guru.sprigframework.webapp.domain.Book;
import guru.sprigframework.webapp.domain.Publisher;
import guru.sprigframework.webapp.repositories.AuthorRepositories;
import guru.sprigframework.webapp.repositories.BookRepositories;
import guru.sprigframework.webapp.repositories.PublisherRepositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepositories authorRepositories;
    private final BookRepositories bookRepositories;
    private final PublisherRepositories publisherRepositories;

    public BootstrapData(AuthorRepositories authorRepositories, BookRepositories bookRepositories,PublisherRepositories publisherRepositories) {
        this.authorRepositories = authorRepositories;
        this.bookRepositories = bookRepositories;
        this.publisherRepositories  = publisherRepositories;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("started in bootstrap");

        Publisher publisher = new Publisher();
        publisher.setName("Laguna");
        publisher.setCity("Belgrade");
        publisher.setState("Serbia");

        publisherRepositories.save(publisher);

        System.out.println("Publisher count: " +publisherRepositories.count());


        Author mile = new Author("Mile","Mitorvic");
        Book book1  = new Book("BOOOK1","111");
        book1.setPublisher(publisher);

        mile.getBooks().add(book1);
        book1.getAuthors().add(mile);
        publisher.getBooks().add(book1);

        authorRepositories.save(mile);
        bookRepositories.save(book1);
        publisherRepositories.save(publisher);

        authorRepositories.save(mile);
        bookRepositories.save(book1);


        Author kale =new Author("kale","kalanovic");
        Book book2  = new Book("BOOOK2","112");
        book2.setPublisher(publisher);
        publisher.getBooks().add(book2);


        kale.getBooks().add(book2);
        book2.getAuthors().add(kale);

        authorRepositories.save(kale);
        bookRepositories.save(book2);
        publisherRepositories.save(publisher);





        System.out.println("number of books is " + bookRepositories.count());
        System.out.println("Number of books : "+ publisher.getBooks().size());



    }
}
