import java.util.Arrays;

public class Main {
    public void sort(int[] sortArr)
    {
        int length=sortArr.length, mid=0;

        System.out.println(Arrays.toString(sortArr));

        if(length>2)
        {
            if(length%2==0)
            mid=length/2;
            else
            mid=(length+1)/2;        
            int sortHalfOne[]=Arrays.copyOfRange(sortArr, 0, mid);
            int sortHalfTwo[]=Arrays.copyOfRange(sortArr, mid, length);
            System.out.println(Arrays.toString(sortHalfOne));
            System.out.println(Arrays.toString(sortHalfTwo));
            Main obj=new Main();
            obj.sort(sortHalfOne);
            obj.sort(sortHalfTwo);

        }
        
        
        


    }
    public static void main(String[] args) throws Exception {
        int sortArr[]={15, 10, 5, 8, 9, 4, 12};
        Main ob=new Main();
        ob.sort(sortArr);
        
    }
}
