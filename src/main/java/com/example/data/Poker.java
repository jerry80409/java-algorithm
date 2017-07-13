package com.example.data;

import java.util.Objects;

/**
 * Created by jerry on 2017/7/13.
 */
public class Poker {
    // 花色
    private String suit;

    // 數字
    private String num;

    public Poker() {
    }

    public Poker(final String suit, final String num) {
        this.suit = suit;
        this.num = num;
    }

    public String getSuit() {
        return this.suit;
    }

    public void setSuit(final String suit) {
        this.suit = suit;
    }

    public String getNum() {
        return this.num;
    }

    public void setNum(final String num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object poker) {
        if (poker == this) {
            return true;
        }

        if (!(poker instanceof Poker)) {
            return false;
        }

        Poker compared = (Poker) poker;
        return this.suit.equals(compared.suit) &&
                this.num.equals(compared.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, num);
    }

    @Override
    public String toString() {
        return "(" + suit + "," + num + ")";
    }
}
