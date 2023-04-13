package tests;

public class UnitTest {
	public static String findPreviousDate(String inputDate) {
		// Parse input string to year, month, and day values
		int day = Integer.parseInt(inputDate.substring(0, 2));
		int month = Integer.parseInt(inputDate.substring(3, 5));
		int year = Integer.parseInt(inputDate.substring(6, 10));
		
		// Check if input date is in a leap year
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

		if (day<1 || day>31 || month<1 || month>12 || year<1900 || year>2015 || (month == 2 && day>29 && isLeapYear) || (month == 2 && day>28 && !isLeapYear)) {
			return "INVALID";
		}
		
		if (month == 1) {
			if (day == 1) {
				month = 12;
				year--;
				return String.format("%02d/%02d/%04d", 31, month, year);
			} else {
				return String.format("%02d/%02d/%04d", day - 1, month, year);
			}
		} else if (month == 3) {
			if (day == 1) {
				month--;
				if (isLeapYear) {
					return String.format("%02d/%02d/%04d", 29, month, year);
				} else {
					return String.format("%02d/%02d/%04d", 28, month, year);
				}
				
			} else {
				return String.format("%02d/%02d/%04d", day - 1, month, year);
			}
		} else if (month ==2 || month == 4 || month == 6 || month == 8 || month == 9 || month == 11) {
			if (day == 1) {
				month--;
				return String.format("%02d/%02d/%04d", 31, month, year);
			} else {
				return String.format("%02d/%02d/%04d", day - 1, month, year);
			}
		} else if (month == 5 || month == 7 || month == 10 || month == 12) {
			if (day == 1) {
				month--;
				return String.format("%02d/%02d/%04d", 30, month, year);
			} else {
				return String.format("%02d/%02d/%04d", day - 1, month, year);
			}
		} else {
			return "INVALID";
		}
	}
	
	public static int linearSearch(int v, int[] a) {
		int i = 0;
		while (i < a.length) {
			if (a[i] == v)
				return i;
			i++;
		}
		return -1;
	}
	
	public static int countItem(int v, int a[]) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == v) {
				count++;
			}
		}
		return (count);
	}
	
	public static int binarySearch(int v, int a[]) {
		int lo,mid,hi;
		lo = 0;
		hi = a.length-1;
		while (lo <= hi) {
			mid = (lo+hi)/2;
			if (v == a[mid]) return (mid);
			else if (v < a[mid]) hi = mid-1;
			else lo = mid+1;
		}
		return(-1);
	}
	
	public static int EQUILATERAL = 0;
	public static int ISOSCELES = 1;
	public static int SCALENE = 2;
	public static int INVALID = 3;
	public static int triangle(int a, int b, int c) {
		if (a >= b+c || b >= a+c || c  >= a+b) return(INVALID);
		if (a == b && b == c) return(EQUILATERAL);
		if (a == b || a == c || b == c) return(ISOSCELES);
	 	return(SCALENE);
	 }
	
	public static boolean prefix(String s1, String s2) {
		if (s1.length() > s2.length()) {
			return false;
		}
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) return false;
		}
		return true;
	}
}
