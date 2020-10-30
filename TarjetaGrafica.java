public class TarjetaGrafica {
     
    //Gama de la tarjeta grafica: baja, media o alta
    private String gama;
    //Cantidad de RAM que tiene
    private int cantidadRam;
    //La grafica funciona o no
    private boolean funciona;
    
    /**
     * Contructor que crea un objeto de tarjeta grafica con los siguientes atributos.
     */
    public TarjetaGrafica(String tipoGama, int cantidadDeRam){
        gama = tipoGama;
        cantidadRam = cantidadDeRam;
        funciona = true;
    }
    
    /**
     * Devuelve el valor del atributo gama.
     */
    public String getGama(){
        return gama;        
    }
    
    /**
     * Devuelve el valor del atributo cantidadRam.
     */
    public int getRam(){
        return cantidadRam;        
    }
    
    /**
     * Devuelve el valor del atributo funciona.
     */
    public boolean getFunciona(){
        return funciona;        
    }
    
    /**
     * Cambia el valor del atributo gama.
     */
    public void setGama(String cambiaGama){
        gama = cambiaGama;
    }
    
    /**
     * Realiza una operacion para cambiar el valor del atributo cantidadRam.
     */
    public void cambiaRam(int cantidadDeRam){
        cantidadRam += cantidadDeRam;
    }
    
    /**
     * Cambia el valor del atributo booleano funciona.
     */
    public void cambiaFunciona(){
        if (funciona != false) {
            funciona = false;
        } else {
            funciona = true;
        }
    }
    
    /**
     * Imprime por pantalla los detalles del objeto.
     */
    public void imprimeDetalles(){
        System.out.println("Gama: " + gama + " | Cantidad de RAM: " + cantidadRam + "GB de RAM | Funciona: " + funciona);
    }
    
    /**
     * Devuelve un String con los valores del atributo.
     */
    public String estado(){
        String estadoGrafica ="Gama: " + gama + " | Cantidad de RAM: " + cantidadRam + "GB de RAM | Funciona: " + funciona;
        return estadoGrafica;
    }
}