package first;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Double> list = Arrays.asList(2.71,3.14,0.99);

        Iterator<Double> it = list.iterator();
        while (it.hasNext())        //넣어둔 값을 꺼내면 다음번에는 출력X ,it = list.iterator(); 생성자 생성하고는 가능
            System.out.print(it.next() + " ");
        System.out.println();

        for (Double d : list)
            System.out.print(d + " ");
        System.out.println();
    }

}
