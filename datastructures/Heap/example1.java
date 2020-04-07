import java.util.*;
class maxheap{
   ArrayList<Integer> l1=new ArrayList<>();
void insert(int d)
{
int i=l1.size();
l1.add(i,d);
if(i==1)
return;
int parent=(i-1)/2;
while(parent>=0 && l1.get(parent)<l1.get(i))
{
    int t=l1.get(i);
    l1.set(i,l1.get(parent));
    l1.set(parent,t);
   // l1.add(i,l1.get(parent));
    //l1.add(parent,t);
    i=parent;
    parent=(i-1)/2;

}
}
public void print()
{
    System.out.println(l1);
}

}
public class example1
{
    public static void main(String[] args) {
        
        maxheap m1=new maxheap();
        m1.insert(11);   
        m1.insert(13);  
        m1.insert(12);  
        m1.insert(19);  
        m1.insert(14);  
        m1.insert(16);  
        m1.insert(17); 
        m1.insert(20); 
        m1.print();
    }
 

}