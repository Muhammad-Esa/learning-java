package learning.project;

public class Methods {
    /*
    -Access Modifier [private, protected, public
    -Optional Static  if we call method without creating instance of class
    -Return Type
    -name
    -Optional Parameters
    -Method Body
    -Optional Return Value
     */

    private static int add(int n1, int n2){
        //body business logic
        int result=n1+n2;
        return result;

        //return n1+n2;
    }
    public static void main(String[] args){
        int result1=add(25, 30);
        System.out.println(result1);

        int result2=add(25, 5);
        System.out.println(result2);

        //once we created method we can use multiple times



    }
}
