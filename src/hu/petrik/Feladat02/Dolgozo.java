package hu.petrik.Feladat02;

public class Dolgozo extends Thread{

    private String [] munka = {"eslo","masodik","harmadik","negyedik","ötödik","hatodik","hetedik"};
    private int szamlalo = 0;
    private Nyomtato nyomtato;

    public Dolgozo(Nyomtato nyomtato){
        this.nyomtato = nyomtato;
    }

    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(4000);
            }catch (InterruptedException ex){
                System.out.println(ex);
            }
            nyomtato.feladatKiadas(munka[szamlalo]);
            System.out.println("Nyomtatásra kiküldve "+munka[szamlalo]);
            szamlalo++;
            if (szamlalo == munka.length){
                szamlalo = 0;
            }

        }
    }
}
