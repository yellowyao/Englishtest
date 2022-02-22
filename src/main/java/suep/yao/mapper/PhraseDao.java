package suep.yao.mapper;

import suep.yao.main.Phrase;

import java.util.List;

public interface PhraseDao {
    List<Phrase> findAllPhrase();
}
