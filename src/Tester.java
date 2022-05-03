/*
Javadoc - 01
Exercise: javadoc-1
create a class called Tester that has the main method where you:
create a new WordGames object
print in console the result of the addHelloWord method invocation
print in console the result of the getFullName method invocation
add Javadoc comments to:
the 2 classes with a short description and the author
the 3 methods with a short description, the parameters and the return
 */

import java.util.Scanner;

/**
 * @author Davide
 *This class is a test for the class WordGames
 */
public class Tester {
    /**
     * In this main method the player is being asked for his first and last name. Then it creates an object of the WordGames
     * class that allows you to invoke its methods
     * @param args not used
     */
    public static void main(String[] args) {

        String name;
        String surname;
        String fullName;
        WordGames wordGamesObject = new WordGames();

        Scanner input = new Scanner(System.in);
        System.out.println("Please, insert your name");
        name = input.next();
        System.out.println("Please, insert your surname");
        surname = input.next();
        input.close();

        fullName = wordGamesObject.getFullName(name,surname);
        //System.out.println(fullName);
        System.out.println(wordGamesObject.addHelloWord(fullName));
    }
}
