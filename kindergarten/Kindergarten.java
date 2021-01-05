package com.codecool.kindergarten;

import com.codecool.kindergarten.kids.ComfortableKid;
import com.codecool.kindergarten.kids.LivelyKid;
import com.codecool.kindergarten.kids.MusicLoverKid;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Kindergarten {
    private int workingHours = 6;
    private int headcount;
    private final ArrayList<Kid> kids = new ArrayList<>();
    private final LinkedList<Activity> activities = new LinkedList<>();

    public void setWorkingHours(int hours) {
        this.workingHours = hours;
    }

    public int getWorkingHours() {
        return this.workingHours;
    }

    public void addKid(Kid kid) {
        kids.add(kid);
    }

    public void addRandomKid() {
        final int numberOfPersonalities = 3;
        int personalityID = new Random().nextInt(numberOfPersonalities);
        switch (personalityID) {
            case 0:
                new ComfortableKid(this);
                break;
            case 1:
                new LivelyKid(this);
                break;
            case 2:
                new MusicLoverKid(this);
                break;
        }
    }

    public void addRandomKids(int numberOfKids) {
        for (int i = 0; i < numberOfKids; i++) {
            addRandomKid();
        }
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public void setHeadcount(int headcount) {
        this.headcount = headcount;
    }

    public int getHeadcount() {
        return this.headcount;
    }

    public Activity getActivity() {
        return activities.removeFirst();
    }

    public void setRandomActivities(int numberOfActivities) {
        for (int i = 0; i < numberOfActivities; i++) {
            addActivity(getRandomActivity());
        }
    }

    public Activity getRandomActivity() {
        int numberOfActivities = Activity.values().length;
        int activityID = new Random().nextInt(numberOfActivities);
        for (Activity activity : Activity.values()) {
            if (activity.ordinal() == activityID)
                return activity;
        }
        return null;
    }

    public void makeKidsDoingActivity(Activity activity) {
        for (int i = 0; i < kids.size(); i++) {
            Kid kid = (Kid) kids.get(i);
            kid.doActivity(activity);
            kid.setWhining();
        }
    }

    public int countWhiningKids() {
        int whiningKids = 0;
        for (Kid kid : kids) {
            if (kid.isWhining())
                whiningKids++;
        }
        return whiningKids;
    }

    public boolean doWeHaveChaos() {
        return countWhiningKids() >= 3;
    }

    public void printChaos() {
        System.out.print("Do we have chaos? ");
        System.out.println(doWeHaveChaos() ? "yes" : "no");
    }

    public void advanceTimeByHalfAnHour() {
        Activity currentActivity = getActivity();
        System.out.println(", current activity: " + currentActivity);
        makeKidsDoingActivity(currentActivity);
        printKids();
        printChaos();
    }

    public void printKids() {
        for (int i = 1; i <= kids.size(); i++) {
            System.out.printf("%3d. ", i);
            kids.get(i - 1).printKid();
        }
    }
}
