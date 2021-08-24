package com.ameen.thread.synchronize2;

public class ThrowsException {
	// thorwerMethod
	// excepiton
	// runtimeexception
	// finally

	public static void main(String args[]) {
		String x = "9854565320";
		boolean isRequiredNumber = false;
		
		for (int i = 0; i < x.length(); i++) {
			char current = x.charAt(i);
			

			for (int j = 0; j < x.length(); j++) {
				if(j < x.length()-2) {
					if (current == x.charAt(j) && x.charAt(j+1) == current && x.charAt(j+2) == current) {
						isRequiredNumber = true;
					}
				}
				
			}
			
			if(isRequiredNumber) {
				break;
			}
			
		}
		
		System.out.println(isRequiredNumber);
	}
}
