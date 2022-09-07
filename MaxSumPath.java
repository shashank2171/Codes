import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[m];
            HashMap<Integer,Integer> hm = new HashMap<>();

            for(int i =0; i<n; i++) a[i]=sc.nextInt();
            for(int i =0; i<m; i++){
                b[i]=sc.nextInt();
                hm.put(b[i],i);
            }
            int a1=0;
            int b1=0;
            int i=0;
            int sum=0;
            int s=0;
            try{
                while(true){
                    while(!hm.containsKey(a[i])){
                        a1 = a1+a[i];
                        i++;
                    }
                    
                    a1=a1+a[i];
                    for(int j=hm.get(a[i]); j>=s; j--){
                        b1 = b1+b[j];
                    }
                    
                    s=hm.get(a[i])+1;
                    i++;
                    if(a1>b1) sum+=a1;
                    else sum+=b1;
                    b1=0;
                    a1=0;
                }
            }
            catch(Exception e){
                for(int j=s; j<m; j++) b1=b1+b[j];
            }
            if(a1>b1) sum+=a1;
            else sum+=b1;

            System.out.println(sum);
        }
        sc.close();
    }
}
