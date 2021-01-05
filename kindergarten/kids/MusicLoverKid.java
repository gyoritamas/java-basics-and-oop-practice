package com.codecool.kindergarten.kids;

import com.codecool.kindergarten.Activity;
import com.codecool.kindergarten.Kid;
import com.codecool.kindergarten.Kindergarten;

public class MusicLoverKid extends Kid {
    public MusicLoverKid(Kindergarten kindergarten) {
        super(kindergarten);
    }

    @Override
    public void doActivity(Activity activity) {
        switch (activity) {
            case SINGING:
                setSatisfaction(4);
                break;
            case PLAYING_BALL:
            case DRAWING:
                changeSatisfaction(-1);
                break;
            default:
                changeSatisfaction(0);
        }
    }
}
