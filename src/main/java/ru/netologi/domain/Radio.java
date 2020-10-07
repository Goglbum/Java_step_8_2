package ru.netologi.domain;

public class Radio {
    private int radioStation;
    private int volume;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 10;
    private int minVolume = 0;

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation) {
        this.radioStation = radioStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void nextRadioStation(int radioStation) {
        if (this.radioStation == maxStation) {
            this.radioStation = minStation;
            return;
        }
        this.radioStation = radioStation + 1;
    }

    public void prevRadioStation(int radioStation) {
        if (this.radioStation == minStation) {
            this.radioStation = maxStation;
            return;
        }
        this.radioStation = radioStation - 1;
    }
    public void upVolume(int volume) {
        if (volume >= maxVolume) {
            return;
        }
        this.volume = volume + 1;
    }
    public void downVolume(int volume) {
        if (volume <= minVolume) {
            return;
        }
        this.volume = volume - 1;
    }
}
