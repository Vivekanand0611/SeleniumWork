package com.ecom.qa.logical.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NumberOfDuplicateElement {
	
	public static void main(String[] args) {
		
		String str ="vivekanandbaby";
		char [] ch = str.toCharArray();
		Map<Character,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<=ch.length-1;i++)
		{
			if(map.get(ch[i])==null)
			{
				map.put(ch[i], 1);
			}else {
				map.put(ch[i], map.get(ch[i])+1);
					
				}
			}
		System.out.println("Number Of Duplicate Element will be");
		for(Entry<Character,Integer> enter:map.entrySet())
		{
			if(enter.getValue()>1)
			{
				System.out.println(enter.getKey()+"---"+enter.getValue());
			}
		}
		}
	}

