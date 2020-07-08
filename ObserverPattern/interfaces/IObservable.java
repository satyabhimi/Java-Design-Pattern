package ObserverPattern.interfaces;

public interface IObservable extends IWeather {
    void add(IObserver observer);

    void delete(IObserver observer);

    void notifyObserver();
}