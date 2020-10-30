package ru.netologi.domain.constructor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Radio {
    private int radioStation;
    private int volume;
    private int maxStation = 10;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int radioStation, int maxStation) {
        this.radioStation = radioStation;
        this.maxStation = maxStation;
    }

    public Radio(int volume) {
        this.volume = volume;
    }

    public void nextRadioStation(int radioStation) {
        if (this.radioStation >= maxStation) {
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
        if (this.radioStation > maxStation) {
            this.radioStation = maxStation;
            return;
        }
        this.radioStation = radioStation - 1;
    }

    public void remoteControl(int radioStation) {
        if (radioStation >= maxStation) {
            this.radioStation = maxStation;
            return;
        }
        this.radioStation = radioStation;
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