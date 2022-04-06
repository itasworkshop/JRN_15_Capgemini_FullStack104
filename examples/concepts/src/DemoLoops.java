public class DemoLoops {
    public static void main(String[] args){
        //Loop --> doing something again and again

        //print Hello World 5 times

        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");

        //while loop
        int counter = 10;
        while (counter<=5){
            System.out.println("Hello World! from while loop.");
            counter = counter + 1;
        }

        //do-while
        int counter2 = 10;
        do{
            System.out.println("Hello World! from do-while loop.");
            counter2 = counter2+1;
        }while (counter2<=5);

        //difference between while and do-while --> do-while will run at least once.
    }
}
