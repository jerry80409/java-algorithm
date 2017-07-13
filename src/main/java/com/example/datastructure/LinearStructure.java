package com.example.datastructure;

import com.example.data.Poker;
import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by jerry on 2017/7/13.
 * <p>
 * 線性結構（撲克牌為例）
 * 1. 建立線性結構: 建立一個空間, 最多可以放 13 張撲克牌(同花色)
 * 2. 尋找節點: 可以取得這組撲克牌的某一張撲克牌
 * 3. 插入節點: 可以在這組撲克牌中, 插入任何一張撲克牌
 * 4. 刪除節點: 可以從這組撲克牌中, 移除任何一張撲克牌
 */
public class LinearStructure {

    private static final int MAX_SIZE = 13;

    private List<Poker> suit = new ArrayList<>();

    public LinearStructure() {
    }

    // 尋找節點
    public Poker findPokerByNum(@NotNull String num) {

        for (Poker poker : suit) {
            if (Objects.nonNull(poker) &&
                    poker.getNum().equals(num)) {
                System.out.println("找到 Poker: " + poker);
                return poker;
            }
        }

        return null;
    }

    // 插入節點
    public void insertedPoker(@NotNull Poker poker) {
        if (MAX_SIZE <= suit.size()) {
            System.out.println("空間已滿, 無法插入");

        } else {
            suit.add(poker);
            System.out.println("插入 poker(" + poker.getNum() + ")");
        }
    }

    // 刪除節點
    public void deletedPoker(@NotNull Poker target) {
        for (Poker poker : suit) {
            if (poker.equals(target)) {
                suit.remove(target);
                System.out.println("刪除 poker(" + target.getNum() + ")");
                return;
            }
        }

        System.out.println("找不到 poker(" + target.getNum() + ")");
    }

    public void show() {
        System.out.println(suit);
    }

    public List<Poker> getSuit() {
        return this.suit;
    }
}
