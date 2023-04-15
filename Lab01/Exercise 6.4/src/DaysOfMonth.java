import java.util.Scanner;

public class DaysOfMonth {
	
  public static int checkMonth(String month, int year) {
	  int d=0;
	  switch (month) {
  		case "1":
  		case "January":
  		case "Jan.":
  		case "Jan":
  		case "3":
  		case "March":
  		case "Mar.":
  		case "Mar":
  		case "5":
  		case "May":
  		case "7":
  		case "July":
  		case "Jul":
  		case "8":
  		case "August":
  		case "Aug.":
  		case "Aug":
  		case "10":
  		case "October":
  		case "Oct.":
  		case "Oct":
  		case "12":
  		case "December":
  		case "Dec.":
  		case "Dec":
  			d=31;  		
  			break;
  		case "4":
  		case "April":
  		case "Apr.":
  		case "Apr":
  		case "6":
  		case "June":
  		case "Jun":
  		case "9":
  		case "September":
  		case "Sept.":
  		case "Sep":
  		case "11":
  		case "November":
  		case "Nov.":
  		case "Nov":
  			d=30;
  			break;
  		case "2":
  		case "Febuary":
  		case "Feb.":
  		case "Feb":
  			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
  				d = 29;
  			} else {
  				d = 28;
  			}
  			break;
	  }
	  return d;
  }
    
  public static void main(String[] args) {
	  	
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a month: ");
        String month = sc.next();
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        int day=checkMonth(month,year);
        while (day==0) {
        	System.out.print("Invalid input. Please enter another month: ");
        	month=sc.next();
        	day=checkMonth(month,year);
        }
        if (day!=0) {
        	System.out.printf("Number of days of the month is: %d",day);
        }
  }
}
  


