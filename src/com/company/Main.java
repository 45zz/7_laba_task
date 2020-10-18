package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> array1= new ArrayList<>();
        show(array1.toArray());
        System.out.println("Добавим элемент в массив:");
        array1.add(30);
        show(array1.toArray());
        System.out.println("Выводим элемент с индексом 0: " + array1.get(0));

        System.out.println("Добавляем элемент на индекс 0:");
        array1.add(0,100);
        show(array1.toArray());

        System.out.println("Проверим, содержится ли элемент:" + array1.contains(30));
        System.out.println("Проверим, содержится ли элемент:" + array1.contains(20));

        System.out.println("Удалим 0-вой элемент: ");
        show(array1.toArray());
        array1.remove(0);
        show(array1.toArray());

        System.out.println("Добавил в коллекцию array1 коллекцию array2:");
        ArrayList <Integer> array2= new ArrayList<>(){};
        array2.add(-10);
        array2.add(-30);

        System.out.print("array1:");
        show(array1.toArray());
        System.out.print("array2:");
        show(array2.toArray());

        array1.addAll(array2);
        show(array1.toArray());

        System.out.println("Найдём индекс элемента -10: " + array1.indexOf(-10));
        System.out.println("Найдём индекс элемента -5 (которого нет): " + array1.indexOf(-5));

        System.out.println("------------------------------------");
        LinkedList<Integer> linked1=new LinkedList<>();
        System.out.println("Добавим элемент в массив:");
        linked1.add(30);
        show(array1.toArray());
        System.out.println("Выводим элемент с индексом 0: " + linked1.get(0));

        System.out.println("Добавляем элемент на индекс 0:");
        linked1.add(0,100);
        show(linked1.toArray());

        System.out.println("Проверим, содержится ли элемент:" + linked1.contains(30));
        System.out.println("Проверим, содержится ли элемент:" + linked1.contains(20));

        System.out.println("Удалим 0-вой элемент: ");
        show(array1.toArray());
        linked1.remove(0);
        show(linked1.toArray());

        System.out.println("Добавил в коллекцию array1 коллекцию array2:");
        ArrayList <Integer> linked2= new ArrayList<>(){};
        linked2.add(-10);
        linked2.add(-30);

        System.out.print("linked1:");
        show(linked1.toArray());
        System.out.print("linked2:");
        show(linked2.toArray());

        linked1.addAll(linked2);
        show(linked1.toArray());

        System.out.println("Найдём индекс элемента -10: " + linked1.indexOf(-10));
        System.out.println("Найдём индекс элемента -5 (которого нет): " + linked1.indexOf(-5));



        System.out.println("-------------------------------");
        DogHome hto=new DogHome();
        System.out.println("Добавим много собак: ");
        Dog put=new Dog("Putur", 15);
        hto.addDog(put);
        hto.addDog(new Dog("Razan", 15),new Dog("Murk", 3));
        hto.addDog(new Dog("merq",30));
        hto.addDog(new Dog("merz",30));
        hto.addDog(new Dog("er",30),new Dog("gor",30),new Dog("mor",30),new Dog("grom",30));
        hto.showDogs();
        Dog temp = new Dog("mers",30);
        hto.addDog(temp);
        hto.showDogs();
        System.out.println("Удалим объект put:");
        hto.remove(put);
        hto.showDogs();
        System.out.println("Получим объект по индексу:");
        System.out.println( hto.getDog(0));



        // write your code here
    }
    public static void show(Object [] t){
        if(t.length==0) System.out.print("Нет элементов");
        for (Object g:t
        ) {
            System.out.print(g +" ");

        }
        System.out.println();
    }
}