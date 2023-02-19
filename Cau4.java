/*
viết chương trình xóa phần tử x (nếu có)
input:mảng 1 chiều số nguyên a,phan tu x
output:mảng sau khi xóa x(nếu có)
xuất mảng theo giá trị tăng dần
 */
package test;

import java.util.Arrays;
import java.util.Scanner;


public class Cau4 {
    public static void main(String[] args) {
        int[] mang;
        int a;
        int x;
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap so phan tu trong mang: ");
        a=sc.nextInt();
        mang= new int[a];
        for(int i=0;i<mang.length;i++){
            System.out.print("nhap phan tu thu " +i+":");
            mang[i]= sc.nextInt();
        }
        System.out.println("nhap gia tri can xoa");
        x=sc.nextInt();
        int viTriXoa=timViTriXoa(mang, x);
        if(viTriXoa==-1){
            System.out.println("gia tri khong co trong mang");                    
        }else{
            for(int i=viTriXoa;i<a-1;i++){
                mang[i]=mang[i+1];
            }
        a--;
        }
        Arrays.sort(mang);
        System.out.println("mang sau khi xoa "+x);
        for(int i=0;i<a;i++){
            System.out.print(mang[i]+ " ");
        }
    }        
    static int timViTriXoa(int[] mang,int x){
            int viTri=-1;
            for(int i=0;i<mang.length;i++){
                if(mang[i]==x){
                    viTri=i;
                }
            }
             
            return viTri;
    }
}  
   