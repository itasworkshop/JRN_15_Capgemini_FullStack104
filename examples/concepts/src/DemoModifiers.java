
//Access Modifiers
//public, private and protected --> classes, methods and variables
//default --> if nothing is provided --> not available outside package
//public --> you can access public from everywhere
//private --> only where you define
//protected --> only in inheritance


import com.mysite.mypackage.DemoTest;

public class DemoModifiers {

    public static  void main(String[] args){

        DemoTest obj = new DemoTest();
        //DemoTestPrivate --> not accessible
        //obj.id  //only where you define

    }
}
