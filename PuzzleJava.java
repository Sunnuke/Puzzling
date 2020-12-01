import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    
        // PUZZLE 01
        //  Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. 
        // Print the sum of all numbers in the array. Also have the function return an array that only 
        // includes numbers that are greater than 10 (e.g. when you pass the array above, 
        // it should return an array with the values of 13,25,32)
        public ArrayList<Integer> PuzzeleI(ArrayList<Integer> arr) {
            int sum = 0;
            System.out.print("Old array: " + arr + "\n");
            ArrayList<Integer> newArr = new ArrayList<Integer>();
            for (int i = 0; i < arr.size(); i++) {
                sum = sum + arr.get(i);
                if (arr.get(i) > 10) {
                    int x = arr.get(i);
                    newArr.add(x);
                }
            }
            System.out.println("Sum: " + sum);
            return newArr;
        }


        // PUZZLE 02
        //  Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. 
        // Shuffle the array and print the name of each person. Have the method also
        // return an array with names that are longer than 5 characters.
        public ArrayList<String> PuzzeleII(ArrayList<String> arr) {
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).length() < 6) {
                    arr.remove(i);
                }
            }
            return arr;
        }


        // PUZZLE 03
        //  Create an array that contains all 26 letters of the alphabet (this array must have 26 values). 
        // Shuffle the array and, after shuffling, display the last letter from the array. 
        // Have it also display the first letter of the array. 
        // If the first letter in the array is a vowel, have it display a message.
        public ArrayList<Character> PuzzeleIII() {
            String abc = "abcdefghijklmnopqrstuvwxyz";
            ArrayList<Character> letters = new ArrayList<Character>();
            for (int i = 0; i < abc.length(); i++) {
                char let = abc.charAt(i);
                letters.add(let);
            }
            System.out.println("Alphabet List: " + letters);
            System.out.println("Shuffling List!");
            Collections.shuffle(letters);
            System.out.println("Last Letter: " + letters.get(letters.size() - 1));
            System.out.println("First Letter: " + letters.get(0));
            if (letters.get(0) == 'a' || letters.get(0) == 'e' || letters.get(0) == 'i' || letters.get(0) == 'o' || letters.get(0) == 'u'){
                System.out.println(letters.get(0) + " Is a Vowel");
            }
            return letters;
        }


        // PUZZLE 04
        //  Generate and return an array with 10 random numbers between 55-100.
        public ArrayList<Integer> PuzzeleIV() {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for (int i = 0; i < 10; i++) {
                Random x = new Random();
                int num = x.nextInt(100 - 55) + 55;
                arr.add(num);
            }
            return arr;
        }


        // PUZZLE 05
        //  Generate and return an array with 10 random numbers between 55-100 and 
        // have it be sorted (showing the smallest number in the beginning). 
        // Display all the numbers in the array. Next, display the minimum value in the array 
        // as well as the maximum value.
        public ArrayList<Integer> PuzzeleV() {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for (int i = 0; i < 10; i++) {
                Random x = new Random();
                int num = x.nextInt(100 - 55) + 55;
                arr.add(num);
            }
            int max = arr.get(0);
            int min = arr.get(0);
            for (int i = 0; i < 10; i++) {
                if ((int) arr.get(i) > (int) max) {
                    max = arr.get(i);
                }
                if ((int) arr.get(i) < (int) min) {
                    min = arr.get(i);
                }
            }
            Collections.sort(arr);
            int mx = max;
            int mn = min;
            arr.add(mx);
            arr.add(mn);
            return arr;
        }


        // PUZZLE 06
        //  Create a random string that is 5 characters long.
        public String PuzzeleVI() {
            String abc = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            String str = new String();
            for (int i = 0; i < 5; i++) {
                int x = new Random().nextInt(abc.length());
                String letter = String.valueOf(abc.charAt(x));
                str = str + letter;
            }
            return str;
        }


        // PUZZLE 07
        //  Generate an array with 10 random strings that are each 5 characters long
        public ArrayList<String> PuzzeleVII() {
            String abc = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            ArrayList<String> strArr = new ArrayList<String>();
            for (int j = 0; j < 10; j++) {
                String str = new String();
                for (int i = 0; i < 5; i++) {
                    int x = new Random().nextInt(abc.length());
                    String letter = String.valueOf(abc.charAt(x));
                    str = str + letter;
                }
                strArr.add(str);
            }
            return strArr;
        }
}