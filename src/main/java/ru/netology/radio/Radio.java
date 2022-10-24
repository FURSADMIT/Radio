package ru.netology.radio;
public class Radio {
    private int currentWave;
    private int currentVolume;

    public void setWave(int newWave) {
        if (newWave >= 0 & newWave <= 9) {
            currentWave = newWave;
        }
    }

    public void nextStation() {

        if (currentWave >= 9) {
            currentWave = 0;
            return;
        } else {
            currentWave++;
        }
    }

    public void prevWave() {

        if (currentWave <= 0) {
            currentWave = 9;
            return;
        } else {
            currentWave--;
        }
    }

    public int getWave() {
        return currentWave;
    }


    public void setHigherVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void setLowerVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}