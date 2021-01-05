package com.codecool.kindergarten.kids;

import com.codecool.kindergarten.Activity;
import com.codecool.kindergarten.Kid;
import com.codecool.kindergarten.Kindergarten;

public class ComfortableKid extends Kid {
    public ComfortableKid(Kindergarten kindergarten) {
        super(kindergarten);
    }

    @Override
    public void doActivity(Activity activity) {
        switch (activity) {
            case DRAWING:
                setSatisfaction(4);
                break;
            case DANCING:
                changeSatisfaction(-1);
                break;
            case PLAYING_BALL:
                changeSatisfaction(-2);
                break;
            default:
                changeSatisfaction(0);
        }
    }
}
