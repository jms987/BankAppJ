package Models;

import java.util.ArrayList;
import java.util.Date;

public class Credit {
    private int number;
    private float baseValue;
    private float actualValue;
    private int numberofrepayment;
    private int repaymentleft;
    private float percentage;
    private Date startedDate;
    private Date lastDatePart;

    public Credit(int number, float baseValue, int numberofrepayment, float percentage) {
        this.number = number;
        this.baseValue = baseValue;
        this.actualValue = baseValue;
        this.numberofrepayment = numberofrepayment;
        this.repaymentleft = numberofrepayment;
        this.percentage = percentage;
        startedDate = new Date();
        startedDate.setTime(System.currentTimeMillis());
        lastDatePart = new Date();
    }

    public float calculatePart() {
        return (actualValue / repaymentleft) * ((100 + percentage) / 1200);
    }

    public boolean addMandatoryRepayment(float money) {
        if (money > calculatePart()) {
            actualValue -= money;
            repaymentleft -= 1;
            lastDatePart.setTime(System.currentTimeMillis());
            return true;
        } else {
            return false;
        }
    }

    public void addRepayment(float money)
    {
        actualValue -= money;
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
