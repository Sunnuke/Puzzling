import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava uzz = new PuzzleJava();
        
        // PUZZLE 01
        // ● Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. 
        // Print the sum of all numbers in the array. Also have the function return an array that only 
        // includes numbers that are greater than 10 (e.g. when you pass the array above, 
        // it should return an array with the values of 13,25,32)
        ArrayList<Integer> values = new ArrayList<Integer>(Arrays.asList(3,5,1,2,7,9,8,13,25,32));
        ArrayList<Integer> changed = uzz.Puzzle01(values);
        System.out.println(changed);


        // PUZZLE 02
        // ● Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. 
        // Shuffle the array and print the name of each person. Have the method also
        //  return an array with names that are longer than 5 characters.
        ArrayList<String> nameList = new ArrayList<String>(Arrays.asList("Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"));
        ArrayList<String> bigNames = uzz.Puzzle02(nameList);
        System.out.println(bigNames);


        // PUZZLE 03
        // ● Create an array that contains all 26 letters of the alphabet (this array must have 26 values). 
        // Shuffle the array and, after shuffling, display the last letter from the array. 
        // Have it also display the first letter of the array. 
        // If the first letter in the array is a vowel, have it display a message.
        ArrayList<Character> letters26 = new ArrayList<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', "k", 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
        ArrayList<Character> sorted = uzz.Puzzle03(nameList);
        System.out.println(sorted);


        // PUZZLE 04
        // ● Generate and return an array with 10 random numbers between 55-100.
        ArrayList<Integer> random10 = uzz.Puzzele04();
        System.out.println(random10);


        // PUZZLE 05
        // ● Generate and return an array with 10 random numbers between 55-100 and 
        // have it be sorted (showing the smallest number in the beginning). 
        // Display all the numbers in the array. Next, display the minimum value in the array 
        // as well as the maximum value.
        ArrayList<Integer> random10of55To100 = uzz.Puzzele05();
        System.out.println(random10of55To100);


        // PUZZLE 06
        // ● Create a random string that is 5 characters long.
        String randomString = uzz.Puzzle06();
        System.out.println(randomString);


        // PUZZLE 07
        // ● Generate an array with 10 random strings that are each 5 characters long
        ArrayList<String> randomStringArray = uzz.Puzzle06();
        System.out.println(randomStringArray);
    }
}