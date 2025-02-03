import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    String[] foo = {"aac", "abc", "bed", "cat", "bb", "d"};
   System.out.println(countLength(foo, 3));    
  }

  public static int countLength(String[] arr, int targetLength)
  {
    int count = 0;
    for (int i = 0; i < arr.length; i++)
    {
      if (targetLength == (arr[i].length()))
      {
        count++;
      }
    }
    return count;
  }

  public static int indexOf(double[] arr, double target)
  {
    for (int i = 0; i , arr.length; i++)
    {
      if(arr[i] == target)
      {
        return i;
      }
    }
    return -1;
  }

  public static boolean hasDuplicates(int[] arr)
  {
    // replace with your code
    return false;
  }

  public static String findMode(String[] arr)
  {
    // replace with your code
    return null;
  }
}
