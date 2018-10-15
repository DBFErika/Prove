package prove;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tipi di variabili
        // nomi delle variabili sono degli identificatori(costruiti con lettera alfabetica con aggiunta di _
        //no spazio perchè è un separatore
        //ogni variabile primitiva ha la classe Wrapper che crea un oggetto di quel tipo
        //numerici -> byte, short , int, float, double, long(è un int), boolean
        //visibilità -> blocco di parentesi graffe in cui è DICHIARATA
        //alias: se ce ne sono uguali in 2 blocchi ha precedenza quella interna
        // dichiarazione -> const: costante, solo una volta in qualsiasi punto
                        //static -> si legano alla classe e non all'oggetto
        //private, public, protected come i metodi
        //static final = const
        //int       -> 0b00101    -> memorizzato in binario
        //             0xFFEA     -> memorizzato in esadecimale
        //             987654321L -> memorizzato come long: quindi rappresentato solo su variabili long
        //decimali  -> 10.2f -> mem in float
        //             1e6 -> 10^6
        //caratteri -> 'a' -> char
        //             '\u00FE' -> carattere utf
        //             '\n' o '\t' -> caratteri escape
        //stringa   -> "fgggfsdgrsg"
//        int i = 100;
//        Integer j = new Integer(10);
//        
//        //classe Wrapper e tipi primitivi sono compatibili. E' possibile fare così:        
//        i = j;
//        j = 200;
//        
//        //tipo primitivo non offre altri metodi, solo il suo valore
//        //il tipo Wrapper invece propone i metodi della suddetta classe
//        System.out.println(j.MAX_VALUE);
//        System.out.println(j.MIN_VALUE);
//        //assegno il valore massimo di j a i
//        i = j.MAX_VALUE;
//        //aumento di 1
//        i++;
//        
//        //quello che mostra è il numero minore possibile perchè non può mostrare il numero dopo a causa della dimensione        
//        //esempio 111 -> quello dopo è 1000 non può essere mostrato 
//        //-> quindi viene mostrato solo 000
//        System.out.println(i);
//        //dimensione x RAM -> attenzione con le matrici! 
//        //se togliamo 10 il numero mostrato non cambia poichè è un numero molto grande
//        
//        i = i-10;
//        
//        //Double.NaN -> per confrontare oggetti che non si possono rappresentare, come il null
//        Short h = 2; //(16 bit)
//        Long l = new Long(2);
//        
//        //------------------------------------------------------------------------------------------------------------------------
//        
//        Integer k = new Integer(10);
//        Integer y = new Integer(10);
//        
//        //confrontiamo 2 oggetti (quindi i 2 indirizzi)
//        if (k == y)
//            System.out.println("Sono uguali.");
//        else
//            System.out.println("Non sono uguali.");
//        
//        //se voglio confrontare i due valori dei due oggetti:
//        if (k.intValue() == y.intValue())//(non è necessario intValue per tutte le variabili)
//            System.out.println("Sono uguali.");
//        else
//            System.out.println("Non sono uguali.");
//        //OPPURE:
//        if (k.equals(y))
//            System.out.println("Sono uguali.");
//        else
//            System.out.println("Non sono uguali.");
//        //è bene che in una classe che implementi una equals per confrontare
//        //vale anche per le stringhe
//        
//        
//        //confrontiamo 2 valori di cui 1 è all'interno di un oggetto
//        if (k == 10)
//            System.out.println("K è = a 10");
//        else
//            System.out.println("K non è 10.");
//        if (y == 10)
//            System.out.println("Y è = a 10");
//        else
//            System.out.println("Y non è 10.");
//        
//        //In conclusione si possono confrontare due tipi primitivi e i valori di due oggetti
//        //se i 2 oggetti sono contenuti nella stessa indirizzazione allora risulta uguale altrimenti no.
//        //Boxing automatico:
//        Integer w = -1;
//        
//        //----------------------------------------------------------------------------------------------------
//        //OPERATORI
//        
//        //cast -> (double)number -> forzatura, a volte non è permesso poichè è possibile perdere le info
//        // aritmetici -> +, -, /, *, %(resto), +=, -=, *=, /=, %=
//        //esempio:
//        int a = 10;
//        int b = 20;
//        
//        a *= 3; // = 30
//        b %= 3; // = 2 -> resto
//        
//        //INCREMENTO: ++x, --x, x++, x--
//        //esempio:
//        a = 10;
//        b = 20;        
//        //è differente se è così:
//        a = b++; //dà il valore alla a e incrementa b
//        System.out.println(a);
//        System.out.println(b);
//        a = ++b; //incrementa b e poi dà il valore alla a
//        System.out.println(a);
//        System.out.println(b);
//        //così da soli sono uguali
//        a++;
//        ++a;
//        
//        //CONCATENAZIONE -> +
//        
//        //CONFRONTO -> <, >, >=, <=, ==, !=
//        
//        //LOGICI -> &&, ||, ! (AND, OR, NOT)
//                
//        //CONDIZIONALE UNARIO -> (predicato) ? (seVero) : (seFalso) -> come l'if
//        int quanti = 10;
//        String s = "Io vedo " + quanti + " bambin";
//        System.out.println(s + ((quanti == 1) ? "o." : "i."));
//        //CONTROLLO CONDIZIONALE -> if() ad una via, if()else() a due vie
//        // + vie -> switch(c){case1 value1: .... break; ... default: ...} (c può essere byte, int, char, Enum, String)
//        //o mettere break o mettere return
//        Scanner scan = new Scanner(System.in);
//        String str;
//        System.out.print("Inserisci un numero intero <10: ");
//        int selettore = scan.nextInt();
//        
//        switch(selettore)
//        {
//            case 0: 
//                str= "zero";
//                break;
//            case 1:
//                str = "one";
//                break;
//            case 2:
//                str = "two";
//                break;
//            //default -> tutti gli altri casi
//            default:
//                str = "non mi aspettavo questo numero.";                
//        }
//        
//        System.out.println("Hai inserito " + str);
//        
//        /////////////////////////////////
//        System.out.print("Inserisci un mese: ");
//        String sel = scan.next();
//        
//        switch(sel)
//        {
//            case "febbraio": 
//                str= "28";
//                break;
//            case "novembre":                
//            case "aprile":
//            case "giugno":
//            case "settembre":
//                str = "30";
//                break;
//            //default -> tutti gli altri casi
//            default:
//                str = "31";                
//        }
//        System.out.println("Il numero di giorni è " + str);
//        
//        //CON GLI ENUMERATIVI
//        String stringa;
//        Mesi mese; // = Mesi.gennaio;
//        System.out.print("Inserisci un mese: ");   
//        stringa = scan.next();
//        
//        //convertiamo la stringa in mese
//        mese = Mesi.toMesi(stringa);
//        
//        //controlliamo se ha preso quello inserito
//        System.out.println("*" + mese + "*");
//        
//        switch(mese)
//        {
//            case febbraio: 
//                str= "28";
//                break;
//            case novembre:                
//            case aprile:
//            case giugno:
//            case settembre:
//                str = "30";
//                break;
//            //default -> tutti gli altri casi
//            default:
//                str = "31";                
//        }
//        System.out.println("Il numero di giorni è " + str);
//        
//        //altrimenti si può inserire il metodo nell'enumerativo
//        
//        System.out.print("Inserisci un mese: ");   
//        stringa = scan.next();
//        mese = Mesi.toMesi(stringa);
//        System.out.println("Il numero di giorni è " + Mesi.nGiorni(mese));
//        
//        //-----------------------------------------------------------------------------------
//        //CONTROLLO CICLICO
//        
//        //while, for, for(foreach), do...while
//        //il for e foreach sono un cicli enumerativi
////        
//        String st;
//        Mesi mese1;
//        mese1 = Mesi.aprile;
//        Mesi[] mesi = Mesi.values();
//        for (int m = 0; m < mesi.length; m++) 
//        {
//            System.out.println(mesi[m]);
//        }
//        int m = 0;
//        while(m < mesi.length)
//        {
//            System.out.println(mesi[m++]);
//        }
//        //foreach
//        for( Mesi mes : mesi)
//        {
//            System.out.println(mesi[m]);
//        }


