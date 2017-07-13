package com.example.data;

/**
 * Created by jerry on 2017/7/14.
 */
public enum SuitEnum {
    SPADES("SPADES"), // 黑桃
    HEARTS("HEARTS"), // 紅心
    DIAMONDS("DIAMONDS"), // 方塊
    CLUBS("CLUBS");  // 梅花

    private String value;

    SuitEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
