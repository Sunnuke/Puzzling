import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava uzz = new PuzzleJava();
        
        // PUZZLE 01
        System.out.println("PUZZLE 01");
        //  Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. 
        // Print the sum of all numbers in the array. Also have the function return an array that only 
        // includes numbers that are greater than 10 (e.g. when you pass the array above, 
        // it should return an array with the values of 13,25,32)
        ArrayList<Integer> values = new ArrayList<Integer>( Arrays.asList( 3,5,1,2,7,9,8,13,25,32 ) );
        ArrayList<Integer> changed = uzz.PuzzeleI(values);
        System.out.println("New array: " + changed);


        // PUZZLE 02
        System.out.println("PUZZLE 02");
        //  Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. 
        // Shuffle the array and print the name of each person. Have the method also
        //  return an array with names that are longer than 5 characters.
        ArrayList<String> nameList = new ArrayList<String>(Arrays.asList("Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"));
        System.out.println("List Names: " + nameList);
        ArrayList<String> bigNames = uzz.PuzzeleII(nameList);
        System.out.println("Names greater than 5 letters: " + bigNames);


        // PUZZLE 03
        System.out.println("PUZZLE 03");
        //  Create an array that contains all 26 letters of the alphabet (this array must have 26 values). 
        // Shuffle the array and, after shuffling, display the last letter from the array. 
        // Have it also display the first letter of the array. 
        // If the first letter in the array is a vowel, have it display a message.
        ArrayList<Character> sorted = uzz.PuzzeleIII();
        System.out.println("Shuffled Alphabet: " + sorted);


        // PUZZLE 04
        System.out.println("PUZZLE 04");
        //  Generate and return an array with 10 random numbers between 55-100.
        ArrayList<Integer> random10 = uzz.PuzzeleIV();
        System.out.println("An array of 10 Random Numbers between 55-100: " + random10);


        // PUZZLE 05
        System.out.println("PUZZLE 05");
        //  Generate and return an array with 10 random numbers between 55-100 and 
        // have it be sorted (showing the smallest number in the beginning). 
        // Display all the numbers in the array. Next, display the minimum value in the array 
        // as well as the maximum value.
        ArrayList<Integer> random10of55To100 = uzz.PuzzeleV();
        System.out.println("An array of 10 Random Numbers between 55-100 with the Max and Min Values at the end: " + random10of55To100);


        // PUZZLE 06
        System.out.println("PUZZLE 06");
        //  Create a random string that is 5 characters long.
        String randomString = uzz.PuzzeleVI();
        System.out.println("A random String 5 characters long: " + randomString);


        // PUZZLE 07
        System.out.println("PUZZLE 07");
        //  Generate an array with 10 random strings that are each 5 characters long
        ArrayList<String> randomStringArray = uzz.PuzzeleVII();
        System.out.println("An array with 10 random strings that are 5 characters long: " + randomStringArray);
    }
}