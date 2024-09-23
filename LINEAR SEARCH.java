import java.util.*;
public class linearser {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int x=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        search(n,x,arr);
    }
    static float search(int n,int x,int arr[])
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                System.out.println("YES");
                return 5.4f;
            }

        }
        System.out.println("NO");
        return 7.8f;
    }
}
