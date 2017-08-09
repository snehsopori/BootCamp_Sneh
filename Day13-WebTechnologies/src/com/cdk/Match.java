package com.cdk;

public class Match {
    String country1;
    String country2;
    String matchType;
    String city;
    int runsScoredByCountry1;
    int runsScoredByCountry2;

    public Match(String country1, String country2, String matchType, String city, int runsScoredByCountry1, int runsScoredByCountry2) {
        this.country1 = country1;
        this.country2 = country2;
        this.matchType = matchType;
        this.city = city;
        this.runsScoredByCountry1 = runsScoredByCountry1;
        this.runsScoredByCountry2 = runsScoredByCountry2;
    }

    public String getCountry1() {
        return country1;
    }

    public String getCountry2() {
        return country2;
    }

    public String getMatchType() {
        return matchType;
    }

    public String getCity() {
        return city;
    }

    public int getRunsScoredByCountry1() {
        return runsScoredByCountry1;
    }

    public int getRunsScoredByCountry2() {
        return runsScoredByCountry2;
    }

    public String getWinner() {
        if(runsScoredByCountry1 > runsScoredByCountry2) {
            return country1;
        } else if(runsScoredByCountry1 < runsScoredByCountry2) {
            return country2;
        } else { return "Match Draw"; }
    }
}
