package main;

public class LateFeeCalculator {
    /**
     * Logic to calculate Late fee
     */
    public double calculateTotalLateFess(LateFeeCalc[] items, int days){
        double totalLateFee = 0;
        for(LateFeeCalc item: items){
            totalLateFee += item.calculateLateFees(days);
        }
        return totalLateFee;
    }
}
