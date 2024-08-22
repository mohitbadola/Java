public class Demo1 {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try {
            j = 18 / i;
            if (j == 0)
                throw new ArithmeticException("Don't print zero");      //try-throw-catch
        } catch (ArithmeticException e) {
            j = 18 / 1;
            System.out.println("Default output " + e);
        } catch (Exception e) {
            System.out.println("Something went wrong.. " + e);
        }
        System.out.println(j);
        System.out.println("bye");
    }
}
