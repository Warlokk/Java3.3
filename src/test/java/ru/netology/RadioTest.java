package ru.netology;

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
        settings.setCurrentVolumeTest(initialVolume);
        settings.setCurrentVolume(changeVolume);
        assertEquals(expected, settings.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/stationData.csv", delimiter = '|', numLinesToSkip = 1)
    void shouldChangeStation(String test, int initialStation, String changeStation, int expected) {
        settings.setCurrentStationTest(initialStation);
        settings.setCurrentStation(changeStation);
        assertEquals(expected, settings.getCurrentStation());
    }

    @ParameterizedTest
    @CsvSource({"5", "0", "9"})
    void shouldChangeStationRC(int inputRC) {
        settings.setCurrentStationRC(inputRC);
        assertEquals(inputRC, settings.getCurrentStation());
    }
}