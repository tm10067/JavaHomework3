package JavaHomework3;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class JavaHomework3 {
    public static void main(String args[]) {
        
        // Задание 1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
        
        System.out.println("Задание 1");
        List<Integer> list = generateRandomList(10); // генерация списка методом
        System.out.println(list);
        list.removeIf(x -> (x % 2 == 0)); // удаление четных чисел из списка
        System.out.println(list);
        
        // Задание 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
        
        System.out.println("Задание 2");
        ArrayList<Integer> array = generateRandomList(10); // генерация списка методом
        System.out.println(array);
        int min = array.stream().mapToInt(x -> x).min().orElse(0);           // используем Stream API
        int max = array.stream().mapToInt(x -> x).max().orElse(0);           // для нахождения минимального, 
        double avg = array.stream().mapToDouble(x -> x).average().orElse(0); // максимального и среднего значений списка
        System.out.printf("Минимальное значение списка: " + min + "\n");
        System.out.printf("Максимальное значение списка: " + max + "\n");
        System.out.printf("Среднее арифметическое значение списка: " + avg + "\n");
    }
    
//  Метод генерации списка для обоих заданий

    private static ArrayList<Integer> generateRandomList(int length){
        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < length; i++){
            list.add(rd.nextInt(0, 100));
        }
        return list;
    }
}