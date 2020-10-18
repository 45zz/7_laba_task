package com.company;

import java.util.Arrays;

public class DogHome {
    private  Dog[] dogs;
    private int pointer=0;
    public DogHome() {
        dogs= new Dog[2];
    }

    private void isCompleted(int newDogs){
        if(dogs.length<pointer+newDogs){
            System.out.println("||Внимание!!! Слишком много собак! Расширяем питомник!||");
            dogs= Arrays.copyOf(dogs,dogs.length*3/2 + newDogs);
        }
    };

    public void showDogs(){
        for (int i=0; i<pointer; i++) {
            System.out.println(dogs[i]);
        }
    }

    public void addDog(Dog... addDogObj){
        int j=0;
        isCompleted(addDogObj.length);

        System.out.println("-----------------");
        for(;j<addDogObj.length;pointer++,j++){
            System.out.println("Добавляем:" + addDogObj[j]);
            dogs[pointer]=addDogObj[j];
        }
        System.out.println("====Добавили=====\n");
    }

    public boolean contains(Dog o) {
        for (int i=0; i<pointer; i++) {
            if(dogs[i]==o) return true;
        }
        return false;
    }

    public int indexOf(Dog o) {
        for (int i=0; i<pointer; i++) {
            if(dogs[i]==o) return i;
        }
        return -1;
    }

    public boolean remove(Dog o){
        for (int i = 0; i < pointer; i++) {
            if(dogs[i]==o) {
                for (int j = i; j < pointer-1; j++) {
                    dogs[j]=dogs[j+1];
                }
                pointer--;
                return true;
            }
        }
        return false;
    }

    public Dog getDog(Dog o){
        for (int i = 0; i < pointer ; i++) {
            if(dogs[i]==o) return dogs[i];
        }
        return null;
    }

    public Dog getDog(int index){
        if(dogs[index]!=null)
            return dogs[index];
        return null;
    }
}