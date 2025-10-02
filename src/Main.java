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
        Park.demonstrateAttractions();
    }

}