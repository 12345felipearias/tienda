package Business;

import java.util.*;
import Data.*;
import GUI.*;
import javax.swing.table.DefaultTableModel;

public class CashRegisterEngine {

    static HashMap< String, Cajero> memoria = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    static Cajero cristian = new Cajero("1032492127", "Cristian", "3134402009", "", "2127");
    static Cajero daniel = new Cajero("1023955054", "Daniel", "3xxxxxxxxx", "", "5054");
    static Cajero brayan = new Cajero("1019071836", "Brayan", "3xxxxxxxxx", "", "1836");

    static void inicialize() {
        memoria.put(cristian.getId(), cristian);
        memoria.put(daniel.getId(), daniel);
        memoria.put(brayan.getId(), brayan);
    }

    static MenuUI menu = new MenuUI();
    static DefaultTableModel tableModelInvent = (DefaultTableModel) menu.getInventarioTable().getModel();

    static public Object[] row(int index, DefaultTableModel a) {
        Object filaData[] = new Object[7];
        for (int i = 0; i < filaData.length-1; i++) {
            filaData[i] = a.getValueAt(index, i);
        }
        for (int i = 0; i < filaData.length; i++) {
            System.out.println(filaData[i]);

        }
        return filaData;
    }

    public static void main(String[] args) {
        row(4, tableModelInvent);
//        inicialize();
//        System.out.println("*");
//        String entered = sc.next();
//        for(Cajero c : memoria.values()){
//            System.out.println("*");
//            if(c.getName().equals(entered)){
//                System.out.println("*");
//                MenuUI menu = new MenuUI();
//                menu.setVisible(true);
//                //menu.setCuenta(c);
//            }else{
//                System.out.println("Error");
//            }
//        }
    }
}
