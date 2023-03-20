import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welkom bij de offerte maker. Wat voorn boot wilt u maken?");
        String bootSoort = input.nextLine();
        Boot boot = new Boot(bootSoort);

        System.out.println("Kies uw navigatiesysteem:");
        System.out.println("1. GPS ontvanger");
        System.out.println("2. Kaartplotter");
        System.out.println("3. Kompas");
        System.out.println("4. Dieptemeter");
        System.out.println("5. Traagheidsnavigatie");

        int keuzeNavi = input.nextInt();

        System.out.println("Kies de prijs: ");
        double prijs = input.nextDouble();

        NavigatieSystem navigatieSystem;

        switch (keuzeNavi) {
            case 1:
                navigatieSystem = new GpsOntvanger(prijs);
                break;
            case 2:
                navigatieSystem = new KaartPlotter(prijs);
                break;
            case 3:
                navigatieSystem = new Kompas(prijs);
                break;
            case 4:
                navigatieSystem = new DiepteMeter(prijs);
                break;
            case 5:
                navigatieSystem = new TraagheidsNavigatie(prijs);
                break;
            default:
                System.out.println("Ongeldige keuze.");
                return;
        }

        System.out.println("U heeft gekozen voor:");
        System.out.println(navigatieSystem.getClass().getSimpleName());
        System.out.println("Prijs: " + navigatieSystem.getPrijs());    
    }
}

class Boot {
    protected String boot;
    
    public Boot(String boot){
        this.boot = boot;
    }
}
class grootte{
    protected int lengte;
}

class NavigatieSystem {
    protected double prijs;

    NavigatieSystem(double prijs){
        this.prijs = prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public double getPrijs() {
        return prijs;
    }
}

class GpsOntvanger extends NavigatieSystem {
    GpsOntvanger(double prijs){
        super(prijs);
    }
}
class KaartPlotter extends NavigatieSystem {
    KaartPlotter(double prijs){
        super(prijs);
    }
}

class Kompas extends NavigatieSystem {
    Kompas(double prijs){
        super(prijs);
    }
}

class DiepteMeter extends NavigatieSystem {
    DiepteMeter(double prijs){
        super(prijs);
    }
}

class TraagheidsNavigatie extends NavigatieSystem {
    TraagheidsNavigatie(double prijs){
        super(prijs);
    }
}

class Motor{
    protected double prijs;

    Motor(double prijs){
        this.prijs = prijs;
    }
    public void setPrijs(double prijs){
        this.prijs = prijs;
    }
    public double getPrijs(){
        return prijs;
    }
}
class ElektrischBinnen extends Motor {
    ElektrischBinnen(double prijs){
        super(prijs);
    }
}
class ElektrischBuiten extends Motor{
    ElektrischBuiten(double prijs){
        super(prijs);
    }
}
class DieselBinnen extends Motor{
    DieselBinnen(double prijs){
        super(prijs);
    }
}
class DieselBuiten extends Motor{
    DieselBuiten(double prijs){
        super(prijs);
    }
}
class BrandstofTank{
    protected int grootte;
    protected boolean jerrycan;
}
class Anker{
    protected int anker;
}
class Hout{
    protected boolean iroko;
    protected boolean mahonie;
    protected boolean oak;
    protected boolean plantageTeak;
    protected boolean padoekes;
    protected boolean maple;
    protected boolean essen;
    protected boolean afzelia;
}
class Extra{
    protected boolean airconditioning;
    protected boolean Sonar;
    protected boolean extraPks;
    protected boolean deckStoelen;
    protected boolean koelKast;
    protected boolean bakPlaat;
    protected boolean binnenStoelen;
    protected boolean zonnepanelen;
    protected boolean peddels;
    protected boolean opblaasbareBootje;
    protected boolean lifeVest;
    protected boolean luxeIntrieur;
    protected boolean motorBootje;
    protected boolean luxeMaterialen; 
}