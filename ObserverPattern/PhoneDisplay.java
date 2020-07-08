package ObserverPattern;

import ObserverPattern.interfaces.IObserver;
import ObserverPattern.interfaces.IWeather;

public class PhoneDisplay implements IObserver {
    IWeather weather;

    public PhoneDisplay(IWeather weather) {
        this.weather = weather;
    }

    @Override
    public void update() {
        System.out.println(weather.getWeatherData());
    }

}