package com.serenitydojo;

public class Cat extends Pet {
    public static final String CAT_GAME= "plays with string";
    private String favoriteToy;

    public Cat(String name, String favoriteToy, int age) {
        super(name, age);
        this.favoriteToy = favoriteToy;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    public String play(){ return CAT_GAME;}
}
