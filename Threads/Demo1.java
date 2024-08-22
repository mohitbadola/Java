// class Z {
// }

// class A extends Z implements Runnable {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable {
//     public void run() {
// for (int i = 0; i < 5; i++) {
//     System.out.println("hello");
//     try {
//         Thread.sleep(10);
//     } catch (InterruptedException e) {
//         e.printStackTrace();
//     }
// }
//     }
// }

public class Demo1 {
    public static void main(String[] args) {
        // 1 method
        // A obj1 = new A();
        // B obj2 = new B();
        // Thread t1 = new Thread(obj1);
        // Thread t2 = new Thread(obj2);
        // t1.start();
        // t2.start();

        // 2 method
        // Runnable obj1 = new A();
        // Runnable obj2 = new B();
        // Thread t1 = new Thread(obj1);
        // Thread t2 = new Thread(obj2);
        // t1.start();
        // t2.start();

        // 3 method using lambda expression
        Runnable obj1 = new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
