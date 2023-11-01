package com.test.code;

public class DefangingAnIPAddress {
	public static void main(String[] args) {
		String address = "1.1.1.1";

		DefangingAnIPAddress defangingAnIPAddress = new DefangingAnIPAddress();
		System.out.println(defangingAnIPAddress.defangIPaddr(address));
	}

	public String defangIPaddr(String address) {
		String newAddress ="";
		for(int i=0; i<address.length(); i++) {
			if(address.charAt(i)=='.') {
				newAddress =newAddress+"["+address.charAt(i)+"]";
			}
			else {
				newAddress = newAddress+address.charAt(i);
			}
		}
		return newAddress;
	}
}
