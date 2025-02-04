import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    String[] foo = {"aac", "abc", "bed", "cat", "bb", "d"};
    int[] array = {1, 2, 3, 4, 2, 5, 2, 87, 2, 1, 5, 7};
    double[] list = {1.3, 2.6, 2.8, 2.4, 7963.2, 42.4};
   System.out.println(countLength(foo, 3)); 
   System.out.println(indexOf(list, 2.4));
   System.out.println(hasDuplicates(array));  
   System.out.println(findMode(array));  
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
    for (int i = 0; i < arr.length; i++)
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
    for (int i = 0; i < arr.length; i++)
    {
      int target = arr[i];
      for (int j = i+1; j < arr.length; j++)
      {
        if (target == arr[j])
        {
          return true;
        }
      }
    }
    return false;
  }

  public static int findMode(int[] arr)
  {
    int count = 0;
    int mode = arr[0];
    int maxCount = 0;
    for (int i = 0; i < arr.length; i++)
    {
      int target = arr[i];
      count = 0;
      for (int j = 0; j < arr.length; j++)
      {
        if (target == arr[j])
        {
          count++;
        }
      }
      if (maxCount < count)
      {
        maxCount = count;
        mode = arr[i];
      }
    }
    return mode;
  }
}
