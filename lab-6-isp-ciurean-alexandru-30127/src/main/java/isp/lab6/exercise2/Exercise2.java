package isp.lab6.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        final Dictionary dictionary = Dictionary.getInstance();

        final Word firstBook = new Word("book");
        final WordDescription firstBookDescription = new WordDescription("notebook", null);
        final boolean isFirstBookAdded = dictionary.addWord(firstBook, firstBookDescription);
        System.out.println("Result=" + isFirstBookAdded);
        System.out.println("Dictionary=" + Dictionary.getDictionary());


        final Word secondWord = new Word("book");
        final WordDescription secondBookDescription = new WordDescription("fourthB", createListOfWords(firstBook));
        final boolean isSecondBookAdded = dictionary.addWord(secondWord, secondBookDescription);
        System.out.println("Result=" + isSecondBookAdded);
        System.out.println("Dictionary=" + Dictionary.getDictionary());


        final boolean isThirdWordDeleted = dictionary.deleteWord(firstBook);
        System.out.println("Result=" + isThirdWordDeleted);
        System.out.println("Dictionary=" + Dictionary.getDictionary());


        final WordDescription existingDescription = dictionary.searchWord(new Word("fourthW"));
        System.out.println("Result=" + existingDescription);

        final List<Word> synonymsNotFound = dictionary.findSynonyms(new Word("not found"));
        System.out.println("Result=" + synonymsNotFound);


    }

    private static List<Word> createListOfWords(final Word... words) {
        final List<Word> wordsList = new ArrayList<>();
        for (Word word : words) {
            wordsList.add(word);
        }
        return wordsList;
    }
}