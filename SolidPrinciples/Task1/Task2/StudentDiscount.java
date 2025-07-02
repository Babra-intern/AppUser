package SolidPrinciples.Task1.Task2;

public class StudentDiscount extends Discount {

    final double stuDiscount = 10;


    @Override
    public double apply_discount(double amount){


        double discounted_amount =amount - (stuDiscount / 100.0) * amount;

        return discounted_amount;
    }
    
}
