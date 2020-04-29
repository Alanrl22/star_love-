package com.starlove.starlove.entity;

public class Choose {

    private String genre;
    private String planet;
    private String eye;
    private String hair;
    private String skin;

    // Empty constructor
    public Choose(){
    }
    //Constructor with all items
    public Choose(String genre, String planet, String eye, String hair, String skin) {
        this.genre = genre;
        this.planet = planet;
        this.eye = eye;
        this.hair = hair;
        this.skin = skin;
    }
    //Constructor with eye
    public Choose(String genre, String planet, String eye) {
        this.genre = genre;
        this.planet = planet;
        this.eye = eye;
    }
     /* Constructor with hair
    public Choose(String genre, String planet, String hair) {
        this.genre = genre;
        this.planet = planet;
        this.hair = hair;
    }
    public Choose(String genre, String planet, String skin) {
        this.genre = genre;
        this.planet = planet;
        this.skin = skin;
    } */



    // Getter
    public String getGenre() {
        return genre;
    }
    public String getPlanet() {
        return planet;
    }
    public String getEye() {
        return eye;
    }
    public String getHair() {
        return hair;
    }
    public String getSkin() {
        return skin;
    }
    //Seter
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setPlanet(String planet) {
        this.planet = planet;
    }
    public void setEye(String eye) {
        this.eye = eye;
    }
    public void setHair(String hair) {
        this.hair = hair;
    }
    public void setSkin(String skin) {
        this.skin = skin;
    }
}
