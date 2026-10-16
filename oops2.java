public class oops2{
    public static void main (String args[]){
        Student s1= new Student();
        s1.name="Anika";
        s1.roll=123;
        s1.marks= new int[3];
        s1.marks[0] = 90;
        s1.marks[1] = 85;
        s1.marks[2] = 95;

        Student s2=new Student(s1);

        System.out.println(s2.name);
        System.out.println(s2.roll);
        for(int i=0;i<s2.marks.length;i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    int marks[];

    public Student() {
        // Khali chhod sakte hain ya default values de sakte hain
    }

    //shallow copy constructor
    
    Student(Student s1){
        marks=new int[3];
        name=s1.name;
        roll=s1.roll;
        marks=s1.marks;
    }
    

    //deep copy constructor
    /*
    Student(Student s1){
        marks=new int[3];
        name=s1.name;
        roll=s1.roll;
        for(int i=0;i<marks.length;i++){
            marks[i]=s1.marks[i];
        }

    }*/
}
