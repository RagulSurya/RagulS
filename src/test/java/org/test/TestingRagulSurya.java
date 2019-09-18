//STRING
package org.test;

public class TestingRagulSurya {
	public static void main(String[] args) {
		String s = "RAGULSURYA";
		int compareTo = s.compareTo("RAGUL");
		System.out.println(compareTo);
		
		char ch = 'A';
		int i = ch;
		System.out.println(i);
		
		String st = "C";
		int compareTo2 = st.compareTo("A");
		System.out.println(compareTo2);
		
		String stt = "ABCDEFGH";
		int compareTo3 = s.compareTo("ABBCEE");
		System.out.println(compareTo3);
		
// NAME SPLIT
		String name = "My name is Ragul";
		String[] split = name.split(" ");
		System.out.println(split[0]);
		for (int j = 0;j<split.length;j++) {
			
		System.out.println(split[j ]);	
		}
		
		
		
//EQUALS & EQUALS IGNORE
		boolean equals = s.equals("RAGULSURYA");
		System.out.println(equals);
		boolean equalsIgnoreCase = s.equalsIgnoreCase("RAGULSURYA");
		System.out.println(equalsIgnoreCase);
		
		}
		
	
	
}
