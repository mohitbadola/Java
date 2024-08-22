// class - class → extends
// class - interface →> implements
// interface - interface -> extends

interface A {
    int age = 24; // Interface attributes are by default public, static and final
    String name = "Mohit"; // can't contain a constructor (as it cannot be used to create objects)

    void show(); // Interface methods are by default abstract and public

    void config();
}

/**
 * X
 */
interface X {
    void run();
}

/**
 * Y
 */
interface Y extends X {

}

/**
 * B
 */
class B implements A, Y { // class can implement multiple interfaces.

    public void show() {
        System.out.println("Display");
    }

    public void config() {
        System.out.println("Config");
    }

    public void run() {
        System.out.println("Running");
    }
}

interface Computer {
    void code();
}

/**
 * Desktop
 */
class Desktop implements Computer {
    public void code() {
        System.out.println("Code, Compile, Run in Desktop");
    }
}

/**
 * Laptop
 */
class Laptop implements Computer {
    public void code() {
        System.out.println("Code, compile, run in Laptop");
    }
}

class Developer {
    public void devapp(Computer Comp) {
        Comp.code();
    }
}

/**
 * Demo
 */
public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.config();
        obj.show();
        System.out.println(A.age + " " + A.name);
        obj.run();

        Computer Comp = new Desktop(); // interface references
        Computer Comp1 = new Laptop();
        Developer Mohit = new Developer();
        Mohit.devapp(Comp);
        Mohit.devapp(Comp1);
    }
}