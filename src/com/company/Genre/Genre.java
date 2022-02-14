package com.company.Genre;

import java.util.List;

public enum Genre {

    HORROR(1),
    DETECTIVE(2),
    FANTASY(3),
    THRILLER(4),
    COMEDY(5);

    private int index;

    Genre(int index) {
        this.index = index;
    }

    public int getIndex(){
        return this.index;
    }

}
