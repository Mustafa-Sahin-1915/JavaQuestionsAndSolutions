package somesubjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class TestQuestion {
    public static void main(String[] args) {
        List<String> dates = new ArrayList<>();
        dates.add("12/2/2020");
        dates.add("10/2/2022");
        dates.add("8/2/2023");
        dates.add("a/b/cccc");

        dates.replaceAll(t->t.replace("/","-") );
        System.out.println(dates);
        /*
        public interface Function<T, R> {

    /**
     * Applies this function to the given argument.
     *
     * @param r the function argument
     * @return R the function result
        R apply(T t);
    }
        stream().map(Function<T,R>)

            public interface Consumer<T> {

    /**
     * Performs this operation on the given argument.
     *
     * @param t the input argument

        void accept(T t);
     }

       stream().forEach( Consumer<T> function)
         */

        Function<String,String > capitilize = (str)-> str.toUpperCase();
        dates.stream().map(capitilize).forEach(System.out::println);


        List<String> list1 = new ArrayList<>();
        list1.add( "One" );
        list1.add( "Two" );
        list1.add( "Three" );

        List<String> list2 = new ArrayList<>();
        list2.add( "Two" );

        list1.remove( list2 );

        System.out.println(list1);

        for (int i=0; i<10; i=i++){
            i+=1;
            System.out.println("Hello World!");
        }

    }

}
