/**
 * Created By Arjun Gautam
 * Date :05/10/2021
 * Time :10:09
 * Project Name :Collection
 */
package collection_deerwalk;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//HashSet does not allow the duplicate elements
public class HasSetDemo {
    public static void main(String[] args) {
        Set set=new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        Iterator i=set.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }


    }


}
