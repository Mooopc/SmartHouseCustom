package ru.netology.stats;

public class Radio {

    //  RadioStation

    public int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadiostation) {
        if (newCurrentRadiostation > 9) {
            return;
        }
        if (newCurrentRadiostation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadiostation;
    }

    public void next() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
            return;
        }
        currentRadioStation += 1;
    }

    public void prev() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
            return;
        }
        currentRadioStation -= 1;
    }

    //  Volume

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
    public void increaseVolume() {
        if (currentVolume == 100) {
            return;
        }
        currentVolume += 1;
    }
    public void decreaseVolume() {
        if (currentVolume == 0) {
            return;
        }
        currentVolume -= 1;
    }
}