import java.util.Scanner;
/**
 * Call of Calculate.
 * 
 * @author Karlo Zunec 
 * @version 0.61
 * Roadmap:
 * v.0.1 Grobe Funktionalität
 * v.0.2 Funktionierender FFA Punkte Modus
 * v.0.3 Highscores
 * v.0.4 Namen und Texteingabe
 * v.0.5 Neues Visuelles Interface
 * v.0.6 Funktionierender FFA Timer Modus
 * v.0.65 Basic SQL imp.
 * * v.0.69 SQL Scores
 * v.0.7 Neuer Modus Team Death Match
 * v.0.8 Competetive FFA modus
 * v.? Login und Scores durch SQL
 * ...
 */
class CallofCalculate
{
    // Generelle Variablen
    int runden;
    // Variablen für spiele
    String Spielername1;
    String Spielername2;
    String Spielername3;
    String Spielername4;
    String Spielername5;
    int Spieler1punkte; 
    int Spieler2punkte;
    int Spieler3punkte; 
    int Spieler4punkte;
    int Spieler5punkte;
    int Spieler1time; 
    int Spieler2time;
    int Spieler3time; 
    int Spieler4time;
    int Spieler5time;
    int SpielerPop;
    String SpielerNop;
    // Interface Variablen & Spiele
    int wt = 10;
    String FFAmodus;
    int rundenanzahl;
    int spieleranzahl;
    // Variablen für Highscore
    int highscore;
    String highscorename;
    //int highscorewin;
    //String highscorename;
    // Variablen für eingabe
    String texteingabe;
    // SQL Connector
    CallofCalculate()
    {
        CallofCalculateMenu();  
    }
    
    public void StartGame()
    {
        CallofCalculateMenu();
    }
   
    private void CallofCalculateMenu()
    {
        clear();
        System.out.println("__________________________________________________________________________________________________");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|     ___          _   _            __      ___          _               _          _            |");
        wait(wt);
        System.out.println("|    / __|  __ _  | | | |    ___   / _|    / __|  __ _  | |  __   _  _  | |  __ _  | |_   ___    |");
        wait(wt);
        System.out.println("|   | (__  / _` | | | | |   / _ \\ |  _|   | (__  / _` | | | / _| | || | | | / _` | |  _| / -_)   |");
        wait(wt);
        System.out.println("|    \\___| \\__,_| |_| |_|   \\___/ |_|      \\___| \\__,_| |_| \\__|  \\_,_| |_| \\__,_|  \\__| \\___|   |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                                  Spielmodus auswählen                                          |");
        wait(wt);
        System.out.println("|                              _____________________________                                     |");
        wait(wt);
        System.out.println("|                              |                           |                                     |");
        wait(wt);
        System.out.println("|                              |   1.   Free for All       |                                     |");
        wait(wt);
        System.out.println("|                              |                           |                                     |");
        wait(wt);
        System.out.println("|                              |   2.  Team-Deathmatch     |                                     |");
        wait(wt);
        System.out.println("|                              |                           |                                     |");
        wait(wt);
        System.out.println("|                              |   3.     Beenden          |                                     |");
        wait(wt);
        System.out.println("|                              _____________________________                                     |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                                        Code von                                                |");
        wait(wt);
        System.out.println("|                                       Karlo Zunec                                              |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                             © 2021 gesamtschule-willich2.de                                    |"); // 23 |
        wait(wt);
        System.out.println("__________________________________________________________________________________________________");
        int Spielauswahl = leseZahl();
        if (Spielauswahl == 2021)
        {
            easteregg();
            wait(4000);
            clear();
            CallofCalculateMenu();
        }
        if(Spielauswahl == 1)
        {
            clear();
            FFAselect();
        }
        else if(Spielauswahl == 2)
        {
            clear();
            TeamDeathMatch();
        }
        else if(Spielauswahl == 3)
        {
            System.out.println("Beende Spiel...");
            wait(500);
            clear();
        }
        else if(!(Spielauswahl == 1 && Spielauswahl == 2 && Spielauswahl == 3))
        {
            while(Spielauswahl > 3)
            {
                Spielauswahl = 0;
                System.out.println("Ungültige Zahl.");
                wait(200);
                System.out.println("Erneut eingeben.");
                Spielauswahl = leseZahl();
                if(Spielauswahl == 1)
                {
                    FFAselect();
                }
                else if(Spielauswahl == 2)
                {
                    TeamDeathMatch();
                }
                else if(Spielauswahl == 3)
                {
                    System.out.println("Beende Spiel...");
                }
            }
        }
    }
    
    private void FFAselect()
    {
        if(rundenanzahl == 0)
        {
            rundenanzahl = 5;
        }
        if(FFAmodus == null)
        {
            FFAmodus = "Punkte";
        }
        if(spieleranzahl == 0)
        {
            spieleranzahl = 2;
        }
        System.out.println("__________________________________________________________________________________________________");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                                  ______   ______                                               |");
        wait(wt);
        System.out.println("|                                 |  ____| |  ____|     /\\                                       |");
        wait(wt);
        System.out.println("|                                 | |__    | |__       /  \\                                      |");
        wait(wt);
        System.out.println("|                                 |  __|   |  __|     / /\\ \\                                     |");
        wait(wt);
        System.out.println("|                                 | |      | |       / ____ \\                                    |");
        wait(wt);
        System.out.println("|                                 |_|      |_|      /_/    \\_\\                                   |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                                          Runden: "+ rundenanzahl +"                                             |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                                       Spieleranzahl: "+ spieleranzahl +"                                         |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                                      Spielmodus: "+ FFAmodus +"                                        |");
        wait(wt);
        System.out.println("|                            |_____________________________________|                             |");
        wait(wt);
        System.out.println("|                            |                                     |                             |");
        wait(wt);
        System.out.println("|                            |        1.   Spiel Starten           |                             |");
        wait(wt);
        System.out.println("|                            |                                     |                             |");
        wait(wt);
        System.out.println("|                            |        2.     Optionen              |                             |");
        wait(wt);
        System.out.println("|                            |                                     |                             |");
        wait(wt);
        System.out.println("|                            |        3.   Zurück zum Menü         |                             |");
        wait(wt);
        System.out.println("|                            |                                     |                             |");
        wait(wt);
        System.out.println("|                            |_____________________________________|                             |");
        wait(wt);
        System.out.println("|                                                                                                |"); // 23 |
        wait(wt);
        System.out.println("__________________________________________________________________________________________________");
        int x = leseZahl();
        if(x == 1)
        {
            clear();
            spielmodusstartenFFA();
        }
        else if(x == 2)
        {
            clear();
            FFAopt();
        }
        else if(x == 3)
        {
            clear();
            CallofCalculateMenu();
        }
        else if(x > 3)
        {
            failsafe();
        }
    }
    
    private void FFAopt()
    {
        System.out.println("__________________________________________________________________________________________________");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                                  ______   ______                                               |");
        wait(wt);
        System.out.println("|                                 |  ____| |  ____|     /\\                                       |");
        wait(wt);
        System.out.println("|                                 | |__    | |__       /  \\                                      |");
        wait(wt);
        System.out.println("|                                 |  __|   |  __|     / /\\ \\                                     |");
        wait(wt);
        System.out.println("|                                 | |      | |       / ____ \\                                    |");
        wait(wt);
        System.out.println("|                                 |_|      |_|      /_/    \\_\\                                   |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                                          Runden: "+ rundenanzahl +"                                             |");
        wait(wt);
        System.out.println("|                                       Spieleranzahl: "+ spieleranzahl +"                                         |");
        wait(wt);
        System.out.println("|                                      Spielmodus: "+ FFAmodus +"                                        |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                            |_______________Optionen_______________|                            |");
        wait(wt);
        System.out.println("|                            |     1. Rundenanzahl wechseln         |                            |");
        wait(wt);
        System.out.println("|                            |                                      |                            |");
        wait(wt);
        System.out.println("|                            |     2. Spieleranzahl wechseln        |                            |");
        wait(wt);
        System.out.println("|                            |                                      |                            |");
        wait(wt);
        System.out.println("|                            |     3.   Spielmodus wechsel          |                            |");
        wait(wt);
        System.out.println("|                            |                                      |                            |");
        wait(wt);
        System.out.println("|                            |     4.        Zurück                 |                            |");
        wait(wt);
        System.out.println("|                            |______________________________________|                            |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                                                                                                |"); // 23 |
        wait(wt);
        System.out.println("__________________________________________________________________________________________________");
        int x = leseZahl();
        if(x == 1)
        {
            clear();
            rundenanzahlwechselnFFA();
        }
        else if(x == 2)
        {
            clear();
            spieleranzahlwechselnFFA();
        }
        else if(x == 3)
        {
            clear();
            spielmoduswechselnFFA();
        }
        else if(x == 4)
        {
            clear();
            FFAselect();
        }
        else if(x > 4)
        {
            failsafe();
        }
    }
    
