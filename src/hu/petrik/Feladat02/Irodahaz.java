package hu.petrik.Feladat02;

import java.util.ArrayList;

public class Irodahaz {
    private Nyomtato nyomtato;
    private Dolgozo dolgozo;
    private Postazo postazo;
    public static ArrayList<String>levelek;
    public Irodahaz(){
        levelek = new ArrayList<>();
        this.nyomtato = new Nyomtato(10);
        this.dolgozo = new Dolgozo(nyomtato);
        this.dolgozo.start();
        this.postazo = new Postazo(nyomtato);
        this.postazo.start();

        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            System.out.println("A kinyomtatott levelek: ");
            for (String item:this.levelek) {
                System.out.println(item);
            }

        }
    }

}
