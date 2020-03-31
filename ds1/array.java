public class array {
    public static void main(String[] args) {

        int sum=0;
        int cot=0;

        int array[]=new int[]{9,8,7,6,5};
        int array2 []=new int[]{11,12,13,14,15};
        for(int  i=0;i<array.length;i++)
        {
            for(int j=0;j<array2.length;j++)
            {
                if(array[i]==array[j])
                {
                    cot++;
                    sum+=cot;

                }
            }
        }
        System.out.println(sum);


    }
}
