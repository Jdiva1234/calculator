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

    public int addition() {
        int add = 0;
        for (int i = 0; i < numbers.length; i++) {
            add += numbers[i];
        }
        return add;
    }

    public int subtraction() {
        int sub = 0;
        for (int i = 0; i < numbers.length; i++) {
            sub -= numbers[i];
        }
        return sub;
    }

    public int multiplication() {
        int multiply = 1;
        for (int i = 0; i < numbers.length; i++) {
            multiply *= numbers[i];
        }
        return multiply;
    }

    public int division() {
        int divide = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
           if(numbers[i] != 0) {
               divide /= numbers[i];
           }else{
               System.out.println("You can't divide by zero");
           }
        }
        return divide;
    }

    public int modulo() {
        int mode = numbers[0];
        for (int i = 1; i < numbers.length; i++){
           if(numbers[i] != 0){
               mode %= numbers[i];
           }else {
               System.out.println("The mode is " + mode);
           }
    }
    return mode;

}
    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);
        System.out.println("How many numbers do you want to educate?");
        int firstNumber = cal.nextInt();//why can't I use an array here?

        int[] number = new int[firstNumber];
        Main calculator = new Main(number);//why is this an array?
        System.out.println("Enter the numbers");
        for(int i=0; i < firstNumber; i++){
            number[i] = cal.nextInt();//why is this not working?
        }
        System.out.println("the numbers added " + calculator.addition());
        System.out.println("the numbers subtracted " + calculator.subtraction());
        System.out.println("the numbers multiplied " + calculator.multiplication());
        System.out.println("the numbers divided " + calculator.division());
        System.out.println("the numbers modulo " + calculator.modulo());
        cal.close();
}
    }


