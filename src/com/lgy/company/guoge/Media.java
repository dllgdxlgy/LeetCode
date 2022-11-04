package com.lgy.company.guoge;

abstract class Media {
    private String name;

    public Media(String s){
        this.name = s;
    }

    abstract String returnAttributes();
}

