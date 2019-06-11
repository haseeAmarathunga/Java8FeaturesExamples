import java.util.stream.*;
import java.util.Optional;
import java.util.Arrays;
import java.util.List;

class StreamMore
{

    public static void main(String args[])
    {
        List<Integer> nums = Arrays.asList(args).stream().mapToInt(Integer::parseInt).collect(Collectors.toList());

        Stream<Integer> stNum = Stream.of();

        Optional<Integer> optNum = stNum.reduce((i,j)->{return i*j;});

        if(optNum.isPresent()){
            System.out.println(optNum.get());
        }


    }
}