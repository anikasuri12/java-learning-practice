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

    public void setpassword(String pwd){
        password=pwd;
    }

}