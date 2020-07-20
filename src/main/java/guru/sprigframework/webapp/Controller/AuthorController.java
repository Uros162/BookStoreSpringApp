package guru.sprigframework.webapp.Controller;

import guru.sprigframework.webapp.repositories.AuthorRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final AuthorRepositories authorRepositories;

    public AuthorController(AuthorRepositories authorRepositories) {
        this.authorRepositories = authorRepositories;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model){

        model.addAttribute("authors",authorRepositories.findAll());

        return "authors/list";
    }
}
