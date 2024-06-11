package Basic_01;

public class DataTypes {
    public static void main(String[] args) {
        
        // In java there are two types of data types -- Primitive data Types and Reference data Types
        // Primitive data types are further divided into 8 categories
        // 1. Byte--Size->(8bits->1byte) The range of byte data type is between -128 to 127 and it is stored in the stack memory 
        byte b = 10;
        System.out.println("Byte value: " + b);

        // 2. short--Size->(16bits->2byte) The range of short data type is between -32,768 to 32,767 and it is stored in the stack memory 
        short s= 20;
        System.out.println("Short value: " + s);

        // 3. int--Size->(32bits->4byte) The range of int data type is between 2,147,483,648 to 2,147,483,647 and it is stored in the stack memory 
        int i=10000;
        System.out.println("Int value: " + i);

        // 4. long--Size->(64bits->8byte) it is stored in the stack memory 
        long l=123232343;
        System.out.println("Long value: " + l);

        // 5. float--Size->(32bits->4byte) The range of float data type is Approximately 1.4E-45 to 3.4028235E38 and it is stored in the stack memory 
        float f= 55.2f;
        System.out.println("Float value" +f);

        // 6. double--Size->(64bits->8byte) it is stored in the stack memory 
        double d= 564.22;
        System.out.println("Double value: " + d);

        // 7. char--Size->(16bits->2byte) it is stored in the stack memory 
        char c= 'a';
        System.out.println("Char value: " + c);

        boolean n=true;
        System.out.println("Boolean value: " + n);
    }
}
