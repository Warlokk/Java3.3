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

    public void setCurrentStationTest(int initialStation) {
        this.currentStation = initialStation;
    }

    public void setCurrentStation(String changeStation) {
        int newStation = getCurrentStation();
        if (changeStation.equals("next")) {
            newStation++;
        }
        if (changeStation.equals("prev")) {
            newStation--;
        }
        if (newStation >= minStation && newStation <= maxStation)
            this.currentStation = newStation;
        if (newStation < minStation)
            this.currentStation = maxStation;
        if (newStation > maxStation)
            this.currentStation = minStation;
    }

    public void setCurrentStationRC(int inputRC) {
        this.currentStation = inputRC;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolumeTest(int initialVolume) {
        this.currentVolume = initialVolume;
    }

    public void setCurrentVolume(String changeVolume) {
        int newVolume = getCurrentVolume();
        if (changeVolume.equals("+")) {
            newVolume++;
        }
        if (changeVolume.equals("-")) {
            newVolume--;
        }
        if (newVolume >= minVolume && newVolume <= maxVolume)
            this.currentVolume = newVolume;
    }

}
