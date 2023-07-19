import java.util.Scanner;

public class CountSmallerNumber {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int size=scanner.nextInt();
        int array[]=new int[size];
        for (int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }
        findCountSmallerNumber(array,size);
    }
    public static void findCountSmallerNumber(int array[],int size)
    {
        for(int i=0;i<size;i++)
        {
            int count=0;
            for (int j=i+1;j<size;j++)
            {
                if(array[i]>array[j])
                {
                    count++;
                }
            }
            System.out.print(count+" ");
        }
    }
}
