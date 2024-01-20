import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FridayExercises {
    public static void main(String[] args) {
        String parameter = "";
       int[] numbers = new int[] {1,2,3,4,5};
        int num1 = 6;
        int num2 = 7;
        int num3 = 8;
        int num4 = 9;
      //  first();
      //  askForNumber(parameter);
        add2(num1, num2, num3, num4);
    }

    static void first(){
        System.out.println("One call");
        second();
    }

    static void second(){
        System.out.println("Second method");
        first();
    }

    static String askForNumber (String returnedNumber){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int myInt = keyboard.nextInt();

        returnedNumber = String.valueOf(myInt);

        if(myInt % 2 == 0)
            System.out.println("*** The previous introduced number is Pair ***");
        else
            System.out.println("*** The previous introduced number is Odd ***");

        returnedNumber = System.out.printf("*** The selected number was: %s%n", returnedNumber + " ***").toString();

      return returnedNumber;
    }

    static void add (int[] numbers){
        for (int number : numbers)
            System.out.printf("Numbers: %s%n", number);
    }

    static  void add2 (int... numbers){
        for (int number : numbers)
            System.out.printf("Numbers: %s%n", number);
    }
}
