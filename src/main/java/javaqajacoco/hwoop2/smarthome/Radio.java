package javaqajacoco.hwoop2.smarthome;

public class Radio {

    public int currentRadioChannel;
    public int currentSoundVolume;

    public int getCurrentRadioChannel() {
        return currentRadioChannel;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void increaseVolume() {

        if (currentSoundVolume < 100) {
            currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentSoundVolume == 0) {
            return;
        }
        if (currentSoundVolume <= 100) {
            currentSoundVolume = currentSoundVolume - 1;
        }

    }

    public void nextRadioChannel() {
        if (currentRadioChannel < 9) {
            currentRadioChannel = currentRadioChannel + 1;
        }

        if (currentRadioChannel == 9) {
            return;
        }
    }
    public void prevRadioChannel() {

        if (currentRadioChannel == 0) {
            return;
        }

        if (currentRadioChannel <= 9) {
            currentRadioChannel = currentRadioChannel - 1;
        }

    }

    public void setCurrentRadioChannel(int newCurrentRadioChannel) {
        if (newCurrentRadioChannel < 0) {
            return;
        }
        if (newCurrentRadioChannel > 9) {
            return;
        }
        currentRadioChannel = newCurrentRadioChannel;
        }
    }

