package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio settings = new Radio();

    @ParameterizedTest
    @CsvFileSource(resources = "/volumeData.csv", delimiter = '|', numLinesToSkip = 1)
    void shouldChangeVolume(String test, int currentVolume, String change, int expected) {
        settings.setCurrentVolume(currentVolume);
        int newVolume = 0;
        if (change.equals("+")) {
            newVolume = currentVolume + 1;
        }
        if (change.equals("-")) {
            newVolume = currentVolume - 1;
        }
        settings.setCurrentVolume(newVolume);
        assertEquals(expected, settings.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/stationData.csv", delimiter = '|', numLinesToSkip = 1)
    void shouldChangeStation(String test, int currentStation, String change, int expected) {
        settings.setCurrentStation(currentStation);
        int newStation = 0;
        if (change.equals("next")) {
            newStation = currentStation + 1;
        }
        if (change.equals("prev")) {
            newStation = currentStation - 1;
        }
        settings.setCurrentStation(newStation);
        assertEquals(expected, settings.getCurrentStation());
    }

    @Test
    void shouldChangeStationRC() {
        int inputRC = 5;
        settings.setCurrentStation(inputRC);
        assertEquals(inputRC, settings.getCurrentStation());
    }
}