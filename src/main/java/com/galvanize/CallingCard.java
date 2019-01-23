package com.galvanize;

public class CallingCard {

    public int centsPerMinute;

    public int getRemainingMinutes() {
        return remainingMinutes;
    }

    public void setRemainingMinutes(int remainingMinutes) {
        this.remainingMinutes = remainingMinutes;
    }

    public int remainingMinutes;

    public CallingCard(int centsPerMinute) {
        this.centsPerMinute = centsPerMinute;
        this.remainingMinutes = 0;
    }

    public void addDollars(int numOfDollars) {
        remainingMinutes += (numOfDollars * 100)/centsPerMinute;
    }

    public void useMinutes(int numOfMinutes) {
        if (numOfMinutes > remainingMinutes) {
            remainingMinutes = 0;
        } else {
            remainingMinutes -= numOfMinutes;
        }
    }


}
