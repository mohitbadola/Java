/**
 * Demo
 */
public class Demo {                                                         
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int arr[] = new int[5];
        //String str = null;
        // try-catch block
        try {
            j = 18 / i;
            //System.out.println(str.length());
            System.out.println(arr[0]);
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bound");
        } catch (Exception e) {
            System.out.println("Something went wrong: "+e);
        }

        System.out.println(j);
        System.out.println("Finish");
    }
}