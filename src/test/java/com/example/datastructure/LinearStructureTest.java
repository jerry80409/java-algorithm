package com.example.datastructure;

import com.example.data.Poker;
import com.example.data.SuitEnum;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jerry on 2017/7/14.
 */
public class LinearStructureTest {

    private LinearStructure linearStructure = new LinearStructure();

    @Test
    public void insertPokerACEShouldBeSuccess() {
        Poker newPoker = new Poker(SuitEnum.SPADES.getValue(), "ACE");
        linearStructure.insertedPoker(newPoker);
        linearStructure.show();

        Assert.assertEquals(1, linearStructure.getSuit().size());
    }

    @Test
    public void insertPokerJACKAndACEShouldBeSuccess() {
        Poker jackPoker = new Poker(SuitEnum.SPADES.getValue(), "JACK");
        Poker acePoker = new Poker(SuitEnum.SPADES.getValue(), "ACE");
        linearStructure.insertedPoker(jackPoker);
        linearStructure.insertedPoker(acePoker);
        linearStructure.show();

        Assert.assertEquals(2, linearStructure.getSuit().size());
    }

    @Test
    public void deletedPokerShouldBeSuccess() {
        Poker jackPoker = new Poker(SuitEnum.SPADES.getValue(), "JACK");
        Poker acePoker = new Poker(SuitEnum.SPADES.getValue(), "ACE");
        linearStructure.insertedPoker(jackPoker);
        linearStructure.insertedPoker(acePoker);

        linearStructure.deletedPoker(jackPoker);
        linearStructure.show();

        Assert.assertEquals(1, linearStructure.getSuit().size());
    }

    @Test
    public void findPokerShouldBeSuccess() {
        Poker jackPoker = new Poker(SuitEnum.SPADES.getValue(), "JACK");
        Poker acePoker = new Poker(SuitEnum.SPADES.getValue(), "ACE");
        linearStructure.insertedPoker(jackPoker);
        linearStructure.insertedPoker(acePoker);

        Poker findPoker = linearStructure.findPokerByNum("JACK");
        Assert.assertEquals(jackPoker, findPoker);
    }
}
