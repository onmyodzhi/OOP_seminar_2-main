package ru.gb.lessons.interfaces.core;

import java.util.ArrayList;
import java.util.List;

import ru.gb.lessons.interfaces.core.clients.*;
import ru.gb.lessons.interfaces.core.clients.Runnable;
import ru.gb.lessons.interfaces.core.clients.Animals;
import ru.gb.lessons.interfaces.core.clients.home.impl.Cat;

public class VetClinic {
    private List<Runnable> animalsWhoCanRun;
    private List<Swimable> animalsWhoCanSwim;
    private List<Flyable> animalsWhoCanFly;
    private static List<Animals> animals = new ArrayList<>();
    public static void main(String[] args) {
        Human human = new Human("Python");
        Cat cat = new Cat(0, null, 0, null, null);
        // animals.add(human);
        animals.add(cat);
        for (Animals element: animals) {
            heal(element);
        }
    }
    private static void heal(Animals patients) {
        System.out.println(patients.getClassName() + "cured");
    }

    private List<Soundable> animalsWhoCanSound;
    private void addRunAnimalList(Runnable animal){
        this.animalsWhoCanRun.add(animal);
    }
    private void addSwimAnimalList(Swimable animal){
        this.animalsWhoCanSwim.add(animal);
    }
    private void addFlyAnimalList(Flyable animal){
        this.animalsWhoCanFly.add(animal);
    }

    private void addSoundAnimalList(Soundable animal){
        this.animalsWhoCanSound.add(animal);
    }

    protected List<Runnable> getAnimalsWhoCanRun(){
        return animalsWhoCanRun;
    }

    public List<Flyable> getAnimalsWhoCanFly() {
        return animalsWhoCanFly;
    }

    public List<Soundable> getAnimalsWhoCanSound() {
        return animalsWhoCanSound;
    }

    public List<Swimable> getAnimalsWhoCanSwim() {
        return animalsWhoCanSwim;
    }
}

