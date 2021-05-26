package day2;

public class Variable {
    //variable inside class is known as global variable
    int i;   //instance variable
    static int j; //class variable
    
    //notes : by default system will give default value to global variable not to local variable 

 

    public static void main(String[] args) {
        //variable inside a method/function is known as local variable
        int k=8;
        System.out.println(k);
        
        //since i want to access global variable i which is non static inside static void main 
        //so i have to create object of Variable class
        Variable v=new Variable(); //create object of class Variable
        System.out.println(v.i);
        
        System.out.println(j);

 

    }

 

}