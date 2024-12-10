class Tomato extends Plant {
    public Tomato() {
        super("Tomato");
    }

    @Override
    public void reactToTemperature(double temperature) {
        if (temperature < 18 || temperature > 30) {
            System.out.println(name + ": Температура неблагоприятна! Нужно регулировать.");
        } else {
            System.out.println(name + ": Температура в норме.");
        }
    }
}