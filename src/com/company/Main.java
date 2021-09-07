package com.company;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

class Person {
    public String Name;
    public int Age;
    public static String Species = "Human";

    public Person(String name, int age) {
        this.Name = name;
        this.Age = age;
    }

    public void Describe(){
        System.out.println("Your name is " + this.Name + " and you are " + this.Age + " years old!");
    }

    public static Person CreateMiddleAgedPerson(String name) {
        return new Person(name, 45);
    }

    public static Person CreateBaby(String name) {
        return new Person(name, 1);
    }

    public static Person CreateChild(String name) {
        return new Person(name, 5);
    }

    public void Say(String message) {
        System.out.println(this.Name + ": " + message);
    }

    public void Ask(String message) {
        System.out.println(this.Name + ": " + message + "?");
    }

    public static void Yell(String message){
        System.out.println("Something" + ": " + message);
    }
}

class Application {
    public String Name;
    public boolean IsRunning;

    public Application(String name) {
        this.Name = name;
        this.IsRunning = false;
    }

    public void Run() {
        System.out.println("Starting " + this.Name);
        Scanner scanner = new java.util.Scanner(System.in);
        this.IsRunning = true;

        while (this.IsRunning) {
            System.out.println("\nWhat would you like to do?");
            String input = scanner.nextLine();

            if (Objects.equals(input, "quit")) {
                this.IsRunning = false;
            } else {
                System.out.println("Invalid command!");
            }
        }

        System.out.println("Quitting " + this.Name);
    }
}

public class Main {
    public int TimeOfApplication = 15;

    public static void main(String[] args) {

        //Remove the comments as you wish! Remember control click!

        //TakeUserInput();

        //CreatingApps();

        //LoopThroughArgs(args);

        //StaticFactories();

        //WhileLoopExample();

        //IntegersAndPrinting();

        //InstancesOfMainAndStaticVsInstance();

        //StaticVsInstanceField();
    }

    private static void TakeUserInput() {
        System.out.print("Please enter your name!: ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        name = name.toLowerCase(Locale.ROOT);
        System.out.println("Your name is " + name);
    }

    private static void CreatingApps() {
        Application app_two = new Application("Lame Game");
        Application app_three = new Application("Boring Game");
        Application app_four = new Application("Stressful Game");
        Application app = new Application("Awesome Game");
        app.Run();
    }

    private static void LoopThroughArgs(String[] args) {
        for (String arg : args) {
            System.out.println("Argument: " + arg.toUpperCase(Locale.ROOT));
        }
    }

    private static void StaticFactories() {
        Person baby = Person.CreateBaby("Amy");
        Person middleAged = Person.CreateMiddleAgedPerson("Henry");
        Person child = Person.CreateChild("Gary");

        baby.Describe();
        middleAged.Describe();
        child.Describe();
    }

    private static void WhileLoopExample() {
        int i = 0;

        while (i < 10) {
            System.out.print(i + "\t");
            i = i + 1; //Must escape!!! Make sure it escapes!!!
            //In this case i will keep going until it becomes 10,
            // which then the while loop will escape

            //Also remember
            //    i = i + 1
            //  is the same as
            //    i += 1
            //  and shorthand when only adding one is:
            //    i++
        }
    }

    private static void IntegersAndPrinting() {
        int i = 5;
        i = 10 + i;
        System.out.println(i);
    }

    private static void InstancesOfMainAndStaticVsInstance() {
        Main harry = new Main();
        Main alex = new Main();
        Main amy = new Main();
        alex.TimeOfApplication = 10;
        harry.TimeOfApplication = 20;
        amy.TimeOfApplication = 80;

        int i = harry.TimeOfApplication;
        System.out.println(i);
        System.out.println(alex.TimeOfApplication);
        System.out.println(harry.TimeOfApplication);
    }

    private static void StaticVsInstanceField() {
        Person alex = new Person("Alex", 28);
        Person amy = new Person("Amy", 25);

        System.out.println(alex.Age);
        System.out.println(amy.Age);

        System.out.println(Person.Species);
        System.out.println(Person.Species);
    }
}