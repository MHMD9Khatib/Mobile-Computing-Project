package com.example.mybmiPro;

public class Records {

    String weightRecords;String dateRecords;
    String stutesRecords;
    double bmiForRecords;
    String timeRecords;String lengthRecords;
    String uId;
    public Records() {
    }

    public Records(String dateRecords, String timeRecords, String lengthRecords, String weightRecords, String uId, String stutesRecords, double bmiForRecords) {

        this.lengthRecords = lengthRecords;
        this.weightRecords = weightRecords;
        this.dateRecords = dateRecords;
        this.timeRecords = timeRecords;
        this.uId = uId;this.stutesRecords = stutesRecords;
        this.bmiForRecords = bmiForRecords;
    }


    public void setWeightRecords(String weightRecords) {
        this.weightRecords = weightRecords;
    }

    public void setStutesRecords(String stutesRecords) {
        this.stutesRecords = stutesRecords;
    }

    public void setBmiForRecords(double bmiForRecords) {
        this.bmiForRecords = bmiForRecords;
    }

    public String getTimeRecords() {
        return timeRecords;
    }

    public String getuId() {
        return uId;
    }
    public String getStutesRecords() {
        return stutesRecords;
    }


    public double getBmiForRecords() {
        return bmiForRecords;
    }


    public String getWeightRecords() {
        return weightRecords;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getDateRecords() {
        return dateRecords;
    }


    public String getLengthRecords() {
        return lengthRecords;
    }

    public void setLengthRecords(String lengthRecords) {
        this.lengthRecords = lengthRecords;
    }
    public void setDateRecords(String dateRecords) {
        this.dateRecords = dateRecords;
    }


    public void setTimeRecords(String timeRecords) {
        this.timeRecords = timeRecords;
    }

}

