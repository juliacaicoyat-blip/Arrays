import java.util.Scanner;

public class EstacionMeteteorologica {
    public static void main(String[] args) {
        String[]dias={"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
        double[] temperaturas=new double[7];
        Scanner d=new Scanner(System.in);
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("w"+temperaturas[i]);


            do {
                temperaturas[i]=d.nextDouble();



            }while (temperaturas[i]<-10||temperaturas[i]>10);

        }
        double temperaturaMedia; // Esto lo vamos a calcular
        double sumaTemperaturas = 0;


        for (int j = 0; i < 7; j++) {
            // Ahora en sumaTemperaturas has de sumar la temperatura del día `i`
            sumaTemperaturas+=temperaturas[j];
        }
        temperaturaMedia=sumaTemperaturas/7;
        System.out.println("media"+temperaturaMedia);
        int[]max=0;
        for (int i = 0; i < max; i++) {


        }
    }
}
