package OOPS;

public class OOPS {
    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.setColor("Blue");
        // p1.setTip(4);
        // // System.out.println(p1.color+" "+p1.tip);  ---> Error after setting the attributes to private
        // System.out.println(p1.getColor());
        // System.out.println(p1.getTip());

        // Student s1 = new Student("Alkesh",28);
        // System.out.println(s1.name+" "+s1.roll);

        // Boy b1 = new Boy();
        // b1.call("Alkesh");
        // b1.gen = "Male";
        // b1.gender();

        // Mustang m1 = new Mustang();
        // m1.walk();
        // Horse h1 = new Horse();
        // h1.walk();
        // Hierarchy = Animal -> Horse -> Mustang
        // Animal a1 = new Animal();  --> Error : We cannot create an object of abstract class

        Bear b1 = new Bear();
        b1.eat("chicken");
        b1.eat(2);
    }   
}

class Pen{
    // Attributes
    private String color;
    private int tip;

    // Functions
    void setColor(String newColor){
        color = newColor;
    }

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

    // Constructor
    class Student{
        String name;
        int roll;

        Student(String name,int roll){
            this.name = name;
            this.roll = roll;
        }
    }


// inheritance
class Human{
    int age;

    void eat(){
        System.out.println("Eating..");
    }
    void call(String name){
        System.out.println("My name is " + name);
    }
}

class Boy extends Human{
    String gen;

    void gender(){
        System.out.println("My gender is " + gen);
    }
}

abstract class Animal{
    Animal(){
        System.out.println("Constructor of animal class");
    }

    void eats(){
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Constructor of horse class");
    }

    void walk(){
        System.out.println("Horse is walking");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Constructor of Mustang class");
    }

    void walk(){
        System.out.println("Mustang is walking");
    }
}

// Interfaces
interface chess{
    // void moves();{}  -> Error : The interface chess cannot define an initializer

    void moves();
}

class Queen implements chess{
    public void moves(){
        System.out.println("Queen is moving");
    }
}

class King implements chess{
    public void moves(){
        System.out.println("King is moving");
    }
}

interface Herbivore{
    void eat(String food);
}

interface Carnivore{
    void eat(int items);
}

class Bear implements Herbivore,Carnivore{

    // void eat(String food){      --> error : class from interface must be declared as public

    // }
    public void eat(String food){
        System.out.println("Bear is eatting "+food);
    }

    public void eat(int items){
        System.out.println("Bear is eatting "+items);
    }
}

