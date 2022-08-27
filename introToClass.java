public class introToClass {
    

    private int [] items;
    private int count;
    public introToClass(int length)
    {
        items = new int[length];
    }
public void setItems(int  item)
{
items[count]=item;
count++;

if(items.length==count)
{
    int [] newAray = new int[count*2];
    for(int i=0; i< count ; i++)
    {
        newAray[i]= items[i];
    }
    items= newAray;
}
}

public void deleteItem( int index)
{
    if(index>=count || index<0)
    {
        throw new IllegalArgumentException();
    }
   count--;
    for(int i=0; i< count ; i++)
    {
      if(i>=index)
         {
            items[i]= items[i+1];

         }       
    }
}
    public void print()
    {
      for(int i=0;i<count;i++)
      {
        System.out.print("value of arrays:"+ items[i]);
        System.out.println();
      }
      System.out.println(count);
    }

    public static void main(String args[])
    {
        introToClass intro = new introToClass(3);
         int [] num ={2,3,1};
         intro.setItems(4);
         intro.setItems(3);
         intro.setItems(1);
         intro.setItems(3);
         intro.setItems(1);
         intro.setItems(1);
         intro.setItems(3);
         intro.setItems(1);
         intro.setItems(3);
         intro.print();
         intro.deleteItem(1);
        intro.print();


    }
}
