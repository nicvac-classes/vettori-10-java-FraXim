//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;
import java.util.Random;
// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Random rand= new Random();
        int somma, media, n, i;
        System.out.println("Inserisci quanti studenti hanno partecipato al test");
        n = in.nextInt();
        String[] nome = new String[n];
        int[] voto = new int[n];
        int[] credito = new int[n];
        for (i = 0; i <= n - 1; i++){
            System.out.println("Nome " + (i + 1) + "° studente : ");
            nome[i] = in.next();
            voto[i] = rand.nextInt(11);
            System.out.println("Voto " + (i + 1) + "° studente : " + voto[i]);
            credito[i] = rand.nextInt(11);
            System.out.println("Crediti " + (i + 1) + "° studente : " + credito[i]);
        }
        somma = 0;
        for (i = 0; i <= n - 1; i++){
            somma = somma + voto[i];
        }
        media = somma / n;
        System.out.println("Media = " + media);
        for (i = 0; i <= n - 1; i++){
            if (voto[i] > media && credito[i] >= 6){
                    System.out.println("Lo studente " + nome[i] + " ha ottenuto una votazione maggiore della media e dei crediti maggiori di 6");
            }
        }
    }  
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md