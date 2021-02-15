package ru.netology.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Radio {
    private String name;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio(int maxStation) {
        this.maxStation = maxStation;
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
            setCurrentStation(maxStation);
        } else
            setCurrentStation(getCurrentStation() - 1);
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
