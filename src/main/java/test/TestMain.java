package test;

import net.bytebuddy.dynamic.scaffold.MethodRegistry;

import java.text.DecimalFormat;
import java.time.Month;

public class TestMain {
    public static void main(String[] args) {

        // How to calculate credit
        int neededCreditSum = 300000;
        double commonSumm;
        double annuityPayment;
        double coefficientAnnuityPayment;
        double percentageRate = 15;
        int creditPeriod = 18;
        double monthCreditRate;


        DecimalFormat round = new DecimalFormat("#.####");
        DecimalFormat roundPayment = new DecimalFormat("#.##");

        monthCreditRate = (percentageRate / 100) / 12;
        System.out.println("Calculate percent rate by Month");
        System.out.println(round.format(monthCreditRate));


        System.out.println("Calculate coefficient annuity payment");
        coefficientAnnuityPayment = monthCreditRate * (Math.pow((1 + monthCreditRate),creditPeriod))
                /((Math.pow((1 + monthCreditRate),creditPeriod))-1);
        System.out.println(round.format(coefficientAnnuityPayment));

        System.out.println("Calculate annuity payment");
        annuityPayment = neededCreditSum * coefficientAnnuityPayment;
        System.out.println(roundPayment.format(annuityPayment));

        System.out.println("Calculate percent");
        double percent = (neededCreditSum * (percentageRate/100) * 30) / 365;

        System.out.println(roundPayment.format(percent));


        commonSumm = annuityPayment * creditPeriod;
        System.out.println("Payment plan");
        System.out.println("Number of payment "+ " | " + "Repayment of principal" + " | " +
                " Percent repayment " + " | " + "Balance");
        for (int i = 1; i <= creditPeriod ; i++) {
            System.out.println(i + " | " + roundPayment.format(annuityPayment) + " | " +
                    (roundPayment.format(annuityPayment - percent)) + " | " +
                    roundPayment.format(percent) + " | " + (roundPayment.format(commonSumm -= annuityPayment)));
        }



    }
}
