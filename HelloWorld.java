import java.util.Scanner;

public class HelloWorld {

    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] a){

        Scanner sc = new Scanner(System.in);
        Constants c = new Constants();

        final double PI = 3.12;

//        sc.next(); //string input
//
        System.out.println(c.ENTER_NAME);
        int number = sc.nextInt(); //helps us to take integer input(int)
        sc.nextLine();
        System.out.println("number: "+number);
        long big_num = number;
        System.out.println("big_num: "+big_num);
        int anotherNum = (int)big_num;
//        boolean flag = sc.nextBoolean();
        System.out.println("Enter name");
        String name = sc.nextLine();  //Allows to String input
        sc.nextDouble();
        sc.nextFloat();
        sc.nextBoolean();
        if(number>anotherNum) {
            System.out.println(number);
        }


        System.out.println("Hello "+name);
    }
}