//        //VETTORI
//        //prendo delle stringhe e le trasferisco in un altro vettore
//        
//        //vettore di stringhe della stessa dimensione di args
//        String[] vs = new String[args.length];
//        //inizializzazione diretta: String[] a = {"pane", "verdura" };
//        int i = 0;
//        //per ogni stringa di args
//        for(String s : args)
//        {
//            //inserisco il valore nel posto dell'array numero i e poi incremento
//            vs[i++] = s;
//        }
//        for(String s : vs)
//        {
//            if (s != null) 
//            {
//                //voglio stampare ogni elemento, quindi basta mettere la stringa creata
//                //nel ciclo
//                System.out.println(s);
//            }
//            
//        }

//        //FORMATTAZIONE STRINGHE
//        //Interi
//        int int1 = 15;
//        int int2 = 95;
//        //per stampare più di un valore serve la classe String.format
//        //segnaposti -> bisogna usare %d -> d significa decimal
//        String s;
//        //per gestire output la stringa non deve essere vuota
//        s = String.format("%2$d --- %1$d", int1, int2); //format(String, args)
//        // l'args 0 e 1 sono gli stessi -> se mettiamo 0$ o 1$ l'argomento è sempre il primo
//        // se aggiungo 1$ e 2$ -> $ segna a quale args si riferisce quindi se metto il 2$ prima
//        // uscirà prima il 95 e poi il 15
//        
//        s = String.format("Il primo numero è: %d --- l'altro è: %d", int1, int2);
//        
//        //gestire grandezza del campo
//        //%10d -> è in campo  10 di tab
//        //inoltre se si aggiunge a %10d000 -> aggiunge 000 al numero che stampo
//        s = String.format("Il primo numero è: %10d --- l'altro è: %10d000", int1, int2);
//
//        
//        //Decimali
//        
//        double d1 = 15.123456789;
//        double d2 = 95.123456789;
//        //la grandezza del campo è 10 -> quindi tronca tutti i decimali dopo il sesto arrotondando l'ultimo
//        s = String.format("Il primo numero è: %10f --- l'altro è: %10.10f", d1, d2); //> se voglio 10 decimali faccio %10.10f
//        //esiste poi %10g x mantenere 10 caratteri e %10e per la notazione scientifica
//        
//        //per poter importare il formato locale di uno stato
//        s = String.format(Locale.JAPAN, "%.2f", 1.23456);
//        
//        
//        d1 = 123456789.12345;
//        d2 = 123456789.12345;
//        
//        //riesce a formattare le migliaia con 2 decimali
//        s = String.format("Il primo numero è: € %,.2f --- l'altro è: %10.5f", d1, d2);
//        
//        
//        //Stringhe
//        
//        String str= "12345678901234567890";
//        
//        //s = String.format("%10s", str);
//        //se inserisco 60 mi accosta tutto a dx -> se metto -60 mi accosta tutto a sx
//        s = String.format("%-60s", "Il vero valore è " + str);
//        s = String.format("%20s", "-"); // non c'è nulla da stampare
//        System.out.println(s);
        
        //VETTORI
        //dichiarazione: Tipo[]nome;  Tipo nome[];    sono equivalenti
        
        //istanziare:   Tipo[]nome = new Tipo[n];
        
        //inizializzare: Tipo[] nome = { e1, e2, e3, e4};
        //numero elementi: nome.length
        //primo elementi: nome[0]
        //ultimo elemento -> length -1
        
        
