public class sorting {
    public static void main(String[] args){
        int marks[]={5,4,1,3,2};
        for (int i=0;i<marks.length;i++){
            if (marks[i]>marks[i+1]){
                int temp=marks[i];
                marks[i]=marks[i+1]; 
                marks[i+1]=temp;
            }
        }
        for (int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
    }
    
}
