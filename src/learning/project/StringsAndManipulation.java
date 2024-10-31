package learning.project;

public class StringsAndManipulation {
    public static void main(String[] args){
        String firstName="Muhammad Esa";
        String age="29";

        System.out.println(firstName + " " + age);
        System.out.println("firstName: " + firstName);
        System.out.println("age: " + age);

        String Bio=firstName + age; // Just concatenates two Strings
        System.out.println(Bio.toUpperCase());     // After concatenating prints the value & upper case due to calling Method of class String Type
        System.out.println(Bio.toLowerCase());
        System.out.println(Bio.substring(8));
        System.out.println(Bio.substring(0, 8));
        System.out.println("   ".isEmpty()); // checks in between "  " & due the space it returns false means its not empty
        System.out.println("  ".isBlank()); // checks any String in between so there isn't so any string returns true
        System.out.println(" a ".isEmpty());
        System.out.println(" a ".isBlank());
        System.out.println(" name   ".trim());  //will trim all the spaces before 7 after string
    }
}
