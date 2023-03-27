import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testDefaultSize() {
        Radio radio = new Radio();

        radio.setRadioNumber(10);
        Assertions.assertEquals(0, radio.getRadioNumber());
    }

    @Test
    public void shouldNotSetBigRadioNumber() {
        Radio radio = new Radio(20);

        radio.setRadioNumber(20);

        int expected = 0;
        int actual = radio.getRadioNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSmallRadioNumber() {
        Radio radio = new Radio(20);

        radio.setRadioNumber(-1);

        int expected = 0;
        int actual = radio.getRadioNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioNumber() {
        Radio radio = new Radio(20);

        radio.setRadioNumber(19);

        int expected = 19;
        int actual = radio.getRadioNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioNumber() {
        Radio radio = new Radio(20);

        radio.setRadioNumber(15);
        radio.next();

        int expected = 16;
        int actual = radio.getRadioNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseRadioNumber() {
        Radio radio = new Radio(20);

        radio.setRadioNumber(19);
        radio.next();

        int expected = 0;
        int actual = radio.getRadioNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioNumber() {
        Radio radio = new Radio(20);

        radio.setRadioNumber(15);
        radio.prev();

        int expected = 14;
        int actual = radio.getRadioNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseRadioNumber() {
        Radio radio = new Radio(20);

        radio.setRadioNumber(0);
        radio.prev();

        int expected = 19;
        int actual = radio.getRadioNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setVolume(50);
        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio radio = new Radio();

        radio.setVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setVolume(50);
        radio.decreaseVolume();

        int expected = 49;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio radio = new Radio();

        radio.setVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetHighVolume() {
        Radio radio = new Radio();

        radio.setVolume(110);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetLowVolume() {
        Radio radio = new Radio();

        radio.setVolume(-10);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

}
