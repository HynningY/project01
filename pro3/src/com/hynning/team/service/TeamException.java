package com.hynning.team.service;

/**
 * @author Hynning
 * @date 2021/12/2 - 2:30 下午
 */
public class TeamException extends Exception{
    static final long serialVersionUID = -3387516993124229948L;

    public TeamException(Throwable cause) {
        super();
    }

    public TeamException(String message) {
        super(message);
    }
}
