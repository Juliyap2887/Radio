import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio.Radio;

public class RadioTest {

    //Тесты для станций

    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(5);

        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldSetMaxStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);

        Assertions.assertEquals(9, radio.getMaxStation());
    }

    @Test
    public void shouldSetMinStation() {
        Radio radio = new Radio();
        radio.setMinStation(0);

        Assertions.assertEquals(0, radio.getMinStation());
    }


    @Test
    public void nextCurrentStationNormStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(8);
        radio.nextCurrentStation();

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void nextCurrentStationMaxBorderStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(9);
        radio.nextCurrentStation();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nextCurrentStationOverMaxStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(10);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationNormStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(6);
        radio.prevCurrentStation();

        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationMinBorderStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(0);
        radio.prevCurrentStation();

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationUnderMinStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(-1);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationNormStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(5);
        radio.remoteCurrentStation(7);

        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationOverMaxStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(5);
        radio.remoteCurrentStation(10);

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationUnderMinStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(5);
        radio.remoteCurrentStation(-1);

        Assertions.assertEquals(0, radio.getCurrentStation());
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

}
