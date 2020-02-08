public class Complex {

    
    public double real;
    public double imag;
    

    public Complex(double real, double imag){
        this.real += real;
        this.imag += imag;
        
    }
    public void add(Complex num, Complex num2){
        this.real = num.real + num2.real;
        this.imag = num.imag + num2.imag;
    }
    public void subtract(Complex num, Complex num2){
        this.real = num.real - num2.real;
        this.imag = num.imag - num2.imag;
    }
    public void print(){
        System.out.println(real + " " + imag +"i");
    }
    
    public static void main(String[] args) {
        Complex c1 = new Complex(8.0, 8.5);
        Complex c2 = new Complex(9.0, 4.5);
        Complex result = new Complex(8.0, 4.5);
        result.add(c1,c2);

        result.print();

        result.subtract(c1,c2);
        result.print();
}
}