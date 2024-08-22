/*
Threads:-
Multiple threads run at same time in a code.
This is known as Multithreading.

- A thread is a smallest unit to work with. (individual task)
- They can run parallely.
- Multiple threads can share resources.
*/

//Differences between "extending" and "implementing" Threads

// The major difference is that when a class extends the Thread class, you cannot extend any other class,
// but by implementing the Runnable interface, it is possible to extend from another class as well,
// like: class MyClass extends OtherClass implements Runnable.

//Thread States
// - New State   
// - Runnable State  ->  start() method
// - Running State     -> a thead is running with run() method 
// - Waiting State	    -> sleep(),  wait() method
// - Dead State

// Through notify(), you will go to waiting state to runnable state.
// From Running, Runnable state to dead state through stop() method.

/**
 * A
 */
class A extends Thread { // extends cant

    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("hi");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

/**
 * B
 */
class B extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("hello");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(obj1.getPriority());

        obj1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();
    }
}
