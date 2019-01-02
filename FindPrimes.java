

public class FindPrimes
{
    private static int[] array = new int[2];
    private static int count;

    public static int[] FindPrimes()
    {
        array[0] = 2;
        count = 1;
        for(int i = 3; i < 1000000; i++)
        {
            int arrayCount = 0;
            boolean cont = true;
            while (array[arrayCount] != 0)
            {
                if (i % array[arrayCount] == 0)
                {
                    cont = false;
                    break;
                }
                if (arrayCount != 0 && (array[arrayCount] * array[arrayCount - 1]) > i)
                {
                    break;
                }
                arrayCount++;
            }
            if (cont)
            {
                array[count] = i;
                count++;
                if (count == array.length)
                {
                    Resize();
                }
            }
        }
        return array;
    }

    private static void Resize()
    {
         int[] tmp = new int[array.length * 2];
         for (int i = 0; i < array.length; i++)
         {
            tmp[i] = array[i];
         }
         array = tmp;
    }

    public static void main(String[] args)
   {
       int[] array = FindPrimes();
       for (int i = 0; i < array.length; i++)
       {
           if (array[i] != 0)
           {
               System.out.print(array[i] + " ");
           }
       }
       System.out.println();
   }
}
