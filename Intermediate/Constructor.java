package Intermediate;


class Human{
    // This is also called as encaplsulating the data as nobdy is directly able to access the private fields
    private String name;
    private int age;
    private String Bike;


    // Now there are two types of constructor --- defualt and parameterized consturctor
    // this is a default constructor if we don't make it its still there but nothing inside it
    public Human(){
        System.out.println("inside Human default constructor");

        this.name = "Unknown";
        this.age = 0;
        this.Bike = "No Bike";
    }

    // Parameterized constructor
    public Human(String name,int age,String Bike){
        System.out.println("inside Human Parameterized constructor");

        this.name = name;
        this.age = age;
        this.Bike = Bike;
    }
    // These are getters and setters for accessing the fields 
    public int  getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public String getBike(){
        return this.Bike;
    }

    
    public void  setAge(int age){
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setBike(String Bike){
        // this keyword refers to the current class here 
        this.Bike=Bike;
    }
}

class AdvanceHuman extends Human{


    private int Ear;
    private int Eye;
    private int limbs;


    public AdvanceHuman(){

        super();
        System.out.println("inside AdvanceHuman default constructor");
        this.Ear=0;
        this.Eye=0;
        this.limbs=0;
    }
    public AdvanceHuman(int Ear,int Eye, int limbs){

        super("Rohit",12,"Pulsur");
        System.out.println("inside AdvanceHuman Parmeterized constructor");
        this.Ear=Ear;
        this.Eye=Eye;
        this.limbs=limbs;
    }
    public int getEar() {
        return Ear;
    }
    public void setEar(int ear) {
        Ear = ear;
    }
    public int getEye() {
        return Eye;
    }
    public void setEye(int eye) {
        Eye = eye;
    }
    public int getLimbs() {
        return limbs;
    }
    public void setLimbs(int limbs) {
        this.limbs = limbs;
    }

    
}


public class Constructor {
    public static void main(String[] args) {
            // Human h1= new Human("Rohit",22,"Hunter");
            // System.out.println(h1.getName()+" : "+h1.getAge()+" : "+h1.getBike());       
            AdvanceHuman h2= new AdvanceHuman(2,2,4);
                     
    }
}
