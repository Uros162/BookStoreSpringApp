package guru.sprigframework.webapp.Controller;

import guru.sprigframework.webapp.repositories.BookRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookRepositories bookRepositories;

    public BookController(BookRepositories bookRepositories) {
        this.bookRepositories = bookRepositories;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("books",bookRepositories.findAll());

        return "books/list";
    }
}
