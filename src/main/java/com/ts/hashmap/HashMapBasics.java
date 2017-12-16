package com.ts.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapBasics {

	public static void main(String[] args) {
		try {

			Map<String,String> mMap = new HashMap<String,String>();
			mMap.put("PostgreSQL", "Free Open Source Enterprise Database");
			mMap.put("DB2", "Enterprise Database , It's expensive");
			mMap.put("Oracle", "Enterprise Database , It's expensive");
			mMap.put("MySQL", "Free Open SourceDatabase");

			Iterator<?> iter = mMap.entrySet().iterator();

			while (iter.hasNext()) {
				Map.Entry mEntry = (Map.Entry) iter.next();
				System.out.println(mEntry.getKey() + " : " + mEntry.getValue());
			}

			mMap.put("Oracle", "Enterprise Database , It's free now ! (hope)");

			System.out.println("One day Oracle.. : " + mMap.get("Oracle"));

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
}
