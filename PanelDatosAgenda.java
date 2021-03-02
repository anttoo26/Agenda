import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelDatosAgenda extends JPanel implements ActionListener
{
  JButton btnGuardar, btnBuscar, btnEditar, btnEliminar, btnMostrar;
  JTextField txtNombre, txtApellidos, txtTelefono, txtCorreo, txtFechaC, txtEditar, txtBuscar;
  ManejoPersonaAgenda datos = new ManejoPersonaAgenda();
  JFrameMostrarAgenda jfm;
  public PanelDatosAgenda()
  {
    setLayout(new GridLayout(10,4));
    JLabel lblNombre = new JLabel("Nombre: ", JLabel.RIGHT);
    txtNombre = new JTextField(20);
    add(lblNombre);
    add(txtNombre);
    
    JLabel lblApellidos = new JLabel("Apellidos: ", JLabel.RIGHT);
    txtApellidos = new JTextField(30);
    add(lblApellidos);
    add(txtApellidos);
    
    JLabel lblTelefono = new JLabel("Telefono: ", JLabel.RIGHT);
    txtTelefono = new JTextField(15);
    add(lblTelefono);
    add(txtTelefono);
    
    JLabel lblCorreo = new JLabel("Correo ", JLabel.RIGHT);
    txtCorreo = new JTextField(15);
    add(lblCorreo);
    add(txtCorreo);
    
    JLabel lblFechaC = new JLabel("Fecha de Cumpleaños: ", JLabel.RIGHT);
    txtFechaC = new JTextField(15);
    add(lblFechaC);
    add(txtFechaC);
    
    
    btnGuardar = new JButton("Dar de Alta");
    btnGuardar.addActionListener(this);
    btnBuscar = new JButton("Buscar");
    btnBuscar.addActionListener(this);
    btnEditar = new JButton("Editar");
    btnEditar.addActionListener(this);
    btnEliminar= new JButton("Eliminar");
    btnEliminar.addActionListener(this);
    btnMostrar= new JButton("Mostrar");
    btnMostrar.addActionListener(this);
    add(btnGuardar);
    add(btnBuscar);
    add(btnEditar);
    add(btnEliminar);
    add(btnMostrar);
  }//Método Constructor
  
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource() == btnGuardar) 
      {
         if(txtNombre.getText() == null || txtNombre.getText().isEmpty())
         {
          JOptionPane.showMessageDialog(null, "Debe de ir al menos el nombre de la persona",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.requestFocus();
         }
        else
         if(txtTelefono.getText() == null || txtTelefono.getText().isEmpty())
         {
          JOptionPane.showMessageDialog(null, "Se debe de colocar el teléfono de la persona",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtTelefono.requestFocus();
         }
        else
          {
           datos.agregar(txtNombre.getText(), txtApellidos.getText(),txtTelefono.getText(),
           txtCorreo.getText(),txtFechaC.getText());
           JOptionPane.showMessageDialog(null, "Se guardarán los datos",
           "Aviso", JOptionPane.INFORMATION_MESSAGE);	
           txtNombre.setText("");
           txtApellidos.setText("");
           txtTelefono.setText("");
           txtCorreo.setText("");
           txtFechaC.setText("");
           txtNombre.requestFocus();
           // datos.mostrar();
           }
         }
  }
}