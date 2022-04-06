
//OOPS --> Object-Oriented Programing
//Object --> 1) Properties
//           2) Functionalities
//Laptop --> price, color, company
//          playmusic, playvideo,runprogram

//We create using class
//class --> Blueprint/Template for creating object
//empty enquiry form --> template --> class
//Fill the form --> real world objects

class Laptop1{
    int price;
    String cname;

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

public class DemoOops2 {
    public static void main(String[] args){
        Laptop1 lp1 = new Laptop1();
        lp1.price = 10000;
        lp1.cname = "Dell";

        lp1.myLaptopDetail();
        lp1.playMusic();

        Laptop1 lp2 = new Laptop1();
        lp2.price = 50000;
        lp2.cname = "Hp";

        lp2.myLaptopDetail();
        lp2.playMusic();
    }
}
