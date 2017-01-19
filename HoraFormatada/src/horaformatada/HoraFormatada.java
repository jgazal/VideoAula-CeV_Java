package horaformatada;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class HoraFormatada {
    public static void main(String[] args) {
        DateFormat relogioFormatado = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
        Date relogio = new Date(); 
        System.out.println(relogioFormatado.format(relogio)); 
    }  
}