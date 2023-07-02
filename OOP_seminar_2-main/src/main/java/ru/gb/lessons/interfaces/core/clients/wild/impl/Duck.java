package ru.gb.lessons.interfaces.core.clients.wild.impl;

import java.lang.annotation.Annotation;
import java.time.LocalDate;

import ru.gb.lessons.interfaces.core.clients.Flyable;
import ru.gb.lessons.interfaces.core.clients.Runnable;
import ru.gb.lessons.interfaces.core.clients.Soundable;
import ru.gb.lessons.interfaces.core.clients.SurfaceSwimming;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

public class Duck extends WildAnimal implements Flyable, Runnable, Soundable, SurfaceSwimming {
    public Duck() {
    }

    public Duck(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int fly() {
        System.out.println(CLASS_NAME + "flies at a speed of: 5 km/h");
        return 5;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + "walks at a speed of: 3 km/h");
        return 3;
    }

    @Override
    public int sound() {
        System.out.println("Says quack.");
        return 0;
    }


    @Override
    public int surfaceSwimming() {
        System.out.println(CLASS_NAME + " Can swim on the surface");
        return 0;
    }

    @Override
    public int swimmingSpeed() {
        System.out.println(CLASS_NAME + " swim at 14 km/h");
        return 14;
    }
}
