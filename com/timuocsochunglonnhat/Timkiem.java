package com.timuocsochunglonnhat;
import java.util.Scanner;
public class Timkiem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap a:");
        int a=scanner.nextInt();
        System.out.println("Nhap b:");
        int b=scanner.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if (a==0 || b==0){
            System.out.println("khong co uoc chung lon nhat");
        }

        while (a != b){
            if (a > b){
                a = a -b;
            }else {
                b = b-a;
            }
        }
        System.out.println("uoc chung lon nhat la: "+a);
    }
}
