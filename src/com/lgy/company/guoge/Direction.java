package com.lgy.company.guoge;

public enum Direction implements MyInterface{

    NORTH,
    SOUTH,
    WEST,
    EAST;


    @Override
    public Direction changeDirection(boolean clockwise) {
        switch (this) {
            case NORTH:
                if(clockwise){
                    return EAST;
                }else {
                    return WEST;
                }

            case SOUTH:
                if(clockwise){
                    return WEST;
                }else {
                    return EAST;
                }


            case WEST:
                if(clockwise){
                    return SOUTH;
                }else {
                    return NORTH;
                }

            case EAST:
                if(clockwise){
                    return NORTH;
                }else {
                    return SOUTH;
                }
        }
        return null;
    }
}
