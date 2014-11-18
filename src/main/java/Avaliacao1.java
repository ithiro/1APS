/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Primeira avaliação parcial 2014/2.
 * @author 
 */
import utfpr.ct.dainf.if62c.*

public class Avaliacao1 {

    public static void main(String[] args) {
        // implementar main
    }
    
    public static Complexo[] raizesEquacao(Complexo a, Complexo b, Complexo c) {
        Complexo[] m = new Complexo[2];
        Complexo[] delta = new delta[2]; 
        delta[0] = sqrt((b.prod(b)).sub((a.prod(c)).prod(4)))[0];
        delta[1] = sqrt((b.prod(b)).sub((a.prod(c)).prod(4)))[1];
        b.real = -b.real; b.img = -b.img;
        m[0] = (b.sum(delta[0])).div(a.prod(2));
        m[1] = (b.sum(delta[1])).div(a.prod(2));
        return m;
    }
    
}
