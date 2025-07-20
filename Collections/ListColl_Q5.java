package collections;
import java.util.*;
public class ListColl_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> list=new LinkedList<>();
     list.add(1);
     list.add(2);
     list.add(3);
     System.out.println(list);
     list.addFirst(10);
     System.out.println(list);
     list.addLast(30);
     System.out.println(list);
     list.remove(Integer.valueOf(10));
     System.out.println(list);
	}

}
