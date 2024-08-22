class A {
    int age;

    public void show() {
        System.out.println("In show");
    }

    class B {
        public void config() {
            System.out.println("in Config");
        }
    }

    static class C {
        public void ex() {
            System.out.println("In static Class");
        }
    }
}

class D {
    public void show() {
        System.out.println("in D show");
    }
}

// abstract class                   //abstract class req derived class  or annonymous inner class to use
abstract class E {                  // abstract method should always be overriden or defined in inheriting(derived) class
    public abstract void display(); // abstract method should always be in abstract class but not vice versa
                                    // (i.e abstract class can have only abstract method or only non abstract methods or both)
    public void show(){
        System.out.println("non abstract method");  
    }
}                                   
                                    


class F extends E{                                              //always override abstract method in derived class
    public void display(){
        System.out.println("abstract class overriden in derived class");
    }
}

/**
 * Demo
 */
public class Demo {

    public static void main(String[] args) {
        // A obj = new A();
        // obj.show();

        // A.B obj1 = obj.new B(); // for Inner class
        // obj1.config();

        // A.C obj2 = new A.C(); // for static Inner class
        // obj2.ex();

        // D ob = new D() {
        // public void show() { // Anonymous Inner class
        // System.out.println("In new show");
        // }
        // };
        // ob.show();

        // E obj3 = new E() { // abstract Inner class
        //     public void display() {
        //         System.out.println("abstract inner class");
        //     }
        // };
        // obj3.display();

        // F obj4 = new F();        abstract method in inherited class
        // obj4.display();
    }
}