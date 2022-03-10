package hu.petrik.Feladat02;

public class Postazo extends Thread {
    private Nyomtato nyomtato;

    public Postazo(Nyomtato nyomtato) {
        this.nyomtato = nyomtato;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            String s = nyomtato.Nyomtatas(3500);
            Irodahaz.levelek.add(s);
            System.out.println("Kinyomtatva, borítékolva " + s);

        }
    }
}