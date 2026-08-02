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