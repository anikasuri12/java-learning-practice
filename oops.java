public class oops {
    public static void main(String args[]){
        Pen pen1=new Pen();
        pen1.setcolor("blue");
        System.out.println(pen1.color);

        pen1.settip(5);
        System.out.println(pen1.tip);

        pen1.setcolor("black");
        System.out.println(pen1.color);
        
        pen1.color="green";
        System.out.println(pen1.color);

        Bankdetails user1=new Bankdetails();
        user1.username="anika";
        //user1.password="1234";                     // This will cause error coz password is private
        user1.setpassword("1234"); //ab hojayega coz maine func bnaya jo class ke andr hee h 
        System.out.println(user1.username);
        System.out.println(user1.getpassword());

        Pencil pencil1=new Pencil();
        pencil1.setLength(10);
        System.out.println(pencil1.getLength());

        //constructors ka seekhri
        Student s1=new Student();

        //copy constructor ka seekhri
        Human h1=new Human();     //h1 naam ka object bnaya Human class me
        h1.name="abc";
        h1.age=20;
        h1.password="lalalal";

        Human h2=new Human(h1);  //h2 naam ka object bnaya jisme h1 ka data copy so this is copy constructor
        h2.password="bruh";

        System.out.println("details of h1 are:" +h1.name+ " "+h1.age+ " "+ h1.password);
        System.out.println("details of h2 are:" +h2.name+ " "+h2.age+ " "+ h2.password);
    }
    
}

class Human{
    String name;
    int age;
    String password;

    Human() {      //ye h1 hai
    }

    Human(Human h1){       //ye h copy constructor jisme h1 ka data copy ho rha h h2 me
        this.name=h1.name;
        this.age=h1.age;
    }
}


class Pen{
    String color;
    int tip;

    void setcolor(String newcolor){
        color=newcolor;
    }

    void settip(int newtip){
        tip=newtip;
    }
}

class Bankdetails{
    public String username;
    private String password;
 
    public void setpassword(String pwd){     //setter function-sets value
        password=pwd;
    }

    public String getpassword(){         //getter function-returns value
        return password;
    }
}

class Pencil{
    private int length;
    private int tipsize;

    public void setLength(int len){      //setter function-sets value
        length=len;
    }

    public int getLength(){             //getter function-returns value
        return length;
    }
}


// encapsulation- ek single capsule,entity ie class me prop and methods saathme bnana
//  and bohot faltu ya bohot sensitive data ko hide krna- we hide using access specifiers

//constructors
class Student{
    String name;
    int rollno;

    Student(){        //constructor- same name as class, no return type, automatically called when object is created
        System.out.println("constructor called");
    }
}





