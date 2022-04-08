package com.mysite.mypackage;

//default access -- not available outside
class DemoTestPrivate {

    private int id = 10;

    public void addition(int x,int y){
        System.out.println(x+y);
    }

    //using within class itself
    private class Test2 {

    }
}
