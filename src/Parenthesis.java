import java.util.*;
public class Parenthesis {

        public static boolean chkParenthesis(String A, int n) {
            char[] arrC = A.toCharArray();
            int num = 0;
            int i = 0;
            while(i < arrC.length && num >= 0){
                if(arrC[i] == '('){
                    num++;
                }else if(arrC[i] == ')'){
                    num--;
                }
                i++;

            }
            if(i < arrC.length || num != 0){
                return false;
            }
            return true;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Scanner si = new Scanner(System.in);
        int n = si.nextInt();
        chkParenthesis(str,n);
    }
    }

