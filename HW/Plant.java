abstract class Plant {
    String name;

    public Plant(String name) {
        this.name = name;
    }

    public abstract void reactToTemperature(double temperature);
}