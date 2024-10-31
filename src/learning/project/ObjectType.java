package learning.project;
import java.awt.*;

public class ObjectType {
    public static void main(String[] args){

        int age=29; //Primitive Type

        Point pointA=new Point(10, 10); // Reference / Object Type

        System.out.println("pointA = " + pointA);
        System.out.println();
        pointA.move(10, 11);
        System.out.println("pointA = " + pointA);

    }
}
