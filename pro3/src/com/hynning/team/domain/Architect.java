package com.hynning.team.domain;

/**
 * @author Hynning
 * @date 2021/12/1 - 2:35 下午
 */
public class Architect extends Designer{

    private int stock;//股票

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment euqipment, double bonus, int stock) {
        super(id, name, age, salary, euqipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getDetails() + "\t架构师\t" + getStatus() + "\t" + getBonus() + "\t" + stock + "\t"+ getEuqipment().getDescription();
    }


}
