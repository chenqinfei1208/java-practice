import java.util.Scanner;
public class Test2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result="";
        int count=0;
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if('0'<= arr[i] && arr[i] <= '9'){
                count=1;
                int index=1;
                for(int j=i+1;j<arr.length;j++){
                    if('0' <arr[j] && arr[j]<='9'){
                        count++;
                        index=j;
                    }else{
                        break;
                    }
                }if(count>result.length()){

                    result=str.substring(i,index+1);
                }
            }else{
                continue;
            }
        }
        System.out.println(result);
    }
}