package ru.netology.domain;

public class Radio {
    private String name;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        this.currentStation = newStation;
    }

    public void setStationRC(int newStation) {
        if (newStation > maxStation)
            return;
        this.currentStation = newStation;
    }

    public void setCurrentStationUp() {
        if (getCurrentStation() == maxStation) {
            setCurrentStation(minStation);
        } else
            setCurrentStation(getCurrentStation() + 1);
    }

    public void setCurrentStationDown() {
        if (getCurrentStation() == minStation) {
            setCurrentStation(getMaxStation());
        } else
            setCurrentStation(getCurrentStation() - 1);
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        this.currentVolume = newVolume;
    }

    public void setCurrentVolumeUp() {
        if (getCurrentVolume() == maxVolume)
            return;
        else
            setCurrentVolume(getCurrentVolume() + 1);
    }

    public void setCurrentVolumeDown() {
        if (getCurrentVolume() == minVolume)
            return;
        else
            setCurrentVolume(getCurrentVolume() - 1);
    }

}
