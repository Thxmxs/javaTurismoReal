/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method;

import Database.Conexion;
import java.sql.Connection;
import javax.swing.WindowConstants;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class reportesMethod {
    
        private static Connection conn;
    public void crearReporteReservas(){
        
        try {
            conn = Conexion.getConnection();
            JasperReport reporte = null;
            String ruta = "src\\Reports\\ReporteReservas.jasper";
            reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            
            JasperPrint imprimirReporte = JasperFillManager.fillReport(reporte, null, conn);
            JasperViewer vistaReporte = new JasperViewer(imprimirReporte,false);//false para que no se cierre el programa al cerrar el reporte
            vistaReporte.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            vistaReporte.setVisible(true);
        } catch (Exception e) {
            System.err.println(e);
        }
    
    }
    
        public void crearReportePagos(){
        
        try {
            conn = Conexion.getConnection();
            JasperReport reporte = null;
            String ruta = "src\\Reports\\reportePagos.jasper";
            reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            
            JasperPrint imprimirReporte = JasperFillManager.fillReport(reporte, null, conn);
            JasperViewer vistaReporte = new JasperViewer(imprimirReporte,false);//false para que no se cierre el programa al cerrar el reporte
            vistaReporte.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            vistaReporte.setVisible(true);
        } catch (Exception e) {
            System.err.println(e);
        }
    
    }
}
