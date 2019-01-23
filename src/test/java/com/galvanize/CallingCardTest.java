package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CallingCardTest {
    @Test
    public void canAddMoneyToCard() {
        CallingCard callingCard = new CallingCard(20);
        callingCard.addDollars(1);

        int actualValue = callingCard.getRemainingMinutes();

        assertEquals(5, actualValue);
    }

    @Test
    public void canDecreaseMinutes() {
        CallingCard card = new CallingCard(20);
        card.addDollars(1);
        card.useMinutes(6);

        int actualValue = card.getRemainingMinutes();

        assertEquals(0, actualValue);
    }

    @Test
    public void cannotDecreaseMinutesBelowZero() {

    }

    @Test
    public void removeDecimalPlacesFromUnevenNumbers() {

    }
}
