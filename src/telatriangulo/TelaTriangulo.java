/**
 *
 * @author Larissa Censi
 */

package telatriangulo;

import java.util.HashSet;

import java.util.Scanner;

import java.util.Set;



public class TelaTriangulo {


	public static void main(String args[]) {
            Triangulo triangulo = new Triangulo();
            
		Scanner sc = new Scanner(System.in);

		System.out.println("Informa o tipo do triangulo");

		System.out.println("Informa o valor do lado a");

		double a = sc.nextDouble();

		System.out.println("Informa o valor do lado b");

		double b = sc.nextDouble();

		System.out.println("Informa o valor do lado c");

		double c = sc.nextDouble();
<<<<<<< HEAD



		Set<String> propriedades = new HashSet<>();

		double hipotenusa = a;

		if (hipotenusa < b) {

			hipotenusa = b;

		}

		if (hipotenusa < c) {

			hipotenusa = c;

		}

		if ((a + b + c - hipotenusa) > hipotenusa) {

			propriedades.add("Válido");

			if (a == b || b == c || c == a) {

				if (a == b && b == c) {

					propriedades.add("Equilátero");

				} else {

					propriedades.add("Isósceles");

				}

			}

			if (a != b && b != c && c != a) {

				propriedades.add("Escaleno");

			}

			if (((a * a + b * b + c * c) - hipotenusa * hipotenusa) == hipotenusa

					* hipotenusa) {

				propriedades.add("Retângulo");

			}

		} else {

			propriedades.add("Inválido");

		}

=======
>>>>>>> 72a280f9dfc83bbeb95b83b545caa62bee4bfac7
		
		System.out.println("Propriedades do triangulo ->");

<<<<<<< HEAD
                propriedades.forEach((valor) -> {
                    System.out.println(valor);
            });
=======
                Set<String> propriedades = triangulo.verificar(a, b, c);
                
		for (String valor : propriedades) {

			System.out.println(valor);

		}
>>>>>>> 72a280f9dfc83bbeb95b83b545caa62bee4bfac7

	}             

}