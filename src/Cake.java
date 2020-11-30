import java.util.*;
public class Cake {

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            while(input.hasNextInt()){
                int r = input.nextInt();
                int c = input.nextInt();
                System.out.println(deal(r,c));
            }
        }
        public static int deal(int r,int c){
            int n = 0;
            if(r%4==0||c%4==0){
                n=r*c/2;
            }else{
                n=r*c/2+1;
            }
            return n;
        }
    }

