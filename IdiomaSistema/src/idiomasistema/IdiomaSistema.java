package idiomasistema;

import java.util.*;

public class IdiomaSistema {

    public static void main(String[] args) {       
        Locale loc = Locale.getDefault();
        System.out.println("O idioma do sistema é ");
        System.getProperties();
        System.out.println(System.getProperty("user.language"));
    }
    
}
