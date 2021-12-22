package com.hynning.team.junit;

import com.hynning.team.domain.Employee;
import com.hynning.team.service.NameListService;
import com.hynning.team.service.TeamException;
import org.junit.Test;

/**
 * @author Hynning
 * @date 2021/12/2 - 2:39 下午
 */
public class NameListServiceTest {

    @Test
    public void testGetAllEmployees(){
        NameListService service = new NameListService();
        Employee[] employees = service.getAllEmployees();
        for(int i = 0; i < employees.length; i++){
            System.out.println(employees[i]);
        }
    }

    @Test
    public void testGetEmployee(){
        NameListService service = new NameListService();
        int id = 1;
        try{
            Employee employee = service.getEmployees(id);
            System.out.println(employee);
        }catch (TeamException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testNameListService(){
        new NameListService();
    }
}
