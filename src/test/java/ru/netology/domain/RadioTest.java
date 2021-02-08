package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio settings = new Radio();

    @ParameterizedTest
    @CsvFileSource(resources = "/volumeData.csv", delimiter = '|', numLinesToSkip = 1)
    void shouldChangeVolume(String test, int initialVolume, String changeVolume, int expected) {
        settings.setCurrentVolume(initialVolume);
        if (changeVolume.equals("+")) settings.setCurrentVolumeUp();
        if (changeVolume.equals("-")) settings.setCurrentVolumeDown();
        assertEquals(expected, settings.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/stationData.csv", delimiter = '|', numLinesToSkip = 1)
    void shouldChangeStation(String test, int initialStation, String changeStation, int expected) {
        settings.setCurrentStation(initialStation);
        if (changeStation.equals("next")) settings.setCurrentStationUp();
        if (changeStation.equals("prev")) settings.setCurrentStationDown();
        assertEquals(expected, settings.getCurrentStation());
    }

    @ParameterizedTest
    @CsvSource({"5", "0", "9"})
    void shouldChangeStationRC(int inputRC) {
        settings.setCurrentStation(inputRC);
        assertEquals(inputRC, settings.getCurrentStation());
    }
}