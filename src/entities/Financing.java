package entities;

public class Financing {

    private double totalAmount;
    private double income;
    private int months;

    public Financing() {
    }

    public Financing(double totalAmount, double income, int months) {
        this.totalAmount = totalAmount;
        this.income = income;
        this.months = months;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public double entry() {
        return totalAmount * 0.2;
    }

    public double quota() {
        return (totalAmount - entry()) / months;
    }
}
