//TODO: create a subtraction
// TODO: multiplication
// TODO: Division
//TODO: Add all the method to one
//TODO: Use scanner to create an input interaction
//TODO: Then use G
import java.util.Scanner;
public class Main {

    public static int addition(int firstNumber, int secondNumber){
        int result = firstNumber + secondNumber;
        return result;

    }
    public static int substraction(int firstNumber, int secondNumber){
        int answer = firstNumber - secondNumber;
        return answer;
    }

    public static int multipliaction(int firstNumber, int secondNumber){
        int output = firstNumber * secondNumber;
        return output;
    }
    public static int division(int firstNumber, int secondNumber){
        int answers = firstNumber / secondNumber;
        return answers;
    }
    public static int modulo(int firstNumber, int secondNumber){
        int results = firstNumber % secondNumber;
        return results;

    }
    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);
        System.out.println("Hello! What is your first number?");
        int firstNumber = cal.nextInt();
        System.out.println("What is the second number");
        int secondNumber = cal.nextInt();
        System.out.println("the two numbers together " + addition(firstNumber, secondNumber));
        System.out.println("the two numbers subtracted " + substraction(firstNumber, secondNumber));
        System.out.println("the two numbers multiplied " + multipliaction(firstNumber, secondNumber));
        System.out.println("the two numbers divided " + division(firstNumber, secondNumber));
        System.out.println("the two numbers modulo " + modulo(firstNumber, secondNumber));
        cal.close();
}
    }
