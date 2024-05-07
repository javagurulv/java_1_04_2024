package lv.javaguru.java1.student_artem_galustan.lesson3.Robo;

public class SecRobot {

    public String Name;

    public int work;

    public SecRobot(String Name, int work) {
        this.Name = Name;
        this.work = work;
    }
    public String getName() {
        return this.Name;
    }
    public void set(String newName) {
        this.Name = newName;
    }
}
