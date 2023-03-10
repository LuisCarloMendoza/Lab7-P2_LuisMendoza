/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package luismendoza_lab7p2;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author luiscarlomendoza
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        DefaultListModel m = (DefaultListModel) jList1.getModel();
        m.addElement("Mi Unidad");
        m.addElement("Destacados");
        m.addElement("Papelera");

        BinariosArchivo ap = new BinariosArchivo("./archivosTotales.cbm");
        ap.cargarArchivo();
        archivos = ap.getArchivos();

        BinariosCarpetas ac = new BinariosCarpetas("./carpetasTotales.cbm");
        ac.cargarArchivo();
        carpetas = ac.getCarpetas();

        BinariosArchivoFav af = new BinariosArchivoFav("./archivosFavoritos.cbm");
        af.cargarArchivo();
        archivosFav = af.getArchivos();

        BinariosCarpetasFav az = new BinariosCarpetasFav("./carpetasFavoritas.cbm");
        az.cargarArchivo();
        carpetasFav = az.getCarpetas();

    }

    public void ActualizarArbol(DefaultMutableTreeNode raiz, ArrayList<Archivo> lista1, ArrayList<Carpeta> lista2) {

        for (Carpeta c : lista2) {
            DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(c);

            if (c.getArchivos().isEmpty() == false) {
                for (int i = 0; i < c.getArchivos().size(); i++) {
                    DefaultMutableTreeNode nodo2 = new DefaultMutableTreeNode(c.getArchivos().get(i));
                    nodo.add(nodo2);
                }

            }

            raiz.add(nodo);

        }

        for (Archivo a : lista1) {
            DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(a);
            raiz.add(nodo);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pp_carpeta = new javax.swing.JPopupMenu();
        jmi_agregarArchivo = new javax.swing.JMenuItem();
        jmi_agregarCarpeta = new javax.swing.JMenuItem();
        jmi_descargar = new javax.swing.JMenuItem();
        jmi_FavCarpeta = new javax.swing.JMenuItem();
        jmi_carpetaPapelera = new javax.swing.JMenuItem();
        pp_archivo = new javax.swing.JPopupMenu();
        jmi_FavArchivo = new javax.swing.JMenuItem();
        jmi_Descargar = new javax.swing.JMenuItem();
        jmi_archivoPapelera = new javax.swing.JMenuItem();
        jd_listarArchivos = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlist_listarTodo = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jd_listarCarpetas = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        jl_listarCarpetas = new javax.swing.JList<>();
        jd_table = new javax.swing.JDialog();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jb_crearArchivo = new javax.swing.JButton();
        jb_crearCarpeta = new javax.swing.JButton();
        Vaciar = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();

        jmi_agregarArchivo.setText("Agregar Archivo");
        jmi_agregarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_agregarArchivoActionPerformed(evt);
            }
        });
        pp_carpeta.add(jmi_agregarArchivo);

        jmi_agregarCarpeta.setText("Agregar Carpeta");
        jmi_agregarCarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_agregarCarpetaActionPerformed(evt);
            }
        });
        pp_carpeta.add(jmi_agregarCarpeta);

        jmi_descargar.setText("Descargar");
        jmi_descargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_descargarActionPerformed(evt);
            }
        });
        pp_carpeta.add(jmi_descargar);

        jmi_FavCarpeta.setText("Like");
        jmi_FavCarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_FavCarpetaActionPerformed(evt);
            }
        });
        pp_carpeta.add(jmi_FavCarpeta);

        jmi_carpetaPapelera.setText("Papelera");
        jmi_carpetaPapelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_carpetaPapeleraActionPerformed(evt);
            }
        });
        pp_carpeta.add(jmi_carpetaPapelera);

        jmi_FavArchivo.setText("Like");
        jmi_FavArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_FavArchivoActionPerformed(evt);
            }
        });
        pp_archivo.add(jmi_FavArchivo);

        jmi_Descargar.setText("Descargar");
        jmi_Descargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_DescargarActionPerformed(evt);
            }
        });
        pp_archivo.add(jmi_Descargar);

        jmi_archivoPapelera.setText("Papelera");
        jmi_archivoPapelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_archivoPapeleraActionPerformed(evt);
            }
        });
        pp_archivo.add(jmi_archivoPapelera);

        jlist_listarTodo.setModel(new DefaultListModel());
        jlist_listarTodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlist_listarTodoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jlist_listarTodo);

        jLabel1.setText("Lista de Archivos");

        javax.swing.GroupLayout jd_listarArchivosLayout = new javax.swing.GroupLayout(jd_listarArchivos.getContentPane());
        jd_listarArchivos.getContentPane().setLayout(jd_listarArchivosLayout);
        jd_listarArchivosLayout.setHorizontalGroup(
            jd_listarArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listarArchivosLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addGroup(jd_listarArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_listarArchivosLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        jd_listarArchivosLayout.setVerticalGroup(
            jd_listarArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listarArchivosLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jl_listarCarpetas.setModel(new DefaultListModel());
        jl_listarCarpetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_listarCarpetasMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jl_listarCarpetas);

        javax.swing.GroupLayout jd_listarCarpetasLayout = new javax.swing.GroupLayout(jd_listarCarpetas.getContentPane());
        jd_listarCarpetas.getContentPane().setLayout(jd_listarCarpetasLayout);
        jd_listarCarpetasLayout.setHorizontalGroup(
            jd_listarCarpetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_listarCarpetasLayout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        jd_listarCarpetasLayout.setVerticalGroup(
            jd_listarCarpetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listarCarpetasLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Extension", "Tama??o"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable1);

        javax.swing.GroupLayout jd_tableLayout = new javax.swing.GroupLayout(jd_table.getContentPane());
        jd_table.getContentPane().setLayout(jd_tableLayout);
        jd_tableLayout.setHorizontalGroup(
            jd_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jd_tableLayout.setVerticalGroup(
            jd_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTree1);

        jb_crearArchivo.setText("Crear Archivo");
        jb_crearArchivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_crearArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearArchivoMouseClicked(evt);
            }
        });

        jb_crearCarpeta.setText("Crear Carpeta");
        jb_crearCarpeta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_crearCarpeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearCarpetaMouseClicked(evt);
            }
        });

        Vaciar.setText("Vaciar");
        Vaciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VaciarMouseClicked(evt);
            }
        });

        jProgressBar1.setMaximum(1000000);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jb_crearArchivo)
                        .addGap(28, 28, 28)
                        .addComponent(jb_crearCarpeta)
                        .addGap(26, 26, 26)
                        .addComponent(Vaciar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_crearArchivo)
                    .addComponent(jb_crearCarpeta)
                    .addComponent(Vaciar))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_crearArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearArchivoMouseClicked
        // TODO add your handling code here:
        String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre del archivo");
        String link = JOptionPane.showInputDialog(this, "Ingrese el link del archivo");
        String extension = JOptionPane.showInputDialog(this, "Ingrese la extension del archivo");
        double tamanio = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese el tama??o del archivo"));

        Archivo archivo = new Archivo(nombre, link, extension, tamanio);
        archivos.add(archivo);

        BinariosArchivo ap = new BinariosArchivo("./archivosTotales.cbm");
        ap.setArchivos(archivos);
        ap.escribirArchivo();


    }//GEN-LAST:event_jb_crearArchivoMouseClicked

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
        if (jList1.getSelectedIndex() >= 0) {

            DefaultTreeModel mClean = (DefaultTreeModel) jTree1.getModel();
            DefaultMutableTreeNode raizClean = (DefaultMutableTreeNode) mClean.getRoot();
            raizClean.removeAllChildren();
            mClean.reload();

            if (jList1.getSelectedValue().equals("Mi Unidad")) {
                DefaultTreeModel arbol = (DefaultTreeModel) jTree1.getModel();
                DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) arbol.getRoot();
                ActualizarArbol(raiz, archivos, carpetas);
                arbol.reload();

            } else if (jList1.getSelectedValue().equals("Destacados")) {
                DefaultTreeModel arbol = (DefaultTreeModel) jTree1.getModel();
                DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) arbol.getRoot();
                ActualizarArbol(raiz, archivosFav, carpetasFav);
                arbol.reload();
            } else {
                DefaultTreeModel arbol = (DefaultTreeModel) jTree1.getModel();
                DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) arbol.getRoot();
                ActualizarArbol(raiz, archivosPapelera, carpetasPapelera);
                arbol.reload();
            }
        }


    }//GEN-LAST:event_jList1MouseClicked

    private void jb_crearCarpetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearCarpetaMouseClicked
        // TODO add your handling code here:
        String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre del archivo");
        String link = JOptionPane.showInputDialog(this, "Ingrese el link del archivo");

        carpetaG = new Carpeta(nombre, link);

        boolean centinela = true;
        while (centinela) {
            String p = JOptionPane.showInputDialog(this, "Desea agregar Archivo? s/n");
            if (p.equals("s")) {

                String nombreA = JOptionPane.showInputDialog(this, "Ingrese el nombre del archivo");
                String linkA = JOptionPane.showInputDialog(this, "Ingrese el link del archivo");
                String extensionA = JOptionPane.showInputDialog(this, "Ingrese la extension del archivo");
                double tamanioA = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese el tama??o del archivo"));
                Archivo archivoC = new Archivo(nombreA, linkA, extensionA, tamanioA);
                carpetaG.getArchivos().add(archivoC);

            } else {
                centinela = false;
            }
        }

        carpetas.add(carpetaG);

        BinariosCarpetas ac = new BinariosCarpetas("./carpetasTotales.cbm");
        ac.setCarpetas(carpetas);
        ac.escribirArchivo();


    }//GEN-LAST:event_jb_crearCarpetaMouseClicked

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == 3) {
            //seleccionar un nodo con click derecho
            int row = jTree1.getClosestRowForLocation(evt.getX(), evt.getY());
            jTree1.setSelectionRow(row);
            Object v1 = jTree1.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;
            if (nodo_seleccionado.getUserObject() instanceof Carpeta) {
                carpetaSeleccionada = (Carpeta) nodo_seleccionado.getUserObject();
                pp_carpeta.show(evt.getComponent(), evt.getX(), evt.getY());
            } else if (nodo_seleccionado.getUserObject() instanceof Archivo) {
                archivoSeleccionado = (Archivo) nodo_seleccionado.getUserObject();
                pp_archivo.show(evt.getComponent(), evt.getX(), evt.getY());

            }

        }

    }//GEN-LAST:event_jTree1MouseClicked

    private void jmi_agregarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_agregarArchivoActionPerformed
        // TODO add your handling code here:

        DefaultListModel clean = (DefaultListModel) jlist_listarTodo.getModel();
        clean.clear();
        jlist_listarTodo.setModel(clean);

        DefaultListModel lista = (DefaultListModel) jlist_listarTodo.getModel();
        for (int i = 0; i < archivos.size(); i++) {
            lista.addElement(archivos.get(i));
        }
        jlist_listarTodo.setModel(lista);

        jd_listarArchivos.setModal(true);
        jd_listarArchivos.pack();
        jd_listarArchivos.setLocationRelativeTo(this);
        jd_listarArchivos.setVisible(true);

    }//GEN-LAST:event_jmi_agregarArchivoActionPerformed

    private void jlist_listarTodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlist_listarTodoMouseClicked
        // TODO add your handling code here:

        if (jlist_listarTodo.getSelectedIndex() >= 0) {

            DefaultListModel lista = (DefaultListModel) jlist_listarTodo.getModel();
            Archivo archivoS = ((Archivo) lista.getElementAt(jlist_listarTodo.getSelectedIndex()));

            DefaultTreeModel modelo = (DefaultTreeModel) jTree1.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();

            for (int i = 0; i < raiz.getChildCount(); i++) {

                if (raiz.getChildAt(i).equals(nodo_seleccionado)) {
                    DefaultMutableTreeNode m = new DefaultMutableTreeNode(archivoS);
                    nodo_seleccionado.add(m);
                    raiz.add(nodo_seleccionado);
                    JOptionPane.showMessageDialog(jd_listarArchivos, "Se agrego con ??xito");
                    break;

                }
            }

            modelo.reload();

        }


    }//GEN-LAST:event_jlist_listarTodoMouseClicked

    private void jmi_agregarCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_agregarCarpetaActionPerformed
        // TODO add your handling code here:
        DefaultListModel clean = (DefaultListModel) jl_listarCarpetas.getModel();
        clean.clear();
        jl_listarCarpetas.setModel(clean);

        DefaultListModel lista = (DefaultListModel) jl_listarCarpetas.getModel();
        for (int i = 0; i < carpetas.size(); i++) {
            lista.addElement(carpetas.get(i));
        }
        jl_listarCarpetas.setModel(lista);

        jd_listarCarpetas.setModal(true);
        jd_listarCarpetas.pack();
        jd_listarCarpetas.setLocationRelativeTo(this);
        jd_listarCarpetas.setVisible(true);


    }//GEN-LAST:event_jmi_agregarCarpetaActionPerformed

    private void jl_listarCarpetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_listarCarpetasMouseClicked
        // TODO add your handling code here:
        if (jl_listarCarpetas.getSelectedIndex() >= 0) {

            DefaultListModel lista = (DefaultListModel) jl_listarCarpetas.getModel();
            Carpeta carpetaS = ((Carpeta) lista.getElementAt(jl_listarCarpetas.getSelectedIndex()));

            DefaultTreeModel modelo = (DefaultTreeModel) jTree1.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();

            for (int i = 0; i < raiz.getChildCount(); i++) {

                if (raiz.getChildAt(i).equals(nodo_seleccionado)) {
                    DefaultMutableTreeNode m = new DefaultMutableTreeNode(carpetaS);
                    nodo_seleccionado.add(m);
                    raiz.add(nodo_seleccionado);
                    JOptionPane.showMessageDialog(jd_listarArchivos, "Se agrego con ??xito");
                    break;

                }
            }

            modelo.reload();

        }

    }//GEN-LAST:event_jl_listarCarpetasMouseClicked

    private void jmi_FavCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_FavCarpetaActionPerformed
        // TODO add your handling code here:
        carpetasFav.add(carpetaSeleccionada);
        BinariosCarpetasFav ap = new BinariosCarpetasFav("./carpetasFavoritas.cbm");
        ap.setCarpetas(carpetasFav);
        ap.escribirArchivo();

    }//GEN-LAST:event_jmi_FavCarpetaActionPerformed

    private void jmi_FavArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_FavArchivoActionPerformed
        // TODO add your handling code here:
        archivosFav.add(archivoSeleccionado);
        BinariosArchivoFav ap = new BinariosArchivoFav("./archivosFavoritos.cbm");
        ap.setArchivos(archivosFav);
        ap.escribirArchivo();

    }//GEN-LAST:event_jmi_FavArchivoActionPerformed

    private void jmi_carpetaPapeleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_carpetaPapeleraActionPerformed
        // TODO add your handling code here:
        carpetasPapelera.add(carpetaSeleccionada);

        for (int i = 0; i < carpetas.size(); i++) {
            if (carpetas.get(i).equals(carpetaSeleccionada)) {
                carpetas.remove(i);
            }
        }

        for (int i = 0; i < carpetasFav.size(); i++) {
            if (carpetasFav.get(i).equals(carpetaSeleccionada)) {
                carpetasFav.remove(i);
            }
        }

        BinariosCarpetas ac = new BinariosCarpetas("./carpetasTotales.cbm");
        ac.setCarpetas(carpetas);
        ac.escribirArchivo();

    }//GEN-LAST:event_jmi_carpetaPapeleraActionPerformed

    private void jmi_archivoPapeleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_archivoPapeleraActionPerformed
        // TODO add your handling code here:
        archivosPapelera.add(archivoSeleccionado);

        for (int i = 0; i < archivos.size(); i++) {
            if (archivos.get(i).equals(archivoSeleccionado)) {
                archivos.remove(archivoSeleccionado);
            }
        }

        for (int i = 0; i < archivosFav.size(); i++) {
            if (archivosFav.get(i).equals(archivoSeleccionado)) {
                archivosFav.remove(i);
            }
        }

        BinariosArchivo ap = new BinariosArchivo("./archivosTotales.cbm");
        ap.setArchivos(archivos);
        ap.escribirArchivo();
        System.out.println("yay");

    }//GEN-LAST:event_jmi_archivoPapeleraActionPerformed

    private void VaciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VaciarMouseClicked
        // TODO add your handling code here:
        carpetasPapelera.clear();
        archivosPapelera.clear();

    }//GEN-LAST:event_VaciarMouseClicked

    private void jmi_descargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_descargarActionPerformed
        // TODO add your handling code here:
        
        adminBarra barra = new adminBarra(jProgressBar1, 100);
        barra.start();

        jProgressBar1.setValue(0);

        for (int i = 0; i < carpetaSeleccionada.getArchivos().size(); i++) {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.insertRow(model.getRowCount(), new Object[]{carpetaSeleccionada.getArchivos().get(i).getNombre(), carpetaSeleccionada.getArchivos().get(i).getExtension(), carpetaSeleccionada.getArchivos().get(i).getTamanio()});
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        

        jd_table.setModal(true);
        jd_table.pack();
        jd_table.setLocationRelativeTo(this);
        jd_table.setVisible(true);
        
        model.setRowCount(0);

    }//GEN-LAST:event_jmi_descargarActionPerformed

    private void jmi_DescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_DescargarActionPerformed
        // TODO add your handling code here:

        adminBarra barra = new adminBarra(jProgressBar1, archivoSeleccionado.getTamanio());
        barra.start();

        jProgressBar1.setValue(0);

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.insertRow(model.getRowCount(), new Object[]{archivoSeleccionado.getNombre(), archivoSeleccionado.getExtension(), archivoSeleccionado.getTamanio()});

        jd_table.setModal(true);
        jd_table.pack();
        jd_table.setLocationRelativeTo(this);
        jd_table.setVisible(true);
        
        model.setRowCount(0);

    }//GEN-LAST:event_jmi_DescargarActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Vaciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTree jTree1;
    private javax.swing.JButton jb_crearArchivo;
    private javax.swing.JButton jb_crearCarpeta;
    private javax.swing.JDialog jd_listarArchivos;
    private javax.swing.JDialog jd_listarCarpetas;
    private javax.swing.JDialog jd_table;
    private javax.swing.JList<Carpeta> jl_listarCarpetas;
    private javax.swing.JList<Archivo> jlist_listarTodo;
    private javax.swing.JMenuItem jmi_Descargar;
    private javax.swing.JMenuItem jmi_FavArchivo;
    private javax.swing.JMenuItem jmi_FavCarpeta;
    private javax.swing.JMenuItem jmi_agregarArchivo;
    private javax.swing.JMenuItem jmi_agregarCarpeta;
    private javax.swing.JMenuItem jmi_archivoPapelera;
    private javax.swing.JMenuItem jmi_carpetaPapelera;
    private javax.swing.JMenuItem jmi_descargar;
    private javax.swing.JPopupMenu pp_archivo;
    private javax.swing.JPopupMenu pp_carpeta;
    // End of variables declaration//GEN-END:variables

    private ArrayList<Archivo> archivos = new ArrayList();
    private ArrayList<Carpeta> carpetas = new ArrayList();

    private ArrayList<Archivo> archivosFav = new ArrayList();
    private ArrayList<Carpeta> carpetasFav = new ArrayList();

    private ArrayList<Archivo> archivosPapelera = new ArrayList();
    private ArrayList<Carpeta> carpetasPapelera = new ArrayList();

    private Carpeta carpetaG;
    DefaultMutableTreeNode nodo_seleccionado;
    Carpeta carpetaSeleccionada;
    Archivo archivoSeleccionado;

}
