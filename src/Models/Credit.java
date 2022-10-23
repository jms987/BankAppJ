package Models;

public class Credit {
    private int number;
    private float baseValue;
    private float actualValue;
    private int numberofrepayment;
    private int repaymentleft;
    private float percentage;

    public Credit(int number, float baseValue, int numberofrepayment, float percentage) {
        this.number = number;
        this.baseValue = baseValue;
        this.actualValue = baseValue;
        this.numberofrepayment = numberofrepayment;
        this.repaymentleft = numberofrepayment;
        this.percentage = percentage;
    }

    public int getNumber() {
        return number;
    }

    public float getBaseValue() {
        return baseValue;
    }

    public float getActualValue() {
        return actualValue;
    }

    public void setActualValue(float actualValue) {
        this.actualValue = actualValue;
    }

    public int getNumberofrepayment() {
        return numberofrepayment;
    }

    public void setNumberofrepayment(int numberofrepayment) {
        this.numberofrepayment = numberofrepayment;
    }

    public int getRepaymentleft() {
        return repaymentleft;
    }

    public void setRepaymentleft(int repaymentleft) {
        this.repaymentleft = repaymentleft;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }
}
