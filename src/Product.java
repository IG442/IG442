public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String originCountry;
    private double price;
    private boolean isReserved;

    public Product(String name, String productionDate, String manufacturer, String originCountry, int price, boolean isReserved) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.originCountry = originCountry;
        this.price = price;
        this.isReserved = isReserved;
    }

    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + originCountry);
        System.out.println("Цена: " + price + " Usd");
        System.out.println("Бронирование: " + (isReserved ? "Забронировано" : "Доступно"));
        System.out.println("   ");
    }
}
