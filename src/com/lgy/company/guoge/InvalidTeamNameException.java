package com.lgy.company.guoge;

/**
 * @author LGY
 * @create 2022-11-23 14:59
 */
public class InvalidTeamNameException extends Exception {
    private String message;

    public InvalidTeamNameException(String message) {
        //super(message);
        this.message = message;

    }

    public String getMessage(){
        return message;
    }
}
