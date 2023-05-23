package ex01;

public class Hyundai extends Carro{
    public Hyundai(String modelo, int ano, double valor, String cor, int portas) {
        super(modelo, ano, valor, cor, portas);
    }

    @Override
    public void iniciarpartida() {
        setVelocidade(5);
        System.out.println("Iniciando o motor... minha velocidade está em " + getVelocidade());
    }

    @Override
    public void frear() {
        double aux = getVelocidade();
        setVelocidade(aux - 2);
        System.out.println("Freando... minha velocidade está em " + getVelocidade());
    }

    @Override
    public void acelerar() {
        double aux = getVelocidade();
        setVelocidade(aux + 15);
        System.out.println("Acelerando... minha velocidade está em " + getVelocidade());
    }
}
