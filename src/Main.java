import java.util.Arrays;

public class Main {

    public void merge(int[] sortArr,int start, int mid, int end)
    {
        //Size to two subarrays
        int sub1=mid-start+1;
        int sub2=end-mid;

        //Create temp arrays
        int leftArray[]=new int[sub1];
        int rightArray[]= new int[sub2];

        for (int i=0;i<sub1;i++)
        {
            leftArray[i]=sortArr[start+i];
        }
        for (int j=0;j<sub2;j++)
        {
            rightArray[j]=sortArr[mid+1+j];
        }
        //Merge the temp arrays
        //initial indexes of first and second subarrays
        int i=0, j=0;

        //Initial index of merged subarray array
        int k=start;
        while(i<sub1 && j<sub2)
        {
            if(leftArray[i]<rightArray[j])
            {
                sortArr[k]=leftArray[i];
                i++;
            }
            else
            {
                sortArr[k]=rightArray[j];
                j++;
            }
            k++;
        }
        
        //Copying rest of the values
        while(i<sub1)
        {
            sortArr[k]=leftArray[i];
            i++;
            k++;

        }
        while(j<sub2)
        {
            sortArr[k]=rightArray[j];
            j++;
            k++;

        }
        
    }

    public void sort(int[] sortArr, int start, int end)
    {
        if(start<end)
        {
            //Finding mid point
            int mid=(start+end)/2;

            //Devide the array in two arrays
            sort(sortArr,start,mid);            
            sort(sortArr,mid+1,end);    
            
            //merge the devided arrays
            merge(sortArr,start,mid,end);
        }
        
    }
    public static void main(String[] args) throws Exception 
    {

        int givenArr[]={15, 10, 5, 8, 9, 4, 12};
        System.out.println("Given Array: "+ Arrays.toString(givenArr));

        //Calling sort method
        Main ob=new Main();
        ob.sort(givenArr,0,givenArr.length-1);
        System.out.println("Sorted Array: "+ Arrays.toString(givenArr));

        System.out.print("End");        
    }
}
