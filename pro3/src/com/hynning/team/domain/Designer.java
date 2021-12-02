package com.hynning.team.domain;

/**
 * @author Hynning
 * @date 2021/12/1 - 2:26 下午
 */
public class Designer extends Programer{

    private double bonus;//奖金

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment euqipment, double bonus) {
        super(id, name, age, salary, euqipment);
        this.bonus = bonus;
    }

    public double getBonus() {

        return bonus;
    }

    public void setBonus(double bonus) {

        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return getDetails() + "\t设计师\t" + getStatus() + "\t" + bonus + "\t\t\t" + getEuqipment().getDescription();
    }
}
