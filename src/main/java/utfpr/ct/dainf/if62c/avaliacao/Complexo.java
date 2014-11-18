package utfpr.ct.dainf.if62c.avaliacao;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Primeira avaliação parcial 2014/2.
 * @author 
 */
public class Complexo {
    private double real;
    private double img;

    public Complexo() {
    }

    public Complexo(double a, double b) {
        public double real = a;
        public double img = b;
    }

    public getReal() {
        return real;
    }

    public getImg() {
        return img;
    }

    public Complexo soma(Complexo c) {
        return new Complexo(real + c.real, img + c.img);
    }
    
    public Complexo sub(Complexo d) {
        return new Complexo(real - d.real, img - d.img);
    }

    public Complexo prod(double e) {
        return new Complexo(real * e, img * e);
    }

    public Complexo prod(Complexo f) {
        return new Complexo(real * f.real - img * f.img, img * f.real + real * f.img);
    }
    
    public Complexo div(Complexo g) {
        return new Complexo((real * g.real + img * g.img)/(g.real * g.real + g.img * g.img),
        (img * g.real - real * g.img)/(g.real * g.real + g.img * g.img));
    }
    
    public Complexo[] sqrt() {
        p = Math.sqrt(real * real + img * img);
        if (real > 0)      {i = Math.atan(img/real);}
        else if (real < 0) {i = Math.atan(img/real) + Math.PI;}
        else {
            if (img == 0) {i = 0;}
            else if (img > 0) {i = Math.PI/2;}
            else {i = 3*Math.PI/2}
        }
        oi = i/2;
        oii = i/2 + Math.PI;
        Complexo[] r = new Complexo[2];
        r[0].real = p * Math.cos(oi)
        r[0].img = p * Math.sin(oi)
        r[1].real = p * Math.cos(oii)
        r[1].img = p * Math.sin(oii)
        return r;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (int) (Double.doubleToLongBits(real)
            ^ (Double.doubleToLongBits(real) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(img)
            ^ (Double.doubleToLongBits(img) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        final Complexo c = (Complexo) obj;
        return obj != null && getClass() == obj.getClass()
            && real == c.real && img == c.img;
    }

    @Override
    public String toString() {
        return String.format("%+f%+fi", real, img);
    }
}
