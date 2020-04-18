public class exception1
{
    public static void main(String[] args) {
        
    
    try {
        throw new myexp("rehan");
    }
     catch (myexp e) {
     System.out.println("caught " );   
     e.printStackTrace();
    }
}
}

class myexp extends Exception{
    myexp(String s)
    {
        super(s);
    }
}