package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Cliente;
import modelo.MetodosNodo;
import vista.FRM_Migracion;

public class Controlador_FRM_Migracion implements ActionListener
{
    MetodosNodo metodosNodo;
    FRM_Migracion fRM_Migracion;
    
    public Controlador_FRM_Migracion(FRM_Migracion fRM_Migracion) 
    {
        metodosNodo=new MetodosNodo();
        this.fRM_Migracion=fRM_Migracion;
    }

   
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equalsIgnoreCase("Registrar"))
        {
            System.out.println("Registrar");
            String[] info=fRM_Migracion.getInformacionCliente();
            Cliente cliente=new Cliente(info[0],info[1],info[2],Integer.parseInt(info[3]), info[4]);
            if(info[2].equalsIgnoreCase("Normal"))
                metodosNodo.agregarCliente(cliente);
            else
                metodosNodo.agregarPrimerCliente(cliente);
            
            fRM_Migracion.resetGUI();
        }
        
        if(e.getActionCommand().equalsIgnoreCase("Cancelar"))
        {
            System.out.println("Cancelar");
            
            if(metodosNodo.consultar(fRM_Migracion.getInformacionCliente()[0]))
            {
                metodosNodo.eliminar();
                fRM_Migracion.mensaje("Se eliminó exitosamente");
            }
            else
                fRM_Migracion.mensaje("Este cliente no se encuentra registrado");
            fRM_Migracion.resetGUI();
        }
        
        
        if(e.getActionCommand().equalsIgnoreCase("Limpiar"))
        {
            System.out.println("Cancelar");
            
           fRM_Migracion.limpiarPizarra2();
        }
        
        if(e.getActionCommand().equalsIgnoreCase("Generar Reporte"))
        {
            
            if(metodosNodo.tamano()>0)
            {
                fRM_Migracion.colocarCantPersonas(metodosNodo.tamano()+"");
                fRM_Migracion.colocarPromedio(metodosNodo.getPromedioEdad()+"");
                fRM_Migracion.mostarReporte(metodosNodo.consultaGeneral());
            }
            else
                fRM_Migracion.mensaje("No hay Clientes en Espera");
        }
        
        if(e.getActionCommand().equalsIgnoreCase("Modificar"))
        {
            if(metodosNodo.consultar(fRM_Migracion.getInformacionCliente()[0]))
            {
                metodosNodo.modificar(fRM_Migracion.getInformacionCliente());
                fRM_Migracion.mensaje("Se Modificó exitosamente");
            }
            else
                fRM_Migracion.mensaje("Este cliente no se encuentra registrado");
            fRM_Migracion.resetGUI();
        }
        
        if(e.getActionCommand().equals("Atendiendo"))
        {
            if(metodosNodo.size()>0)
            {
                fRM_Migracion.mostrarEnPantalla(metodosNodo.getPrimero().getInformacion());
                metodosNodo.eliminarAtendido();
            }
            else
                fRM_Migracion.mostrarEnPantalla("No hay más Clientes en la Fila");
        }
         if(e.getActionCommand().equals("<"))
        {
            
            String arreglo[] = new String[5];
            metodosNodo.ordenarMenorAMayor();
            fRM_Migracion.limpiarTabla();
            for (int i = 0; i < metodosNodo.size(); i++)
            {
                arreglo[0] = metodosNodo.getCliente(i).getCedula();
                arreglo[1] = metodosNodo.getCliente(i).getNombre();
                arreglo[2] = metodosNodo.getCliente(i).getEdad()+"";
                arreglo[3] = metodosNodo.getCliente(i).getFecha();
                arreglo[4] = metodosNodo.getCliente(i).getPrioridad();
                fRM_Migracion.colocarFilas(arreglo);
            }  
        }
        if(e.getActionCommand().equals(">"))
        {
            String arreglo[] = new String[5];
            metodosNodo.ordenarMayorAMenor();
            fRM_Migracion.limpiarTabla();
            for (int i = 0; i < metodosNodo.size(); i++)
            {
                arreglo[0] = metodosNodo.getCliente(i).getCedula();
                arreglo[1] = metodosNodo.getCliente(i).getNombre();
                arreglo[2] = metodosNodo.getCliente(i).getEdad()+"";
                arreglo[3] = metodosNodo.getCliente(i).getFecha();
                arreglo[4] = metodosNodo.getCliente(i).getPrioridad();
                fRM_Migracion.colocarFilas(arreglo);
            }    

        }

    }
    
}
