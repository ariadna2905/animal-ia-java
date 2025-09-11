
package animal;

public class Animal {

   
    public static void main(String[] args) {
        // TODO code application logic here
        animalBR obr=new animalBR();
        String aux;
        aux=obr.getVertebrado1("si","no","no","no");
        
        System.out.println("V1= "+aux);
        
        aux=obr.getVertebrado2("AVE","si","si");
        
        System.out.println("V1= "+aux);
    }
    
}
