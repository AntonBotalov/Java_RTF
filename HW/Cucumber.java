class Cucumber extends Plant {
    public Cucumber() {
        super("Cucumber");
    }

    @Override
    public void reactToTemperature(double temperature) {
        if (temperature < 20 || temperature > 28) {
            System.out.println(name + ": Температура неблагоприятна! Нужно регулировать.");
        } else {
            System.out.println(name + ": Температура в норме.");
        }
    }
}