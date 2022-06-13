package Aula_7.Ex1;

public class Retangulo extends Forma{
    public double comprimento, altura;

    public Retangulo(double c, double h){
        this.comprimento = c;
		this.altura = h;
    }

    public void setRetangulo(double c, double h){
        this.comprimento = c;
		this.altura = h;
    }

	public void setAltura(double h){
		this.altura = h;
    }

	public void setComprimento(double c){
        this.comprimento = c;
    }
	
	public double getComprimento() {
		return comprimento;
	}

	public double getAltura() {
		return altura;
	}

	public static Boolean values(double comprimento, double altura){
        boolean valid = false;
        if(comprimento>0 && altura>0){
            valid = true;
        }
        return valid;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
 
        if (!(o instanceof Retangulo)) {
            return false;
        }
        
        Retangulo r = (Retangulo) o;
        
        return Double.compare(altura, r.altura) == 0
                && Double.compare(comprimento, r.comprimento) == 0
                && cor.equalsIgnoreCase(r.cor);
    }

    @Override
	public String toString() {
		if(Boolean.TRUE.equals(values(comprimento, altura)))
			return String.format ("Comprimento: %s || Altura: %s || Cor: %S", this.comprimento, this.altura, this.cor);
		else{
			return "Valores inválidos!";
		}
	}
	
	public double perimetro () {
		return 2 * comprimento + 2 * altura;
	}

	public double area () {
		return comprimento * altura;
	}
}
