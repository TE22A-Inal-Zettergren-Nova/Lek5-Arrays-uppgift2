import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] tb_fält = new int[4];
        /*Uppgift a*/
        Scanner tb = new Scanner(System.in);
        System.out.print("Skriv in heltal 1: ");
        int tal1 = tb.nextInt();
        System.out.print("Skriv in heltal 2: ");
        int tal2 = tb.nextInt();
        System.out.print("Skriv in heltal 3: ");
        int tal3 = tb.nextInt();
        System.out.print("Skriv in heltal 4: ");
        int tal4 = tb.nextInt();

        tb_fält[0]= tal1;
        tb_fält[1]= tal2;
        tb_fält[2]= tal3;
        tb_fält[3]= tal4;
        System.out.println( tb_fält[0]+" "+ tb_fält[1]+" "+ tb_fält[2]+" "+ tb_fält[3]);

        tb_fält[0]= tal4;
        tb_fält[1]= tal3;
        tb_fält[2]= tal2;
        tb_fält[3]= tal1;
        System.out.println( tb_fält[0]+" "+ tb_fält[1]+" "+ tb_fält[2]+" "+ tb_fält[3]);

        /*Uppgift b*/

        String[] fält2 = new String[3];

        fält2[0] = "Hej";
        fält2[1] = "Katt";
        fält2[2] = "Hund";

        Scanner ord = new Scanner(System.in);
        System.out.print("Gissa ett ord som jag skrivit: ");
        String gissning = ord.nextLine();
        System.out.print("Gissade du ordet Hej? ");
        System.out.println(fält2[0].equals(gissning));
        System.out.print("Gissade du ordet Katt? ");
        System.out.println(fält2[1].equals(gissning));
        System.out.print("Gissade du ordet Hund? ");
        System.out.println(fält2[2].equals(gissning));
        
        


    }
}
