//Custom Exception
// class CustomException extends Exception{
//     public CustomException(String str){
//         super(str);
//     }
// }

class A {
    public void show() throws ClassNotFoundException //Ducking exceptions using throws
    {
        // try {
        //     Class.forName("Calc");
        // } catch (ClassNotFoundException e) {
        //     System.out.println("Not able to find the class");
        // }
        
        Class.forName("Calc");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        // int i = 20;
        // int j = 0;
        // try {
        // j = 18 / i;
        // if (j == 0)
        // throw new CustomException("Don't print zero");
        // } catch (CustomException e) {
        // j = 18 / 1;
        // System.out.println("Default output " + e);
        // } catch (Exception e) {
        // System.out.println("Something went wrong.. " + e);
        // }
        // System.out.println(j);
        // System.out.println("bye");

        //A obj = new A();
        // obj.show();

        A obj = new A();
        try {
        obj.show();
        } catch (ClassNotFoundException e) {
        //e.printStackTrace();
        System.out.println("Not able to find the class");
        }
    }
}
