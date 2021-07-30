package org.zerock.store.ui;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("하고싶은 일은..");

        String oper = scanner.nextLine();

        switch (oper){
            case "1":
                System.out.println("메뉴 이름이 뭐야?");
                String menuName = scanner.nextLine();


                break;
            case "2":

                System.out.println("현재 위도?");
                double lat = Double.parseDouble(scanner.nextLine());

                System.out.println("현재 경도?");
                double lng = Double.parseDouble(scanner.nextLine());

                break;
        }



    }
}