public class S7COPY {
    public static void main(String[] args) {
        Student s1 = new Student("spoo", 5);
        s1.marks[0] = 1;
        s1.marks[1] = 4;
        s1.marks[2] = 9;
        s1.pass = "rtd";
        Student s2 = new Student(s1);
        s1.marks[2] = 90;
        s2.pass = "ggh";
        System.out.println(s2.name);
        System.out.println(s2.marks[2]);
    }
}

class Student {
    String name;
    int rollNo;
    int marks[] = new int[3];
    String pass = "ss";

    Student(String name, int roll) {
        this.name = name;
        this.rollNo = roll;
    }

    Student(Student s1) {
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        // this.marks = s1.marks;///Shallow copy or Lazy Copy
        this.marks[0] = s1.marks[0];
        this.marks[1] = s1.marks[1];///DEEP COPY
        this.marks[2] = s1.marks[2];
    }
}
