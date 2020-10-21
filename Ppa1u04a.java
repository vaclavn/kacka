package ppa1;

import java.util.Locale;
/**
* Pro cteni ze standardniho vstupu.
 */
import java.util.Scanner;
/**
 * Trida, ktera v zadanem uzavrenem intervalu <x1, x2> nalezne vsechny
lokalni extremy (minimum nebo maximum) funkce f(x) = cos(x) + a * cos(b * x + c).
 * @author Katerina Skopkova
 * @version 1 (2020_10_21)
*/
public class Ppa1u04a {

	
	public static Scanner sc;
	/** Vstupni bod programu
	 * @param args nic  
	 */
	public static void main(String[] args) {
		sc = new Scanner (System.in);
		sc.useLocale(Locale.US);
		
		System.out.print("a=" );
		double a = sc.nextDouble();
		
		System.out.print("b=" );
		double b = sc.nextDouble();
		
		System.out.print("c=" );
		double c = sc.nextDouble();
		
		System.out.print("x1=" );
		double x1 = sc.nextDouble();
		
		System.out.print("x2=" );
		double x2 = sc.nextDouble();
		
		double Delta = 1.0 / 1024;
		
		
		int min = 0;
		int max = 0;
		
		
	for(int x = 0; x1+(x*Delta) <= x2; x++) {
			double XKratdelta = x*Delta+x1;
			double fx =  Math.cos(XKratdelta) + a * Math.cos(b * XKratdelta + c);
		    double f0 =  (Math.cos(XKratdelta-Delta) + a * Math.cos(b * (XKratdelta-Delta) + c)) - (Math.cos(XKratdelta) + a * Math.cos(b * XKratdelta + c));
			double f2 =  (Math.cos(XKratdelta) + a * Math.cos(b * XKratdelta + c)) - (Math.cos(XKratdelta+Delta) + a * Math.cos(b * (XKratdelta+Delta) + c));
			
			boolean PorovnavaniZnaminekf0 = f0>0;
			boolean PorovnavaniZnaminekf2 = f2>0;
			
			
			
			if (PorovnavaniZnaminekf0 == true && PorovnavaniZnaminekf2 != true) {
				min++;
			}
			if (PorovnavaniZnaminekf0 == false && PorovnavaniZnaminekf2 != false) {
				max++;
			}
	  }
	
		System.out.println("min: " + min);
		System.out.println("max: " + max);
		
		}
		
	}	

