
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

    public static void updateithbit(int num2){
        int newbit=0;
        if (newbit==1){
            setithbit(num2);
        }
        else{
            clearithbit(num2);
        }
    }

    public static void powerof2(int num2){
        if (num2<=0){
            System.out.println("not a power of 2");
        }
        for (int i=0;i<31;i++){
            if (num2==(1<<i)){
                System.out.println("The number is a power of 2");
                return;
            }
            System.out.println("not a power of 2");
        }
    }



    public static void clearlastibits(int num2){
        int i=3;
        int newnum3=(num2 &((-1)<<i));
        System.out.println("The new number after clearing the last i bits is: "+newnum3);
    }

    public static void clearrangeofbits(int num2){
        int i=2;
        int j=4;
        int a=((-1)<<(j+1));
        int b=((1<<i)-1);
        int bitmask=(a|b);
        int newnum4=(num2 & bitmask);
        System.out.println("The new number after clearing the range of bits is: "+newnum4);
    }

    public static void powerof2 (num2){
    if (num2 <= 0){
        System.out.println("not a power of 2");
        return;
    }
    
    for (int i = 0; i < 31; i++){
        if (num2 == (1 << i)){
            System.out.println("The number is a power of 2");
            return;
        }
    }
    
    // Moved outside the loop! It only prints here if the loop finishes without returning.
    System.out.println("not a power of 2");
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
        int num2=10;
        getithbit(num2);
        
        setithbit(num2);
        clearithbit(num2);
        updateithbit(num2);
        clearlastibits(num2);
        clearrangeofbits(num2);
        powerof2(num2);



    }
}

