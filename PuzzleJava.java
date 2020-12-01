import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    
        // PUZZLE 01
        // ● Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. 
        // Print the sum of all numbers in the array. Also have the function return an array that only 
        // includes numbers that are greater than 10 (e.g. when you pass the array above, 
        // it should return an array with the values of 13,25,32)
        public ArrayList<Integer> Puzzele01(ArrayList<Integer> arr) {
            int sum = 0;
            ArrayList<Integer> newarr = new ArrayList<Integer>();
            for (int i = 0; i < arr.size(); i++) {
                sum = sum + arr.get(i);
                if (i > 10) {
                    newarr.add(i);
                }
            }
            System.out.print(sum);
            return newarr;
        }


        // PUZZLE 02
        // ● Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. 
        // Shuffle the array and print the name of each person. Have the method also
        // return an array with names that are longer than 5 characters.
        public ArrayList<String> Puzzele02(ArrayList<String> arr) {
            for (int i = 0; i < arr.size(); i++) {
                System.out.print(arr.get(i));
                if (arr.get(i).length() < 6) {
                    arr.remove(i);
                }
            }
            return arr;
        }


        // PUZZLE 03
        // ● Create an array that contains all 26 letters of the alphabet (this array must have 26 values). 
        // Shuffle the array and, after shuffling, display the last letter from the array. 
        // Have it also display the first letter of the array. 
        // If the first letter in the array is a vowel, have it display a message.
        public ArrayList<Character> Puzzele03(ArrayList<Character> arr) {
            Collections.shuffle(arr);
            System.out.print(arr.get(arr.size() - 1));
            System.out.print(arr.get(0));
            if (arr.get(0) == 'a' || arr.get(0) == 'e' || arr.get(0) == 'i' || arr.get(0) == 'o' || arr.get(0) == 'u'){
                System.out.print(arr.get(0) + " Is a Vowel");
            }
            return arr;
        }


        // PUZZLE 04
        // ● Generate and return an array with 10 random numbers between 55-100.
        public ArrayList<Integer> Puzzele04() {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for (int i = 0; i < 10; i++) {
                Random x = new Random();
                int num = x.nextInt(100 - 55 + 1);
                arr.add(num);
            }
            return arr;
        }


        // PUZZLE 05
        // ● Generate and return an array with 10 random numbers between 55-100 and 
        // have it be sorted (showing the smallest number in the beginning). 
        // Display all the numbers in the array. Next, display the minimum value in the array 
        // as well as the maximum value.
        public ArrayList<Object> Puzzele05() {
            ArrayList<Object> arr = new ArrayList<Object>();
            for (int i = 0; i < 10; i++) {
                Random x = new Random();
                int num = x.nextInt(100 - 55 +1);
                arr.add(num);
            }
            Object max = arr.get(0);
            Object min = arr.get(0);
            for (int i = 0; i < 10; i++) {
                if ((int) arr.get(i) > (int) max) {
                    max = arr.get(i);
                }
                if ((int) arr.get(i) < (int) min) {
                    min = arr.get(i);
                }
            }
            String mx = "Max = " + max;
            String mn = "Min = " + min;
            arr.add(mx);
            arr.add(mn);
            return arr;
        }


        // PUZZLE 06
        // ● Create a random string that is 5 characters long.
        public String Puzzele06() {
            String abc = "abcdefghijklmnopqrstuvwxyz"
            String str;
            for (int i = 0; i < 5; i++) {
                int x = new Random().nextInt(26);
                String letter = String.valueOf(abc.charAt(x));
                str = str + letter;
            }
            return str;
        }


        // PUZZLE 07
        // ● Generate an array with 10 random strings that are each 5 characters long
        public ArrayList<String> Puzzele07() {
            String abc = "abcdefghijklmnopqrstuvwxyz"
            ArrayList<String> strArr;
            for (int i = 0; i < 10; i++) {
                String str;
                for (int i = 0; i < 5; i++) {
                    int x = new Random().nextInt(26);
                    String letter = String.valueOf(abc.charAt(x));
                    str = str + letter;
                }
                strArr.add(str);
            }
            return strArr;
        }
}