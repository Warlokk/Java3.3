package ru.netology;

public class Radio {
    private String name;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation >= minStation && newStation <= maxStation)
            this.currentStation = newStation;
        if (newStation < minStation)
            this.currentStation = maxStation;
        if (newStation > maxStation)
            this.currentStation = minStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume >= minVolume && newVolume <= maxVolume)
            this.currentVolume = newVolume;
        if (newVolume < minVolume)
            return;
        if (newVolume > maxVolume)
            return;
    }

}
