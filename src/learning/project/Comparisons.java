package learning.project;

public class Comparisons {
    public static void main(String[] args){
        //comparison Operators
        // < <= > >= == !=
        //Comparisons will return boolean values
        System.out.println(10 < 10);  // return false because 10 is not less 10
        System.out.println(10 <= 10); // return true because 10 is not less 10 but equals to 10
        System.out.println(10 > 10);  // return false because 10 is not greater the 10
        System.out.println(10 >= 10); // return true because 10 is not greater then 10 but equals to 10
        System.out.println(10 == 10); // return true because 10 is equal to 10
        System.out.println(10 != 10); //returns false because 10 is equal to 10

        System.out.println();

        boolean isAdult=15 >= 16; //comparision Operators return boolean values so isAdult variable has initialised with boolean type
        System.out.println(isAdult);


    }
}
