package com.codecool.kindergarten.kids;

import com.codecool.kindergarten.Activity;
import com.codecool.kindergarten.Kid;
import com.codecool.kindergarten.Kindergarten;

public class LivelyKid extends Kid {
    public LivelyKid(Kindergarten kindergarten) {
        super(kindergarten);
    }

    @Override
    public void doActivity(Activity activity) {
        switch (activity) {
            case PLAYING_BALL:
                setSatisfaction(3);
                break;
            case SINGING:
            case DRAWING:
                changeSatisfaction(-1);
                break;
            default:
                changeSatisfaction(0);
        }
    }
}
