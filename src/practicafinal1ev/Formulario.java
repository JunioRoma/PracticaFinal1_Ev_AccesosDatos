/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafinal1ev;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author Junior
 */
public class Formulario extends javax.swing.JFrame {

//    MakeXpath ventanaXpath = new MakeXpath();
//    MakeJAxbSax ventanaJaxbSax = new MakeJAxbSax();
//    File ficheroXml;
//    int valorDeGuardado = 0; //nos permite alternar entre uno y otro para llamar al método de guardado correspondiente
    File ficheroXml;
    dom gesDom = new dom();
    sax gesasx = new sax();
    jaxb gesJaxb = new jaxb();
    xpath gesXpath = new xpath();

    public Formulario() {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.cyan);
    }

//    @Override
//    public Image getIconImage() {
//        Image hola = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/images_1.png"));
//        return hola;
//    }
    private void AbrirSaxOnClick(java.awt.event.MouseEvent evt) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            ficheroXml = fileChooser.getSelectedFile();
        }
    }

//    private File abrirJFile() {
//        File fichero = null;
//        int rv;
//
//        try {
//            JFileChooser fc = new JFileChooser();
//            //Nos impide seleccionar más de un archivo.
//            fc.setMultiSelectionEnabled(false);
//            fc.setDialogType(JFileChooser.OPEN_DIALOG);
//            rv = fc.showOpenDialog(this);
//
//            if (rv == JFileChooser.APPROVE_OPTION) {
//                fichero = fc.getSelectedFile();
//            }
//        } catch (NullPointerException e) {
//            System.out.println("No se puedo mostrar el xml");
//            return null;
//        }
//
//        return fichero;
//
//    }
//
//    private File guardarJFile() {
//        File fichero = null;
//        int rv;
//
//        try {
//            JFileChooser fc = new JFileChooser();
//            //Nos impide seleccionar más de un archivo.
//            fc.setMultiSelectionEnabled(false);
//            fc.setDialogType(JFileChooser.SAVE_DIALOG);
//            rv = fc.showSaveDialog(this);
//
//            if (rv == JFileChooser.SAVE_DIALOG) {
//                fichero = fc.getSelectedFile();
//                ventanaJaxbSax.guardarMemoria_XML_JAXB();
//            }
//        } catch (NullPointerException e) {
//            System.out.println("No se puedo mostrar el xml");
//            return null;
//        }
//
//        return fichero;
//
//    }
//
//    private void guardaArchivo() {
//        JFileChooser fc = new JFileChooser(); //Creamos un nuevo objeto fileChooser
//        fc.setMultiSelectionEnabled(false); //Nos impide seleccionar más de un archivo.
//        fc.setDialogType(JFileChooser.OPEN_DIALOG); //Abrimos el fileChooser
//        //En un int guardamos el valor que nos da cuando el usuario elige un archivo
//        int seleccion = fc.showSaveDialog(this);
//
//        if (seleccion == JFileChooser.APPROVE_OPTION) {
//            //Si llego aquí es que el usuario ha pulsado en guardar cuando ha salido el menú de jFileChooser.
//            //Tenemos la opción de guardar el contenido sobre un fichero.
//            File archivo = fc.getSelectedFile(); //Obtiene el archivo seleccionado
//            String nombre = archivo.getName(); //Obtiene el nombre del archivo seleccionado
//            //Necesitamos saber si es un png o un jpg. La extensión, para poder guardarlo y que no de error.
//            //Para ello declaramos un string y tomamos un substring del nombre del archivo, tomando como referencia
//            //el lastIndex del punto +1. Esto es para que no dé error.
//            String extension = nombre.substring(nombre.lastIndexOf('.') + 1);
//            //Si la extensión es xml, ejecuta.
//            if (extension.equalsIgnoreCase("xml")) {
//                if (valorDeGuardado == 1) {  //Esto nos va a permitir alternar entre uno u otro dependiendo
//                    ventanaJaxbSax.guardarDomComoFile(nombre);  //de si hemos usado JaxB o Dom para generar los datos.
//                } else if (valorDeGuardado == 2) {       //El valor se asigna cuandos se usa el botón de añadir datos
//                    ventanaJaxbSax.guardarMemoria_XML_JAXB();      //o el de editar datos.
//                }
//            }
//        }
//
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panelDeTexto = new javax.swing.JTextPane();
        MostradorDePanorama = new javax.swing.JLabel();
        marca = new javax.swing.JTextField();
        anio = new javax.swing.JTextField();
        potencia = new javax.swing.JTextField();
        combustible = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        seguridad = new javax.swing.JTextField();
        traccion = new javax.swing.JTextField();
        tipo = new javax.swing.JTextField();
        peso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoBusqueda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BotonEjecutarXml1 = new javax.swing.JButton();
        BotonEjecutarXml2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        combustible1 = new javax.swing.JTextField();
        precio1 = new javax.swing.JTextField();
        seguridad1 = new javax.swing.JTextField();
        traccion1 = new javax.swing.JTextField();
        tipo1 = new javax.swing.JTextField();
        peso1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        modelo1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        marca1 = new javax.swing.JTextField();
        anio1 = new javax.swing.JTextField();
        potencia1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));
        setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        setForeground(new java.awt.Color(255, 0, 0));
        setIconImage(getIconImage());
        setIconImages(null);

        jScrollPane1.setViewportView(panelDeTexto);

        marca.setForeground(new java.awt.Color(153, 153, 153));
        marca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        marca.setText("MARCA");

        anio.setForeground(new java.awt.Color(153, 153, 153));
        anio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        anio.setText("AÑO DE SALIDA");

        potencia.setForeground(new java.awt.Color(153, 153, 153));
        potencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        potencia.setText("POTENCIA");

        combustible.setForeground(new java.awt.Color(153, 153, 153));
        combustible.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        combustible.setText("COMBUSTIBLE");

        precio.setForeground(new java.awt.Color(153, 153, 153));
        precio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        precio.setText("PRECIO");

        seguridad.setForeground(new java.awt.Color(153, 153, 153));
        seguridad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        seguridad.setText("NIVEL DE SEGURIDAD");

        traccion.setForeground(new java.awt.Color(153, 153, 153));
        traccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        traccion.setText("TRACCION");

        tipo.setForeground(new java.awt.Color(153, 153, 153));
        tipo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tipo.setText("TIPO");

        peso.setForeground(new java.awt.Color(153, 153, 153));
        peso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        peso.setText("PESO");

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAMPOS PARA MODIFICAR");

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        campoBusqueda.setForeground(new java.awt.Color(153, 153, 153));
        campoBusqueda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoBusqueda.setText("MODELO");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("FILTRAR POR:");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BotonEjecutarXml1.setText("MOSTRAR TODO");
        BotonEjecutarXml1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonEjecutarXml1MousePressed(evt);
            }
        });
        BotonEjecutarXml1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEjecutarXml1ActionPerformed(evt);
            }
        });

        BotonEjecutarXml2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practicafinal1ev/images_1.png"))); // NOI18N
        BotonEjecutarXml2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonEjecutarXml2MousePressed(evt);
            }
        });
        BotonEjecutarXml2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEjecutarXml2ActionPerformed(evt);
            }
        });

        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        combustible1.setForeground(new java.awt.Color(153, 153, 153));
        combustible1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        combustible1.setText("COMBUSTIBLE");

        precio1.setForeground(new java.awt.Color(153, 153, 153));
        precio1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        precio1.setText("PRECIO");

        seguridad1.setForeground(new java.awt.Color(153, 153, 153));
        seguridad1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        seguridad1.setText("NIVEL DE SEGURIDAD");

        traccion1.setForeground(new java.awt.Color(153, 153, 153));
        traccion1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        traccion1.setText("TRACCION");

        tipo1.setForeground(new java.awt.Color(153, 153, 153));
        tipo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tipo1.setText("TIPO");

        peso1.setForeground(new java.awt.Color(153, 153, 153));
        peso1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        peso1.setText("PESO");

        jLabel14.setBackground(new java.awt.Color(153, 153, 255));
        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("AÑADIR CAMPOS");

        modelo1.setForeground(new java.awt.Color(153, 153, 153));
        modelo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modelo1.setText("MODELO");

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("INSERTAR");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
        });

        marca1.setForeground(new java.awt.Color(153, 153, 153));
        marca1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        marca1.setText("MARCA");

        anio1.setForeground(new java.awt.Color(153, 153, 153));
        anio1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        anio1.setText("AÑO DE SALIDA");

        potencia1.setForeground(new java.awt.Color(153, 153, 153));
        potencia1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        potencia1.setText("POTENCIA");

        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton4.setText("Consultas Con Xpath;");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("MUESTRA POTENCIA");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("MUESTRA MARCA");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("MUESTRA COMBUSTIBLE");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jMenu1.setText("ABRIR ");

        jMenuItem1.setText("ABRIR");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("MOSTRAR");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MostradorDePanorama, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(709, 724, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 726, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotonEjecutarXml1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotonEjecutarXml2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(seguridad)
                                                    .addComponent(combustible, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(marca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(traccion)
                                                    .addComponent(precio, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                                    .addComponent(anio))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(peso, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(potencia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                                    .addComponent(tipo)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(campoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(seguridad1)
                                                    .addComponent(combustible1, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(marca1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(traccion1)
                                                    .addComponent(anio1)
                                                    .addComponent(precio1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tipo1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(peso1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(potencia1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                            .addComponent(modelo1))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)))
                        .addGap(51, 51, 51)
                        .addComponent(jLabel8)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MostradorDePanorama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(8, 8, 8)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(BotonEjecutarXml2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(15, 15, 15)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(anio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(combustible, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(seguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(traccion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2)
                                                .addGap(8, 8, 8)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(campoBusqueda)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(15, 15, 15)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(marca1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(anio1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(potencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(combustible1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(precio1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(peso1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(seguridad1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(traccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(modelo1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel17))))
                            .addComponent(jScrollPane1)))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonEjecutarXml1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(3, 3, 3)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            ficheroXml = fileChooser.getSelectedFile();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        gesasx.abrir_XML_SAX(ficheroXml);
        panelDeTexto.setText(gesasx.recorrerSAX());
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void BotonEjecutarXml2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEjecutarXml2MousePressed
        String buscar = campoBusqueda.getText();
        for (int i = 0; i < gesJaxb.pruebaCoche.size(); i++) {
            if (gesJaxb.pruebaCoche.get(i).getModelo().equals(buscar)) {
                gesJaxb.pruebaCoche.get(i).setModelo(campoBusqueda.getText());
                gesJaxb.pruebaCoche.get(i).setMarca(marca.getText());
                gesJaxb.pruebaCoche.get(i).setAnioSalida(anio.getText());
                gesJaxb.pruebaCoche.get(i).setPotencia(potencia.getText());
                gesJaxb.pruebaCoche.get(i).setCombustible(combustible.getText());
                gesJaxb.pruebaCoche.get(i).setPrecio(precio.getText());
                gesJaxb.pruebaCoche.get(i).setPeso(peso.getText());
                gesJaxb.pruebaCoche.get(i).setEstrellasSeguridad(seguridad.getText());
                gesJaxb.pruebaCoche.get(i).setTraccion(traccion.getText());
                gesJaxb.pruebaCoche.get(i).setTipoChasis(tipo.getText());

            }

        }
        gesJaxb.guardar_XML_JAXB(ficheroXml);

    }//GEN-LAST:event_BotonEjecutarXml2MousePressed

    private void BotonEjecutarXml2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEjecutarXml2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonEjecutarXml2ActionPerformed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed

        gesJaxb.abrir_XML_JAXB(ficheroXml);
        gesJaxb.recorrerJAXByMostrar();
        String buscar = campoBusqueda.getText();
        for (int i = 0; i < gesJaxb.pruebaCoche.size(); i++) {
            if (gesJaxb.pruebaCoche.get(i).getModelo().equals(buscar)) {
                campoBusqueda.setText(gesJaxb.pruebaCoche.get(i).getModelo());
                marca.setText(gesJaxb.pruebaCoche.get(i).getMarca());
                anio.setText(gesJaxb.pruebaCoche.get(i).getAnioSalida());
                potencia.setText(gesJaxb.pruebaCoche.get(i).getPotencia());
                combustible.setText(gesJaxb.pruebaCoche.get(i).getCombustible());
                precio.setText(gesJaxb.pruebaCoche.get(i).getPrecio());
                peso.setText(gesJaxb.pruebaCoche.get(i).getPeso());
                seguridad.setText(gesJaxb.pruebaCoche.get(i).getEstrellasSeguridad());
                traccion.setText(gesJaxb.pruebaCoche.get(i).getTraccion());
                tipo.setText(gesJaxb.pruebaCoche.get(i).getTipoChasis());

            }

        }

//        ventanaJaxbSax.abrir_XML_JAXB(ficheroXml);
//        String campoParaFiltrar = campoBusqueda.getText();
//        String[] dios = new String[9];
//        dios = ventanaJaxbSax.recorrerJaxB(campoParaFiltrar);
//
//        marca.setText(dios[0]);
//        anio.setText(dios[1]);
//        potencia.setText(dios[2]);
//        combustible.setText(dios[3]);
//        precio.setText(dios[4]);
//        peso.setText(dios[5]);
//        seguridad.setText(dios[6]);
//        traccion.setText(dios[7]);
//        tipo.setText(dios[8]);

    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed

        gesDom.abrir_XML_DOM(ficheroXml);
        gesDom.aniadirDom(ficheroXml, marca1.getText(), modelo1.getText(), anio1.getText(), potencia1.getText(), combustible1.getText(), precio1.getText(), peso1.getText(), seguridad1.getText(), traccion1.getText(), tipo1.getText());

// private File guardar(){
//        try{
//            JFileChooser fileChooser = new JFileChooser();
//            File ruta=null;
//            fileChooser.setMultiSelectionEnabled(false);
//            fileChooser.setDialogType(JFileChooser.SAVE_DIALOG);
//            int guardar = fileChooser.showSaveDialog(this);
//            if(guardar == JFileChooser.APPROVE_OPTION)
//                ruta = fileChooser.getSelectedFile();
//                gesJaxb.guardar_XML_JAXB(ruta);
//               
//        }
//        catch (Exception ex){
//            System.out.println("No se puede acceder al fichero");
//        }
//        return archivo;
//    }
//        //File fichero = abrirJFile();
//        String marca = marca1.getText();
//        String modelo = modelo1.getText();
//        String anioSalida = anio1.getText();
//        String potencia = potencia1.getText();
//        String combustible = combustible1.getText();
//        String precio = precio1.getText();
//        String peso = peso1.getText();
//        String estrellasSeguridad = seguridad1.getText();
//        String traccion = traccion1.getText();
//        String tipoChasis = tipo1.getText();
//        int temp = ventanaJaxbSax.editarJaxB(marca, modelo, anioSalida, potencia, combustible, peso, precio, peso, estrellasSeguridad, traccion, tipoChasis);
//        if (temp == 0) {
//            String aux[] = ventanaJaxbSax.recorrerJaxB(modelo);
//            String salida = "";
//            for (int i = 0; i < 10; i++) {
//                salida = salida + "\n" + aux[i];
//            }
//            panelDeTexto.setText(salida);
//        } else if (temp == -1) {
//            panelDeTexto.setText("Error al editar");
//        }
//
//        marca1.setText("");
//        modelo1.setText("");
//        anio1.setText("");
//        potencia1.setText("");
//        combustible1.setText("");
//        precio1.setText("");
//        peso1.setText("");
//        seguridad1.setText("");
//        traccion1.setText("");
//        tipo1.setText("");

    }//GEN-LAST:event_jLabel16MousePressed

    private void BotonEjecutarXml1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEjecutarXml1ActionPerformed
        String consultaGeneral = "/coches/coche";
        panelDeTexto.setText(gesXpath.EjecutaXPath(ficheroXml, consultaGeneral));
    }//GEN-LAST:event_BotonEjecutarXml1ActionPerformed

    private void BotonEjecutarXml1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEjecutarXml1MousePressed

//        //        String texto = BlocDeConsultas.getText();
//        //        ventanaXpath.EjecutaXPath(texto);
//        //
//        //        panelDeTexto.setText(ventanaXpath.EjecutaXPath(texto));
//        File fichero = abrirJFile();
//        String consulta = ""; //Aquí vamos a guardar el parámetro de entrada que le vamos a pasar.
//        String verModelo = filtrarModelo.getText();  //Variable que vamos a usar en la consulta
//        int temp = ventanaJaxbSax.abrirDom(fichero);
//        //Creamos una estructura con el árbol DOM y, si se crea correctamente, ejecutamos el XPath
//        if (temp == 0) {
//            //A través de los ifs seleccionamos lo que ocurre dependiendo del botón que esté seleccionado.
//            if (jRadioButton5.isSelected()) {
//                consulta = "/coches/coche"; //Damos un valor a la variable consulta
//                try {
//                    panelDeTexto.setText(ventanaXpath.EjecutaXPath(consulta, fichero)); //Se ejecuta el método del XPath y aparece en el textArea
//                } catch (ParserConfigurationException ex) {
//                    Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (SAXException ex) {
//                    Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (IOException ex) {
//                    Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
//                }
//
//            } else if (jRadioButton2.isSelected()) {
//                consulta = "/coches/coche/@marca";
//                try {
//                    panelDeTexto.setText(ventanaXpath.EjecutaXPath(consulta, fichero));
//                } catch (ParserConfigurationException ex) {
//                    Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (SAXException ex) {
//                    Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (IOException ex) {
//                    Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            } else if (jRadioButton3.isSelected()) {
//                consulta = "/coches/coche/precio";
//                try {
//                    panelDeTexto.setText(ventanaXpath.EjecutaXPath(consulta, fichero));
//                } catch (ParserConfigurationException ex) {
//                    Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (SAXException ex) {
//                    Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (IOException ex) {
//                    Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            } else if (jRadioButton4.isSelected()) {
//                consulta = "/coches/coche/peso";
//                try {
//                    panelDeTexto.setText(ventanaXpath.EjecutaXPath(consulta, fichero));
//                } catch (ParserConfigurationException ex) {
//                    Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (SAXException ex) {
//                    Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (IOException ex) {
//                    Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            } else if (jRadioButton1.isSelected()) {
//                consulta = "/coches/coche[./modelo='" + verModelo + "']"; //Obtenemos el valor escrito en el textfield y
//                try {
//                    panelDeTexto.setText(ventanaXpath.EjecutaXPath(consulta, fichero));    //se lo asignamos al string que asignamos como valor
//                } catch (ParserConfigurationException ex) {
//                    Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (SAXException ex) {
//                    Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (IOException ex) {
//                    Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//            try {
//                panelDeTexto.setText(ventanaXpath.EjecutaXPath(consulta, fichero));
//            } catch (ParserConfigurationException ex) {
//                Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (SAXException ex) {
//                Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//                Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        } else if (temp == -1) {
//            panelDeTexto.setText("No se puede mostrar el contenido del árbol");
//        }

    }//GEN-LAST:event_BotonEjecutarXml1MousePressed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
//        gesXpath.ejecutaXpath(archivo, jTextField1.getText());
//        panelDeTexto.setText(gesXpath.salida);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        String consultaMarca = "coches/coche/@marca";
        panelDeTexto.setText(gesXpath.EjecutaXPath(ficheroXml, consultaMarca));
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String consultaPotencia = "coches/coche/@potencia";
        panelDeTexto.setText(gesXpath.EjecutaXPath(ficheroXml, consultaPotencia));
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        String consultaCombustible = "coches/coche/@combustible";
        panelDeTexto.setText(gesXpath.EjecutaXPath(ficheroXml, consultaCombustible));
    }//GEN-LAST:event_jButton3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEjecutarXml1;
    private javax.swing.JButton BotonEjecutarXml2;
    private javax.swing.JLabel MostradorDePanorama;
    private javax.swing.JTextField anio;
    private javax.swing.JTextField anio1;
    private javax.swing.JTextField campoBusqueda;
    private javax.swing.JTextField combustible;
    private javax.swing.JTextField combustible1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField marca1;
    private javax.swing.JTextField modelo1;
    private javax.swing.JTextPane panelDeTexto;
    private javax.swing.JTextField peso;
    private javax.swing.JTextField peso1;
    private javax.swing.JTextField potencia;
    private javax.swing.JTextField potencia1;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField precio1;
    private javax.swing.JTextField seguridad;
    private javax.swing.JTextField seguridad1;
    private javax.swing.JTextField tipo;
    private javax.swing.JTextField tipo1;
    private javax.swing.JTextField traccion;
    private javax.swing.JTextField traccion1;
    // End of variables declaration//GEN-END:variables
}
