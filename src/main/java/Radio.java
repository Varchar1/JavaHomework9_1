public class Radio {
    public int radioNumber;
    public int volume;

    public void next() {
        if (radioNumber < 9) {
            radioNumber++;
        } else {
            radioNumber = 0;
        }
    }

    public void prev() {
        if (radioNumber > 0) {
            radioNumber--;
        } else {
            radioNumber = 9;
        }
    }

    public void setRadioNumber(int newRadioNumber) {
        if (newRadioNumber < 0) {
            return;
        }
        if (newRadioNumber > 9) {
            return;
        }
        radioNumber = newRadioNumber;
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