//        //matrici -> vettori a 2 elementi
        
//        int[][] matrice = new int[2][3];
//        
//        matrice[0][0] = 11;
//        matrice[0][1] = 12;
//        matrice[0][2] = 21;
//        
//        matrice[1][0] = 12;
//        matrice[1][1] = 22;
//        matrice[1][2] = 31;
//        
//        //ho la possibilità di assegnare anche righe di dimensioni diverse
//        //vengono dette matrici ragged:
//        int[][] matrice2 = new int[2][]; // non metto nessun dimensionamento, ma sono obbligato dopo a metterlo su tutte le righe
//                                         // si può anche mettere l'inserimento di 3
//        matrice2[0] = new int[10]; 
//        //matrice2[0][0] = 11;
//        matrice2[0][1] = 12;
//        matrice2[0][2] = 21;
//        
//        matrice2[1] = new int[20];
//        matrice2[1][0] = 12;
//        matrice2[1][1] = 22;
//        matrice2[1][2] = 31;
//        
//        
//        //System.out.println("T. min.: " + matrice[1][1] + " del giorno: " + matrice[1][0]);
//        //posso anche estrarre il vettore di riga -> att.ne però se modifico i valori all'interno
//        //si modificiano anche nella matrice!
//        //ogni riga è un array -> viene gestito di conseguenza
//        int[] riga = matrice2[1];
//        riga[1] = 90;
//        //mostro ogni elemento della matrice 0
//        for(int e: matrice[0])
//            System.out.println(e);
//        oppure mostro il vettore di interi dove ho estratto la riga della matrice
//        for(int e: riga)
//            System.out.println(e);
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(String.format("%5d", matrice2[i][j]));
//            }
//            System.out.println("");
//        }
//        //matrici multimensionali
//        //cubo di rubik
//        //come 3 fogli -> su ognuno dei fogli ha una matrice
//        // se facessi solo 3 dimensioni del cubo, posso inserire solo 1 colore
//        //tre dimensioni -> cubo[foglio][riga][colonna]
//        Colori[][][][] rubik = new Colori[3][3][3][3];
//        
//        rubik[0][0][0] = new Colori[] {Colori.giallo, Colori.verde, Colori.rosso};
//        rubik[0][0][1] = new Colori[] {Colori.verde, Colori.rosso};
//        
//        //oppure
//        rubik[0][0][0] = new Colori[3];
//        rubik[0][0][0][0] = Colori.giallo;
//        rubik[0][0][0][1] = Colori.verde;
//        rubik[0][0][0][2] = Colori.rosso;
//        rubik[0][0][1] = new Colori[2];
//        rubik[0][0][1][0] = Colori.verde;
//        rubik[0][0][1][1] = Colori.rosso;
//        //vettori dinamici inseriti da basic
//        //il limite più grosso del vettore è quello di avere un max di elementi
//        //quindi sono vettori statici
//        
//        //LIBRERIE ARRAYS -> utilities per vettori statici
//        
//        //int[] v1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120};
//        //voglio sapere in che posizione si trova il 7 -> ricordare che l'indice parte da 0
//        
//        
//        //binarySearch
//        //int pos = Arrays.binarySearch(v1, 70); //ricerca binaria
//        //se la posizione è negativa non c'è
//        
//        int[] v1 = {10, 20, 30, 70, 50, 60, 70, 80, 90, 10, 110, 120};
//        System.out.println(Arrays.toString(v1));
//        //sort -> per riordinare il vettore
//        Arrays.sort(v1); 
//        
//        //copyOf -> copiare da un vettore ad un altro -> per poter utilizzarlo da sè
//        int[] v2 = Arrays.copyOf(v1, 5);
//        int[] v3 = v1;
//        v2[3] = 0;
//        v1[4] = 550;
//        
//        //mostro gli elementi degli array
//        //System.out.println(Arrays.toString(v1));
//        System.out.println(Arrays.toString(v1));
//        System.out.println(Arrays.toString(v2));
//        System.out.println(Arrays.toString(v3));
//        //System.out.println(pos);
        
        
        //USO DI ARRAYLIST
        int[] v1 = {10, 20, 30, 70, 50, 60, 70, 80, 90, 10, 110, 120};
        
        ArrayList lista = new ArrayList(); //la lista non è omogenea per il tipo
        for (int i = 0; i < 10; i++) {
            lista.add(11 * i);
        }
        lista.add(1, 5);
        lista.remove(Integer.valueOf(44)); 
        lista.remove(4);
        lista.add(0,3.2);
        lista.add(0,"Siamo in tanti");
        System.out.println(lista.indexOf(66));
        System.out.println(lista);
        lista.set(0, 111);
        System.out.println(lista);        
        System.out.println(lista.size());
        Anagrafica.test();
        
        
    }
    enum Colori
    {
        giallo, verde, blu, rosso, bianco, arancione;
    }
}

