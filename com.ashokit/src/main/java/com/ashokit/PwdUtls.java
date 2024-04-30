package com.ashokit;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdUtls {
public static void main(String[] args) {
	String sts="anil";
	Encoder encoder = Base64.getEncoder();
	String encodeToString = encoder.encodeToString(sts.getBytes());
	System.out.println(encodeToString);
}
}
