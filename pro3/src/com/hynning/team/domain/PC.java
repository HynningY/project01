package com.hynning.team.domain;

/**
 * @author Hynning
 * @date 2021/12/1 - 11:32 上午
 */
public class PC implements Equipment{

    private String model; //机器型号
    private String display;//显示器名称

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDescription(){

        return model + "(" + display + ")" + ')' ;
    }
}
