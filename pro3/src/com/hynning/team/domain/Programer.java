package com.hynning.team.domain;

import com.hynning.team.service.Status;

/**
 * @author Hynning
 * @date 2021/12/1 - 11:55 上午
 */
public class Programer extends Employee {

    private int memberId;
    private Status status = Status.FREE;
    private Equipment euqipment;

    public Programer() {
    }

    public Programer(int id, String name, int age, double salary, Equipment euqipment) {
        super(id, name, age, salary);
        this.euqipment = euqipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEuqipment() {
        return euqipment;
    }

    public void setEuqipment(Equipment euqipment) {
        this.euqipment = euqipment;
    }

    @Override
    public String toString() {
//        return super.toString() + "\t程序员\t" +  status + "\t" + euqipment + "\t\t\t" + euqipment.getDescription() ;
        return getDetails() + "\t程序员\t" +  status + "\t" +  "\t\t\t" + "\t"  + euqipment.getDescription() ;
    }
}
