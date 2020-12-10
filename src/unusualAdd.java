import java.util.*;
public class unusualAdd {
        public int addAB(int A, int B) {
            // write code here
            while(B != 0){
                int sum = A ^ B;
                int next = (A & B) << 1;
                A = sum;
                B = next;
            }
            return A;
        }
    }

