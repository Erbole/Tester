package com.geektach.tester;

public class Model {
    private String name;
    private String music;
    private int numbers;
    private String times;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public Model(String name, String music, int numbers, String times) {
        this.name = name;
        this.music = music;
        this.numbers = numbers;
        this.times = times;
    }
}

