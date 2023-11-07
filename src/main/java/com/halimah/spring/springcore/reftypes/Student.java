package com.halimah.spring.springcore.reftypes;

public class Student {
    private Scores score;

    public void setScore(Scores score) {
        this.score = score;
    }

    public Scores getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                '}';
    }
}
