import java.io.FileNotFoundException;
import java.io.*;
import java.util.HashSet;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author lotalorafox
 */
public class Main {
    public static void main(String[] arcs) throws FileNotFoundException, IOException {
        File words = new File("InsumoTallerHash.txt");
        //FileReader w = new FileReader("InsumoTallerHash.txt");
        Scanner in = new Scanner(words,"UTF-8");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        HashSet<String> data = new HashSet<>();
        System.out.print("Putting data...");
        while(in.hasNext()){
            System.out.print("...");
            String[] a = in.nextLine().split(",");
            for(String i:a){
                //i.replaceAll("Ñ","N");
                data.add(i);
            }
        }
        in.close();
        System.out.println();
        Object[] darr = data.toArray();
        //System.out.print(darr.length);
        Hashtable table = new Hashtable(darr.length);
        for(Object k: darr){
            table.add((String)k);
        }
        System.out.println("Size of the table: " + table.prime);
        System.out.println("Number of elements: " + table.e);
        System.out.println("Charge factor: " + table.getfac());
        //table.print();
        Scanner sc = new Scanner(System.in,"iso-8859-1");
        System.out.println();
        System.out.println("Put the text to find on the table, to go out put '0', to view the table put 1");
        String s = sc.next();
        while(!(s.equals("0")))
        {   

            if(!(s.equals("1"))){
                int code = table.find(s);
                if(code != -1)
                    System.out.println("code " + code + " weight " + table.weight(code));
                else
                    System.out.println("'" + s + "' is not in the table");    
            }else{
                table.print();
            }
            s =sc.next();
            
        }
    }
          
}

