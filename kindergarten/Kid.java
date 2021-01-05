package com.codecool.kindergarten;

public abstract class Kid {
    private Kindergarten kindergarten;
    private int satisfaction = 2;
    private boolean isWhining;

    public Kid(Kindergarten kindergarten) {
        this.kindergarten = kindergarten;
        kindergarten.addKid(this);
    }

    public void setSatisfaction(int value) {
        this.satisfaction = value;
    }

    public void changeSatisfaction(int value) {
        this.satisfaction += value;
        setSatisfaction(Math.max(this.satisfaction, 0));
    }

    public int getSatisfaction() {
        return this.satisfaction;
    }

    public void setWhining() {
        this.isWhining = (getSatisfaction() == 0);
    }

    public boolean isWhining() {
        return this.isWhining;
    }

    public void printKid() {
        System.out.printf("%15s | %2d | %-10s%n",
                this.getClass().getSimpleName(), this.getSatisfaction(), this.isWhining() ? "whining" : "not whining");
    }

    public abstract void doActivity(Activity activity);
}
