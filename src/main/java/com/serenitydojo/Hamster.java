package com.serenitydojo;

public class Hamster extends Pet{
    public static final String HAMSTER_GAME = "runs in wheel";
    private String favoriteGame;

    public Hamster(String name, int age, String favoriteGame){
        super(name, age);
        this.favoriteGame = favoriteGame;
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }
    public void setFavoriteGame(String favoriteToy) {
        this.favoriteGame = favoriteGame;
    }

    public String play(){ return HAMSTER_GAME;}
}
