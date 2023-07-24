public class Act_8_Ejer_CalcDesc {
    public static void main(String[] args) {
    //test descuento

//María es propietaria de una tienda de ropa y le gustaría crear un programa que calcule el valor final del producto después de aplicar un descuento que ofrecería a sus clientes.
//Si el valor de la compra está entre $100.0 y $199.99, el descuento es del 10%.
//Si el valor de la compra está entre $200.0 y $299.99, el descuento es del 15%.
//Para compras superiores a $300.0, el descuento es del 20%.
        double valorCompra = 300.0;
        // ifs aqui
        if(valorCompra > 300){
            System.out.println("valor del articulo: " + valorCompra +" descuento es de 20%");
        }else if(valorCompra >= 100 && valorCompra < 200){
            System.out.println("valor del articulo: " + valorCompra +" descuento es de 10%");
        } else if (valorCompra >= 200 && valorCompra <300) {
            System.out.println("valor del articulo: " + valorCompra +" descuento es de 15%");
        } else{
            System.out.println("no hay descuento");
        }
    }
}