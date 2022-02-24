public class TestCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria(0.0, 0.0,123);
        CuentaBancaria cuenta2 = new CuentaBancaria(0.0, 0.0, 456);
        
        System.out.println(CuentaBancaria.cuentasCount());


    //tiene saldo en ambas cuentas y puede retirar
        cuenta1.depositarcc(1000.10);
        cuenta1.depositarca(500.50);
        System.out.println(cuenta1.toString());
        cuenta1.retirarcc(50.20);
        cuenta1.retirarca (15.30);
        System.out.println(cuenta1.toString());



    // no tiene saldo en una cuenta y no puede retirar
        cuenta2.depositarcc(200.50);
        cuenta2.retirarcc(10.10);
        cuenta2.retirarca(100.20);
        System.out.println(cuenta2.toString());
    }
}