package ru.netology.radio;

public class Radio {
    private int numberOfWaves = 10;
    private int maxWave = numberOfWaves - 1;
    private int minWave = 0;
    private int currentWave;

    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public Radio() {

    }

    public Radio(int newNumberOfWave) {
        this.numberOfWaves = newNumberOfWave;
    }


    public void setWave(int newWave) {
        if (newWave >= minWave & newWave < this.numberOfWaves) {
            currentWave = newWave;
        }
    }


    public void nextWave() {
        this.maxWave = this.numberOfWaves - 1;
        if (currentWave >= maxWave) {
            currentWave = minWave;
            return;
        } else {
            currentWave++;
        }
    }

    public void prevWave() {
        this.maxWave = numberOfWaves - 1;
        if (currentWave <= minWave) {
            currentWave = maxWave;
            return;
        } else {
            currentWave--;
        }
    }

    public int getWave() {
        return currentWave;
    }


    public void setHigherVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void setLowerVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}


