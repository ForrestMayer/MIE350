package com.mie.model;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

	
public class MemberList {

		private Map map = new HashMap();
		
		public void add(Member new_Member) {
			map.put(new_Member.getUsername(), new_Member);
		}

		
		public boolean has(String Member_userName) {
			return map.containsKey(Member_userName);
		}

		
		public boolean has(Member Member) {
			return map.containsKey(Member.getUsername());
		}

		public int size() {
			return map.size();
		}

		public Member get(String Member_userName){

			return (Member) map.get(Member_userName);
		}

		public Iterator iterator() {
			return map.values().iterator();
		}
}
