import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coche {

   public static void main(String args[]) throws IOException {

      BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

      String r;

      int incremPuer;

      incremPuer = 0;

      Coche0 miCoche = new Coche0(incremPuer);

      do {

         do {

            System.out.print("agregar puerta al coche? (s/n): ");

            r = bufEntrada.readLine();

            r = r.toLowerCase();

         } while (!(r.equals("s") || r.equals("n")));

         if (r.equals("s")) {

            incremPuer = miCoche.puertas(incremPuer);

            System.out.println("Número de puertas que tiene el objeto: " + incremPuer);

         }

      } while (!r.equals("n"));
      {

         System.out.println("Finaliza agregar mas puertas");

      }
   }

}

class Coche0 {

   int puertas;

   Coche0(int p) {

      puertas = p;

   }

   int puertas(int incremPuer) {

      return incremPuer + 1;

   }

}