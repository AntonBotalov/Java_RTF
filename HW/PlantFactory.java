class PlantFactory {
    public static Plant createPlant(String type) {
        return switch (type.toLowerCase()) {
            case "tomato" -> new Tomato();
            case "cucumber" -> new Cucumber();
            default -> throw new IllegalArgumentException("Неизвестный тип растения: " + type);
        };
    }
}