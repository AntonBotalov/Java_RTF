import java.util.ArrayList;
import java.util.List;

class Greenhouse implements TemperatureObserver {
    private final List<Plant> plants = new ArrayList<>();

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    @Override
    public void update(double temperature) {
        System.out.println("Greenhouse: Обновление температуры до " + temperature + "°C");
        for (Plant plant : plants) {
            plant.reactToTemperature(temperature);
        }
    }
}