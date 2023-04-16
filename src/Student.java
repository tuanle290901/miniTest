public class Student extends People {
    private double avg;
    public Student(String name, int age, double avg) {
        super(name, age);
        this.avg = avg;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return  "People{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", age=" +super.getAge() +
                ", avg=" + avg +
                '}';
    }
}