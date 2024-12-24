import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio.Radio;

public class RadioTest {

    //Тесты для станций

    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(28);
        radio.nextCurrentStation();

        Assertions.assertEquals(29, radio.getCurrentStation());
    }

    @Test
    public void nextCurrentStationMaxBorderStation() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(29);
        radio.nextCurrentStation();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nextCurrentStationOverMaxStation() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(30);


        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationNormStation() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(6);
        radio.prevCurrentStation();

        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationMinBorderStation() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(0);
        radio.prevCurrentStation();

        Assertions.assertEquals(29, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationUnderMinStation() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(-1);
        radio.prevCurrentStation();

        Assertions.assertEquals(29, radio.getCurrentStation());
    }


    // Тесты для звука

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(100);
        radio.setMinVolume(0);
        radio.setCurrentVolume(49);

        Assertions.assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(100);

        Assertions.assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);

        Assertions.assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void setCurrentVolumeTestOverMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(100);
        radio.setMinVolume(0);
        radio.setCurrentVolume(50);
        radio.setCurrentVolume(101);

        Assertions.assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void nextCurrentVolumeNormVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(100);
        radio.setMinVolume(0);
        radio.setCurrentVolume(59);
        radio.nextCurrentVolume();

        Assertions.assertEquals(60, radio.getCurrentVolume());
    }

    @Test
    public void prevCurrentVolumeNormVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(100);
        radio.setMinVolume(0);
        radio.setCurrentVolume(59);
        radio.prevCurrentVolume();

        Assertions.assertEquals(58, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeTestUnderMinVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(100);
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);
        radio.setCurrentVolume(-1);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void prevCurrentVolumeMinBorderVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(100);
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);
        radio.prevCurrentVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void nextCurrentVolumeMaxBorderVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(100);
        radio.setMinVolume(0);
        radio.setCurrentVolume(100);
        radio.nextCurrentVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

}
