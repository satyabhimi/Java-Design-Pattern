package ObserverPattern;

import ObserverPattern.interfaces.IObserver;
import ObserverPattern.interfaces.IWeather;

public class RoadDisplay implements IObserver {

    IWeather weather;

    public RoadDisplay(IWeather weather) {
        this.weather = weather;
    }

    @Override
    public void update() {
        weather.getWeatherData();
    }

}