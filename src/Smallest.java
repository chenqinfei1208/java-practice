import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Smallest {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                String str = sc.nextLine();
                String[] strings = str.split("");
                int[] n = new int[strings.length-1];
                for(int i=0;i <n.length;i++){
                    n[i] = Integer.parseInt(strings[i]);
                }
                int k = Integer.parseInt(strings[strings.length-1]);
                Arrays.sort(n);
                for(int i = 0;i<k-1;i++){
                    System.out.print(n[i] + "");
                }
                System.out.println(n[k-1]);
            }
        }
    }

