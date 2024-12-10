package oops;

import encapsulation.Encapsulation;

public class Basics {
    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.age = 21;
//        p1.name = "Tanmay";
//        System.out.println(p1.name + "," + p1.age);

//        Person p2 = new Person();
//        p2.age = 30;
//        p2.name = "anil";
//        System.out.println(p2.name + "," + p2.age);

//        Person p3 = new Person("raj", 31);
//        System.out.println(p3.name + "," + p3.age);

//        Person p3 = new Person();
//        Person p4= new Person();

//        p1.eat();
//        p2.walk();
//        p2.walk(5);
//        System.out.println(Person.count);

//        Developer d1 = new Developer("raju", 31);
//        d1.walk();

        Encapsulation obj = new Encapsulation();
//        obj.doWork();
    }
}

class Developer extends Person{
    public Developer(String name, int age){
        super(name , age);

    }
    void walk() {
        System.out.println( "Developer " +name + " is walking");
    }
}

class Person {
    String name;
    int age;

    static int count = 0;

    public Person() {
        count++;
        System.out.println("creating an object using constructor");
    }

//    public Person(int newAge, String newName) {
//        this();                     // type 1 to use this keyword
//        name = newName;
//        age = newAge;
//    }

    public Person(String name, int age) {
        // type 2 to use this keyword
        this.name = name;  // 'this.name' refers to the instance variable
        this.age = age;   // 'this.age' refers to the instance variable
    }


    void walk() {
        System.out.println(name + " is walking");
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    void walk(int steps) {
        System.out.println(name + " walked " + steps + " steps");
    }

    void doWork(){
        System.out.println("is working");
    }


}
