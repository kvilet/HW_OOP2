package javaqajacoco.hwoop2.smarthome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSwitchRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioChannel(4);

        int expected = 4;
        int actual = radio.currentRadioChannel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchRadioStationIfEqualToZero() {
        Radio radio = new Radio();
        radio.setCurrentRadioChannel(0);

        int expected = 0;
        int actual = radio.currentRadioChannel;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldSwitchRadioStationIfEqualToNine() {
        Radio radio = new Radio();
        radio.setCurrentRadioChannel(9);

        int expected = 9;
        int actual = radio.currentRadioChannel;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSwitchRadioStationIfBelowZero() {
        Radio radio = new Radio();
        radio.setCurrentRadioChannel(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSwitchRadioStationIfAboveNine() {
        Radio radio = new Radio();
        radio.setCurrentRadioChannel(10);

        int expected = 0;
        int actual = radio.getCurrentRadioChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldWorkNext() {
        Radio radio = new Radio();
        radio.nextRadioChannel();

        int expected = 1;
        int actual = radio.getCurrentRadioChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotWorkNext() {
        Radio radio = new Radio();
        radio.setCurrentRadioChannel(9);
        radio.nextRadioChannel();

        int expected = 9;
        int actual = radio.getCurrentRadioChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldWorkPrev() {
        Radio radio = new Radio();
        radio.setCurrentRadioChannel(9);
        radio.prevRadioChannel();

        int expected = 8;
        int actual = radio.getCurrentRadioChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotWorkPrevIfEqualToZero() {
        Radio radio = new Radio();
        radio.setCurrentRadioChannel(0);
        radio.prevRadioChannel();

        int expected = 0;
        int actual = radio.getCurrentRadioChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotWorkPrevIfAbove9() {
        Radio radio = new Radio();
        radio.setCurrentRadioChannel(10);
        radio.prevRadioChannel();

        int expected = 0;
        int actual = radio.getCurrentRadioChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.currentSoundVolume = 99;
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio radio = new Radio();
        radio.currentSoundVolume = 100;
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolumeEqual100() {
        Radio radio = new Radio();
        radio.currentSoundVolume = 100;
        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldNotDecreaseVolumeAbove100() {
        Radio radio = new Radio();
        radio.currentSoundVolume = 101;
        radio.decreaseVolume();

        int expected = 101;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldNotDecreaseVolume() {
        Radio radio = new Radio();
        radio.currentSoundVolume = 0;
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }


}
