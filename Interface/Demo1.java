// enum Status {
//     Running, Failed, Pending, Success; // (Ordinal) 0 - running 1-failed and so on
// }

// enum Laptop {
//     Macbook(2000), XPS(1000), Surface, Thinkpad(1500);

//     private int price;

//     private Laptop() {
//         price = 500;
//     }

//     private Laptop(int price) {
//         this.price = price;
//     }

//     public int getPrice() {
//         return price;
//     }

//     public void setPrice(int price) {
//         this.price = price;
//     }
// }

public class Demo1 {
    public static void main(String[] args) {
        // Status s = Status.Running;
        // System.out.println(s);
        // System.out.println(s.ordinal()); //ordinal is like index
        // Status[] ss = Status.values();
        // for (Status state : ss) {
        // System.out.println(state + " " + state.ordinal());
        // }
        // for (Status myVar : Status.values()) {
        // System.out.println(myVar);
        // }

        // enum with if else
        // Status st = Status.Running;
        // if (st == Status.Running) {
        // System.out.println("All good");
        // } else if (st == Status.Failed) {
        // System.out.println("Try Again");
        // } else if (st == Status.Pending) {
        // System.out.println("Wait");
        // } else
        // System.out.println("Done");

        // enum with switch
        // Status stat = Status.Running;
        // switch (stat) {
        // case Running:
        // System.out.println("All good");
        // break;
        // case Failed:
        // System.out.println("Try Again");
        // break;
        // case Pending:
        // System.out.println("Wait");
        // break;
        // default:
        // System.out.println("Done");
        // break;
        // }

        // Laptop lp = Laptop.Macbook;
        // System.out.println(lp+" "+lp.getPrice());

        // for(Laptop lap : Laptop.values()){
        // System.out.println(lap +" "+lap.getPrice());
        // }
        // Laptop lp = Laptop.Macbook;
        // lp.setPrice(12);
        // System.out.println(lp.getPrice()+" "+lp);
    }
}
