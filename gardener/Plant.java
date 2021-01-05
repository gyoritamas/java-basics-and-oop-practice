package com.codecool.gardener;

public abstract class Plant {
    private final Garden garden;
    private String id;
    private int size;

    public Plant(Garden garden, String id, int size) {
        this.garden = garden;
        garden.addPlant(this);
        setId(id);
        changeSize(size);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void changeSize(int size) {
        this.size = Math.max(this.size + size, 0);
    }

    public boolean isAlive() {
        return !(getSize() == 0);
    }

    public abstract int getMaxSize();

    public abstract void feedPlant(Nutrient nutrient);

    public void feedPlant(){
        this.changeSize(-1);
    }

    public void printPlant() {
        System.out.printf("%10s | %4s | %2d%n",
                this.getClass().getSimpleName(), this.getId(), this.getSize());
    }

}
