import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
class MyCode {
	public static void main (String[] args) {
		List<String> list1 = new ArrayList<>();
    list1.add("Perl");
    list1.add("Python");
    list1.add("Python");
    list1.add("Python");
    list1.add("Java");
    list1.add("Ruby");
    list1.add("Go");
    list1.add("Go");
    list1.add("C");
    list1.add("C++");
    list1.add("Java");
    list1.add("Java");
    list1.add("C");
    list1.add("C");
    list1.add("Java");
    list1.add("Java");
      list1.add("C");

    List<String> list2 = new ArrayList<>();
    list2.add("Java");
    list2.add("Python");
    list2.add("Go");
    System.out.println(list1);
    System.out.println(list2);
    
    HashMap<String, Integer> list2map = new HashMap<>();
    for (String s :list2) {
      list2map.put(s, 0);
    }
    for (String l : list1) {
      if (list2map.containsKey(l)) {
        int v = list2map.get(l);
        list2map.put(l, ++v);
      }
    }
    list1.removeAll(list2);
    System.out.println(list1);
    
    Collections.sort(list1);
    System.out.println(list1);
    
    //ashMap<String, int> count = new HashMap<>();
    List<String> count = new ArrayList<>();
    for (String s : list2) {
      for (int i = 0; i < list2map.get(s); i++) {
        count.add(s);
      }
    }
    count.addAll(list1);
    list2.addAll(list1);
    System.out.println(list2);
    System.out.println(count);
  }
}




