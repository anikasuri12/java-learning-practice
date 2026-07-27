import java.util.*;
public class javaprac2{
    public static void find(int marks[],int key){
        for (int i=0;i<marks.length;i++){
            if (marks[i]==key){
                System.out.println("found at index "+i);

            }

        }
    }

    public static void main(String[] args){
        int marks[]={12,22,21,28,45};
        int key=28;
        find(marks,key);
    }
}
