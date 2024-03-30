import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main{
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(bs.readLine());
        
        while(T-- > 0){
            
            StringTokenizer st = new StringTokenizer(bs.readLine(), " ");
            
            int[] startPoint = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
            int[] endPoint = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
            
            int n = Integer.parseInt(bs.readLine());
            
            int count =0;
            
            while(n-- > 0){
                st = new StringTokenizer(bs.readLine(), " ");
                    
                int[] r = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
                
                double startDist = Math.pow(r[0] - startPoint[0], 2)  + Math.pow(r[1] - startPoint[1], 2);
                double endDist = Math.pow(r[0] - endPoint[0], 2)  + Math.pow(r[1] - endPoint[1], 2);
                
                
                if(startDist < Math.pow(r[2],2) && endDist >= Math.pow(r[2],2))
                    count++;
                else if(endDist < Math.pow(r[2],2) && startDist >= Math.pow(r[2],2))
                    count++;
               
            }
            System.out.println(count);
        }
    }
}
