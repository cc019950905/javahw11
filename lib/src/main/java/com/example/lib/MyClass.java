package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int []a=new int[3];
        if(x>y){
            if(x>z){
                if(y>z){
                    a[0]=z;
                    a[1]=y;
                    a[2]=x;
                }else{
                    a[0]=y;
                    a[1]=z;
                    a[2]=x;
                }

            }
        }if(y>x){
            if(y>z){
                if(x>z){
                    a[0]=z;
                    a[1]=x;
                    a[2]=y;
                }else{
                    a[0]=x;
                    a[1]=z;
                    a[2]=y;
                }
            }
        }if(z>x){
            if(z>y){
                if(y>x){
                    a[0]=x;
                    a[1]=y;
                    a[2]=z;
                }else{
                    a[0]=y;
                    a[1]=x;
                    a[2]=z;
                }
            }
        }
        for(int b:a){
            System.out.println(b+" ");
        }

    }
}
