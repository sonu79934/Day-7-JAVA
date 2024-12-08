import java.util.*;
public class prefixsumofarray{
    public static void main(String array[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]={11,2,3,4,3};
        int s=0;
        for(int i=0;i<a.length;i++)
        {
        s+=a[i];
        int res=s/(i+1);
        a[i]=res;
        }
        System.out.println(Arrays.toString(a));
    }
}