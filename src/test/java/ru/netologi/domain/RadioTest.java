package ru.netologi.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/nextRadioStation.csv")
    public void nextRadioStation(int radioStation, int expected) {
        Radio radio = new Radio();
        radio.setRadioStation(radioStation);
        radio.nextRadioStation(radioStation);
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/prevRadioStation.csv")
    public void prevRadioStation(int radioStation, int expected) {
        Radio radio = new Radio();
        radio.setRadioStation(radioStation);
        radio.prevRadioStation(radioStation);
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/upVolume.csv")
    public void upVolume(int volume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(volume);
        radio.upVolume(volume);
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/downVolume.csv")
    public void downVolume(int volume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(volume);
        radio.downVolume(volume);
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

}