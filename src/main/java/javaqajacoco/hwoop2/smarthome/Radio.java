package javaqajacoco.hwoop2.smarthome;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {

    private int currentRadioChannel;
    private int currentSoundVolume;
    private int channelQuantity = 10;
    private int maxChannel = channelQuantity - 1;

    public Radio(int channelQuantity) {
        this.channelQuantity = channelQuantity;
        if (channelQuantity == 0) {
            maxChannel = 0;
        } else {
            this.maxChannel = channelQuantity - 1;
        }
    }

    public void nextRadioChannel() {
        if (currentRadioChannel != maxChannel) {
            currentRadioChannel = currentRadioChannel + 1;
        } else {
            currentRadioChannel = 0;
        }
    }

    public void prevRadioChannel() {

        if (currentRadioChannel != 0) {
            currentRadioChannel = currentRadioChannel - 1;
        } else {
            currentRadioChannel = maxChannel;
        }
    }

    public void increaseVolume() {

        if (currentSoundVolume != 100) {
            currentSoundVolume = currentSoundVolume + 1;
        } else {
            currentSoundVolume = 100;
        }
    }

    public void decreaseVolume() {

        if (currentSoundVolume != 0) {
            currentSoundVolume = currentSoundVolume - 1;
        } else {
            currentSoundVolume = 0;
        }
    }

    public void setCurrentRadioChannel(int newCurrentRadioChannel) {
        if (newCurrentRadioChannel < 0) {
            return;
        }
        if (newCurrentRadioChannel > maxChannel) {
            return;
        }
        currentRadioChannel = newCurrentRadioChannel;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < 0) {
            currentSoundVolume = 0;
            return;
        }
        if (newCurrentSoundVolume > 100) {
            currentSoundVolume = 100;
            return;
        }
        currentSoundVolume = newCurrentSoundVolume;
    }
}

