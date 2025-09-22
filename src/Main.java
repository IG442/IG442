import java.util.Scanner;
    public class main {
        public static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
}
        public static void main(String[] args) {
            printThreeWords();
}


        public static void checkSumSign() {
            int a = 5;
            int b = -3;

            int sum = a + b;

            if (sum >= 0) {
                System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная");
            }
        }
        public static void main(String[] args) {
            checkSumSign();
        }


        public static void printColor() {
            int value = 50;

            if (value <= 0) {
                System.out.println("Красный");
            } else if (value > 0 && value <= 100) {
                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
            }
        }
        public static void main(String[] args) {
            printColor();
        }



        public static void compareNumbers() {
            int a = 10;
            int b = 5;
            if (a >= b) {
                System.out.println("a >= b");
            } else {
                System.out.println("a < b");
            }
        }
        public static void main(String[] args) {
            compareNumbers();
        }



        public static boolean task5(int a, int b) {
            int sum = a + b;
            return sum >= 10 && sum <= 20;
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            System.out.println(task5(number1, number2));
            scanner.close();
        }



        public static void task6(int number) {
            if (number >= 0) {
                System.out.println("Положительное число");
            } else {
                System.out.println("Отрицательное число");
            }
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите целое число: ");
            int userInput = scanner.nextInt();
            task6(userInput);
            scanner.close();
        }

        //task7
        public static boolean isNegative(int number) {
         return number < 0;
     }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите целое число: ");
            int inputNumber = scanner.nextInt();

            boolean result = isNegative(inputNumber);
            System.out.println(result);
            scanner.close();
     }



    public static void task8(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }
    public static void main(String[] args) {
        task8("Привет", 5);
    }




    public static boolean task9(int year) {
            return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(" ");
            int year = scanner.nextInt();
            System.out.println(task9(year));
            scanner.close();
        }




    //task10
        public static void main(String[] args) {
            int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
            for (int num : arr) {
                System.out.print(num + " ");
        }
    }


        //task11
        public static void main(String[] args) {
            int[] arr = new int[100];
            for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
            for (int num : arr) {
            System.out.print(num + " ");
        }
    }




        //task12
        public static void main(String[] args) {
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




        //task13
        public static void main(String[] args) {
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




        //task14
        public static int[] task14(int len, int initialValue) {
            int[] array = new int[len];
            for (int i = 0; i < len; i++) {
                array[i] = initialValue;
            }
            return array;
            }
        public static void main(String[] args) {
            int[] result = task14(5, 7);
            for (int value : result) {
                System.out.print(value + " ");
            }
        }
    }