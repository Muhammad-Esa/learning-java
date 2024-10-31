package learning.project;

import java.sql.SQLOutput;

public class IncrementDecrement {
    public static void main(String[] args){
        int number=0;

        //Decrement operator: --
        System.out.println(number--);  //it will perform 0-1 subtract 1 from variable value before PostDecrement
        System.out.println(number);    //Now the number value has been decreased so the new value is -1
        System.out.println();
        int numberTwo=0;
        System.out.println(--numberTwo); // it will subtract 1 from variable before printing & then prints New number
        System.out.println(numberTwo);

        /*
        //Increment operator: ++
        System.out.println(number++);  //it will add 0+1 add 1
        System.out.println(number);    //Now the number value has been increased so the new value is 1
        System.out.println();
        int numberTwo=0;
        System.out.println(++numberTwo); // it will add increase number before print & then prints New number
        System.out.println(numberTwo);
        */

        /*
        int increment= number + 1;
        int decrement= number -1;
        System.out.println(increment);
        System.out.println(decrement);
        */
    }

}
