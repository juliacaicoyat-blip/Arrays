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
        double sumaTemperaturas=0;


        for (int i = 0; i < temperaturas.length; i++) {
            // Ahora en sumaTemperaturas has de sumar la temperatura del día `i`
            sumaTemperaturas+=temperaturas[i];
        }

        System.out.println("media"+sumaTemperaturas/7+"ª");
       double maxima =temperaturas[0];
       int diaMaxima;
        for (int i = 0; i<temperaturas.length; i++) {
            if(temperaturas[i]>maxima){
                maxima=temperaturas[i];
                diaMaxima=i;
            }


        }
        double minima=temperaturas[0];
        int diaMinima;
        for (int i = 0; i < temperaturas.length; i++) {
            if(temperaturas[i]<minima){
                minima=temperaturas[i];
                diaMinima=i;
            }


        }

        System.out.println("maxima:"+maxima+"ªC("+dias[diaMaxima]+")");
        System.out.println("minima:"+minima+"ªC("+dias[diaMinima]+")");
        //separación


        String diasPorEncima="";
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[0]>sumaTemperaturas){
                diasPorEncima+=dias[i]+"";


            }

        }
        System.out.println(""+diasPorEncima);

        //separación
        double MayorSubida=0;
        double subida=0;
        int pos=0;
        for (int i = 0; i < temperaturas.length-1; i++) {
            subida=temperaturas[i]-temperaturas[i+1];
            if (subida>MayorSubida){
                MayorSubida=subida;
                pos=i;

            }


        }
        System.out.println("Mayor"+"de"+dias[pos]+"a"+dias[pos+1]+"("+MayorSubida+"ªC)");
        String grafico="-";

        for (int i = 0; i <temperaturas.length ; i++) {
            if (temperaturas){

            }


        }








    }
}
