package menuOpcoes;

public class somatoria{


    public float calcAritmetica(float nota1, float nota2) {
        return (nota1+nota2)/2.0f;
    }
    public float calcPonderada(float nota1, int peso1,
                                        float nota2, int peso2,
                                        float nota3, int peso3) {
        return ((nota1*peso1)+(nota2*peso2)+(nota3*peso3))/(peso1+peso2+peso3);
    }

}
