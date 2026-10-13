public class Ejemplo4 {
    public static void main(String[] args) {
        int[] m ={0,1,2,3,4,5,6,7,8,9};
        int suma=0;
        for (int i=0; i<m.length ;i++){
            suma=suma+m[i];
            m[i]=m[i]/2;
            System.out.println("la media es "+suma/m.length);


        }
    }
}
