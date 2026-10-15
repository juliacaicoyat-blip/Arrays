public class Ejemplo10 {
    public static void main(String[] args) {
        int[]x={1,2,3,4,5,6,7,8,9};
        int buscar=5;
        int indice=-1;
        for (int i=0;i< x.length;i++){
            if(x[i]==buscar){
                indice=i;

            }

        }
        System.out.println("el num es"+indice);
    }

}
