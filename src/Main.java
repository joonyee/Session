import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<>();

        //Student 인스턴스 생성
        Student s1 = new Student();
        s1.setName("홍길동");
        s1.setHeight(175);
        s1.setWeight(75);
        Student s2 = new Student();
        s2.setName("이서경");
        s2.setHeight(180);
        s2.setWeight(78);
        Student s3 = new Student();
        s3.setName("이영희");
        s3.setHeight(155);
        s3.setWeight(49);
        Student s4 = new Student();
        s4.setName("김멋사");
        s4.setHeight(182);
        s4.setWeight(82);

        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s4);

        int max = 0;
        for(int j = 0; j < student.size() - 1; j++){
            if (student.get(j).getBMI() > student.get(j+1).getBMI()){
                max = j;
            }
            else
                max = j+1;
        }
        student.remove(max);

        for (int i = 0; i < student.size() ; i++) {
            student.get(i).printIntro(student.get(i));
            student.get(i).say();
        }
    }
}

