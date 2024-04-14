
Answer:-2

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String reversed = reverseString(input);
        
        System.out.println("Reversed string: " + reversed);
        
        scanner.close();
    }
    
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}

Answer:-3

public class Main {
    static void reverses(String str)
    {
        char[] inputArray = str.toCharArray();
        char[] result = new char[inputArray.length];
 
        for (int i = 0; i < inputArray.length; i++)
        {
            if (inputArray[i] == ' ')
            {
                result[i] = ' ';
            }
        }
        
        int j = result.length - 1;
        
        for (int i = 0; i < inputArray.length; i++)
        {
 
            if (inputArray[i] != ' ')
            {
                if (result[j] == ' ')
                {
                    j--;
                }
                result[j] = inputArray[i];
                j--;
            }
        }
        System.out.println(String.valueOf(result));
    }
    
    public static void main(String[] args)
    {
        reverses("internship at physics wallah");
    }
}
