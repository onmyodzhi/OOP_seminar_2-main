package ru.gb.lessons.interfaces.core.personal;


public class Nurse implements Inject {
    protected String name;
    protected String specialization;
    protected int seniority;
    protected final String CLASS_NAME = "The " + getClass().getSimpleName();

    Nurse(String name, String specialization, int seniority){
        this.specialization = specialization;
        this.name = name;
        this.seniority = seniority;
    }
    @Override
    public void inject() {
        System.out.println(CLASS_NAME + " gave you a shot.");
    }
}
