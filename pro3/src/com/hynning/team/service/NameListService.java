package com.hynning.team.service;

import com.hynning.team.domain.*;

import static com.hynning.team.service.Data.*;

/**
 * @author Hynning
 * @date 2021/12/1 - 2:44 下午
 * @desc 将Data中的数据封装到Employee[]数组中，同事提供Employee[]方法
 */
public class NameListService {

    private Employee[] employees;

    public NameListService() {
        employees = new Employee[EMPLOYEES.length];

        for (int i = 0; i < employees.length; i++){
            int key = Integer.parseInt(EMPLOYEES[i][0]);
//            System.out.println(key+"-"+EMPLOYEE);

            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String  name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            Equipment equipment;
            double bouns;
            int stock;

            switch (key){
                case EMPLOYEE:
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programer(id,name,age,salary,equipment);
                    break;
                case DESIGNER:
                    equipment = createEquipment(i);
                    bouns = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id,name,age,salary,equipment,bouns);
                    break;
                case ARCHITECT:
                    equipment = createEquipment(i);
                    bouns = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id,name,age,salary,equipment,bouns,stock);
                    break;
            }

        }

    }

    private Equipment createEquipment(int index) {
        int key = Integer.parseInt(EQUIPMENTS[index][0]);
        String modelOrName = EQUIPMENTS[index][1];
//        String price = EQUIPMENTS[index][2];
        switch (key){
            case PC:
                String display = EQUIPMENTS[index][2];
                return new PC(modelOrName,display);
            case NOTEBOOK:
                Double price = Double.parseDouble(EQUIPMENTS[index][2]);
                return new NoteBook(modelOrName,price);
            case PRINTER:
                String type = EQUIPMENTS[index][2];
                return new Priter(modelOrName,type);
        }

        return null;
    }

    /**
     * 获取所有员工
     * @return
     */


    public Employee[] getAllEmployees() {
        return employees;
    }

    public Employee getEmployees(int id) throws TeamException {

        for (int i = 0; i< employees.length;i++){
            if(employees[i].getId() == id){
                return employees[i];
            }
        }

        throw new TeamException("找不到指定员工");

    }
}
