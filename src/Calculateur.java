public class Calculateur {
    public Calculateur() {
    }
    public void testRacineCarree(int n)throws  RacineCarreeException{
        if (n<0){
            throw new RacineCarreeException(n);
        }
        System.out.println("Le nombre " + n + " est positif.");
    }
}