    private void rundenanzahlwechselnFFA()
    {
        System.out.println("__________________________________________________________________________________________________");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                                  ______   ______                                               |");
        wait(wt);
        System.out.println("|                                 |  ____| |  ____|     /\\                                       |");
        wait(wt);
        System.out.println("|                                 | |__    | |__       /  \\                                      |");
        wait(wt);
        System.out.println("|                                 |  __|   |  __|     / /\\ \\                                     |");
        wait(wt);
        System.out.println("|                                 | |      | |       / ____ \\                                    |");
        wait(wt);
        System.out.println("|                                 |_|      |_|      /_/    \\_\\                                   |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                                                                                                |");   
        wait(wt);
        System.out.println("|                                           Runden: "+ rundenanzahl +"                                            |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                            |_______________Optionen_______________|                            |");
        wait(wt);
        System.out.println("|                            |                                      |                            |");
        wait(wt);
        System.out.println("|                            |       Rundenanzahl einstellen        |                            |");
        wait(wt);
        System.out.println("|                            |              (1 - 10)                |                            |");
        wait(wt);
        System.out.println("|                            |           Geben sie die              |                            |");
        wait(wt);
        System.out.println("|                            |     gewünschte Rundenanzahl an:      |                            |");
        wait(wt);
        System.out.println("|                            |                                      |                            |");
        wait(wt);
        System.out.println("|                            |______________________________________|                            |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                                                                                                |"); // 23 |
        wait(wt);
        System.out.println("__________________________________________________________________________________________________");
        int x = leseZahl();
        if(x == 10 || x < 10)
        {
            clear();
            rundenanzahl = x;
            FFAopt();
        }
        else if(x > 10)
        {
            while(x > 10)
            {
                x = 0;
                System.out.println("Ungültige Rundenanzahl!");
                wait(200);
                System.out.println("Geben sie erneut die Rundenanzahl an.");
                x = leseZahl();
            }
            clear();
            rundenanzahl = x;
            FFAopt();
        }
    }
    
