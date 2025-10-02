public class Park {
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
}
