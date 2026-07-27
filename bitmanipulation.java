
public class bitmanipulation {

    public static void oddoreven(int number){
        int num=number&1;
        if (num==1){
            System.out.println("The number is odd");
        }
        else{
            System.out.println("The number is even");
        }
    }

    public static void getithbit(int num2){
        int i=2;
        if ((num2 & (1 << i)) != 0){
            System.out.println("The ith bit is 1");
        }
        else{
            System.out.println("The ith bit is 0");
        }
    }

    public static void setithbit(int num2){
        int i=2;
        int newnum=(num2|1<<i);
        System.out.println("The new number after setting the ith bit is: "+newnum);
    }

    public static void clearithbit(int num2){
        int i=2;
        int newnum2=(num2 & ~(1<<i));
        System.out.println("The new number after clearing the ith bit is: "+newnum2);
    }

    public static void clearithbits(int num2){
        int i=2;
        int newnum=(num2 & (1<<i));
        System.out.println("The new number after clearing the ith bits is: "+newnum);
    }




    public static void main( String args[]){
        System.out.println(0&0);
        System.out.println(0&1);
        System.out.println(1&0);
        System.out.println(1&1);
        System.out.println(0|0);
        System.out.println(0|1);
        System.out.println(1|1);
        System.out.println(1|0);
        System.out.println(0^0);
        System.out.println(0^1);
        System.out.println(1^0);
        System.out.println(1^1);
        System.out.println(~0);
        System.out.println(~1);
        System.out.println(~5);
        System.out.println(~10000);
        System.out.println(5<<2);
        System.out.println(5>>2);
        
        int number=5;
        String binary=Integer.toBinaryString(number);
        System.out.println("Binary representation of "+number+" is "+binary);
        int length=binary.length();
        int j=length-1;
        if (binary.charAt(j)=='1'){
            System.out.println("The number is odd");
        }
        else{
            System.out.println("The number is even");

        }
        oddoreven(5);
        int num2=15;
        getithbit(num2);
        
        setithbit(num2);
        clearithbit(num2);
        clearithbits(num2);
    }
}

