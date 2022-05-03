/*
Javadoc - 01
Exercise: javadoc-1
create a class called WordGames that has two methods:
addHelloWord method that takes one parameter as input called word and returns the String Hello [wordHere]
getFullName method that takes two parameters as input called name and surname and returns their concatenation
create a class called Tester that has the main method where you:
 */

/**
 * This class represents a game with words
 */
public class WordGames {

    /**
     * This method generate a greeting to the player
     * @param word requires a String
     * @return a String consisting of "Hello" + param
     */
    public String addHelloWord(String word){
        return "Hello "+word;
    }

    /**
     * This method joins name and surname of the player
     * @param name requires a String with the name
     * @param surname requires a String with the surname
     * @return a single string with both parameters separated by one space
     */
    public String getFullName (String name, String surname){
        return name+" "+surname;
    }
}
