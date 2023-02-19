/*
kiểm tra số chính phương
input:số nguyên
output: cho biết n là số chính phương(sqrt(n) là số chính phương )
*/
package test;
import java.util.Scanner;
public class Cau1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n");
        n=sc.nextInt();
        float kq=(float)Math.sqrt(n);
        if(kq==(int)kq){
            System.out.println("la so chinh phuong");
        }else{
            System.out.println("khong la so chinh phuong");
        }
        
        
    }
    
    
}
