import java.util.ArrayList;
import java.util.List;

public class TemperatureController {
    private final List<TemperatureObserver> observers = new ArrayList<>();
    private double temperature;

    public void addObserver(TemperatureObserver observer) {
        observers.add(observer);
    }

    public void setTemperature(double temperature) {
        System.out.println("\nTemperatureController: Установка температуры " + temperature + "°C");
        this.temperature = temperature;
        notifyObservers();
    }

    private void notifyObservers() {
        for (TemperatureObserver observer : observers) {
            observer.update(temperature);
        }
    }
}

