package Aula_4.TP;

public class TP {
    public class Complex{
        private double real, imaginary;

        public Complex(double r, double i){
            this.real = r;
            this.imaginary = i;
        }

        public double getReal() {
            return real;
        }
        
        public double getImaginary() {
            return imaginary;
        }

        public void showComplex(){
            System.out.println(real + " + " + imaginary + "i");
        }
    }

    public static void main(String[] args) {
        
    }
    
}
