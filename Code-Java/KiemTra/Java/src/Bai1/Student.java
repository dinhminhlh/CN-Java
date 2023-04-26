package Bai1;
public class Student {
    private int id;
    private String name;
    private float math;
    private float physics;
    private float english;

    public Student(int id, String name, float math, float physics, float english) {
        this.id = id;
        this.name = name;
        this.math = math;
        this.physics = physics;
        this.english = english;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getMath() {
        return math;
    }

    public float getPhysics() {
        return physics;
    }

    public float getEnglish() {
        return english;
    }

    public float getAverage() {
        return (this.math + this.physics + this.english) / 3;
    }
    
    public String toString() {
    	return id + " " + name + " " + math + " " + physics + " " + english + "\n";
    }
}
