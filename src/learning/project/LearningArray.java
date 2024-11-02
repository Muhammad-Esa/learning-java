package learning.project;
import java.lang.reflect.Array;
import java.util.Arrays;

public class LearningArray {
    public static void main(String[] args){
        //Arrays
        int[] numbers = new int[3]; //array defined limit initialized int type
        numbers[0]=1;    //Assign value in O position of an array
        numbers[1]=33;
        numbers[2]=6;

        System.out.println(
               Arrays.toString(numbers)
        );
        System.out.println(numbers.length);
        int[] numbers2={0, 5, 6, 8, 9};   // Array no limit defined
        System.out.println(
                Arrays.toString(numbers2)
        );

        /*
        Below Array is defined limit with string type &
        assigned values by positions & two methods of Array
        has been used to get values & length of Array by passing objArray
         */
        String[] color = new String[5];
        color[0]="blue";
        color[1]="green";
        color[2]="red";
        color[3]="white";
        color[4]="black";

        System.out.println(
                Arrays.toString(color)
        );
        System.out.println(color.length);
        System.out.println(Array.getLength(color));

    }

}
