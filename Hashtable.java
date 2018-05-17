import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lotalorafox
 */
public class Hashtable {
    List<List<String>> data;
    int datacan =0;
    int e =0;
    float fc =0; 
    public static int prime = 109;
    public static float primef = (float) 109.0;
    public static int prime2 =31;
    public Hashtable(int size){
        data = new ArrayList<List<String>>(prime);
        for(int i=0;i<prime;i++){
            ArrayList<String> tem = new ArrayList<>();
            data.add(i,tem);
        }
            
    }
    public void add(String d){
        int code = hashcode(d);
        data.get(code).add(d);     
        e++;
        this.fac();
    }
    public void fac(){
        this.fc = primef/((float)e);
    }
    public float getfac(){
        return fc;
    }
    public int find(String a){
        int c = hashcode(a);
        //System.out.println(c);
        if(data.get(c).contains(a)){
            System.out.println(c + " " +data.get(c).toString());
            return c;
        }
        else
            return -1;
    }
    public int weight(int c){  
        if(c == -1){
            return -1;
        }
        return data.get(c).size();
    }
    int hashcode(String d){
        long n =0;
        for(char i: d.toCharArray()){
            n += (((int)i)*prime2);
        }
        n = n%prime;
        //System.out.println("'" + d+"'" + n);
        return (int)n;
    }
    public void print(){
        int i=0;
        for(List<String> tem:data){
            System.out.println(i +" " +tem.toString());
            i++;
        }
    }
    
}
