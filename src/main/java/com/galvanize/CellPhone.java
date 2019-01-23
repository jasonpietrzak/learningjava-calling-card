package com.galvanize;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;

public class CellPhone {
    private CallingCard card;
    private Boolean isOnCall;
    private String currentPhoneNumber;
    private ArrayList<String> recentCalls = new ArrayList<String>();

    public CellPhone(CallingCard card) {
        this.card = card;
        this.isOnCall = false;
    }

    public Boolean isTalking() {
        return isOnCall;
    }

    public void startCall(String phoneNumber) {
        this.isOnCall = true;
        this.currentPhoneNumber = phoneNumber;
    }

    public void endCall() {
        this.isOnCall = false;
        String number
    }

    public void tick() {
        card.useMinutes(1);
    }

    public String getCallHistory() {
        String theStr = "";
        for (int i = 0; i < this.recentCalls.size(); i++) {
            if (i == this.recentCalls.size() -1) {
                theStr = theStr.concat(this.recentCalls.get(i));
            } else {
                theStr = theStr.concat(this.recentCalls.get(i) + ", ");
            }
        }
        return theStr;
    }
}