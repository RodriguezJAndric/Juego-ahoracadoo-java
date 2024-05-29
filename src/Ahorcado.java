import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");

        Scanner escaneado = new Scanner(System.in);

        String Palabra = "literatura";
        int intentosmax = 10;
        int intentos =0;
        boolean adivinado = false;
        

        char[] LetrasAdivinadas = new char[Palabra.length()];

        for (int i = 0; i < LetrasAdivinadas.length; i++) {
            LetrasAdivinadas[i] = '_';
        }


        while(!adivinado && intentos <= 9 ){

            System.out.println("Palabra a adivinar :" + String.valueOf(LetrasAdivinadas));
            System.out.println("Ingresa una letra por favor");

            char letttra = Character.toLowerCase(escaneado.next().charAt(0));


            boolean letracorrecta = false;

            for (int j = 0; j < Palabra.length(); j++) {
                if (Palabra.charAt(j) == letttra) {

                    LetrasAdivinadas[j] = letttra;

                    letracorrecta = true;
                    
                    }

                }

                if(!letracorrecta){
                    intentos ++;
                    System.out.println("Letra incorrecta mai fren, te quedan: " + (intentosmax - intentos) + " intentos");
               
                }

                if (String.valueOf(LetrasAdivinadas).equals(Palabra)) {
                    adivinado = true;
                    System.out.println("Felicidades, haz ganado");
                    System.out.println("Palabra secreta : " + Palabra);
                    
                }


        }

        if(!adivinado){
            System.out.println("Que mal, haz perdido");
        }

        escaneado.close();
    }
    
}
