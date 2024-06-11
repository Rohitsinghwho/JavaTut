package Basic_01;

public class TypeCasting {
    public static void main(String[] args) {
        // Widening Casting (Implicit)
        // Widening casting is concept in which the data types are automaticly converted that is implicitly into larger data types 
        // The hierchy is as follow ---->>     byte > short > char > int > long > float > double
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myDouble); // Outputs 9.0

        // Narrowing Casting (explicit)
        // Narrowing casting is concept in which the data types are explicitly converted into smaller data types which can lead to data loss

        double val= 196.26;
        int valInt = (int) val; // Manual casting: double to int
        System.out.println(valInt); // Outputs 196

        int value= 200;
        byte by= (byte)value; //Manual casting: int to byte
        System.out.println(by); // Outputs -56 cause range of byte is -128 to 127 that is why it will modulo the value with 256  and give store the value
        

    }
}
