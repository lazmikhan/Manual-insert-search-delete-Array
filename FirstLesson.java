import java.util.*;
public class FirstLesson {
    

    public static void main(String args[])
    {
int [] numbers={1,2};
      for(int first : numbers)//O(n)
      {
        for(int second: numbers)//O(n)
        {
            for(int third: numbers)
            System.out.println(third); //O(n)
        }
      }
    }
}