import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
class Stream1
{
    public static void main(String args[]){
        List<Integer> num=Arrays.asList(1,2,8,4,0,6,9);
        System.out.println(num);

        //get num list value square
        List<Integer> square = num.stream().map(x -> x*x).collect(Collectors.toList()); 
        System.out.println(square);

        List<String> names=Arrays.asList("Hasitha","Amal","Pasan","Bhanuka");
        List res=names.stream().filter(s->s.startsWith("H")).collect(Collectors.toList());
        System.out.println(res);
    }
}