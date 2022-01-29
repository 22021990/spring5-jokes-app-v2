package guru.springframework.jokesapp.controllers;

import guru.springframework.jokesapp.services.ChuckNorrisJokeProvider;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final ChuckNorrisJokeProvider chuckNorrisJokeProvider;

    public JokesController(ChuckNorrisJokeProvider chuckNorrisJokeProvider) {
        this.chuckNorrisJokeProvider = chuckNorrisJokeProvider;
    }

    @RequestMapping("/")
    public String getNextJoke(Model model) {
        model.addAttribute("nextRandomJoke", chuckNorrisJokeProvider.getNextJoke());
        return "jokes/index";
    }
}
