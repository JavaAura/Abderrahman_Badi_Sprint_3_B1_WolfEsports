package service;

import java.util.List;
import java.util.Optional;

import model.Bracket;
import repository.interfaces.BracketRepository;

public class BracketService {
    
    BracketRepository bracketRepository;

    public BracketService(BracketRepository bracketRepository){
        this.bracketRepository = bracketRepository;
    }

    public Optional<Bracket> getBracket(long id){
        return bracketRepository.get(id);
    }

    public List<Bracket> getFirstRoundBrackets(long id){
        return bracketRepository.getAll(id);
    }

    public List<Bracket> getTournamentWinners(long id){
        return bracketRepository.getWinners(id);
    }

    public void updateBracket(Bracket bracket){
        bracketRepository.update(bracket);
    }
}
