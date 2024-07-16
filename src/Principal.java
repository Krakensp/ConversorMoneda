import javax.swing.*;
import java.util.ArrayList;

public class Principal {


        public static void main(String[] args) {

            Object[]options ={"Conversor de monedas", "Conversor de temperaturas"};


            var dollar = new Moneda("Dollar",17.66);
            var euro = new Moneda("Euro",19.25);
            var libra = new Moneda("Euro",22.91);
            var yen = new Moneda("Yen",22.91);
            double valorConvertido=0;

            ArrayList<Moneda> divisas = new ArrayList<>();
            divisas.add(dollar);
            divisas.add(euro);
            divisas.add(libra);
            divisas.add(yen);

            Object[] optionsDivisas ={"Euro","Dollar","Yen","Libra"};


            Object selectionObject = JOptionPane.showInputDialog(null,"Choose","Menu",
                    JOptionPane.PLAIN_MESSAGE, null ,options,options[0]);
            String selectionString = selectionObject.toString();
            System.out.println(selectionString);

            if(selectionString.equals("Conversor de monedas")){
                Object value = JOptionPane.showInputDialog(null,"Elije la moneda a la que deseas convertir tu dinero","Monedas",
                        JOptionPane.PLAIN_MESSAGE, null , optionsDivisas, optionsDivisas[0]);

                int cantidad= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir a " + value.toString()));


                for(Moneda item:divisas){
                    if(item.getNombre().equals(value.toString())){
                        valorConvertido = item.convierteADivisa(cantidad);
                    }
                }
                JOptionPane.showMessageDialog(null,"La cantidad es " + valorConvertido +" " + (value.toString()));
            }

        }
    }

