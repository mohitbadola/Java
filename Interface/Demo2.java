//Types of Interface

//1.Normal-> An interface having two or more methods.
//2.Functional/SAM(Single Abstract Method)-> An interface with exactly one abstract method, used for lambda expressions.
//3.Marker-> An interface that does not contain any methods, fields, Abstract Methods, and any Constants is Called a Marker interface.

//funtional Interface
// @FunctionalInterface
// /**
//  * A
//  */
// interface A {
//     void show();
// }

// @FunctionalInterface
// interface B{
//     void display(int i);
// }

// @FunctionalInterface
// interface C {
//     int add(int i, int j);
// }

public class Demo2 {
    public static void main(String[] args) {
        // A obj = new A() { //anonymous Inner class
        // public void show(){
        // System.out.println("functional interface A show");
        // }
        // };

        // Lambda expression only work with functional interface
        // A obj = () -> { // ("->") is lambda
        // System.out.println("Inside lambda expression in show");
        // };
        // obj.show();

        // A obj = ()->System.out.println("Inside lambda expression in show"); //single
        // statement doesn't req curly braces
        // obj.show();

        // B obj = i -> System.out.println("inside lambda exp in show : "+i); //passing
        // a value
        // obj.display(5);

        // C obj = (i, j) -> i + j; // returning a value
        // int res = obj.add(5, 4);
        // System.out.println(res);
    }
}
