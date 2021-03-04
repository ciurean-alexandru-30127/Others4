package isp.lab6.exercise2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static java.util.Objects.isNull;
import static java.util.Objects.requireNonNull;

public class Dictionary {
    private static Dictionary INSTANCE;
    private static Map<Word, WordDescription> dictionary;

    private Dictionary() {

    }

    public static Dictionary getInstance() {
        if (isNull(INSTANCE)) {
            INSTANCE = new Dictionary();
            dictionary = new HashMap<>();
        }
        return INSTANCE;
    }

    public static Map<Word, WordDescription> getDictionary() {
        return dictionary;
    }


    public boolean deleteWord(final Word word) {
        if (!dictionary.containsKey(word)) {
            System.out.println(" Word having the  value" + word.getValue() + "not found");
            return false;
        }
        for (WordDescription wordDescription : dictionary.values()) {
            if (Objects.nonNull(wordDescription.getSynonyms())) {
                wordDescription.getSynonyms().remove(word);
            }
        }
        dictionary.remove(word);
        return true;
    }


    public WordDescription searchWord(final Word word) {
        return dictionary.get(word);
    }


    private boolean existsWords(final List<Word> words) {
        if (isNull(words)) {
            return true;
        }
        return dictionary.keySet().containsAll(words);
    }

    public boolean addWord(final Word word, final WordDescription wordDescription) {
        Word word1 = requireNonNull(word, "null");
        WordDescription wordDescription1 = requireNonNull(wordDescription, "null");
        if (!this.existsWords(wordDescription1.getSynonyms())) {
            dictionary.put(word1, wordDescription1);
            return true;
        } else {
            System.out.println(" synonime not EXISTS in dictionary.");
            return false;
        }
    }


    public List<Word> findSynonyms(final Word word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word).getSynonyms();
        }
        return null;
    }

    public void clearDictionary() {
        dictionary.clear();
    }
}
