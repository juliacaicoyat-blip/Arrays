public class Ejemplo14 {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7,8,9};
        int indice=10;
        for (int i = indice; i < num.length-1; i++) {
            num[i]=num[i+1];





        }
        num[num.length-1]=0;
        System.out.println(" ");
    }
}
