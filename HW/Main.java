public class Main {

    //Фабрика и Наблюдатель в системе управления температурой в тепличном комплексе:
    //Определите классы для представления различных типов растений и измерения температуры.
    //Реализуйте фабрику для создания объектов растений.
    //Используйте наблюдателей для контроля за изменениями температуры и оповещения о необходимости регулировк

    public static void main(String[] args) {
        Plant tomato = PlantFactory.createPlant("tomato");
        Plant cucumber = PlantFactory.createPlant("cucumber");

        Greenhouse greenhouse = new Greenhouse();
        greenhouse.addPlant(tomato);
        greenhouse.addPlant(cucumber);

        TemperatureController controller = new TemperatureController();
        controller.addObserver(greenhouse);

        controller.setTemperature(25);
        controller.setTemperature(15);
        controller.setTemperature(35);
    }
}