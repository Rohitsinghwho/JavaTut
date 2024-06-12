package Intermediate;

/**
 * MethodOverloading
 */
public class MethodOverloading {

    public static class Calculator {
        // Method overloading is a concept in which you overload the same function with more parameters 
        public int add(int num1,int num2){
            return num1 + num2;
        }
        public int add(int num1,int num2,int num3,char c){
            return num1 + num2 + num3+c;
        } 
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10, 20,10,'a')); // Output: 137

    }
}