package com.kosovo_cradle_leaderboard;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private int numSubmissions;
    private String countryCode;
    private int heightInInches;

    protected Player() {}

    public Player(String firstName, String lastName, String countryCode, int heightInInches) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numSubmissions = 0;
        this.countryCode = countryCode;
        this.heightInInches = heightInInches;
    }

      @Override
    public String toString() {
        return String.format(
            "Customer[id=%d, firstName='%s', lastName='%s', countryCode='%s', height='%s']",
            id, firstName, lastName, countryCode, heightInInches);
    }


    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumSubmissions() {
        return numSubmissions;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public int getHeightInInches() {
        return heightInInches;
    }

}
