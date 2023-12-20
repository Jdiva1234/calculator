//TODO: create a subtraction
// TODO: multiplication
// TODO: Division
//TODO: Add all the method to one
//TODO: Use scanner to create an input interaction
//TODO: Then use GUI

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

     System.out.println("The final result of the two numbers you added together " + addition(17,20));
        System.out.println("The final result of the two numbers you subtracted together " + substraction(100,20));
        System.out.println("The final result of the two numbers you modulo together " + modulo(127,20));
        System.out.println("The final result of the two numbers you multiplied together " + multipliaction(197,20));
        System.out.println("The final result of the two numbers you divided together " + division(1207,20));

    }
}