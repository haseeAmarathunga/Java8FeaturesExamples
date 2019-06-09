import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

class StreamAPISum
{
    public static void main(String args[]){
        List<Integer> ls= Arrays.asList(5,11,23,11,5,15);
        int sum=StreamSum(ls);
        System.out.println("Sum : "+sum);
    }

    public static int StreamSum(List<Integer> ls)
    {
        return ls.stream().filter(i->i >10).mapToInt(i->i).sum();
    }
}