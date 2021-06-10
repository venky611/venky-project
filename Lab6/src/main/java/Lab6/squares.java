package Lab6;
import java.util.*;
public class squares {

	  public static HashMap method(int[] array) {
	    HashMap<Integer, Integer> map = new HashMap<>();
	 
	    for (int n: array) {
	      map.put( n, n*n);
	    }
	    return map;
	  }
	 
	  public static void main(String[] args) {
	    int array[] = new int[]{1,2,3,4,5,6,7,8,9};
	    HashMap<Integer, Integer> map = method(array);
	 
	    Iterator<Integer> it = map.keySet().iterator();
	    while(it.hasNext()){
	    Integer key = it.next();
	      System.out.print(key + ":" + map.get(key)+"  ,  ");
	    }
	    System.out.println();
	    System.out.println(map);
	  }
}
