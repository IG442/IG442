class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}

public class Main {

    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array == null || array.length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4x4, но длина массива: " + (array != null ? array.length : "null"));
        }
        for (int i = 0; i < 4; i++) {
            if (array[i] == null || array[i].length != 4) {
                throw new MyArraySizeException("Размер массива должен быть 4x4, но длина строки " + i + ": " + (array[i] != null ? array[i].length : "null"));
            }
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]: '" + array[i][j] + "' не является числом");
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = processArray(validArray);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException e) {
            System.err.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.err.println("Ошибка данных массива: " + e.getMessage());
        }

        System.out.println("\nДемонстрация исключения MyArraySizeException:");
        String[][] invalidSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"}
        };
        try {
            processArray(invalidSizeArray);
        } catch (MyArraySizeException e) {
            System.err.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.err.println("Ошибка данных массива: " + e.getMessage());
        }

        System.out.println("\nДемонстрация исключения MyArrayDataException:");
        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "abc", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            processArray(invalidDataArray);
        } catch (MyArraySizeException e) {
            System.err.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.err.println("Ошибка данных массива: " + e.getMessage());
        }

        System.out.println("\nДемонстрация генерации и поимки ArrayIndexOutOfBoundsException:");
        int[] testArray = {1, 2, 3, 4, 5};
        try {
            int value = testArray[10];
            System.out.println("Значение: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Перехвачено ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}