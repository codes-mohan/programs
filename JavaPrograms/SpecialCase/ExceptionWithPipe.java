package SpecialCase;

import java.io.IOException;

public class ExceptionWithPipe {
public static void main(String[] args) {
	try {
		throw new IOException();
		throw new ArithmeticException();
	}catch (IOException|ArithmeticException e) {
		// TODO: handle exception
	}
}
}