class Anagrafica
{
    private String nominativo, comune;
    SimpleDate dataNascita;
    
    public Anagrafica(String n, String c, String d)
    {
        nominativo = n;
        comune = c;
        dataNascita = new SimpleDate(d);
    }
    
    public boolean equals(Anagrafica other)
    {
        return (nominativo.toLowerCase().equals(other.nominativo.toLowerCase()) &&
            dataNascita.equals(other.dataNascita));
    }
    
//    public int compareTo(Anagrafica other)
//    {
//        if (this.equals(other)) //se anagrafica other è uguale a this
//            //se i due oggetti sono uguali -> nominativo e nascita
//            return 0;
//        else if (nominativo.toLowerCase().equals(other.nominativo.toLowerCase()))
//                //controlla se i nominativi sono uguali
//                if (dataNascita.before(other.dataNascita)) 
//                {//confronta le date di nascita 
//                    return -1;                
//                }
//                else
//                {
//                    return 1;
//                }
//        else
//            return nominativo.toLowerCase().compareTo(other.nominativo.toLowerCase());
//            //ritorna il caso del maggiore o del minore riferito al nominativo
//    }
    
    public int compareTo(Anagrafica other)
    {
        //se compariamo e risultano uguali confronto le date di nascita
        if (nominativo.toLowerCase().compareTo(other.nominativo.toLowerCase()) == 0) 
        {
            if (dataNascita.before(other.dataNascita)) 
                {//confronta le date di nascita 
                    return -1;                
                }
                else
                {
                    return 1;
                }
        }
        //se invece sono diversi
        //ritorno il risultato della comparazione
        return nominativo.toLowerCase().compareTo(other.nominativo.toLowerCase());
        
    }
    
