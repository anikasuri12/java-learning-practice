public class learnstrings{
    public static void printString(String name){
        System.out.println(name);
    }

    public static void stringOperations(String name){
        System.out.println("Length of the string is "+ name.length());
        System.out.println("Character at index 3 is "+ name.charAt(3));
    }
    public static float shortestdist(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            
            if(dir=='W'){
                x--;
            }
            else if(dir=='E'){
                x++;
            }
            else if (dir=='N'){
                y++;
            }
            else{
                y--;
            }
            
        }
        System.out.println("final value of x,y is"+" "+x+","+y);
        return (float)Math.sqrt(x*x+y*y);
    }

    public static void substring(String name){
        System.out.println(name.substring(1,4));
    }

    public static void main(String [] args){
        String name="anika";
        String word="racerrcar";
        printString(name);
        stringOperations(name);
        String path="WNEENESENNN";
        shortestdist(path);
        substring(name);
        String str="hi i am anika";
        String num="aaabbccccdd";
    }

    

}