package SolidPrinciples.Task1.Task2;

public class SeniorDiscount extends Discount {

    final double snrDiscount = 8;


    @Override
    public double apply_discount(double amount){


        double discounted_amount =amount - (snrDiscount / 100.0) * amount;

        return discounted_amount;
    }

    
}

    
