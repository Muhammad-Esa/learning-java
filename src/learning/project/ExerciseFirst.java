package learning.project;

public class ExerciseFirst {

    private static float rentalYeald(int monthlyRent, int priceOfProperty ){
       int annualRent = monthlyRent * 12;

        return ((float) annualRent / priceOfProperty)*100;
    }
    public static void main(String[] args){

        float result=rentalYeald(1300, 250000);
        System.out.println(result);

    }
}