    public String toString()
    {
        return nominativo + "-" + dataNascita + "-" + comune;
    }
    
    public static void test()
    {
        Anagrafica a1 = new Anagrafica("Pippo Baudo", "Catania", "10/10/1940");
        Anagrafica a2 = new Anagrafica("Vasco Rossi", "Reggio E", "10/10/1950");
        Anagrafica a3 = new Anagrafica("Vasco Rossi", "Reggio E", "10/10/1950");
        
        ArrayList list = new ArrayList();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        System.out.println(list);
        list.remove(a2);
        System.out.println(list);
        System.out.println(a1.compareTo(a3));
        
    }
    
}

//elenco di valori costanti per definire in modo vincolante delle situazioni
//se voglio inserire delle stringhe devo mettere _    esempio: io_sono_io
//negli enumerativi si possono inserire anche dei metodi!!!!
enum Mesi
{
    //è diventato un vettore
    gennaio, febbraio, marzo, aprile, maggio, giugno, luglio, agosto, settembre,
    ottobre, novembre, dicembre;
    
    public String firstMonth()
    {
        return "gennaio";        
    }
    //convertiamo la stringa passata in mesi enumerativo
    //con static appartiene alla classe e non all'oggetto
    public static Mesi toMesi(String s)
    {
        switch(s)
        {
            case "gen": return gennaio; // non uso break perchè return esce comunque
            case "feb": return febbraio;
            case "mar": return marzo;
            case "mag": return maggio;
            default: return valueOf(s);
        }             
    }
    
    //ciclo
    public static int nGiorni(Mesi mese)
    {
        switch(mese)
        {
            case febbraio: return 28;
            case novembre:                
            case aprile:
            case giugno:
            case settembre: return 30;            
            default: return 31;                
        }
        
    }
}

