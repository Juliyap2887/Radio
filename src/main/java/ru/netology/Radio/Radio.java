package ru.netology.Radio;

public class Radio {
    private int maxStation = 10;
    private int minStation = 0;
    private int currentStation;


    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    // Станции
    public Radio() {
    }

    public Radio(int countStation) {
        this.maxStation = countStation - 1;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextCurrentStation() {
        int currentStation = this.currentStation;
        if (currentStation < maxStation) {
            this.currentStation = currentStation + 1;
        } else {
            this.currentStation = minStation;
        }
    }

    public void prevCurrentStation() {
        int currentStation = this.currentStation;
        if (currentStation > minStation) {
            this.currentStation = currentStation - 1;
        } else {
            this.currentStation = maxStation;
        }
    }


    // Звук
    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextCurrentVolume() {
        int currentVolume = this.currentVolume;
        if (currentVolume < maxVolume) {
            this.currentVolume = currentVolume + 1;
        } else {
            this.currentVolume = maxVolume;
        }
    }

    public void prevCurrentVolume() {
        int currentVolume = this.currentVolume;
        if (currentVolume > minVolume) {
            this.currentVolume = currentVolume - 1;
        } else {
            this.currentVolume = minVolume;
        }
    }
}
