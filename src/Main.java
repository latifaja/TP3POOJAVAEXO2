//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculateur calc = new Calculateur();
        try {
            calc.testRacineCarree(-5);
        }catch (RacineCarreeException e){
            e.printStackTrace();;
        }
        try {
            calc.testRacineCarree(25);
        }catch (RacineCarreeException e){
            e.printStackTrace();;
        }

    }
}