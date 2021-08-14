import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void shouldStationAboveTheLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation());
        radio.statioAboveTheLimit();
        int expected = radio.getMinStation();
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToTheNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMinStation());
        radio.statioAboveTheLimit();
        int expected = 1;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToTheNextStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMinStation() +5);
        radio.statioAboveTheLimit();
        int expected = 6;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationAboveTheLimit2() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation() + 1);
        int expected = radio.getCurrentStation();
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMinStation());
        radio.stationUnderLimit();
        int expected = radio.getMaxStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation());
        radio.stationUnderLimit();
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePrevStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation() -3);
        radio.stationUnderLimit();
        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationUnderLimit2() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMinStation() - 1);
        int expected = radio.getCurrentStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaceVolumeToTheNext() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMinVolume() + 5);
        radio.increaceVolumeToTheNext();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaceVolumeToTheNext2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMinVolume());
        radio.increaceVolumeToTheNext();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaceVolumeToTheNext();
        int expected = radio.getMaxVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeAboveMax2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMaxVolume() + 1);
        int expected = radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaceVolumeToPrev() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.decreaceVolumeToPrev();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaceVolumeToPrev2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMaxVolume() -5);
        radio.decreaceVolumeToPrev();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMinVolume());
        radio.decreaceVolumeToPrev();
        int expected = radio.getMinVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeUnderMin2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMinVolume() -1);
        int expected = radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}
