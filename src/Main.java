import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        int sortArr[]={15, 10, 5, 8, 9, 4, 12};

        int n=sortArr.length, l=0;
        
        if(n%2==0)
        l=n/2;
        else
        l=(n+1)/2;

        int sortHalfOne[]=Arrays.copyOfRange(sortArr, 0, l);
        int sortHalfTwo[]=Arrays.copyOfRange(sortArr, l, n);

        System.out.println(Arrays.toString(sortHalfOne));
        System.out.println(Arrays.toString(sortHalfTwo));
    }
}
