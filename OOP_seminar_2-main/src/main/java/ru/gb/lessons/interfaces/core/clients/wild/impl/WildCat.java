package ru.gb.lessons.interfaces.core.clients.wild.impl;

import ru.gb.lessons.interfaces.core.clients.Jumping;
import ru.gb.lessons.interfaces.core.clients.Runnable;
import ru.gb.lessons.interfaces.core.clients.Soundable;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

import java.time.LocalDate;


public class WildCat extends WildAnimal implements Runnable, Soundable, Jumping {
    public WildCat() {
    }

    public WildCat(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int run() {
        System.out.println("Running at 15 km/h");
        return 15;
    }

    @Override
    public int sound() {
        System.out.println("Says meow.");
        return 1;
    }

    @Override
    public int jumpHeight() {
        System.out.println(CLASS_NAME + " jumps 3 meters high");
        return 3;
    }
}
