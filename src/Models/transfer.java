package Models;

import java.util.Date;

public class transfer {
    private long NumberofAccountIn;
    private long NumberofAccountOut;
    private float moneyAmount;
    private Date date;

    public transfer(long numberofAccountIn, long numberofAccountOut, float moneyAmount, Date date) {
        NumberofAccountIn = numberofAccountIn;
        NumberofAccountOut = numberofAccountOut;
        this.moneyAmount = moneyAmount;
        this.date = date;
    }

    public transfer(long numberofAccountIn, long numberofAccountOut, float moneyAmount) {
        NumberofAccountIn = numberofAccountIn;
        NumberofAccountOut = numberofAccountOut;
        this.moneyAmount = moneyAmount;
        this.date.setTime(System.currentTimeMillis());
    }

    public long getNumberofAccountIn() {
        return NumberofAccountIn;
    }

    public void setNumberofAccountIn(long numberofAccountIn) {
        NumberofAccountIn = numberofAccountIn;
    }

    public long getNumberofAccountOut() {
        return NumberofAccountOut;
    }

    public void setNumberofAccountOut(long numberofAccountOut) {
        NumberofAccountOut = numberofAccountOut;
    }

    public float getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(float moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
