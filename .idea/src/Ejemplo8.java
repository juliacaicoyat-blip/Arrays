public class Ejemplo8 {
    public static void main(String[] args) {
        int []f ={0,1,2,-3,4,5,6,-7,8,9};
        int p=0;
        int n=0;
        for (int i=0;i<f.length ;i++){
            if (f[i]<0){
               n+=f[i];

            } else {
                p+=f[i];

            }


        }
        System.out.println("la suma de los positivos");
        System.out.println("la suma de los negativos");
    }
}
