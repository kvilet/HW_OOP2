package javaqajacoco.hwoop2.smarthome;

public class Radio {

    private int currentRadioChannel;
    private int currentSoundVolume;

    public int getCurrentRadioChannel() {
        return currentRadioChannel;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
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


    public void nextRadioChannel() {
        if (currentRadioChannel != 9) {
            currentRadioChannel = currentRadioChannel + 1;
        } else {
            currentRadioChannel = 0;
        }
    }

    public void prevRadioChannel() {

        if (currentRadioChannel != 0) {
            currentRadioChannel = currentRadioChannel - 1;
        } else {
            currentRadioChannel = 9;
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

