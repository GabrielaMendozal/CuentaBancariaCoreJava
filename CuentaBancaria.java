

public class CuentaBancaria{

    private double saldoCorriente;
    private double saldoAhorro;
    private int numeroDeCuenta;
    private static int cantidadCuentas = 0;

    public CuentaBancaria(double saldoCorriente,double saldoAhorro,int numeroDeCuenta){
        this.saldoCorriente = saldoCorriente;
        this.saldoAhorro = saldoAhorro;
        this.numeroDeCuenta = numeroDeCuenta;
        cantidadCuentas ++;
    }

    public static int cuentasCount(){
        return cantidadCuentas;
    }


    
    public double getSaldoCuentaCorriente(){
        return this.saldoCorriente;
    }

    public double getSaldoAhorro(){
        return this.saldoAhorro;
    }

    public int getNumerodeCuenta(){
        return this.numeroDeCuenta;
    }

    public void setSaldoCuentaCorriente(double saldoCorriente){
        this.saldoCorriente = saldoCorriente;
    }

    public void setSaldoAhorro(double saldo_ahorro){
        this.saldoAhorro = saldoAhorro;
    }

    public void setNumerodeCuenta( int numerodecuenta){
        this.numeroDeCuenta = numeroDeCuenta;
    }


    public void depositarcc(double monto){
        this.saldoCorriente += monto;
    }

    public void depositarca(double monto){
        this.saldoAhorro += monto;
    }

    public void retirarcc(double monto){
        if (saldoCorriente > 0){
        this.saldoCorriente -= monto;
        }
    }

    public void retirarca(double monto){
        if (saldoAhorro > 0){
        this.saldoAhorro -= monto;
        }        
    }

    public String toString(){
        return "N° de cuenta: " + this.numeroDeCuenta + "\n" + 
        "Cuenta corriente: " + this.saldoCorriente + "\n" +
        "Cuenta de ahorros: " + this.saldoAhorro + "\n";
    }

}
