import java.util.Scanner;
public class XiaoYi {
        private static final int MOD = 1000000007;
        private static final int JUMP = 100000;
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            while(in.hasNext()){
                int x0 = in.nextInt();
                if(x0 % MOD ==0){
                    System.out.println(0);
                    continue;
                }
                int x = 0;
                while(x0 != 0 && x <= 3*JUMP){
                    x0 = ((x0 << 1) + 1) % MOD;
                    x++;
                }
                int result = (x + 2) / 3;
                System.out.println(result > JUMP ? - 1 :result);
            }
        }
    }

