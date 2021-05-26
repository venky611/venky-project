package day2;

public class Variables {

    //variable inside class is known as global variable
    int i;   //instance variable
    static int j; //class variable
    byte k;
    static byte l;
    short a;
    long b;
    float c;
    double d;
    char e;
    boolean f;
    
    
    //notes : by default system will give default value to global variable not to local variable 

 

    public static void main(String[] args) {
        //variable inside a method/function is known as local variable
        int k=8;
        System.out.println(k);
        byte g=6;
        System.out.println(g);
        
        //since i want to access global variable i which is non static inside static void main 
        //so i have to create object of Variable class
        Variables v=new Variables(); //create object of class Variable
        System.out.println(v.i);
        System.out.println(l);
        System.out.println(v.k);
        System.out.println(v.a);
        System.out.println(v.b);
        System.out.println(v.c);
        System.out.println(v.d);
        System.out.println(v.e);
        System.out.println(v.f);
    }

 	}


