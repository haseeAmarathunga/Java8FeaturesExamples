import java.util.List;
import java.util.Arrays;
import java.util.Iterator;

class IteratorOld
{
    public static void main(String args[]){
        List<Integer> ls= Arrays.asList(15,2,15,10,3,20);
        int sum=sumIterator(ls);
        System.out.println("Sum : "+sum);
    }

    public static int sumIterator(List<Integer> list){
        Iterator<Integer> it = list.iterator();
        int sum=0;

        while(it.hasNext()){
            int num=it.next();
            if(num>10){
                sum+=num;
            }
        }
        return sum;
    }
}