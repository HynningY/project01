package com.hynning.team.service;

import com.hynning.team.domain.Architect;
import com.hynning.team.domain.Designer;
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
    private int total; //记录开发中人数
    public TeamService() {
        super();
    }

    public Programer[] getTeam() {
        for (int i = 0; i < team.length; i++){
            team[i] = this.team[i];
        }
        return team;
    }
    public void addMember(Employee e) throws TeamException {

        //成员已满，无法添加
        if(total >= MAX_MEMBER){
            throw new TeamException("成员已满，无法添加");
        }

        if (!(e instanceof Programer)){
            throw new TeamException("该成员不是开发成员");
        }

        if (isExist(e)){
            throw new TeamException("该成员已在本团队");
        }

        Programer p = (Programer) e; //一定不会出现转换异常ClassCastExeption
//        if(p.getStatus().getNAME().equals("BUSY"))
        if("BUSY".equals(p.getStatus().getNAME())){
            throw new TeamException("该成员已是某团队成员");
        }else if("VOCATION".equalsIgnoreCase(p.getStatus().getNAME())){
            throw new TeamException("该成员休假，无法添加");
        }

        // 团队中至多一名架构师
        // 团队中至多两名设计师
        // 团队中至多三名程序员
        // 获取team已有的成员中建构师设计师程序员人数
        int numOfArch = 0, numOfDes = 0, numOfPro=0;
        for (int i = 0; i < total; i++){
            if(team[i] instanceof Architect){
                numOfArch++;
            }else if(team[i] instanceof Designer){
                numOfDes++;
            }else if(team[i] instanceof Programer) {
                numOfDes++;
            }

        }
        if(p instanceof Architect){
            if(numOfArch >= 1){
                throw new TeamException("团队中至多一名架构师");
            }
        }else if(p instanceof Designer){
            if(numOfDes >= 2){
                throw new TeamException("团队中至多一名架构师");
            }
        }else if(p instanceof Programer){
            if(numOfPro >= 3){
                throw new TeamException("团队中至多三名程序员");
            }
        }

        //将p（或e）加入现有team
        team[total++] = p;
        // p的属性赋值
        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);

    }

    private boolean isExist(Employee e) {
        for (int i = 1; i < total; i++){
//            if(team[i].getId()==e.getId()){
//                return true;
//            }
//            return team[i].getId()==e.getId();
        }
        return false;
    }

    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (; i < total; i++) {
            if (team[i].getMemberId() == memberId) {
                team[i].setStatus(Status.FREE);
                break;
            }

        }

        if(i == total){
            throw new TeamException("找不到指定Member_id员工");
        }

        for (int j = i + 1; j < total; j++) {
            team[j - 1] = team[j];
        }

        team[total - 1] = null;
//        team[--total] = null;

    }
}
