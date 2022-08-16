/*
Ejercicio individual 23 - Procesamiento de texto
Alumno: Erick Díaz Guerra
 */
package com.company;
import java.util.Scanner;
public class Individual23ProcesamientoDeTexto {

   public static void main(String[] args) {
      Scanner ingresar = new Scanner(System.in);

      System.out.println("**************************************** ****************************************");
      System.out.println("<<< Ingreso y procesamiento de texto >>>");

      System.out.println("**************************************** ****************************************");
      System.out.println("Escriba un texto para ser procesado:");
      String texto = ingresar.nextLine();
      while (texto.equals("")) {
         System.out.println("Ingreso nulo, debe escribir un texto:");
         texto = ingresar.nextLine();
      }

      System.out.println("**************************************** ****************************************");
      System.out.println("Minusculas convertidas en mayusculas desde el texto original:");
      for (int i = 0; i < texto.length(); i++) {
         if (Character.isLowerCase(texto.charAt(i))) {
            System.out.print(Character.toUpperCase(texto.charAt(i)));
         } else
            System.out.print(texto.charAt(i));
      }
      System.out.println("");

      System.out.println("**************************************** ****************************************");
      System.out.println("Mayusculas convertidas en minusculas desde el texto original:");
      for (int i = 0; i < texto.length(); i++) {
         if (Character.isUpperCase(texto.charAt(i))) {
            System.out.print(Character.toLowerCase(texto.charAt(i)));
         } else
            System.out.print(texto.charAt(i));
      }
      System.out.println("");

      System.out.println("**************************************** ****************************************");
      System.out.println("Minusculas convertidas en mayusculas y viceversa desde el texto original:");
      for (int i = 0; i < texto.length(); i++) {
         if (Character.isUpperCase(texto.charAt(i))) {
            System.out.print(Character.toLowerCase(texto.charAt(i)));
         } else
            System.out.print(Character.toUpperCase(texto.charAt(i)));
      }
      System.out.println("");

      System.out.println("**************************************** ****************************************");
      System.out.println("Caracteres en blanco eliminados desde el proceso anterior:");
      for (int i = 0; i < texto.length(); i++) {
         if (!texto.substring(i, i+1).equals(" ")) {
            if (Character.isUpperCase(texto.charAt(i))) {
               System.out.print(Character.toLowerCase(texto.charAt(i)));
            } else
               System.out.print(Character.toUpperCase(texto.charAt(i)));
         }
      }
      System.out.println("");
   }
}