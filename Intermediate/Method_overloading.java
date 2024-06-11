package Intermediate;
// Instance method -- here the method add can access all the props of Calc class and can modify it for calling this add we need to create a instance of it

class Calc{
    public  int num=10;
    public  void add(int n1, int n2){
        System.out.println("The sum of two numbers is: "+(n1+n2+num));
    } 
    
}
public class Method_overloading {
    public static int  numo=10;
    // if we don't make this method static then we need to do create the instance of its outer class first as it is connected to it 
    // but if we make it static that means now it is standalone and we can directly make instance of it
    public static class Calc2{
        // static method -- here the method cannot access the property of the class for accessing the methods we can directly call it 
        private  int a=10;
        // here also if we don't make this static then it will behave like instance method which can access its class properties
        public void multi(int n1, int n2){
            System.out.println("The multiplication of two number is: "+(n1*n2));
        }
        
    }
    public static void main(String[] args) {
        Calc obj= new Calc();
        Calc2 ob1= new Calc2();
        // Calc2.multi(2, 5);
        ob1.multi(3,3);
        // To access the inner class that has implicit ref to the outer class Method_overloading we first have to create the obj of outer class;
        // Method_overloading objj= new Method_overloading();
        // Method_overloading.Calc2 obj1= objj.new Calc2();
        // obj1.multi(2,3);

        obj.add(5, 5);

    }
}

// Object-Oriented Programming (OOP) Concepts

// Classes and objects
// Constructors
// Methods (instance methods, static methods)
// Inheritance
// Polymorphism
// Encapsulation
// Abstraction