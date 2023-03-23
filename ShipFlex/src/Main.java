import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welkom bij de offerte maker. Wat voorn boot wilt u maken?");
        String bootSoort = input.nextLine();
        Boot boot = new Boot(bootSoort);
        mainMenu();

    } 
    public static void mainMenu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Kies welk onderdeel u wilt kiezen");
        System.out.println("1. Navigatiesysteem");
        System.out.println("2. Motor");
        System.out.println("3. Brandstoftank");
        System.out.println("4. Anker");
        System.out.println("5. Hout");
        System.out.println("6. Extra");
        int keuzeMenu = input.nextInt();
        switch(keuzeMenu) {
            case 1: 
                Navigatie();
            break;
            case 2:
                Motor();
            break;
            case 3: 
            // BrandstofTank();
        } 
    } 
        public static void Navigatie(){
                Scanner input = new Scanner(System.in);
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
                mainMenu();
    }
        public static void Motor(){
            Scanner input = new Scanner(System.in);
            System.out.printf("Kies de type motor dat u wilt gebruiken%n1.ElektrischBinnen%n2.ElektrischBuiten%n3.DieselBinnen%n4.DieselBuiten%n");
            int keuzeMotor = input.nextInt();
            System.out.println("Wat is de prijs van deze motor");
            double prijs = input.nextInt();
            Motor motor;
            switch(keuzeMotor){
                case 1: 
                    motor = new ElektrischBuiten(prijs);
                break;
                case 2:
                    motor = new ElektrischBuiten(prijs);
                break;
                case 3:
                    motor = new DieselBuiten(prijs);
                break;
                case 4:
                    motor = new DieselBinnen(prijs);
                break;
                default:
                    System.out.println("Ongeldige keuze");
                    return;
            }
            System.out.println("U heeft gekozen voor:");
            System.out.println(motor.getClass().getSimpleName());
            System.out.println("Prijs: "+ motor.getPrijs());
            mainMenu();
        }
        public static void BrandstofTank(){
            Scanner input = new Scanner(System.in);
            System.out.println("Kies uw brandstoftank:");
            System.out.println("1. Standaard brandstoftank");
            System.out.println("2. Groot brandstoftank");
            System.out.println("3. Extra groot brandstoftank");
            System.out.println("4. Jerrycan");
    
            int keuzeTank = input.nextInt();
    
            System.out.println("Kies de prijs: ");
            double prijs = input.nextDouble();
    
            BrandstofTank brandstofTank;
    
            switch (keuzeTank) {
    
                case 1:
                    brandstofTank = new StandaardTank(prijs);
                    break;
                case 2:
                    brandstofTank = new GrootTank(prijs);
                    break;
                case 3:
                    brandstofTank = new ExtraGrootTank(prijs);
                    break;
                case 4:
                    brandstofTank = new Jerrycan(prijs);
                    break;
                default:
                    System.out.println("Ongeldige keuze.");
                    return;
                }
    
            System.out.println("U heeft gekozen voor:");
            System.out.println(brandstofTank.getClass().getSimpleName());
            System.out.println("Prijs: " + brandstofTank.getPrijs());
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
    private double prijs;

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
class BrandstofTank {
    protected int grootte;
    protected boolean jerrycan;
    protected double prijs;

    BrandstofTank(double prijs) {
        this.prijs = prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public double getPrijs() {
        return prijs;
    }
}
class StandaardTank extends BrandstofTank{

    StandaardTank(double prijs) {
        super(prijs);
    }
}
class GrootTank extends BrandstofTank{

    GrootTank(double prijs) {
        super(prijs);
    }
}
class ExtraGrootTank extends BrandstofTank{

    ExtraGrootTank(double prijs) {
        super(prijs);
    }
}
class Jerrycan extends BrandstofTank {
    Jerrycan(double prijs) {
        super(prijs);
    }
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