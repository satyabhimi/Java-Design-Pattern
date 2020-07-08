package ObserverPattern;

import ObserverPattern.interfaces.IObservable;
import ObserverPattern.interfaces.IObserver;

class OP {
    /*
     * This pattern is used when we need to make changes in listening classes from
     * main class
     */
    public static void main(String[] args) {
        IObservable weather = new WeatherStation();
        IObserver phoneObserver = new PhoneDisplay(weather);

        weather.add(phoneObserver);
        weather.notifyObserver();
    }
}