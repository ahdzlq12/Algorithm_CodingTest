import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    
    public static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        while(T-- > 0){
            int N = Integer.parseInt(br.readLine());
            
            dp[0][0] = 1;
            dp[0][1] = 0;
            dp[1][0] = 0;
            dp[1][1] = 1;
            
            fibonacchi(N);
            
            System.out.println(dp[N][0] + " " + dp[N][1]);
        }
        
        
    }
    
    public static Integer[] fibonacchi(int n){
        
        if(dp[n][0] != null && dp[n][1] != null)
            return dp[n];
        
        Integer[] firstArr = fibonacchi(n-1);
        Integer[] twiceArr = fibonacchi(n-2);
        
        dp[n][0] = firstArr[0] + twiceArr[0];
        dp[n][1] = firstArr[1] + twiceArr[1];
        
        return dp[n];
    }
}