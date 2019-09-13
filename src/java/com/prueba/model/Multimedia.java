
package com.prueba.model;


public class Multimedia {
    
    private int multimedia_id;
    private int director_id;
    private String title;
    private String description;
    private int year;
    private double score;

    public int getMultimedia_id() {
        return multimedia_id;
    }

    public void setMultimedia_id(int multimedia_id) {
        this.multimedia_id = multimedia_id;
    }

    public int getDirector_id() {
        return director_id;
    }

    public void setDirector_id(int director_id) {
        this.director_id = director_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
    
}
