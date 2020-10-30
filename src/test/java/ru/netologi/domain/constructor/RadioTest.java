package ru.netologi.domain.constructor;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @ParameterizedTest
    @CsvFileSource(resources = "/nextRadioStationDefault.csv")
    public void nextRadioStation(int radioStation, int expected) {
        radio.setRadioStation(radioStation);
        radio.nextRadioStation(radioStation);
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/nextRadioStationParametrized.csv")
    public void nextRadioStation(int radioStation, int maxStation, int expected) {
        Radio radio = new Radio(radioStation, maxStation);
        radio.nextRadioStation(radioStation);
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/prevRadioStationDefault.csv")
    public void prevRadioStation(int radioStation, int expected) {
        radio.setRadioStation(radioStation);
        radio.prevRadioStation(radioStation);
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/prevRadioStationParametrized.csv")
    public void prevRadioStation(int radioStation, int maxStation, int expected) {
        Radio radio = new Radio(radioStation, maxStation);
        radio.prevRadioStation(radioStation);
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/remoteControlDefault.csv")
    public void remoteControl(int radioStation, int expected) {
        radio.remoteControl(radioStation);
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/remoteControlParametrized.csv")
    public void remoteControl(int radioStation, int maxStation, int expected) {
        Radio radio = new Radio(radioStation, maxStation);
        radio.remoteControl(radioStation);
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/upVolume.csv")
    public void upVolume(int volume, int expected) {
        Radio radio = new Radio(volume);
        radio.upVolume(volume);
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/downVolume.csv")
    public void downVolume(int volume, int expected) {
        Radio radio = new Radio(volume);
        radio.downVolume(volume);
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }
}