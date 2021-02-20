package vo.jobs.javstream;



import java.util.*;

public class Compare_Stream_Map {


public static void main(String[] args) {

		// Creating an empty Map
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		Map<Integer, String> map2 = new HashMap<Integer, String>();

		// Mapping string values to int keys
		map1.put(10, "Geeks");
		map1.put(15, "4");
		map1.put(20, "Geeks");
		map1.put(25, "Welcomes");
		map1.put(30, "Jo");

		// Mapping string values to int keys
		map2.put(10, "Geeks");
		map2.put(15, "4");
		map2.put(20, "Geeks");
		map2.put(25, "Welcomes");
		map2.put(30, "Jo");

		// Displaying the Map1
		System.out.println("First Map: "
						+ map1);

		// Displaying the Map2
		System.out.println("Second Map: "
						+ map2);

		// Checking the equality
		System.out.println("Equality: " + map1.equals(map2));
      boolean r= IsEqualZ(map1,map2);
      System.out.println("EqualityFn: " + r);
	}

 public static boolean IsEqualZ
   (Map<Integer, String> first,
    Map<Integer, String>  second)
  {
    if(first.size() != second.size())
      return false;

    return first.entrySet().stream().allMatch
      (e->e.getValue().equals( second.get(e.getKey()) ));

  }

}
