import java.util.*;
public class problem1
{
    public static void main(String[] args) {
        
    
    final int help=1;
    int score =help;
    int target=5;
    while((score*2)<=target)
    {
        score=score*2;
    }
    if(score==target)
    {
        System.out.println(help);
    }
    else{
        System.out.println(target-score+1);
    }
}
}