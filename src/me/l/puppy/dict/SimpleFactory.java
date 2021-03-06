package me.l.puppy.dict;

import java.util.HashMap;

import me.l.puppy.dict.core.Dict;

/**
 * Using to get dict instance
 * 
 * @author jun
 * 
 */
public abstract class SimpleFactory {
	static HashMap<String, Dict> registered = new HashMap<String, Dict>();

	public static void register(String name, Dict dict) {
		registered.put(name, dict);
	}

	public static Dict getDict(String name) {
		return registered.get(name);
	}

	public static String[] getNames() {
		String [] ret=new String [registered.size()];
		int idx=0;
		for(String key : registered.keySet())
			ret[idx++]=key;
		return ret;
	}
}
