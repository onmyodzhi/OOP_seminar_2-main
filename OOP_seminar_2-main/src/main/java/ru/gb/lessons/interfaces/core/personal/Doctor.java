package ru.gb.lessons.interfaces.core.personal;



public abstract class Doctor {
    protected String name;
    protected int seniority;
    protected final String CLASS_NAME = "The " + getClass().getSimpleName();
    protected String specialization = CLASS_NAME;

    protected void prescribeMedication(String medicine){}
    protected void toWork(){}
}
