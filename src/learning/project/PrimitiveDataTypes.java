package learning.project;

public class PrimitiveDataTypes {
    public static void main(String[] args){
        /*
            In this program learning Primitive data types

            &

            I am initializing two variables with integer values
            add adding both numbers in add variable with data type integer


         */
        int number_1=2; // Storing Integer value in variable number_1 with data type int
        int number_2=5;     // Storing Integer value in variable number_2
        int add=number_1+number_2;  // adding both variables and storing in variable add integer
        System.out.println("Number_1 + Number_2 = "+ add); //printing the value stored in add and concatinating with both numbers to show

        double pi=3.14;   // primitive data type for storing decimal Numbers
        boolean isAdult=true;  // primitive data type for storing boolean data type true or false with small latter
        char a='M';

        byte numb=127;     //Byte will store in b/w -128 to 127
        short numb_1=-32768;  //Short will store in -32768 to 32767

        int number=1_000_000_008; // representing big numbers will not consider _ and prints number
        double num_2=1_000.32;      // not consider _ underscore just prints number
        System.out.println(number);
        System.out.println(num_2);  //print number double primitive type

    }
}
