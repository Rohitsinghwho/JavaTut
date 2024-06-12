package Intermediate;

class Human{
    // This is also called as encaplsulating the data as nobdy is directly able to access the private fields
    private String name;
    private int age;
    private String Bike;

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



// This is inheritance as all the methods of Human is now AdvanceHuman
class AdvanceHuman extends Human{


    private int Ear;
    private int Eye;
    private int limbs;

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

class SuperHuman extends AdvanceHuman{
    private String superPower;
    private int brainCells;

    public String getSuperPower(){
        return superPower;
    }

    public int getBrainCells(){
        return brainCells;
    }
    public void setSuperPower(String superPower){
        this.superPower=superPower;
    }
    public void setBrainCells(int brainCells){
        this.brainCells=brainCells;
    }
}

public class Inhertance {
    public static void main(String[] args) {
        SuperHuman h1= new SuperHuman();
        SuperHuman h2= new SuperHuman();
        // AdvanceHuman h2= new AdvanceHuman();
        // AdvanceHuman h3= new AdvanceHuman();
        h1.setName("Hansraj Hathi");
        h1.setAge(22);
        h1.setBike("Splendor");
        h2.setName("Aatmaram Bhide");
        h2.setAge(102);
        h2.setBike("Sakharam");
        h1.setEar(2);
        h1.setEye(2);
        h1.setLimbs(4);
        h1.setSuperPower("Can drink Water from mouth");
        h1.setBrainCells(11154);
        System.out.println(h1.getName()+" : "+h1.getAge()+" : "+h1.getBike()+" : "+h1.getEar()+" : "+h1.getEye()+" : "+h1.getLimbs()+" : "+h1.getSuperPower()+" : "+h1.getBrainCells());
        System.out.println(h2.getName()+" : "+h2.getAge()+" : "+h2.getBike());
        

    }
}
