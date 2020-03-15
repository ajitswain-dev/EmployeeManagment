package com.example.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DateTimeFormatter dtformate=DateTimeFormatter.ofPattern("dd/MM/YYYY");
try {
	LocalDateTime date=LocalDateTime.now();
System.out.println(date);
System.out.println(dtformate.format(date));
}
catch(Exception e)
{
	e.getCause();
}
	}

}
