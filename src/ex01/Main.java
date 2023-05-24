package ex01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();
        listaCarros.add(new Renault("Duster", 2022, 112990, "Prata", 4));
        listaCarros.add(new Fiat("Toro", 2023, 146990, "Vermelho", 4 ));
        listaCarros.add(new Hyundai("HB20", 2023, 80000, "Branco", 4));

        for(int i = 0; i < listaCarros.size(); i++){
            if(listaCarros.get(i) instanceof Renault){
                System.out.println("\n----- CARRO RENAULT -----");
            } else if(listaCarros.get(i) instanceof Fiat){
                System.out.println("\n----- CARRO FIAT -----");
            } else if(listaCarros.get(i) instanceof Hyundai){
            System.out.println("\n----- CARRO HYUNDAI -----");
            }
            System.out.println("Modelo: " + listaCarros.get(i).getModelo() + "\nAno: " + listaCarros.get(i).getAno() +
                    "\nValor: " + listaCarros.get(i).getValor() + "\nCor: " + listaCarros.get(i).getCor() + "\nPortas: "
                    + listaCarros.get(i).getPortas());
            listaCarros.get(i).iniciarpartida();
            listaCarros.get(i).acelerar();
            listaCarros.get(i).frear();
        }
    }

}
