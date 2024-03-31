public class Student extends Person{
    private String name;

    void setName(String new_name){
        name = new_name;
    }
    String getName(){
        return name;
    }
    void printIntro(Student s){
        System.out.println(this.getName() + "의 키는 " + this.getHeight() + " 이고, 몸무게는 " + this.getWeight() + "이므로 BMI수치는 " + this.getBMI() + "입니다.");
    }
    void say(){
        System.out.println("안녕");
    }
}
