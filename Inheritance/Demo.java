import tools.*;

public class Demo {
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(8, 4);
        int r2 = obj.sub(8, 4);
        int r3 = obj.multi(8, 4);
        int r4 = obj.div(8, 4);
        double r5 = obj.power(8, 4);
        System.out.println("Add :" + r1 + " Sub : " + r2 + " Mult : " + r3 + " Div : " + r4 + " Power : "+r5);
    }
}