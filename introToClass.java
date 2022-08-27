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

public void searchItem(int item)
{
for(int i =0;i<count ;i++)
{
if(items[i]==item)
{
   System.out.print(i+" ");}}
}
public void insertAt(int item, int index)
{
items[index]= item;
}

public void intersect(int [] Arr)
{ 

    for(int i=0;i<count;i++)
    {
         for(int j=0;j<Arr.length;j++)
         {
          
            if(items[i]==Arr[j])
            {
                System.out.println(items[i]); 
            }
         }
    }
}
public void reverse()
{
    int [] reverseArr= new int[count];

    for(int i=0;i<count;i++)
    {  
        reverseArr[i]= items[count-(i+1)];
    }

    items=reverseArr;
    
}
public int max(){

  
    int max=items[0];
    for(int i=0; i<count;i++)
    { if(max<items[i])
        max= items[i]; } 
        return max;
      }
    public void print()
    {
      for(int i=0;i<count;i++)
      {
        System.out.print("value of arrays:"+ items[i]);
        System.out.println();
      }
      
    }

    public static void main(String args[])
    {
        introToClass intro = new introToClass(3);
         int [] num ={2,3,1};
         intro.setItems(4);
         intro.setItems(3);
         intro.setItems(1);
         intro.setItems(2);
         intro.setItems(8);
        intro.print();
        intro.deleteItem(1);
       intro.print();
        intro.searchItem(3);
       System.out.println("Largest number in array"+ intro.max());

       int [] ArrayNew = {2,3,6};

       intro.intersect(ArrayNew);
       intro.reverse();
    intro.insertAt(67, 0);
       intro.print();


    }
}
