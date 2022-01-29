package guru.springframework.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeProviderImpl implements ChuckNorrisJokeProvider {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokeProviderImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getNextJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
