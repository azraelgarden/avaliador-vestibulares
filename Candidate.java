package com.entities;

public class Candidate {
    private String id;
    private String answers;
    private int index;

    public Candidate(String id, String answers) {
        this.id = id;
        this.answers = answers;
    }

    public String getId() {
        return id;
    }

    public String getAnswers() {
        return answers;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return id + " - " + index;
    }
}

