import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welkom bij de offerte maker. Wat voorn boot wilt u maken?");
        String bootSoort = input.nextLine();
        Boot boot = new Boot(bootSoort);
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
class NavigatieSystem{
    protected boolean gpsOntvanger;
    protected boolean kaartPlotter;
    protected boolean kompas;
    protected boolean diepteMeter;
    protected boolean traagheidsNavigatie;
}
class Motor{
    protected boolean elektrischBinnen;
    protected boolean elektrischBuiten;
    protected boolean dieselBinnen;
    protected boolean dieselBuiten;
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