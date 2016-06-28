/*
Desarrollado: Brahian Velazquez Tellez
 clase para desarrollar el reporte
 */
package Clases;
import java.net.URL;
import java.sql.Connection;
import java.util.Map;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
public class Reporte {
    private Connection conn = null;
    public Reporte(Connection conn){ this.conn = conn;}
    //imprimir programacion utilizando las librerias de ireport
    public void ver_reporte(String carnet_universitario, String contra, String nombre, String matricula){
        JasperReport reporte;
        JasperPrint verReporte;
        try{
            //cargamos el aechivo de jasper con la clase URL y JRLoader
            URL ruta = this.getClass().getResource("/reporte/Reporte_intento.jasper");
            reporte = (JasperReport) JRLoader.loadObject(ruta);
            //creamos un objeto HaspMAp
            Map parametros = new HashMap(){};
            parametros.clear();
            parametros.put("pCarnetUniversitario", carnet_universitario);
            parametros.put("pContra" , contra);
            parametros.put("pNombre", nombre);
            parametros.put("pMatricula", matricula);
            verReporte = JasperFillManager.fillReport(reporte, parametros,conn);
            JasperViewer.viewReport(verReporte,false);
        }catch(JRException e){System.out.println(e);}
    }
}
