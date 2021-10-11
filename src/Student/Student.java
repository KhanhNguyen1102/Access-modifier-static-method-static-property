package Student;

public class Student {
    private String name = "John";
    private String classes = "C02";
    public Student(){}
    protected void setName(String name){
        this.name = name;
    }
    protected void setClasses(String classes){
        this.classes = classes;
    }
    public String toString(){
        return "Học sinh " + this.name + " học tại lớp " + this.classes;
    }
}