    private void spieleranzahlwechselnFFA()
    {
        System.out.println("__________________________________________________________________________________________________");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                                  ______   ______                                               |");
        wait(wt);
        System.out.println("|                                 |  ____| |  ____|     /\\                                       |");
        wait(wt);
        System.out.println("|                                 | |__    | |__       /  \\                                      |");
        wait(wt);
        System.out.println("|                                 |  __|   |  __|     / /\\ \\                                     |");
        wait(wt);
        System.out.println("|                                 | |      | |       / ____ \\                                    |");
        wait(wt);
        System.out.println("|                                 |_|      |_|      /_/    \\_\\                                   |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                                       Spieleranzahl: "+ spieleranzahl +"                                         |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                            |_______________Optionen_______________|                            |");
        wait(wt);
        System.out.println("|                            |                                      |                            |");
        wait(wt);
        System.out.println("|                            |      Spieleranzahl einstellen        |                            |");
        wait(wt);
        System.out.println("|                            |               (1 - 5)                |                            |");
        wait(wt);
        System.out.println("|                            |            Geben sie die             |                            |");
        wait(wt);
        System.out.println("|                            |    gewünschte Spieleranzahl an:      |                            |");
        wait(wt);
        System.out.println("|                            |                                      |                            |");
        wait(wt);
        System.out.println("|                            |______________________________________|                            |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("__________________________________________________________________________________________________");
        int x = leseZahl();
        if(x == 5 || x < 5)
        {
            clear();
            spieleranzahl = x;
            FFAopt();
        }
        else if(x > 5)
        {
            while(x > 5)
            {
                x = 0;
                System.out.println("Ungültige Spieleranzahl!");
                wait(200);
                System.out.println("Geben sie erneut die Spieleranzahl an.");
                x = leseZahl();
            }
            clear();
            spieleranzahl = x;
            FFAopt();
        }
    }
    
    private void spielmoduswechselnFFA()
    {
        System.out.println("__________________________________________________________________________________________________");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                                  ______   ______                                               |");
        wait(wt);
        System.out.println("|                                 |  ____| |  ____|     /\\                                       |");
        wait(wt);
        System.out.println("|                                 | |__    | |__       /  \\                                      |");
        wait(wt);
        System.out.println("|                                 |  __|   |  __|     / /\\ \\                                     |");
        wait(wt);
        System.out.println("|                                 | |      | |       / ____ \\                                    |");
        wait(wt);
        System.out.println("|                                 |_|      |_|      /_/    \\_\\                                   |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                                      Spielmodus: "+ FFAmodus +"                                        |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                            |_______________Optionen_______________|                            |");
        wait(wt);
        System.out.println("|                            |          Modus einstellen:           |                            |");
        wait(wt);
        System.out.println("|                            |                                      |                            |");
        wait(wt);
        System.out.println("|                            |             1. Punkte                |                            |");
        wait(wt);
        System.out.println("|                            |                                      |                            |");
        wait(wt);
        System.out.println("|                            |             2. Timer                 |                            |");
        wait(wt);
        System.out.println("|                            |                                      |                            |");
        wait(wt);
        System.out.println("|                            |             3. Zurück                |                            |");
        wait(wt);
        System.out.println("|                            |______________________________________|                            |");
        wait(wt);
        System.out.println("|                                                                                                |");
        wait(wt);
        System.out.println("|                                                                                                |"); // 23 |
        wait(wt);
        System.out.println("__________________________________________________________________________________________________");
        int x = leseZahl();
        if(x == 1)
        {
            clear();
            FFAmodus = "Punkte";
            FFAopt();
        }
        else if(x == 2)
        {
            clear();
            FFAmodus = "Timer ";
            FFAopt();
        }
        else if(x == 3)
        {
            clear();
            FFAopt();
        }
        else if(x > 3)
        {
            failsafe();
        }
    }
    
    private void spielmodusstartenFFA()
    {
        if(FFAmodus == "Punkte")
        {
            clear();
            FreeForAll();
        }
        else if(FFAmodus == "Timer ")
        {
            clear();
            FreeForAllT();
        }
    }
    
    private void failsafe()
    {
        clear();
        System.out.println("Ungültige Eingabe!");
        wait(250);
        System.out.println("Zurück zum Menü...");
        wait(1000);
        clear();
        CallofCalculateMenu();
    }
    
    private void wintime()
    {
        System.out.println(SpielerNop +" hat mit " + SpielerPop + " Sekunden gewonnen!");
        erneutsp();
    }
    
    private void FreeForAllT()
    {
        Spieler1time = 0;
        Spieler2time = 0;   
        Spieler3time = 0;
        Spieler4time = 0;
        Spieler5time = 0;
        runden = 0;
        System.out.println("  ______   ______            ");
        wait(50);
        System.out.println(" |  ____| |  ____|     /\\   ");
        wait(50);
        System.out.println(" | |__    | |__       /  \\   ");
        wait(50);
        System.out.println(" |  __|   |  __|     / /\\ \\  ");
        wait(50);
        System.out.println(" | |      | |       / ____ \\ ");
        wait(50);
        System.out.println(" |_|      |_|      /_/    \\_\\ ");
        wait(50);
        System.out.println("");
        System.out.println("Jeder für sich selbst!");
        System.out.println("");
        wait(500);
        System.out.println("Antworten auf Zeit!");
        wait(500);
        namenFFA();
        while(!(runden == rundenanzahl))
        {
            rundeFFAT();
        }
        
        if(spieleranzahl == 1)
        {
            System.out.println("du hast " + Spieler1time + " Sekunden gebraucht!");
            erneutsp();
        }
            
        else if(spieleranzahl == 2)
        {
            if (Spieler1time < Spieler2time)
            {
                SpielerPop = Spieler1time;
                SpielerNop = Spielername1;
                wintime();
            }
            else if(Spieler1time > Spieler2time)
            {
                SpielerPop = Spieler2time;
                SpielerNop = Spielername2;
                wintime();
            }   
            else if(Spieler1time == Spieler2time)
            {
                System.out.println("Unentschieden mit " + Spieler2time + " Sekunden!"); 
                erneutsp();
            }
        }
        else if(spieleranzahl == 3)
        { 
            if (Spieler1time < Spieler2time && Spieler1time < Spieler3time)
            {
                SpielerPop = Spieler1time;
                SpielerNop = Spielername1;
                wintime();
            }
            else if(Spieler2time < Spieler1time && Spieler2time < Spieler3time)
            {
                SpielerPop = Spieler2time;
                SpielerNop = Spielername2;
                wintime();
            }
            else if(Spieler3time < Spieler1time && Spieler3time < Spieler2time)
            {
                SpielerPop = Spieler3time;
                SpielerNop = Spielername3;
                wintime();
            }
            else
            {
                System.out.println("Kein Gewinner!");
                erneutsp();
            }
        }  
        else if(spieleranzahl == 4)
        {       
            if (Spieler1time < Spieler2time && Spieler1time < Spieler3time && Spieler1time < Spieler4time)
            {
                SpielerPop = Spieler1time;
                SpielerNop = Spielername1;
                wintime();
            }
            else if(Spieler2time < Spieler1time && Spieler2time < Spieler3time && Spieler2time < Spieler4time)
            {
                SpielerPop = Spieler2time;
                SpielerNop = Spielername2;
                wintime();
            }
            else if(Spieler3time < Spieler1time && Spieler3time < Spieler2time && Spieler3time < Spieler4time)
            {
                SpielerPop = Spieler3time;
                SpielerNop = Spielername3;
                wintime();
            }
            else if(Spieler4time < Spieler1time && Spieler4time < Spieler2time && Spieler4time < Spieler3time)
            {
                SpielerPop = Spieler4time;
                SpielerNop = Spielername4;
                wintime();
            }
            else
            {
                System.out.println("Kein Gewinner!");
                erneutsp();
            }
        }
            
        else if (spieleranzahl == 5)
        {
            if (Spieler1time < Spieler2time && Spieler1time < Spieler3time && Spieler1time < Spieler4time && Spieler1time < Spieler5time)
            {
                SpielerPop = Spieler1time;
                SpielerNop = Spielername1;
                wintime();
            }
            else if(Spieler2time < Spieler1time && Spieler2time < Spieler3time && Spieler2time < Spieler4time && Spieler2time < Spieler5time)
            {
                SpielerPop = Spieler2time;
                SpielerNop = Spielername2;
                wintime();
            }
            else if(Spieler3time < Spieler1time && Spieler3time < Spieler2time && Spieler3time < Spieler4time && Spieler3time < Spieler5time)
            {
                SpielerPop = Spieler3time;
                SpielerNop = Spielername3;
                wintime();
            }
            else if(Spieler4time < Spieler1time && Spieler4time < Spieler2time && Spieler4time < Spieler3time && Spieler4time < Spieler5time)
            {
                SpielerPop = Spieler4time;
                SpielerNop = Spielername4;
                wintime();
            }
            else if(Spieler5time < Spieler1time && Spieler5time < Spieler2time && Spieler5time < Spieler3time && Spieler5time < Spieler4time)
            {
                SpielerPop = Spieler5time;
                SpielerNop = Spielername5;
                wintime();
            }
            else
            {
                System.out.println("Kein Gewinner!");
                erneutsp();
            }
        }
    }
    
    private void rundeFFAT()
    {
        if(spieleranzahl == 1)
        {
            System.out.println("Du bist dran!");
            wait(1000);
            System.out.println("3");
            wait(1000);
            System.out.println("2");
            wait(1000);
            System.out.println("1");
            wait(1000);
            System.out.println("Los!");
            int start = (int)(System.currentTimeMillis() / 1000);
            if(rateEinmal() == true)
            {
                int ende = (int)(System.currentTimeMillis() / 1000);
                int dauer = ende - start;
                System.out.println("Gerechnet nach "+ dauer +" Sekunden");
                Spieler1time = Spieler1time + dauer;
            }
            else
            {
               int ende = (int)(System.currentTimeMillis() / 1000);
               int dauer = ende - start;
               System.out.println("Gerechnet nach "+ dauer +" Sekunden");
               int strafzeit = dauer * 2;
               System.out.println(strafzeit +" Sekunden Strafzeit wurden addiert.");
               Spieler1time = Spieler1time + strafzeit;
            }
            System.out.println("");
            System.out.println(Spielername1 +" hat "+ Spieler1time +" Sekunden verbraucht." );
            System.out.println("");
            runden = runden + 1;
        }
        
        else if(spieleranzahl == 2)
        {
            System.out.println(Spielername1 +" ist dran");
            wait(1000);
            System.out.println("3");
            wait(1000);
            System.out.println("2");
            wait(1000);
            System.out.println("1");
            wait(1000);
            System.out.println("Los!");
            int start = (int)(System.currentTimeMillis() / 1000);
            if(rateEinmal() == true)
            {
                int ende = (int)(System.currentTimeMillis() / 1000);
                int dauer = ende - start;
                System.out.println("Gerechnet nach "+ dauer +" Sekunden");
                Spieler1time = Spieler1time + dauer;
            }
            else
            {
               int ende = (int)(System.currentTimeMillis() / 1000);
               int dauer = ende - start;
               System.out.println("Gerechnet nach "+ dauer +" Sekunden");
               int strafzeit = dauer + 10;
               System.out.println(strafzeit +" Sekunden Strafzeit wurden addiert.");
               Spieler1time = Spieler1time + strafzeit;
            }
            wait(500);
            System.out.println("");
            System.out.println(Spielername2 +" ist dran");
            wait(1000);
            System.out.println("3");
            wait(1000);
            System.out.println("2");
            wait(1000);
            System.out.println("1");
            wait(1000);
            System.out.println("Los!");
            start = (int)(System.currentTimeMillis() / 1000);
            if(rateEinmal() == true)
            {
                int ende = (int)(System.currentTimeMillis() / 1000);
                int dauer = ende - start;
                System.out.println("Gerechnet nach "+ dauer +" Sekunden");
                Spieler2time = Spieler2time + dauer;
            }
            else
            {
               int ende = (int)(System.currentTimeMillis() / 1000);
               int dauer = ende - start;
               System.out.println("Gerechnet nach "+ dauer +" Sekunden");
               int strafzeit = dauer + 10;
               System.out.println(strafzeit +" Sekunden Strafzeit wurden addiert.");
               Spieler2time = Spieler2time + strafzeit;
            }
            wait(500);
            System.out.println("");
            System.out.println(Spielername1 +" hat "+ Spieler1time +" Sekunden verbraucht." );
            wait(500);
            System.out.println(Spielername2 +" hat "+ Spieler2time +" Sekunden verbraucht." );
            System.out.println("");
            runden = runden + 1;
        }
        
        else if(spieleranzahl == 3)
        {
            System.out.println(Spielername1 +" ist dran");
            wait(1000);
            System.out.println("3");
            wait(1000);
            System.out.println("2");
            wait(1000);
            System.out.println("1");
            wait(1000);
            System.out.println("Los!");
            int start = (int)(System.currentTimeMillis() / 1000);
            if(rateEinmal() == true)
            {
                int ende = (int)(System.currentTimeMillis() / 1000);
                int dauer = ende - start;
                System.out.println("Gerechnet nach "+ dauer +" Sekunden");
                Spieler1time = Spieler1time + dauer;
            }
            else
            {
               int ende = (int)(System.currentTimeMillis() / 1000);
               int dauer = ende - start;
               System.out.println("Gerechnet nach "+ dauer +" Sekunden");
               int strafzeit = dauer + 10;
               System.out.println(strafzeit +" Sekunden Strafzeit wurden addiert.");
               Spieler1time = Spieler1time + strafzeit;
            }
            wait(500);
            System.out.println("");
            System.out.println(Spielername2 +" ist dran");
            wait(1000);
            System.out.println("3");
            wait(1000);
            System.out.println("2");
            wait(1000);
            System.out.println("1");
            wait(1000);
            System.out.println("Los!");
            start = (int)(System.currentTimeMillis() / 1000);
            if(rateEinmal() == true)
            {
                int ende = (int)(System.currentTimeMillis() / 1000);
                int dauer = ende - start;
                System.out.println("Gerechnet nach "+ dauer +" Sekunden");
                Spieler1time = Spieler2time + dauer;
            }
            else
            {
               int ende = (int)(System.currentTimeMillis() / 1000);
               int dauer = ende - start;
               System.out.println("Gerechnet nach "+ dauer +" Sekunden");
               int strafzeit = dauer + 10;
               System.out.println(strafzeit +" Sekunden Strafzeit wurden addiert.");
               Spieler2time = Spieler2time + strafzeit;
            }
            wait(500);
            System.out.println("");
            System.out.println(Spielername3 +" ist dran");
            wait(1000);
            System.out.println("3");
            wait(1000);
            System.out.println("2");
            wait(1000);
            System.out.println("1");
            wait(1000);
            System.out.println("Los!");
            start = (int)(System.currentTimeMillis() / 1000);
            if(rateEinmal() == true)
            {
                int ende = (int)(System.currentTimeMillis() / 1000);
                int dauer = ende - start;
                System.out.println("Gerechnet nach "+ dauer +" Sekunden");
                Spieler3time = Spieler3time + dauer;
            }
            else
            {
               int ende = (int)(System.currentTimeMillis() / 1000);
               int dauer = ende - start;
               System.out.println("Gerechnet nach "+ dauer +" Sekunden");
               int strafzeit = dauer + 10;
               System.out.println(strafzeit +" Sekunden Strafzeit wurden addiert.");
               Spieler3time = Spieler3time + strafzeit;
            }
            wait(500);
            System.out.println("");
            System.out.println(Spielername1 +" hat "+ Spieler1time +" Sekunden verbraucht." );
            wait(500);
            System.out.println(Spielername2 +" hat "+ Spieler2time +" Sekunden verbraucht." );
            wait(500);
            System.out.println(Spielername3 +" hat "+ Spieler3time +" Sekunden verbraucht." );
            System.out.println("");
            runden = runden + 1;
        }
        else if(spieleranzahl == 4)
        {
            System.out.println(Spielername1 +" ist dran");
            wait(1000);
            System.out.println("3");
            wait(1000);
            System.out.println("2");
            wait(1000);
            System.out.println("1");
            wait(1000);
            System.out.println("Los!");
            int start = (int)(System.currentTimeMillis() / 1000);
            if(rateEinmal() == true)
            {
                int ende = (int)(System.currentTimeMillis() / 1000);
                int dauer = ende - start;
                System.out.println("Gerechnet nach "+ dauer +" Sekunden");
                Spieler1time = Spieler1time + dauer;
            }
            else
            {
               int ende = (int)(System.currentTimeMillis() / 1000);
               int dauer = ende - start;
               System.out.println("Gerechnet nach "+ dauer +" Sekunden");
               int strafzeit = dauer + 10;
               System.out.println(strafzeit +" Sekunden Strafzeit wurden addiert.");
               Spieler1time = Spieler1time + strafzeit;
            }
            wait(500);
            System.out.println("");
            System.out.println(Spielername2 +" ist dran");
            wait(1000);
            System.out.println("3");
            wait(1000);
            System.out.println("2");
            wait(1000);
            System.out.println("1");
            wait(1000);
            System.out.println("Los!");
            start = (int)(System.currentTimeMillis() / 1000);
            if(rateEinmal() == true)
            {
                int ende = (int)(System.currentTimeMillis() / 1000);
                int dauer = ende - start;
                System.out.println("Gerechnet nach "+ dauer +" Sekunden");
                Spieler1time = Spieler2time + dauer;
            }
            else
            {
               int ende = (int)(System.currentTimeMillis() / 1000);
               int dauer = ende - start;
               System.out.println("Gerechnet nach "+ dauer +" Sekunden");
               int strafzeit = dauer + 10;
               System.out.println(strafzeit +" Sekunden Strafzeit wurden addiert.");
               Spieler2time = Spieler2time + strafzeit;
            }
            wait(500);
            System.out.println("");
            System.out.println(Spielername3 +" ist dran");
            wait(1000);
            System.out.println("3");
            wait(1000);
            System.out.println("2");
            wait(1000);
            System.out.println("1");
            wait(1000);
            System.out.println("Los!");
            start = (int)(System.currentTimeMillis() / 1000);
            if(rateEinmal() == true)
            {
                int ende = (int)(System.currentTimeMillis() / 1000);
                int dauer = ende - start;
                System.out.println("Gerechnet nach "+ dauer +" Sekunden");
                Spieler3time = Spieler3time + dauer;
            }
            else
            {
               int ende = (int)(System.currentTimeMillis() / 1000);
               int dauer = ende - start;
               System.out.println("Gerechnet nach "+ dauer +" Sekunden");
               int strafzeit = dauer + 10;
               System.out.println(strafzeit +" Sekunden Strafzeit wurden addiert.");
               Spieler3time = Spieler3time + strafzeit;
            }
            wait(500);
            System.out.println("");
            System.out.println(Spielername4 +" ist dran");
            wait(1000);
            System.out.println("3");
            wait(1000);
            System.out.println("2");
            wait(1000);
            System.out.println("1");
            wait(1000);
            System.out.println("Los!");
            start = (int)(System.currentTimeMillis() / 1000);
            if(rateEinmal() == true)
            {
                int ende = (int)(System.currentTimeMillis() / 1000);
                int dauer = ende - start;
                System.out.println("Gerechnet nach "+ dauer +" Sekunden");
                Spieler4time = Spieler4time + dauer;
            }
            else
            {
               int ende = (int)(System.currentTimeMillis() / 1000);
               int dauer = ende - start;
               System.out.println("Gerechnet nach "+ dauer +" Sekunden");
               int strafzeit = dauer + 10;
               System.out.println(strafzeit +" Sekunden Strafzeit wurden addiert.");
               Spieler4time = Spieler4time + strafzeit;
            }
            wait(500);
            System.out.println("");
            System.out.println(Spielername1 +" hat "+ Spieler1time +" Sekunden verbraucht." );
            wait(500);
            System.out.println(Spielername2 +" hat "+ Spieler2time +" Sekunden verbraucht." );
            wait(500);
            System.out.println(Spielername3 +" hat "+ Spieler3time +" Sekunden verbraucht." );
            wait(500);
            System.out.println(Spielername4 +" hat "+ Spieler4time +" Sekunden verbraucht." );
            System.out.println("");
            runden = runden + 1;
        }
        else if(spieleranzahl == 5)
        {
            System.out.println(Spielername1 +" ist dran");
            wait(1000);
            System.out.println("3");
            wait(1000);
            System.out.println("2");
            wait(1000);
            System.out.println("1");
            wait(1000);
            System.out.println("Los!");
            int start = (int)(System.currentTimeMillis() / 1000);
            if(rateEinmal() == true)
            {
                int ende = (int)(System.currentTimeMillis() / 1000);
                int dauer = ende - start;
                System.out.println("Gerechnet nach "+ dauer +" Sekunden");
                Spieler1time = Spieler1time + dauer;
            }
            else
            {
               int ende = (int)(System.currentTimeMillis() / 1000);
               int dauer = ende - start;
               System.out.println("Gerechnet nach "+ dauer +" Sekunden");
               int strafzeit = dauer + 10;
               System.out.println(strafzeit +" Sekunden Strafzeit wurden addiert.");
               Spieler1time = Spieler1time + strafzeit;
            }
            wait(500);
            System.out.println("");
            System.out.println(Spielername2 +" ist dran");
            wait(1000);
            System.out.println("3");
            wait(1000);
            System.out.println("2");
            wait(1000);
            System.out.println("1");
            wait(1000);
            System.out.println("Los!");
            start = (int)(System.currentTimeMillis() / 1000);
            if(rateEinmal() == true)
            {
                int ende = (int)(System.currentTimeMillis() / 1000);
                int dauer = ende - start;
                System.out.println("Gerechnet nach "+ dauer +" Sekunden");
                Spieler1time = Spieler2time + dauer;
            }
            else
            {
               int ende = (int)(System.currentTimeMillis() / 1000);
               int dauer = ende - start;
               System.out.println("Gerechnet nach "+ dauer +" Sekunden");
               int strafzeit = dauer + 10;
               System.out.println(strafzeit +" Sekunden Strafzeit wurden addiert.");
               Spieler2time = Spieler2time + strafzeit;
            }
            wait(500);
            System.out.println("");
            System.out.println(Spielername3 +" ist dran");
            wait(1000);
            System.out.println("3");
            wait(1000);
            System.out.println("2");
            wait(1000);
            System.out.println("1");
            wait(1000);
            System.out.println("Los!");
            start = (int)(System.currentTimeMillis() / 1000);
            if(rateEinmal() == true)
            {
                int ende = (int)(System.currentTimeMillis() / 1000);
                int dauer = ende - start;
                System.out.println("Gerechnet nach "+ dauer +" Sekunden");
                Spieler3time = Spieler3time + dauer;
            }
            else
            {
               int ende = (int)(System.currentTimeMillis() / 1000);
               int dauer = ende - start;
               System.out.println("Gerechnet nach "+ dauer +" Sekunden");
               int strafzeit = dauer + 10;
               System.out.println(strafzeit +" Sekunden Strafzeit wurden addiert.");
               Spieler3time = Spieler3time + strafzeit;
            }
            wait(500);
            System.out.println("");
            System.out.println(Spielername4 +" ist dran");
            wait(1000);
            System.out.println("3");
            wait(1000);
            System.out.println("2");
            wait(1000);
            System.out.println("1");
            wait(1000);
            System.out.println("Los!");
            start = (int)(System.currentTimeMillis() / 1000);
            if(rateEinmal() == true)
            {
                int ende = (int)(System.currentTimeMillis() / 1000);
                int dauer = ende - start;
                System.out.println("Gerechnet nach "+ dauer +" Sekunden");
                Spieler4time = Spieler4time + dauer;
            }
            else
            {
               int ende = (int)(System.currentTimeMillis() / 1000);
               int dauer = ende - start;
               System.out.println("Gerechnet nach "+ dauer +" Sekunden");
               int strafzeit = dauer + 10;
               System.out.println(strafzeit +" Sekunden Strafzeit wurden addiert.");
               Spieler4time = Spieler4time + strafzeit;
            }
            wait(500);
            System.out.println("");
            System.out.println(Spielername5 +" ist dran");
            wait(1000);
            System.out.println("3");
            wait(1000);
            System.out.println("2");
            wait(1000);
            System.out.println("1");
            wait(1000);
            System.out.println("Los!");
            start = (int)(System.currentTimeMillis() / 1000);
            if(rateEinmal() == true)
            {
                int ende = (int)(System.currentTimeMillis() / 1000);
                int dauer = ende - start;
                System.out.println("Gerechnet nach "+ dauer +" Sekunden");
                Spieler5time = Spieler5time + dauer;
            }
            else
            {
               int ende = (int)(System.currentTimeMillis() / 1000);
               int dauer = ende - start;
               System.out.println("Gerechnet nach "+ dauer +" Sekunden");
               int strafzeit = dauer + 10;
               System.out.println(strafzeit +" Sekunden Strafzeit wurden addiert.");
               Spieler5time = Spieler5time + strafzeit;
            }
            wait(500);
            System.out.println("");
            System.out.println(Spielername1 +" hat "+ Spieler1time +" Sekunden verbraucht." );
            wait(500);
            System.out.println(Spielername2 +" hat "+ Spieler2time +" Sekunden verbraucht." );
            wait(500);
            System.out.println(Spielername3 +" hat "+ Spieler3time +" Sekunden verbraucht." );
            wait(500);
            System.out.println(Spielername4 +" hat "+ Spieler4time +" Sekunden verbraucht." );
             wait(500);
            System.out.println(Spielername5 +" hat "+ Spieler5time +" Sekunden verbraucht." );
            System.out.println("");
            runden = runden + 1;
        }
    }
    
    private void FreeForAll() // FFA // Spielmodus Jeder gegen Jeden // Punkte
    {   
        Spieler1punkte = 0;
        Spieler2punkte = 0;
        Spieler3punkte = 0;
        Spieler4punkte = 0;
        Spieler5punkte = 0;
        runden = 0;
        // FFA in groß
        System.out.println("  ______   ______            ");
        wait(50);
        System.out.println(" |  ____| |  ____|     /\\   ");
        wait(50);
        System.out.println(" | |__    | |__       /  \\   ");
        wait(50);
        System.out.println(" |  __|   |  __|     / /\\ \\  ");
        wait(50);
        System.out.println(" | |      | |       / ____ \\ ");
        wait(50);
        System.out.println(" |_|      |_|      /_/    \\_\\ ");
        wait(50);
        System.out.println("");
        System.out.println("Jeder für sich selbst!");
        System.out.println("");
        wait(500);
        System.out.println("Für jede richtige Antwort gibt es einen Punkt");
        System.out.println("");
        wait(500);
        namenFFA();
        while (!(runden == rundenanzahl))
        {
            rundeFFAP();
        }
        // Gewinner bei Spieleranzahl ermitteln
        if(spieleranzahl == 1)
        {
            System.out.println("du hast " + Spieler1punkte + " Punkte erreicht!");
            if (highscore < Spieler1punkte)
            {   
                SpielerNop = Spielername1;
                SpielerPop = Spieler1punkte;
                System.out.println("Neuer Highscore! " + Spieler1punkte);
            }
            erneutsp();
        }
            
        else if(spieleranzahl == 2)
        {
            if (Spieler1punkte > Spieler2punkte)
            {
                SpielerPop = Spieler1punkte;
                SpielerNop = Spielername1;
                win();
            }
            else if(Spieler1punkte < Spieler2punkte)
            {
                SpielerPop = Spieler2punkte;
                SpielerNop = Spielername2;
                win();
            }   
            else if(Spieler1punkte == Spieler2punkte)
            {
                System.out.println("Unentschieden mit " + Spieler2punkte + " Punkte(n)"); 
                erneutsp();
            }
        }
        else if(spieleranzahl == 3)
        { 
            if (Spieler1punkte > Spieler2punkte && Spieler1punkte > Spieler3punkte)
            {
                SpielerPop = Spieler1punkte;
                SpielerNop = Spielername1;
                win();
            }
            else if(Spieler2punkte > Spieler1punkte && Spieler2punkte > Spieler3punkte)
            {
                SpielerPop = Spieler2punkte;
                SpielerNop = Spielername2;
                win();
            }
            else if(Spieler3punkte > Spieler1punkte && Spieler3punkte > Spieler2punkte)
            {
                SpielerPop = Spieler3punkte;
                SpielerNop = Spielername3;
                win();
            }
            else
            {
                System.out.println("Kein Gewinner!");
                erneutsp();
            }
        }  
        else if(spieleranzahl == 4)
        {       
            if (Spieler1punkte > Spieler2punkte && Spieler1punkte > Spieler3punkte && Spieler1punkte > Spieler4punkte)
            {
                SpielerPop = Spieler1punkte;
                SpielerNop = Spielername1;
                win();
            }
            else if(Spieler2punkte > Spieler1punkte && Spieler2punkte > Spieler3punkte && Spieler2punkte > Spieler4punkte)
            {
                SpielerPop = Spieler2punkte;
                SpielerNop = Spielername2;
                win();
            }
            else if(Spieler3punkte > Spieler1punkte && Spieler3punkte > Spieler2punkte && Spieler3punkte > Spieler4punkte)
            {
                SpielerPop = Spieler3punkte;
                SpielerNop = Spielername3;
                win();
            }
            else if(Spieler4punkte > Spieler1punkte && Spieler4punkte > Spieler2punkte && Spieler4punkte > Spieler3punkte)
            {
                SpielerPop = Spieler4punkte;
                SpielerNop = Spielername4;
                win();
            }
            else
            {
                System.out.println("Kein Gewinner!");
                erneutsp();
            }
        }
            
        else if (spieleranzahl == 5)
        {
            if (Spieler1punkte > Spieler2punkte && Spieler1punkte > Spieler3punkte && Spieler1punkte > Spieler4punkte && Spieler1punkte > Spieler5punkte)
            {
                SpielerPop = Spieler1punkte;
                SpielerNop = Spielername1;
                win();
            }
            else if(Spieler2punkte > Spieler1punkte && Spieler2punkte > Spieler3punkte && Spieler2punkte > Spieler4punkte && Spieler2punkte > Spieler5punkte)
            {
                SpielerPop = Spieler2punkte;
                SpielerNop = Spielername2;
                win();
            }
            else if(Spieler3punkte > Spieler1punkte && Spieler3punkte > Spieler2punkte && Spieler3punkte > Spieler4punkte && Spieler3punkte > Spieler5punkte)
            {
                SpielerPop = Spieler3punkte;
                SpielerNop = Spielername3;
                win();
            }
            else if(Spieler4punkte > Spieler1punkte && Spieler4punkte > Spieler2punkte && Spieler4punkte > Spieler3punkte && Spieler4punkte > Spieler5punkte)
            {
                SpielerPop = Spieler4punkte;
                SpielerNop = Spielername4;
                win();
            }
            else if(Spieler5punkte > Spieler1punkte && Spieler5punkte > Spieler2punkte && Spieler5punkte > Spieler3punkte && Spieler5punkte > Spieler4punkte)
            {
                SpielerPop = Spieler5punkte;
                SpielerNop = Spielername5;
                win();
            }
            else
            {
                System.out.println("Kein Gewinner!");
                erneutsp();
            }
        }
    }
    
    private void win() // FFA // Gewinnernachricht
    {
        System.out.println("");
        System.out.println(SpielerNop +" hat mit " + SpielerPop + " Punkten gewonnen!");
        if (highscore < SpielerPop)
        {
            highscore = SpielerPop;
            System.out.println("");
            System.out.println("Neuer Highscore! " + SpielerPop + " von "+ SpielerNop);
            SpielerPop = highscore;
            highscorename = SpielerNop;
            wait(250);
        }
        erneutsp();
    }  
    
    private void rundeFFAP() // FFA //Raten und Punkte erhöhen bei bestimmter Spieleranzahl
    {
        if (spieleranzahl == 1)
        {
            System.out.println("Du bist dran");
            if (rateEinmal() == true)
            {
                Spieler1punkte = Spieler1punkte + 1;
            }
            runden = runden + 1;
        }    
        else if(spieleranzahl == 2)
        {
            System.out.println(Spielername1 +" ist dran");
            if (rateEinmal() == true)
            {
                Spieler1punkte = Spieler1punkte + 1;
            }
            System.out.println(Spielername2 +" ist dran");
            if (rateEinmal() == true)
            {
                Spieler2punkte = Spieler2punkte + 1;
            }
            runden = runden + 1;
        }
        else if(spieleranzahl == 3)
        {    
            System.out.println(Spielername1 +" ist dran");
            if (rateEinmal() == true)
            {
                Spieler1punkte = Spieler1punkte + 1;
            }
            System.out.println(Spielername2 +" ist dran");
            if (rateEinmal() == true)
            {
                Spieler2punkte = Spieler2punkte + 1;
            }
            System.out.println(Spielername3 +" ist dran");
            if (rateEinmal() == true)
            {
                Spieler3punkte = Spieler3punkte + 1;
            }
            runden = runden + 1;
        }    
        else if(spieleranzahl == 4)
        {
            System.out.println(Spielername1 +" ist dran");
            if (rateEinmal() == true)
            {
                Spieler1punkte = Spieler1punkte + 1;
            }
            System.out.println(Spielername2 +" ist dran");
            if (rateEinmal() == true)
            {
                Spieler2punkte = Spieler2punkte + 1;
            }
            System.out.println(Spielername3 +" ist dran");
            if (rateEinmal() == true)
            {
                Spieler3punkte = Spieler3punkte + 1;
            }
            System.out.println(Spielername4 +" ist dran");
            if (rateEinmal() == true)
            {
                Spieler4punkte = Spieler4punkte + 1;
            }
            runden = runden + 1;
        }    
       
        else if(spieleranzahl == 5)
        {    
            System.out.println(Spielername1 +" ist dran");
            if (rateEinmal() == true)
            {
                Spieler1punkte = Spieler1punkte + 1;
            }
            System.out.println(Spielername2 +" ist dran");
            if (rateEinmal() == true)
            {
                Spieler2punkte = Spieler2punkte + 1;
            }
            System.out.println(Spielername3 +" ist dran");
            if (rateEinmal() == true)
            {
                Spieler3punkte = Spieler3punkte + 1;
            }
            System.out.println(Spielername4 +" ist dran");
            if (rateEinmal() == true)
            {
                Spieler4punkte = Spieler4punkte + 1;
            }
            System.out.println(Spielername5 +" ist dran");
            if (rateEinmal() == true)
            {
                Spieler5punkte = Spieler5punkte + 1;
            }
            runden = runden + 1;
        }
        else if(spieleranzahl > 5) //Failsafe
        {
            while(spieleranzahl > 5)
            {
                spieleranzahl = 0;
                System.out.println("Ungültige Spieleranzahl!");
                wait(200);
                System.out.println("Geben sie erneut die Spieleranzahl an.");
                spieleranzahl = leseZahl();
            }
            rundeFFAP();
        }
    }
    
    private void TeamDeathMatch()// NOT FINISHED // Spielmodus 2 gegen 2 Teams
    {
        int x;
        String Team1Spieler1;
        String Team1Spieler2;
        String Team2Spieler1;
        String Team2Spieler2;
        //TDM als großer Text
        System.out.println("  _______   _____    __  __ ");
        wait(50);
        System.out.println(" |__   __| |  __ \\  |  \\/  |");
        wait(50);
        System.out.println("    | |    | |  | | | \\  / |");
        wait(50);
        System.out.println("    | |    | |  | | | |\\/| |");
        wait(50);
        System.out.println("    | |    | |__| | | |  | |");
        wait(50);
        System.out.println("    |_|    |_____/  |_|  |_|");
        wait(1000);
        System.out.println("ACHTUNG! Dieses Spiel kann nur mit insgesamt 4 Spielern gespielt werden!");
        wait(750);
        System.out.println("Gebe die Zahl |1| ein und drücke |Enter| um fortzufahren.");
        x = leseZahl();
        if (x == 1)
        {
            System.out.println("// UNDER DEVELOPMENT \\"); 
        }
        else
        {
            failsafe();
        }
    }

    private void namenFFA()
    {
        if(spieleranzahl == 1)
        {
            System.out.println("Spieler1 Name eintragen:");
            lesetext();
            Spielername1 = texteingabe; 
        }
        else if(spieleranzahl == 2)
        {
            System.out.println("Spieler1 Name eintragen:");
            lesetext();
            Spielername1 = texteingabe;
            wait(500);
            System.out.println("Spieler2 Name eintragen:");
            lesetext();
            Spielername2 = texteingabe;
        }
        else if(spieleranzahl == 3)
        {
            System.out.println("Spieler1 Name eintragen:");
            lesetext();
            Spielername1 = texteingabe;
            wait(500);
            System.out.println("Spieler2 Name eintragen:");
            lesetext();
            Spielername2 = texteingabe;
            wait(500);
            System.out.println("Spieler3 Name eintragen:");
            lesetext();
            Spielername3 = texteingabe;
        }
        else if(spieleranzahl == 4)
        {
            System.out.println("Spieler1 Name eintragen:");
            lesetext();
            Spielername1 = texteingabe;
            wait(500);
            System.out.println("Spieler2 Name eintragen:");
            lesetext();
            Spielername2 = texteingabe;
            wait(500);
            System.out.println("Spieler3 Name eintragen:");
            lesetext();
            Spielername3 = texteingabe;
            wait(500);
            System.out.println("Spieler4 Name eintragen:");
            lesetext();
            Spielername4 = texteingabe;
        }
        else if(spieleranzahl == 5)
        {
            System.out.println("Spieler1 Name eintragen:");
            lesetext();
            Spielername1 = texteingabe;
            wait(500);
            System.out.println("Spieler2 Name eintragen:");
            lesetext();
            Spielername2 = texteingabe;
            wait(500);
            System.out.println("Spieler3 Name eintragen:");
            lesetext();
            Spielername3 = texteingabe;
            wait(500);
            System.out.println("Spieler4 Name eintragen:");
            lesetext();
            Spielername4 = texteingabe;
            wait(500);
            System.out.println("Spieler5 Name eintragen:");
            lesetext();
            Spielername5 = texteingabe;
        }
    }
    
    private boolean rateEinmal()
    {   
        int zahl1;
        int zahl2;
        int loesung;
        String operator;
        int operatornummer = zufallszahl(4);
        if (operatornummer == 0) // + //
        { 
            operator = "+";
            zahl1 = zufallszahl(100)+100;
            zahl2 = zufallszahl(100)+100;
            loesung = zahl1 + zahl2;
            System.out.println("Wie viel ist "+ zahl1 + operator + zahl2 + "?");
            int antwort = leseZahl();
            if (antwort == loesung)
            {
                System.out.println("Richtig! Die Antwort lautet "+ loesung);
                return true;
            }
            else if(antwort == 42069)
            {
                Cheats();
                return true;
            }
            else
            {
                System.out.println("Falsch! Die Antwort lautet "+ loesung); 
                return false;
            }
        }
        else if (operatornummer == 1) // - //
        {
            operator = "-";
            zahl1 = zufallszahl(100)+100;
            zahl2 = zufallszahl(50)+100;
            loesung = zahl1 - zahl2;
            System.out.println("Wie viel ist "+ zahl1 + operator + zahl2 + "?");
            int antwort = leseZahl();
            if (antwort == loesung)
            {
                System.out.println("Richtig! Die Antwort lautet "+ loesung);
                return true;
            }
            else if(antwort == 42069)
            {
                Cheats();
                return true;
            }
            else
            {
                System.out.println("Falsch! Die Antwort lautet "+ loesung); 
                return false;
            }
        }   
        else if (operatornummer == 2) // * //
        {
            operator = "*";
            zahl1 = zufallszahl(15)+1;
            zahl2 = zufallszahl(15)+1;
            loesung = zahl1 * zahl2;
            System.out.println("Wie viel ist "+ zahl1 + operator + zahl2 + "?");
            int antwort = leseZahl();
            if (antwort == loesung)
            {
                System.out.println("Richtig! Die Antwort lautet "+ loesung);
                return true;
            }
            else if(antwort == 42069)
            {
                Cheats();
                return true;
            }
             else
            {
                System.out.println("Falsch! Die Antwort lautet "+ loesung); 
                return false;
            }
        }    
        else if (operatornummer == 3) // ./. //
        {            
            operator = "/";
            zahl1 = zufallszahl(110)+25;
            zahl2 = zufallszahl(9)+1;
            loesung = zahl1 / zahl2;
            System.out.println("Wie viel ist "+ zahl1 + operator + zahl2 + "?");
            int antwort = leseZahl();
            if (antwort == loesung)
            {
                System.out.println("Richtig! Die Antwort lautet "+ loesung);
                return true;
            }
            else if(antwort == 42069)
            {
                Cheats();
                return true;
            }
            else
            {
                System.out.println("Falsch! Die Antwort lautet "+ loesung); 
                return false;
            }
        }
        else 
        {
            System.out.println("ERROR 504 RETURN STATEMENT UNKNOWN"); 
            return false;
        }
    }
    
    private void erneutsp()
    {
        System.out.println("");
        wait(500);
        System.out.println("Erneut Spielen?");
        wait(250);
        System.out.println("1. Ja");
        wait(250);
        System.out.println("2. Zurück zum Menü");
        wait(250);
        System.out.println("3. Spiel verlassen");
        int x = leseZahl();
        if(x == 1)
        {
            FreeForAll();
        }
        else if(x == 2)
        {
            wait(250);
            clear();
            CallofCalculateMenu();
        }
        else if(x == 3)
        {
            System.out.println("Exiting Game...");
            wait(500);
            clear();
        }
        else
        {
            System.out.println("Ungültig!");
            System.out.println("Exiting Game...");
            wait(500);
            clear();
        }
    }
    
    private void Cheats() // Nichts Wichtiges // Falls Antwort von rateEinmal gleich 420 ist, wird diese Methode benutzt
    {
        System.out.println("");
        System.out.println("Get the best Cheats from Aimware.com");
        System.out.println("Only best prices for best cheats");
        System.out.println("");
    }
    
    private int zufallszahl(int n) // Zufällige Zahl 
    {
        return new java.util.Random().nextInt(n);
    }
    
    private static void wait(int ms) // Delays im ablauf des Programmes
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
    
    private void clear()
    {
        System.out.print('\u000c');
    }
    
    private void lesetext()
    {
        Scanner scanner = new Scanner(System.in);
        texteingabe = scanner.nextLine();
    }
    
    private int leseZahl()
    {
        return new java.util.Scanner(System.in).nextInt();
    }
    
    //NW
    public static void close()
    {
        Scanner in = new Scanner (System.in);
        System.out.print ("Enter a String: ");
      
        String mystring = in.nextLine();
        System.out.println("The String you entered is: " + mystring);
        in.close();
          
        String myString2 = in.nextLine();
        System.out.println(myString2);
    }
    
    //NW
    public static void newscannertest()
    {
        Scanner userInput = new Scanner(System.in);
        int T=userInput.nextInt();
        userInput.nextLine();
        while(T-->0)
        {
            String S=userInput.nextLine();
            char[] ch = S.toCharArray();
            int K=userInput.nextInt();
        }   
    }
    
    private void Texttest()
    {
        lesetext();
        String x = texteingabe;
        System.out.println(x);
    }
    
    private void easteregg()
    {
        System.out.println("           ____  ");
        wait(250);
        System.out.println("         o8%8888,    ");
        wait(250);
        System.out.println("       o88%8888888.  ");
        wait(250);
        System.out.println("      8'-    -:8888b   ");
        wait(250);
        System.out.println("     8'         8888  ");
        wait(250);
        System.out.println("    d8.-=. ,==-.:888b  ");
        wait(250);
        System.out.println("    >8 `~` :`~' d8888   ");
        wait(250);
        System.out.println("    88         ,88888   ");
        wait(250);
        System.out.println("    88b. `-~  ':88888  ");
        wait(250);
        System.out.println("    888b ~==~ .:88888 ");
        wait(250);
        System.out.println("    88888o--:':::8888      ");
        wait(250);
        System.out.println("    `88888| :::' 8888b  ");
        wait(250);
        System.out.println("    8888^^'       8888b  ");
        wait(250);
        System.out.println("   d888           ,%888b.   ");
        wait(250);
        System.out.println("  d88%            %%%8--'-.  ");
        wait(250);
        System.out.println(" /88:.__ ,       _%-' ---  -  ");
        wait(250);
        System.out.println("     '''::===..-'   =  --.  `");
    }
    
    private void sachentesten() // Nichts wichtiges // Bei benutzung private entfernen und mit Public ersetzen
    {
        System.out.println("Bitte Zahl Eingeben für ZAHL ");
        int ZAHL = leseZahl();
        if(ZAHL == 1)
        {
            System.out.println("ZAHL ist genau 1 ===== "+ ZAHL);
        }
        int x = 10;
        int y = 4;
        int c = 2;
        if (x>y && x>c)
        {
           System.out.println("x ist die größte Zahl");
        }
    }
    
    private void WaitTest() // Nichts wichtiges// Testen von Delay// Bei benutzung private entfernen und mit Public ersetzen
    {
        System.out.println("5 Sekunden");
        wait(5000);
        System.out.println("10 Sekunden");
        wait(10000);
        System.out.println("Finish!");
    } 
    
    public static void main(String[] args) 
    {
        /* Ein Objekt der Klasse DatabaseConnector wird erstellt.
        * SQLite verlangt als einzige Angabe den Namen der Datei!
        * Die anderen Angaben sind irrelevant.
        */  
        DatabaseConnector meinConnector = new DatabaseConnector("", 0, "PlayerDB.db", "", "");
        /*
        * Eine SQL-Anweisung wird ausgeführt.
        */
        meinConnector.executeStatement("INSERT INTO PlayerData (PlayerName, Password, GamesPlayed, GamesWon) VALUES ('Leon', 'Test', '0', '0')");
        /*
        * Zur Sicherheit sollten wir sehr häufig die Fehlermeldungen prüfen.
        */
        //System.out.println(meinConnector.getErrorMessage());
        /*
        * Das Ergebnis wird in der Konsole angezeigt.
        */
        /*for (int i=0; i<meinConnector.getCurrentQueryResult().getRowCount(); i=i+1) {
          for (int j=0; j<meinConnector.getCurrentQueryResult().getColumnCount(); j=j+1) {
           System.out.print(meinConnector.getCurrentQueryResult().getData()[i][j]+" ");
          }           
          System.out.println();
        }*/
    }
    
    public static void selectall()
    {
        /* Ein Objekt der Klasse DatabaseConnector wird erstellt.
        * SQLite verlangt als einzige Angabe den Namen der Datei!
        * Die anderen Angaben sind irrelevant.
        */  
        DatabaseConnector meinConnector = new DatabaseConnector("", 0, "PlayerDB.db", "", "");
        /*
        * Eine SQL-Anweisung wird ausgeführt.
        */
        meinConnector.executeStatement("SELECT * FROM PlayerData");
        /*
        * Zur Sicherheit sollten wir sehr häufig die Fehlermeldungen prüfen.
        */
        System.out.println(meinConnector.getErrorMessage());
        /*
        * Das Ergebnis wird in der Konsole angezeigt.
        */
        for (int i=0; i<meinConnector.getCurrentQueryResult().getRowCount(); i=i+1) 
        {
          for (int j=0; j<meinConnector.getCurrentQueryResult().getColumnCount(); j=j+1) 
          {
              System.out.print(meinConnector.getCurrentQueryResult().getData()[i][j]+" ");
          }           
          System.out.println();
        }
    }
    
    public static void deleteall()
    {
        DatabaseConnector meinConnector = new DatabaseConnector("", 0, "PlayerDB.db", "", "");
        meinConnector.executeStatement("DELETE FROM PlayerData");
    }
    
    public static void spielertest()
    {
        int won;
        String name;
        name = "leon";
        won = 1;
        DatabaseConnector meinConnector = new DatabaseConnector("", 0, "PlayerDB.db", "", "");
        meinConnector.executeStatement("UPDATE PlayerData SET GamesWon = + 1, GamesPlayed = + 1 WHERE PlayerName LIKE '"+name+"' "); 
    }
    
    public static void arraytest()
    {
        String i;
        i = "Test";
        String[] arr = new String[5];
        arr[0] = i;
        if(arr[0] == "Test")
        {
            System.out.println("i = '"+i+"'");
        }
    }
    
    public static void javasqldata()
    {
        //if(getdata() == "Karlo")
        //{
        //    System.out.println("X");
        //}
    }   
    
    public static void getdata()
    {
        DatabaseConnector meinConnector = new DatabaseConnector("", 0, "PlayerDB.db", "", "");
        Scanner meinScanner = new Scanner(System.in);
        String nachname = meinScanner.next();
        meinConnector.executeStatement("SELECT PlayerName FROM PlayerData WHERE PlayerName IS 'TEST'"); 
        if (meinConnector.getCurrentQueryResult().getRowCount() == 0)
        {
             System.out.println("Der Name ist nicht vorhanden!");
        }
        else
        {
            System.out.println("Der Name ist vorhanden!");
        }
    }
    
    String Nametest;
    public void Test()
    {

        DatabaseConnector meinConnector = new DatabaseConnector("", 0, "PlayerDB.db", "", "");

        //Scanner meinScanner = new Scanner(System.in);
        
        System.out.println("Welcher Name ist gesucht?");
        //String name = meinScanner.next();
        
        lesetext();
        Nametest = texteingabe;
        
        meinConnector.executeStatement("select PlayerName from PlayerData where PlayerName LIKE '%" + Nametest + "'");
        
        if (meinConnector.getCurrentQueryResult().getRowCount() == 0) 
        {
            System.out.println("Der Name ist nicht vorhanden!");
        }
        else 
        {   
            for (int i = 0; i < meinConnector.getCurrentQueryResult().getRowCount(); i = i + 1) 
            {
                
                for (int j = 0; j < meinConnector.getCurrentQueryResult().getColumnCount(); j = j + 1) 
                {
                    System.out.print(meinConnector.getCurrentQueryResult().getData()[i][j] + " ");
                }
                System.out.println("Der Name:'"+Nametest+"' ist vorhanden");
            }
        }
        //meinScanner.close();
    }
    
    public void gamewondata()
    {
        String PlayerWon = "Karlo";
        DatabaseConnector meinConnector = new DatabaseConnector("", 0, "PlayerDB.db", "", "");
        meinConnector.executeStatement("UPDATE PlayerData SET GamesWon = + 1 WHERE PlayerName IS LIKE '"+PlayerWon+"'");
    }
    
    public static void winadddatenbank()
    {
        String SpielerNop = "Karlo";
        DatabaseConnector meinConnector = new DatabaseConnector("", 0, "PlayerDB.db", "", "");
        Scanner meinScanner = new Scanner(System.in);
        //Scanner meinScanner = new Scanner(System.in);

        meinConnector.executeStatement("UPDATE GamesWon SET = + 1 WHERE PlayerName = '"+ SpielerNop +"'");
        
        if (meinConnector.getCurrentQueryResult().getRowCount() == 0) 
        {
            //System.out.println("Der Name ist nicht vorhanden!");
        }
        else 
        {
            //for (int i = 0; i < meinConnector.getCurrentQueryResult().getRowCount(); i = i + 1) 
            //{
            //    
            //    for (int j = 0; j < meinConnector.getCurrentQueryResult().getColumnCount(); j = j + 1) 
            //    {
            //        System.out.print(meinConnector.getCurrentQueryResult().getData()[i][j] + " ");
            //    }
            //    System.out.println("Der Name:'"+name+"' ist vorhanden");
            //}
        }
    }
    
    public void btest()
    {
        /*if(Test() == true)
        {
            System.out.println("Name ist vorhanden!");
        }
        else
        {
            System.out.println("Name nicht im System!");
        }*/
    }
}
