package com.hynning.team.junit;

import com.hynning.team.domain.Programer;
import com.hynning.team.service.NameListService;
import com.hynning.team.service.TeamException;
import com.hynning.team.service.TeamService;
import org.junit.Test;

/**
 * @author Hynning
 * @date 2021/12/22 - 10:13 上午
 */
public class TemServiceTest {

    @Test
    public void addNumTest() throws TeamException {

        NameListService service = new NameListService();

        TeamService ts = new TeamService();
        ts.addMember(service.getEmployees(2));

        Programer[] s = ts.getTeam();

        for (int i = 0; i < s.length; i++){
            System.out.println(s[i]);

        }

    }

//    @Test
//    public void getTeamTest(){
//        TeamService ts = new TeamService();
//
//        Programer[] s = ts.getTeam();
//
//        for (int i = 0; i < s.length; i++){
//            System.out.println(s[i]);
//        }
//    }


}
