package ru.gb.lessons.interfaces.core.personal;

public class Therapist extends Doctor implements Inject{
    Therapist(String name, int seniority){
        super.name = name;
        super.seniority = seniority;
    }

    @Override
    protected void prescribeMedication(String medicine) {
        System.out.println(this.specialization + " " + this.name + " prescribed medication - " + medicine);
    }

    @Override
    protected void toWork() {
        System.out.println("Got to work.");
    }

    @Override
    public void inject() {
        System.out.println(this.specialization + " " + this.name + " gave a shot");
    }
}
