/*class calculator{
    public int add(int num1,int num2){
        return num1+num2;
    }

    public int minus(int num1,int num2){
        return num1-num2;
    }

    public int mul(int num1,int num2){
        return num1*num2;
    }
}*/

/*class Student{
String name;
int roll_no;
int marks; 
}*/

/**
 * Human
 */
// Encapsulation
class Human {
    private int age;
    private String name;

    //Constructor

    public Human(){                                 //default constructor
        age = 18;
        name = "Anonymous";
    }

    public Human(int a, String n){                 //Parameterized constructor
        age = a;
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

/**
 * hello
 */
public class hello {
    public static void main(String[] args) {

        /*
         * int num1 = 4, num2 = 4;
         * calculator cal = new calculator();
         * int sum = cal.add(num1, num2);
         * int diff = cal.minus(num1, num2);
         * int product = cal.mul(num1, num2);
         * System.out.println(sum);
         * System.out.println(diff);
         * System.out.println(product);
         */

        /*
         * 1-D array
         * int arr[] = new int[4];
         * arr[1] = 2;
         * arr[2] = 3;
         * arr[3] = 4;
         * //System.out.println(arr[1]);
         * for(int i=0; i<4; i++)System.out.println(arr[i]);
         */

        /*
         * 2-D array
         * int arr[][] = new int[3][3];
         * for(int i=0;i<3;i++){
         * for(int j=0;j<3;j++){
         * arr[i][j] = (int)(Math.random()*10);
         * }
         * }
         * 
         * for(int i=0;i<3;i++){
         * for(int j=0;j<3;j++){
         * System.out.print(arr[i][j]+" ");
         * }
         * System.out.println();
         * }
         * 
         * for(int n[]:arr){
         * for(int m:n){
         * System.out.print(m+" ");
         * }
         * System.out.println();
         * }
         */

        /*
         * jagged array
         * int arr[][] = new int[3][];
         * arr[0] = new int[4];
         * arr[1] = new int[2];
         * arr[2] = new int[3];
         * for(int i=0;i<arr.length;i++){
         * for(int j=0;j<arr[i].length;j++){
         * arr[i][j] = (int)(Math.random()*10);
         * }
         * }
         * 
         * for(int n[]:arr){
         * for(int m:n){
         * System.out.print(m+" ");
         * }
         * System.out.println();
         * }
         */

        /*
         * array of objects
         * Student s1 = new Student();
         * s1.name = "Mohit";
         * s1.roll_no = 1;
         * s1.marks = 49;
         * 
         * Student s2 = new Student();
         * s2.name = "Sohit";
         * s2.roll_no = 2;
         * s2.marks = 48;
         * 
         * Student s3 = new Student();
         * s3.name = "Pulkit";
         * s3.roll_no = 3;
         * s3.marks = 47;
         * 
         * Student students[] = new Student[3];
         * 
         * students[0] = s1;
         * students[1] = s2;
         * students[2] = s3;
         * 
         * for(int i=0; i<students.length; i++){
         * System.out.println(students[i].roll_no+" "+students[i].name+" "+students[i].
         * marks);
         * }
         */

        /*
         * Enhanced for loop
         * for(Student stud : students){
         * System.out.println(stud.roll_no+" : "+stud.name+" : "+ stud.marks);
         * }
         */

        Human obj = new Human();
        Human obj1 = new Human(18, "Mohit");
        // obj.setAge(21);
        // obj.setName("Mohit");
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());


        int n = 1;
        Integer num = n;    //auto-boxing
        
        int n1 = num;       //auto-unboxing

        System.out.println(n +" "+num+" "+n1);

        String str = "12";
        int number = Integer.parseInt(str);
        System.out.println(str +" "+number*2);

    }
}