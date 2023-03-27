public class Radio {
    private int radioNumber;
    private int volume;
    private int radioAmount = 10;

    public Radio(int size) {
        radioAmount = size;
    }

    public Radio() {

    }

    public int getRadioNumber() {
        return radioNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void next() {
        if (radioNumber < radioAmount - 1) {
            radioNumber++;
        } else {
            radioNumber = 0;
        }
    }

    public void prev() {
        if (radioNumber > 0) {
            radioNumber--;
        } else {
            radioNumber = radioAmount - 1;
        }
    }

    public void setRadioNumber(int newRadioNumber) {
        if (newRadioNumber < 0) {
            return;
        }
        if (newRadioNumber > radioAmount - 1) {
            return;
        }
        radioNumber = newRadioNumber;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        volume = newVolume;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}
