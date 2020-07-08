package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

import ObserverPattern.interfaces.IObservable;
import ObserverPattern.interfaces.IObserver;

public class WeatherStation implements IObservable {

    List<IObserver> obList = new ArrayList<>();

    @Override
    public void add(IObserver observer) {
        obList.add(observer);
    }

    @Override
    public void delete(IObserver observer) {
        obList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (IObserver ob : obList) {
            ob.update();
        }
    }

    public double getWeatherData() {
        return 1.0;
    }
}