import java.util.Scanner;
    class main {

        public static void main(String[] args) {

            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }

        public static void compareNumbers() {
            int a = 10;
            int b = 15;
            if (a >= b) {
                System.out.println("a >= b");
            } else {
                System.out.println("a < b");
            }

            NumberComparator comparator = new NumberComparator();
            comparator.compareNumbers();
        }

        public static boolean isSumInRange(int num1, int num2) {
            int sum = num1 + num2;
            return sum >= 10 && sum <= 20;
        }

        public static void task1(String[] args) {
            NumCheck checker = new NumCheck();
            System.out.println(checker.isSumInRange(5, 10));
        }


        public static void task3(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Пожалуйста, введите целое число:");
            int number = scanner.nextInt();
            if (number < 0) {
                ;
                System.out.println("Вы ввели отрицательное число: " + number);
            } else {
                System.out.println("Вы ввели положительное число: " + number);
            }

        }

        public static boolean isNegative(int number) {
            return number < 0;
        }

        public static void task4(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите целое число: ");
            int inputNumber = scanner.nextInt();

            boolean result = isNegative(inputNumber);
            System.out.println(result);
        }

        public static void printStringManyTimes(String text, int times) {
            for (int i = 0; i < times; i++) {
                System.out.println(text);
            }
        }

        public static void task5(String[] args) {
            printStringManyTimes("Привет", 4);
        }

        public static boolean isLeapYear(int year) {
            return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        }

        public static void task6(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(" ");
            int year = scanner.nextInt();
            System.out.println(isLeapYear(year));
        }

        public static void task7(String[] args) {
            int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            System.out.println("Исходный массив:");
            printArray(arr);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    arr[i] = 1;
                } else if (arr[i] == 1) {
                    arr[i] = 0;
                }
            }
            System.out.println("Изменённый массив:");
            printArray(arr);
        }

        public static void printArray(int[] array) {
            System.out.print("[ ");
            for (int value : array) {
                System.out.print(value + " ");
            }
            System.out.println("]");
        }

        public static void task8(String[] args) {
            int[] arr = new int[100];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
            }
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }

        public static void task9(String[] args) {
            int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.println("Исходный массив:");
            for (int num : arr) {
                System.out.print(num + ", ");
            }
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6) {
                    arr[i] *= 2;
                }
            }
            System.out.println("Изменённый массив:");
            for (int num : arr) {
                System.out.print(num + ", ");
            }
            System.out.println();
        }

        public static void task10(String[] args) {
            int size = 5;
            int[][] arr = new int[size][size];
            for (int i = 0; i < size; i++) {
                arr[i][i] = 1;
            }
            System.out.println("");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

    }