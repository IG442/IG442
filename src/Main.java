class Product {
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

public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S26 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5555, true);
        productsArray[1] = new Product("iPhone 17 Pro", "15.09.2025", "Apple Inc.", "USA", 9999, false);
        productsArray[2] = new Product("Huawei Honor 15", "20.03.2025", "Huawei Technologies", "China", 6666, true);
        productsArray[3] = new Product("Xiaomi Note 12 Pro", "18.05.2024", "Xiaomi Corp.", "China", 7777, false);
        productsArray[4] = new Product("Google Pixel 11", "11.09.2024", "Google", "USA", 999, true);

        for (Product product : productsArray) {
            product.printInfo();
        }
    }
}

class Park {
    static class Attraction {
        private String name;
        private String openTime;
        private String closeTime;
        private double price;

        public Attraction(String name, String openTime, String closeTime, double price) {
            this.name = name;
            this.openTime = openTime;
            this.closeTime = closeTime;
            this.price = price;
        }

        public void printAttractionInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + openTime + " - " + closeTime);
            System.out.println("Стоимость: " + price + " руб.");
            System.out.println("   ");
        }
    }

    public class ExamplePark {
        public static void main(String[] args) {
            Park.demonstrateAttractions();
        }
    }

    public static void demonstrateAttractions() {
        Attraction[] attractions = new Attraction[3];
        attractions[0] = new Attraction("Американские горки", "11:00", "21:00", 500);
        attractions[1] = new Attraction("Мини машинки", "10:00", "20:00", 700);
        attractions[2] = new Attraction("Карусель", "10:30", "19:30", 300);

        System.out.println("Информация об аттракционах парка:");
        for (Attraction attr : attractions) {
            attr.printAttractionInfo();
        }
    }
}

class ExamplePark {
    public static void main(String[] args) {
        Park.demonstrateAttractions();
    }
}