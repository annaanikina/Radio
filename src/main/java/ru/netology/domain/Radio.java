package ru.netology.domain;

public class Radio {
    private String name;
    private int currentStation;
    private int currentVolume;
    private int minStation = 0;
    private int maxStation = 9;
    private int minVolume = 0;
    private int maxVolume = 10;
    private boolean on;


    public int statioAboveTheLimit() {
        if (currentStation < maxStation) {
            this.currentStation = currentStation + 1;
        } else {
            this.currentStation = minStation;
        }
        return this.currentStation;
    }

    public int stationUnderLimit() {
        if (currentStation > minStation) {
            this.currentStation = currentStation - 1;
        } else {
            this.currentStation = maxStation;
        }
        return this.currentStation;
    }

    public int increaceVolumeToTheNext() {
        if (currentVolume < maxVolume) {
            this.currentVolume = currentVolume + 1;
        } else {
            this.currentVolume = currentVolume;
        }
        return this.currentVolume;
    }

    public int decreaceVolumeToPrev() {
        if (currentVolume > minVolume) {
            this.currentVolume = currentVolume - 1;
        } else {
            this.currentVolume = currentVolume;
        }
        return this.currentVolume;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

}
