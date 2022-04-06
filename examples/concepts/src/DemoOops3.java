
//OOPS --> Object-Oriented Programing
//Object --> 1) Properties
//           2) Functionalities
//Laptop --> price, color, company
//          playmusic, playvideo,runprogram

//We create using class
//class --> Blueprint/Template for creating object
//empty enquiry form --> template --> class
//Fill the form --> real world objects

class Laptop2{
    int price;
    String cname;

    //constructor --> used for initialisation, automatically getting called during object creation
    Laptop2(int p,String name){
        this.price = p;
        this.cname = name;
    }

    public void myLaptopDetail(){
        System.out.println("This is my "+this.cname+" of price "+this.price); //this keyword --> current object
    }

    public void playMusic(){
        System.out.println("Playing your favorite song!");
    }

    public void playMovie(){
        System.out.println("Playing your favorite movie!");
    }

}

public class DemoOops3 {
    public static void main(String[] args){
        Laptop2 lp1 = new Laptop2(25000,"Mac");
        Laptop2 lp2 = new Laptop2(55000,"Apple");

        lp1.myLaptopDetail();
        lp2.myLaptopDetail();

    }
}
