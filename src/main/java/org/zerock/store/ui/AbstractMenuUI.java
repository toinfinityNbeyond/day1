package org.zerock.store.ui;

import lombok.AllArgsConstructor;
import org.zerock.store.StoreService;

import java.util.Scanner;

@AllArgsConstructor
abstract class AbstractMenuUI {

    private Scanner scanner;
    protected StoreService storeService;

    protected String readLine(String str){
        System.out.println(str);
        return scanner.nextLine();
    }

    protected int readInt(String str){
        System.out.println(str);
        return Integer.parseInt(scanner.nextLine());
    }

    protected Double readDouble(String str){
        System.out.println(str);
        return Double.parseDouble(scanner.nextLine());
    }

    public abstract void doJob();


}