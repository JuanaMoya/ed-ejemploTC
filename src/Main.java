import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void ejercicio1(int[] arrayE, int n){
        int nVeces = 0;
        for (int i = 0; i < arrayE.length; i++) {
            if (arrayE[i]==n){
                nVeces++;
            }
        }
        System.out.println("El número "+n+" aparece "+nVeces);
    }
    public static void ejercicio2(String[] arrayS){
        String palabraMaxima="";
        for (int i = 0; i <arrayS.length ; i++) {
            if (arrayS[i].length()>palabraMaxima.length()){
                palabraMaxima=arrayS[i];
            }
        }
        System.out.println(palabraMaxima);
    }
    public static void ejercicio3(String[] arrayS, char c){
        System.out.println("Palabras del array que empiezan por "+c);
        for (int i = 0; i < arrayS.length; i++) {
            if(arrayS[i].charAt(0)==c){
                System.out.println(arrayS[i]);
            }
        }
    }
    public static int[] ejercicio4(int[] arrayE1, int[] arrayE2){
        int[] resultado;
        int tamañoMaximo=0;
        int tamañoMinimo=0;
        int[] arrayMin;
        int[] arrayMax;
        if (arrayE1.length>arrayE2.length){
            arrayMax=arrayE1;
            arrayMin=arrayE2;
        }
        else{

            arrayMax=arrayE2;
            arrayMin=arrayE1;
        }
        resultado=new int[arrayMax.length];

        for (int i = 0; i < arrayMin.length; i++) {
            if(arrayE1[i]>arrayE2[i]){
                resultado[i]=arrayE1[i];
            }
            else{
                resultado[i]=arrayE2[i];
            }
        }
        for (int i = arrayMin.length; i < arrayMax.length; i++) {
            resultado[i]=arrayMax[i];
        }
        return resultado;
    }
    public static void mostrarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+",");
            }
            System.out.println();
        }
    }
    public static int[][] inicializarMatriz(){
        int[][] matriz=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Dime el valor para almacenar en la matriz");
                matriz[i][j]=sc.nextInt();

            }

        }
        return matriz;
    }
    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2){
        int[][] resultado=new int[matriz1.length][matriz1.length];
        for (int i = 0; i <matriz1.length ; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                resultado[i][j]=matriz1[i][j]+matriz2[i][j];

            }

        }

        return resultado;
    }
    public static void main(String[] args) {
        int[] arrayEnteros={2,5,7,5,12};
        int[] arrayEnteros1={7,4,3,15,20,8};
        String[] arrayString={"azul", "rojo","amarillo","verde"};

        ejercicio1(arrayEnteros,5);
        ejercicio2(arrayString);
        ejercicio3(arrayString,'a');
        int[] resultado=ejercicio4(arrayEnteros,arrayEnteros1);
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }
        int [][] matriz1={{1,5,8},{7,5,4,7},{6,5,4}};
        int[][] matriz2=inicializarMatriz();
        int[][] matriz3=inicializarMatriz();
        int[][] matrizR=sumarMatrices(matriz2,matriz3);
        mostrarMatriz(matrizR);

    }
}