package oo.composicao.AulaCarro;

public class Motor {

    public boolean desligar;
    //Motor liga e esta definido por 1
    double fatorInjecao = 1;
    boolean ligado = false;

    int giros() {
        if (!ligado) {
            return 0;
        } else {
            //Fator injeção é double, então precisa usar o math.round para arredondar;
            return (int) Math.round(fatorInjecao * 3000);
        }
    }

}
