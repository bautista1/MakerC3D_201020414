package org.compi2.codigo3d.parser;

/**
 *
 * @author esvux
 */
public class ControlC3D {
    
    private static int temp = 0;
    private static String c3d = "";
    private static int contEtiqueta=0;
    private static String etiqueta="";
    private static String eV="";
    private static String eF="";
    private static int pre=0;
    /**
     * Reinicia las variables estáticas relacionadas con la generación del
     * código de tres direcciones.
     */
    public static void reiniciar(){
        temp = 0;
        c3d = "";
        contEtiqueta=0;
        etiqueta="";
        eV="";
        eF="";
        pre=0;
    }
    
    /**
     * Genera el siguiente temporal.
     * @return El siguiente temporal (t$#)
     */
    public static String generaTemp(){
        return "t$"+temp++;
    }
    
    /**
     * Agrega la sentencia que recibe como parámetro a la cadena de código
     * de tres direcciones que se va generando hasta ese momento.
     * @param sentencia Código 3D a agregar
     */
    public static void agregarC3D(String sentencia){
        c3d += sentencia;
    }
    
    /**
     * Devuelve el código 3D generao hasta el momento de su invocación.
     * @return Código 3D generado
     */
    public static String getC3D(){
        return c3d;
    }
    
    public static String genEtiqueta(){
        return "L"+contEtiqueta++;
    }
    
    public static void almacenarEv(String ev){
        eV+=","+ev;
    }
    public static void almacenarEf(String ef){
        eF+=","+ef;
    }
    
    public static void formatearEv(){
        eV="";
    }
    
    public static void formatearEf(){
        eF="";
    }
    
    public static String getEv(){
        return eV;
    }
    
    public static String getEf(){
        return eF;
    }

    public static int getPre() {
        return pre;
    }

    public static void setPre(int pre) {
        ControlC3D.pre = pre;
    }
    
    
}
