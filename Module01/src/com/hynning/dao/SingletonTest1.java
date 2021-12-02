package com.hynning.dao;

/**
 * @author Hynning
 * @date 2021/11/30 - 4:45 下午
 */
public class SingletonTest1 {

    //对某个类只存在一个对象实例
    public static void main(String[] args) {
        Bank b1 = Bank.getInstance();
        Bank b2 = Bank.getInstance();

        System.out.println(b1==b2);
    }





}

class Bank{
    // 1.私有化类的构造器
    private Bank(){

    }

    // 2.内部创建类的对象
    private static Bank instance = new Bank();

    //3. 提供公共方法，返回类的对象
    public static Bank getInstance(){
        return instance;
    }

}
