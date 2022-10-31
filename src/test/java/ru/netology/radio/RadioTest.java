package ru.netology.radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    void trueToTheHighBorderOfSetCurrentWave() {
        Radio radio = new Radio();

        int expected = 8;
        radio.setWave(8);

        int actual = radio.getWave();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    void trueTheHighBorderOfSetCurrentWave() {
        Radio radio = new Radio();

        int expected = 9;
        radio.setWave(9);

        int actual = radio.getWave();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    void falseAcrossTheHighBorderOfSetCurrentWave() {
        Radio radio = new Radio();

        int expected = 0;
        radio.setWave(10);

        int actual = radio.getWave();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    void trueToTheLowBorderOfSetCurrentWave() {
        Radio radio = new Radio();

        int expected = 1;
        radio.setWave(1);

        int actual = radio.getWave();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    void trueTheLowBorderOfSetCurrentWave() {
        Radio radio = new Radio();

        int expected = 0;
        radio.setWave(0);

        int actual = radio.getWave();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    void falseAcrossTheLowBorderOfSetCurrentWave() {
        Radio radio = new Radio();

        int expected = 0;
        radio.setWave(-1);

        int actual = radio.getWave();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    void trueToTheBorderOfNextWaveTest() {
        Radio radio = new Radio();

        radio.setWave(7);
        radio.nextWave();

        int expected = 8;
        int actual = (radio.getWave());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void trueTheBorderOfNextWaveTest() {
        Radio radio = new Radio();

        radio.setWave(8);
        radio.nextWave();

        int expected = 9;
        int actual = (radio.getWave());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void falseAcrossTheBorderOfNextWaveTest() {
        Radio radio = new Radio();

        radio.setWave(9);
        radio.nextWave();

        int expected = 0;
        int actual = (radio.getWave());

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void trueToTheBorderOfPrevWaveTest() {
        Radio radio = new Radio();

        radio.setWave(2);
        radio.prevWave();

        int expected = 1;
        int actual = (radio.getWave());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void trueTheBorderOfPrevWaveTest() {
        Radio radio = new Radio();

        radio.setWave(1);
        radio.prevWave();

        int expected = 0;
        int actual = (radio.getWave());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void falseAcrossTheBorderOfPrevWaveTest() {
        Radio radio = new Radio();

        radio.setWave(0);
        radio.prevWave();

        int expected = 9;
        int actual = (radio.getWave());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void trueToTheBorderOfSetHigherVolume() {
        Radio radio = new Radio();

        for (int i = 0; i < 9; i++) {
            radio.setHigherVolume();
        }

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void trueBorderOfSetHigherVolume() {
        Radio radio = new Radio();

        for (int i = 0; i < 10; i++) {
            radio.setHigherVolume();
        }

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void falseAcrossBorderOfSetHigherVolume() {
        Radio radio = new Radio();

        for (int i = 0; i < 11; i++) {
            radio.setHigherVolume();
        }

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void trueToTheBorderSetLowerVolume() {
        Radio radio = new Radio();


        radio.setHigherVolume();
        radio.setHigherVolume();

        radio.setLowerVolume();


        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void trueTheBorderSetLowerVolume() {
        Radio radio = new Radio();


        radio.setHigherVolume();
        radio.setLowerVolume();


        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void falseAcrossTheBorderSetLowerVolume() {
        Radio radio = new Radio();


        radio.setLowerVolume();


        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}