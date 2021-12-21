/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS TUF GAMING A15
 */
public class test_akar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        int angka1;
//        int angka2;
//        double hasil;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("masukkan bilangan pertama");
//        angka1 = scan.nextInt();
//        
//        
//        System.out.println("masukkan bilangan kedua");
//        angka2 = scan.nextInt();
//        
//        
//        hasil = Math.sqrt(Math.pow(angka1,2)+Math.pow(angka2, 2));
//        
//        System.out.println("hasil rumus pytagoras adalah: " + hasil);


//        int a = 10;
//        double b =0.6;
//        double c = a*b;
//        System.out.println(c);


//        double a = 0.5;
//        double b = 1.5;
//        double c = 2.5;
//        
//        List max = new ArrayList();
//        max.add(a);
//        max.add(b);
//        max.add(c);
//        
//        double d = (double) Collections.min(max);
//        if(d==c){
//            System.out.println("benar");
//        }else{
//            System.out.println("salah");
//        }
//        System.out.println(Collections.max(max));
//        System.out.println(Collections.min(max));
//        System.out.println(d);
        List V = new ArrayList();
        V.add(10);
        V.add(20);
        V.add(90);
        V.add(1);
//        double nilai_v = (double) Collections.max(V);
        Collections.sort(V,Collections.reverseOrder());
        Object[] coba = V.toArray();
        String tkj = coba[0].toString();
        System.out.println(coba[0]); 
        System.out.println(tkj);
    }

}
