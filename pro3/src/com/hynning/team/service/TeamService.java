package com.hynning.team.service;

import com.hynning.team.domain.Employee;
import com.hynning.team.domain.Programer;

/**
 * @author Hynning
 * @date 2021/12/2 - 4:25 下午
 */
public class TeamService {

    private int counter = 1; //给memberId赋值
    private final int MAX_MEMBER = 5;//限制开发人数
    private Programer[] team = new Programer[MAX_MEMBER];

    public TeamService() {
        super();
    }

    public Programer[] getTeam() {
        for (int i = 0; i < team.length; i++){
            team[i] = this.team[i];
        }
        return team;
    }
    public void addMember(Employee e){

    }
    public void removeMember(int memberId){


    }
}
