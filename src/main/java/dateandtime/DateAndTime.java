package dateandtime;
import java.time.LocalDate;
import java.time.LocalDateTime;

import java.time.Period;

import java.time.*;
public class DateAndTime {

public static void main(String[] args) {
//		// TODO Auto-generated method stub
		//
	System.out.println(LocalDate.now());
	System.out.println(LocalTime.now());
		
	  LocalDate localdate=LocalDate.of(2023, 6, 1); 
	  LocalTime localtime=LocalTime.of(10, 30); 
	  System.out.println(localdate+","+localtime);
	 
	 
		System.out.println(LocalDateTime.of(localdate, localtime));
		//using period;
		LocalDate start=LocalDate.of(2023, 10, 10);
		LocalDate end=LocalDate.of(2023, 11, 10);
Period period=Period.ofWeeks(1);
//cleanHouse(start,end,period);
System.out.println(start.plus(period));


   

	}
}

