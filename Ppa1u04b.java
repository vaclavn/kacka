
package ppa1;
/**
* Pro cteni ze standardniho vstupu.
 */
import java.util.Scanner;
/**
 * Slouzi k nacteni cisel s desetinnou teckou.
 */
import java.util.Locale;
/**
 * Trida, ktera vypocitava klouzavy prumer z cisel zadanych uzivatelem.
 * @author Katerina Skopkova
 * @version 1 (2020_10_20)
*/
public class Ppa1u04b {
public static Scanner sc;
/** Vstupni bod programu
 * @param args parametry prikazove radky
 */
	public static void main(String[] args) {
		
		sc = new Scanner (System.in);
		sc.useLocale (Locale.US);
		
		int poradi = 1;
		double cislo = sc.nextDouble();
		double klouzavyPrumer = 0;
		double prvniNejCislo = 0;
		double druheNejCislo = 0;
		double tretiNejCislo = 0;
		double ctvrteNejCislo = 0;
		
		while (cislo != 0)
				{
					if (poradi <=3) {
						if (poradi == 1) {ctvrteNejCislo = cislo;}
						if (poradi == 2) {tretiNejCislo = cislo;}
						if (poradi == 3) {druheNejCislo = cislo;}
					System.out.print(poradi + ";");
					System.out.format(Locale.US, "%.2f;\n", cislo);
						
					}
					else {
						klouzavyPrumer = ((cislo*4)+(druheNejCislo*3)+(tretiNejCislo*2)+(ctvrteNejCislo*1))/(10);
						
						System.out.print(poradi + ";");
						System.out.format(Locale.US, "%.2f", cislo);
						System.out.format(Locale.US, ";%.2f \n", klouzavyPrumer);
						
						
						ctvrteNejCislo = tretiNejCislo;
						tretiNejCislo = druheNejCislo;
						druheNejCislo = cislo;
						
					}
					cislo = sc.nextDouble();
					poradi ++;
					
				}
				}
	}


