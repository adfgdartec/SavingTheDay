import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Declaring Variables
        int heroMagic = 12;
        int numLights = 20;
        boolean hasGauntlet = true;

        if (heroMagic > numLights) {
            System.out.println("You save the day!");
        }
        else if(hasGauntlet == true){
            System.out.println("You're not strong enough to light all the lights, but you hold up your gauntlet and it reflects enough light to keep the people safe.");
        }
        else {
            System.out.println("It was not enough!");
        }

        Scanner InputOne;
        InputOne = new Scanner(System.in);

        Scanner InputTwo;
        InputTwo = new Scanner(System.in);

        int numberOne;
        int numberTwo;

        System.out.println("Type a Number: ");

        System.out.println("Type Another Number: ");

        numberOne = InputOne.nextInt();
        numberTwo = InputTwo.nextInt();

        Scanner InputThree;
        InputThree = new Scanner(System.in);

        String input;
        System.out.println("Would you like you to add, subtract, multiply, or divide the numbers?");

        input = InputThree.nextLine();
        if(input == "add") {
            input = InputThree.nextLine();
            int addedNumbers = numberOne + numberTwo;
            System.out.println("Added Numbers = " + addedNumbers);
        }
       else if(input == "subtract") {
            input = InputThree.nextLine();
            int subtractNumbers = numberOne - numberTwo;
            System.out.println("Subtracted Numbers = " + subtractNumbers);
        }
       else if( input == "multiply") {
            input = InputThree.nextLine();
            int multipliedNumbers = numberOne * numberTwo;
            System.out.println("Multiplied Numbers = " + multipliedNumbers);
        }
       else if( input == "divide") {
            input = InputThree.nextLine();
            int dividedNumbers = numberOne / numberTwo;
            System.out.println("Divided Numbers = " + dividedNumbers);
        }


    }
}
