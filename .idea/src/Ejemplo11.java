public class Ejemplo11 {
    public static void main(String[] args) {
        int[]num={1,2,3,4,5,6};
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if(num[i]==num[j]){
                    System.out.println("El numero"+num[i]+"esta dublicado");

                }

            }

        }

    }

}
