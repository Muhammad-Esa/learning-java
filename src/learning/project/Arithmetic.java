package learning.project;

public class Arithmetic {
    //Class Name Arithmetic will perform some arithmetic operations
    public static void main(String[] args){
        int numberOne=10;
        int numberTwo=3;
        System.out.println(numberOne - numberTwo);
        System.out.println(numberOne + numberTwo);
        System.out.println(numberOne * numberTwo);
        System.out.println(numberOne / numberTwo);
        System.out.println(numberOne % numberTwo);
        //BODMAS
        //B - Brackets
        //O - Order
        //D - Division
        //M - Multiplication
        //A - Addition
        //S - Subtraction
        System.out.println((2+2) * (3/1) * 2);

        System.out.println();

        int x=10;
        int y=3;
        //int result=x + y;
        //System.out.println(result);

        x %= y;   //This will add value of y in x
        System.out.println(x);  // prints the new value in x
        /*
            x += y   is x = x + y
            x -= y   is x = x - y
            x *= y   is x = x * y
            x /= y   is x = x / y
            x %= y   is x = x % y
         */

    }
}
