package ru.netology;

public class BillboardManager {
    private MovieItems[] items = new MovieItems[0];
    private int resultLength = 10;

    public BillboardManager() {  // конструктор без параметров

    }

    public BillboardManager(int resultLength) { // конструктор с лимитом
        this.resultLength = resultLength;
    }

    public void add(MovieItems item) {  // добавить новый фильм
        int length = items.length + 1;  // создаем новый массив больше на 1 ячейку
        MovieItems[] tmp = new MovieItems[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;  //копируем новый массив в старый
        items = tmp;
    }

    public MovieItems[] findAll() { // Вывод всех фильмов в порядке добавления
        return items;

    }

    public MovieItems[] findLast()  { // выводим согласно лимиту добавленные фильмы в обратном порядке
        if (items.length > resultLength) {
            resultLength = resultLength;
        } else {
            resultLength = items.length;
        }
        MovieItems[] result = new MovieItems[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = items.length - i- 1;
            result[i] = items [index];
        }
        return result;
    }
}
