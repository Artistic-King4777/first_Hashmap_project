import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapMain {
    public static void main(String[] args) {


        Map<Integer, String> bLCharas = new HashMap<Integer, String>();
        bLCharas.put(1, " Yuzuru");
        bLCharas.put(2, " Satomi");
        bLCharas.put(3, " Drarry");
        bLCharas.put(4, " Skeleton Dance");
        bLCharas.put(5, " FrostIron");
        bLCharas.put(6, " SpideyPool");


        System.out.println(bLCharas);

        System.out.println( bLCharas.containsKey(5) );
        System.out.println( "\n" + bLCharas.get(4));
        System.out.println( bLCharas.size());
        System.out.println( bLCharas.entrySet());

                                              //poiPoisBL is just a variable name to store the iterator
        System.out.println("====================================== ITERATOR LOOP BELOW =============================");
        Iterator<Map.Entry<Integer, String>> poiPoisBL = bLCharas.entrySet().iterator();
        while(poiPoisBL.hasNext()){
            Map.Entry<Integer, String> entry = poiPoisBL.next();
            System.out.println("Key: " + entry.getKey() + "  | Value : " + entry.getValue());
        }

        System.out.println("===============================================================================");

        String shipOne = "IronStucky";
        String shipTwo = "Thorki";
        String shipThree = "Snarry";
        String shipFour = "Koisuru Bouken14";

        String a = String.format("%, d", 1000000000);//ADDED COMMAS can only go to 1 billion
        System.out.printf(a);

        //--------------------------------------
        System.out.printf("%b %n %s %s %n %s %n", shipFour, shipThree, shipTwo, shipOne);
        //%b = if null false if nun-null true I GOT TITLE SUPER NEGRO FOR CODE ABOVE

        System.out.println("==================================");
        System.out.printf("%b %s %n %s %s", shipFour, shipThree, shipTwo, shipOne);

    }
}
