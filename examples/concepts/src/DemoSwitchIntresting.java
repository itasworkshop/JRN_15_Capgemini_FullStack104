import java.util.Scanner;

public class DemoSwitchIntresting {

    public static void main(String[] args){

        //taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your input for 'day' :");
        int day = sc.nextInt();

        //System.out.println("Please Enter your input for 'day' :");
        //int day1 = sc.nextInt();
       //int day = 30;

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("No Idea!");
        }


    }
}
