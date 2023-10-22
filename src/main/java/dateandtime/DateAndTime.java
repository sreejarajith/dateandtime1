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
Period period=Period.ofWeeks(2);
//cleanHouse(start,end,period);
System.out.println(start.plus(period));
System.out.println("cleaning done");
System.out.println("next cleaning date");
LocalDate start1=LocalDate.of(2023, 12, 1);
LocalDate end1=LocalDate.of(2023, 12, 31);
Period period1=Period.ofWeeks(2);
System.out.println(start1.plus(period1));
System.out.println("cleaning done for december");


   

	}
}

