//TODO: create a subtraction
// TODO: multiplication
// TODO: Division
//TODO: Add all the method to one
//TODO: Use scanner to create an input interaction
//TODO: Then use G
import java.util.Scanner;


public class Main {
    private int[] numbers;

    public Main(int[] numbers) {
        this.numbers = numbers;
    }

    public void setNumber(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumber() {
        return numbers;
    }

    public int addition(int secondNumber) {
        int add = 0;
        for (int i = 0; i < numbers.length; i++) {
            add += numbers[i];
        }
        return add;
    }

    public int subtraction(int secondNumber) {
        int sub = 0;
        for (int i = 0; i < numbers.length; i++) {
            sub -= numbers[i];
        }
        return sub;
    }

    public int multipliaction(int secondNumber) {
        int multiply = 0;
        for (int i = 0; i < numbers.length; i++) {
            multiply *= numbers[i];
        }
        return multiply;
    }

    public int division(int secondNumber) {
        int divide = 0;
        for (int i = 0; i < numbers.length; i++) {
            divide /= numbers[i];
        }
        return divide;
    }

    public int modulo(int secondNumber) {
        int mode = 0;
        for (int i = 0; i < numbers.length; i++){
            mode %= numbers[i];
    }
    return mode;

}
    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);
        System.out.println("Hello! What are your numbers?");

        int firstNumber = cal.nextInt();//why can't i use an array here?

        /** THESE ARE THE TWO WAYS TO CREATE AN OBJECT
        Main calculator = new Main(firstNumber);
        Main calculator2 = new Main(firstNumber)
         */
        Main calculator = new Main(new int[]{firstNumber});//why is this an array?


        System.out.println("What is the second number");
        int secondNumber = cal.nextInt();
        System.out.println("the numbers added " + calculator.addition(secondNumber));
        System.out.println("the numbers subtracted " + calculator.subtraction(secondNumber));
        System.out.println("the numbers multiplied " + calculator.multipliaction(secondNumber));
        System.out.println("the numbers divided " + calculator.division(secondNumber));
        System.out.println("the numbers modulo " + calculator.modulo(secondNumber));
        cal.close();
}
    }
