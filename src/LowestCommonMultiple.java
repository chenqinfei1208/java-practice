import java.util.Scanner;
public class LowestCommonMultiple {

        public static int getResult(int m, int n){
            if(m<n){
                int temp = m;
                m=n;
                n=temp;
            }
            int k;
            while(n!=0){
                k=m%n;
                m=n;
                n=k;
            }
            return m;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                int m = sc.nextInt();
                int n = sc.nextInt();
                System.out.println(m*n/getResult(m,n));
            }
        }

    }

