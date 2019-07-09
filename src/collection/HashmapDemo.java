package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapDemo {

	public static void main(String[] args) {
		
		HashMap<String,Integer> map=new HashMap();
		map.put("madan",1111 );
		map.put("Deepika", 2222);
		map.put("null",333);
		map.put("null",222);
		System.out.println(abcd,null,null);
		
	/* 1 st way    Iterator<Map.Entry<String,Integer>> itrator=map.entrySet().iterator();
		while(itrator.hasNext()) {
			Map.Entry<String, Integer> entry=itrator.next();
			System.out.println(entry);*/
/*  2d way   map.forEach((k,v)->System.out.println("key="+k+",value="+v));
*/
		for(Map.Entry<String, Integer> entry : map.entrySet()){
			
			System.out.println("key =:"+entry.getKey()+ "  value="+entry.getValue());
			
		}
	}

}
