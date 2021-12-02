package com.hynning.team.service;

/**
 * @author Hynning
 * @date 2021/12/1 - 2:07 下午
 */
public class Status {

    private final String NAME;

    private Status(String name) {
        this.NAME = name;
    }

    public static final Status FREE = new Status("FREE");

    public static final Status BUSY = new Status("BUSY");

    public static final Status VOATION = new Status("VOATION");

    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString() {
        return NAME;
    }
}
