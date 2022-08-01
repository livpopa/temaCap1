import java.util.Scanner;

class Main {
    public static void main(String[] args) {




        // 1. Scrieti un program care afiseaza “Imi place Java”

        System.out.println("Imi place Java");



        //2. Scrieti un program care afiseaza de 6 ori propozitia “Cursul acesta este foarte fain!”

        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");




        /* 3.Ana are 24 de ani. Fratele ei, David, e cu 6 ani mai mic. Scrieti un program care afiseaza varsta lui David */

        int Ana = 24;
        int David = Ana - 6;

        System.out.println(David);



        //4. Scrieti un program in care cititi o propozitie de la tastatura

        Scanner scanner=new Scanner(System.in);

        System.out.println("Introduceti o propozitie din tastatura : ");

        String propozitie=scanner.nextLine();

        System.out.println("Propozitia introdusa din tastatura este : "+propozitie);

        /*tema 5*/  myVariables("Galaxiei", 31, true);
        /*tema 6*/  douaNumere();
        /*tema 7*/  rezultatul();
        /*tema 8*/  The8();
        semnatura();
    }


    /*5. Scrieti un program in care definiti 3 variabile in metoda “myVariables”, un int, un String si un boolean, apoi apelati metoda din metoda “main”*/


    public static void myVariables(String text, int age, Boolean isJavaHard) {

        // Boolean "Locuiesc pe Galaxiei" = true

        System.out.println("MyAddress is:" + " " + text + " " + age + "!");
        System.out.println(isJavaHard);

    }


    /*6. Scrieti un program in care creati o metoda unde cititi 2 numere de la tastatura, le stocati in variabile, si dupa ce le-ati citit, afisati-le pe ecran.*/

    public static void douaNumere() {
        System.out.println ("Scrieti primul numar");

        Scanner scanner = new Scanner(System.in);
        double numar1 = scanner.nextDouble();


        System.out.println("Scrieti al doilea numar");
        double numar2 = scanner.nextDouble();
        String ambele = scanner.nextLine();


        System.out.println("Ati scris numerele" +numar1 + " si " +numar2);


    }


  /*7. Scrieti un program incare cititi de la tastatura un numar, si
calculati:

        - rezultatul sumei cu 5

        - rezultatul scaderii cu 12.3

        - rezultatul inmultirii cu -3.2

        - rezultatul impartirii cu 4

        - rezultatul modulului cu 6 */

    public static void rezultatul() {

        System.out.println("Scrieti un numar");

        Scanner scanner = new Scanner(System.in);
        double unnumar = scanner.nextDouble();
        double a = unnumar + 5;
        String rezultatul = scanner.nextLine();
        System.out.println("Adunare cu 5 egal: " +a);

        float b = (float) (unnumar - 12.3);
        System.out.println("Scadere 12.3 egal: " +b);

        float c = (float) (unnumar * -3.2);
        System.out.println("Inmultire -3.2: " +c);

        float d = (float) (unnumar % 4);
        System.out.println("Impartire 4: " +d);
    }



    /*8. Stergeti un singur comment din programul acesta in asa fel incat rezultatul afisat sa fie 12 si 2: */


    public static void The8() {
        System.out.println("Exercitiul 8");

        int x = 2;
        int y = 12;


        y = x + y;
        x = y - x;
        y = y - x;


        System.out.println(x);
        System.out.println(y);

    }


    public static void semnatura() {
        System.out.println("Thank you, ");
        System.out.println("L.P.");
    }
}