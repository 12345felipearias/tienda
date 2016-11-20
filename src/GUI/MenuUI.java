package GUI;

import Data.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MenuUI extends javax.swing.JFrame {

    private Cajero cuenta = new Cajero("", "", "", "", "");

    public Cajero getCuenta() {
        return cuenta;
    }

//    public void setCuenta(Cajero cuenta) {
//        if (cuenta==null){
//            System.out.println("Shit");
//        }else{
//        this.cuenta = new Cajero(cuenta);    
//        }        
//    }
    public MenuUI() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Tienda POO");
        addToJtable();
    }
    
    static public Object[] row(int index, DefaultTableModel a) {
        Object filaData[] = new Object[7];
        for (int i = 0; i < filaData.length-1; i++) {
            filaData[i] = a.getValueAt(index, i);
        }
        
        return filaData;
    }
    
    static public Double total(DefaultTableModel a){
        
        double total = 0;
        for (int i = 0; i < a.getRowCount(); i++) {
           total = total + Double.parseDouble(a.getValueAt(i,2).toString());           
        }
        System.out.println(total);
        return total;
    }
    
    static public Double total1(DefaultTableModel a){
        double total = 0;
        for (int i = 0; i < a.getRowCount()-1; i++) {
           //total = total + Integer.parseInt(a.getValueAt(2, i).toString());
           System.out.println(a.getValueAt(i,2).toString());
        }
        return total;
    }

    static HashMap< Integer, Producto> inventario = new HashMap<>();
    Alimentos manzana = new Alimentos("Manzana", 11, 800, new Date(2016, 12, 05), "Del Campo", 1, "manzana", 312, false);
    Alimentos naranja = new Alimentos("Naranja", 12, 700, new Date(2016, 12, 02), "Del Campo", 1, " Unidad", 312, false);
    Alimentos jugo = new Alimentos("Jugo", 15, 1200, new Date(2016, 5, 05), "Éxito", 200, "Mililitros", 312, true);
    Alimentos papas = new Alimentos("Papas", 16, 1000, new Date(2016, 10, 05), "Éxito", 1, "Arroba", 312, false);
    Alimentos yuca = new Alimentos("Yuca", 17, 1400, new Date(2016, 1, 05), "Del Campo", 2, "Kilos", 312, false);
    Alimentos frijol = new Alimentos("Frijol", 18, 1200, new Date(2016, 2, 05), "Éxito", 250, "Gramos", 312, false);
    Alimentos res = new Alimentos("Res", 19, 5000, new Date(2016, 2, 05), "Matadero", 1, "Libra", 312, true);
    Alimentos cerdo = new Alimentos("Cerdo", 110, 4500, new Date(2016, 11, 05), "Matadero", 1, "Libra", 312, true);
    Alimentos pasta = new Alimentos("Pasta", 111, 2500, new Date(2016, 10, 05), "La muñeca", 650, "Gramos", 312, false);
    Alimentos agua = new Alimentos("Agua", 112, 1000, new Date(2016, 1, 05), "Cielo", 3, "Litro", 312, true);
    ///  Farmacia String nombre, int codigo, double precio, Date fechaCaducidad, String marca, int cantidad, String unidad,int existencia,boolean restringido )
    Farmacia Acetaminofen = new Farmacia("Acetaminofen", 21, 1000, new Date(2016, 12, 05), "Laprof", 200, "Gramos", 312, false);
    Farmacia Ibuprofeno = new Farmacia("Ibuprofeno", 21, 1000, new Date(2016, 12, 05), "Laprof", 200, "Gramos", 312, false);
    Farmacia Calmidol = new Farmacia("Calmidol", 21, 1000, new Date(2016, 12, 05), "Laprof", 200, "Gramos", 312, false);
    Farmacia Advil = new Farmacia("Advil", 21, 1000, new Date(2016, 12, 05), "Laprof", 200, "Gramos", 312, false);
    Farmacia Cicatricure = new Farmacia("Cicatricure", 21, 1000, new Date(2016, 12, 05), "Laprof", 200, "Gramos", 312, false);
    Farmacia Pañal = new Farmacia("Pañal", 21, 1000, new Date(2016, 12, 05), "Laprof", 200, "Gramos", 312, false);
    Farmacia Alcohol = new Farmacia("Alcohol", 21, 1000, new Date(2016, 12, 05), "Laprof", 200, "Gramos", 312, false);
    Farmacia Aspirina = new Farmacia("Aspirina", 21, 1000, new Date(2016, 12, 05), "Laprof", 200, "Gramos", 312, false);
    Farmacia Buscapina = new Farmacia("Buscapina", 21, 1000, new Date(2016, 12, 05), "Laprof", 200, "Gramos", 312, false);
    Farmacia Desloratadina = new Farmacia("Desloratadina", 21, 1000, new Date(2016, 12, 05), "Laprof", 200, "Gramos", 312, false);
    Farmacia Curas = new Farmacia("Curas", 21, 1000, new Date(2016, 12, 05), "Laprof", 200, "Gramos", 312, false);
    Farmacia Lincomicina = new Farmacia("Lincomicina", 21, 1000, new Date(2016, 12, 05), "Laprof", 200, "Gramos", 312, false);
    Farmacia Azitromicina = new Farmacia("Azitromicina", 21, 1000, new Date(2016, 12, 05), "Laprof", 200, "Gramos", 312, false);
    Farmacia Penicilina = new Farmacia("Penicilina", 21, 1000, new Date(2016, 12, 05), "Laprof", 200, "Gramos", 312, false);

// Deportes String nombre, int codigo, double precio, Date fechaCaducidad, String marca, int cantidad, String unidad, int existencia, String deporte)   
    Deportes Balon = new Deportes("Balon", 31, 70000, new Date(2056, 12, 05), "Gilbert", 1, "Pelota", 312, "Rugby");

    public ArrayList Arreglo() {
        ArrayList<Producto> inventar = new ArrayList<>(inventario.values());

        inventar.add(manzana);
        inventar.add(naranja);
        inventar.add(jugo);
        inventar.add(papas);
        inventar.add(yuca);
        inventar.add(frijol);
        inventar.add(res);
        inventar.add(cerdo);
        inventar.add(pasta);
        inventar.add(agua);
        inventar.add(Acetaminofen);
        inventar.add(Ibuprofeno);
        inventar.add(Calmidol);
        inventar.add(Advil);
        inventar.add(Cicatricure);
        inventar.add(Pañal);
        inventar.add(Alcohol);
        inventar.add(Aspirina);
        inventar.add(Buscapina);
        inventar.add(Desloratadina);
        inventar.add(Curas);
        inventar.add(Lincomicina);
        inventar.add(Azitromicina);
        inventar.add(Balon);
        inventar.add(Alcohol);
        inventar.add(Aspirina);
        inventar.add(Buscapina);
        inventar.add(Desloratadina);
        inventar.add(Curas);
        inventar.add(Lincomicina);
        inventar.add(Azitromicina);
        inventar.add(Balon);

        return inventar;
    }

    public void addToJtable() {

        DefaultTableModel model = (DefaultTableModel) inventarioTable.getModel();
        ArrayList<Producto> inventar = Arreglo();
        Object filaData[] = new Object[7];
        for (int i = 0; i < inventar.size(); i++) {

            filaData[0] = inventar.get(i).nombre;
            filaData[1] = inventar.get(i).codigo;
            filaData[2] = inventar.get(i).precio;
            filaData[3] = inventar.get(i).marca;
            filaData[4] = inventar.get(i).cantidad + "  " + inventar.get(i).unidad;
            filaData[5] = inventar.get(i).getFechaCaducidad();
            model.addRow(filaData);

        }

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cajeroNombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        facturaTable = new javax.swing.JTable();
        btnRecibo2 = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTotal4 = new javax.swing.JTextField();
        lblTotal5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        inventarioTable = new javax.swing.JTable();
        lblTotal3 = new javax.swing.JLabel();
        lblTotal1 = new javax.swing.JLabel();
        txtTotal6 = new javax.swing.JTextField();
        lblTotal4 = new javax.swing.JLabel();
        txtTotal1 = new javax.swing.JTextField();
        btnRecibo = new javax.swing.JButton();
        btnRecibo1 = new javax.swing.JButton();
        lblTotal6 = new javax.swing.JLabel();
        cajeroId = new javax.swing.JLabel();
        Filtro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        showTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cajeroNombre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cajeroNombre.setText(this.cuenta.getName());
        cajeroNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cajeroNombre.setText(this.cuenta.getName());

        facturaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Producto", "Precio"
            }
        ));
        jScrollPane1.setViewportView(facturaTable);

        btnRecibo2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRecibo2.setText("Facturas");
        btnRecibo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecibo2ActionPerformed(evt);
            }
        });

        lblTotal.setFont(new java.awt.Font("LM Roman Caps 10", 0, 14)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("TOTAL");

        jLabel1.setFont(new java.awt.Font("LM Roman Caps 10", 0, 48)); // NOI18N
        jLabel1.setText("Minimarket POO");

        txtTotal4.setBackground(new java.awt.Color(204, 204, 204));
        txtTotal4.setFont(new java.awt.Font("LM Roman Caps 10", 1, 14)); // NOI18N
        txtTotal4.setForeground(new java.awt.Color(51, 102, 255));
        txtTotal4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblTotal5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblTotal5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal5.setText("Factura Nº");

        inventarioTable.setAutoCreateRowSorter(true);
        inventarioTable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        inventarioTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Codigo", "Precio", "Marca", "Cantidad", "Existencia"
            }
        ));
        inventarioTable.setColumnSelectionAllowed(true);
        inventarioTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventarioTableMouseClicked(evt);
                passToFactura(evt);
            }
        });
        jScrollPane2.setViewportView(inventarioTable);
        inventarioTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        lblTotal3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTotal3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal3.setText("Identificacion");

        lblTotal1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTotal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal1.setText("Cliente");

        txtTotal6.setBackground(new java.awt.Color(204, 204, 204));
        txtTotal6.setFont(new java.awt.Font("LM Roman Caps 10", 1, 14)); // NOI18N
        txtTotal6.setForeground(new java.awt.Color(51, 102, 255));
        txtTotal6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblTotal4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTotal4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal4.setText("Identificacion");

        txtTotal1.setBackground(new java.awt.Color(204, 204, 204));
        txtTotal1.setFont(new java.awt.Font("LM Roman Caps 10", 1, 14)); // NOI18N
        txtTotal1.setForeground(new java.awt.Color(51, 102, 255));
        txtTotal1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnRecibo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnRecibo.setText("Concluir");
        btnRecibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReciboActionPerformed(evt);
            }
        });

        btnRecibo1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRecibo1.setText("Clientes");
        btnRecibo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecibo1ActionPerformed(evt);
            }
        });

        lblTotal6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTotal6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal6.setText("Usuario");

        cajeroId.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cajeroId.setText(this.cuenta.getId());
        cajeroId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cajeroId.setText(this.cuenta.getId());
        cajeroId.setToolTipText("");

        Filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltroActionPerformed(evt);
            }
        });
        Filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FiltroKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Buscar");

        showTotal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        showTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showTotal.setText(total((DefaultTableModel) inventarioTable.getModel()).toString());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTotal6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajeroNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotal4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotal3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTotal4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(cajeroId, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRecibo2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRecibo1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTotal5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(txtTotal6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(showTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                        .addComponent(btnRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(424, 424, 424)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnRecibo2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRecibo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTotal3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cajeroId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTotal6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cajeroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTotal4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTotal4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotal5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotal6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecibo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecibo2ActionPerformed
        FacturasUI facturas = new FacturasUI();
        facturas.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnRecibo2ActionPerformed

    private void btnReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReciboActionPerformed
        //        // Solo en el caso de que el pedido aún no haya sido introducido
        //        if (! pedidoIntroducido){
        //            // se prodecerá a introducirlo en la base de datos e imprimir el recibo
        //            accionesAltaPedido.imprimirRecibo();
        //            // El flag de pedidoIntroducido se pone a verdadero para evitar errores
        //            pedidoIntroducido=true;
        //        }else {
        //            JOptionPane.showMessageDialog (null, "Ya se ha introducido el pedido");
        //        }
    }//GEN-LAST:event_btnReciboActionPerformed

    private void btnRecibo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecibo1ActionPerformed
        ClienteUI cliente = new ClienteUI();
        cliente.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnRecibo1ActionPerformed

    private void FiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroKeyReleased
//        addToJtable(Filtro.getText());
    }//GEN-LAST:event_FiltroKeyReleased

    private void FiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FiltroActionPerformed

    private void FiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_FiltroKeyTyped

    private void inventarioTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventarioTableMouseClicked
        //System.out.println(evt.getButton());
        DefaultTableModel tableModelInvent = (DefaultTableModel) inventarioTable.getModel();
        DefaultTableModel tableModelFactura = (DefaultTableModel) facturaTable.getModel();
        tableModelFactura.addRow(row(inventarioTable.rowAtPoint(evt.getPoint()),tableModelInvent));
        tableModelInvent.removeRow(inventarioTable.rowAtPoint(evt.getPoint()));
        total(tableModelFactura);
        showTotal.updateUI();
    }//GEN-LAST:event_inventarioTableMouseClicked

    private void passToFactura(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passToFactura
        // TODO add your handling code here:
    }//GEN-LAST:event_passToFactura

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
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Filtro;
    private javax.swing.JButton btnRecibo;
    private javax.swing.JButton btnRecibo1;
    private javax.swing.JButton btnRecibo2;
    private javax.swing.JLabel cajeroId;
    private javax.swing.JLabel cajeroNombre;
    private javax.swing.JTable facturaTable;
    private javax.swing.JTable inventarioTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotal1;
    private javax.swing.JLabel lblTotal3;
    private javax.swing.JLabel lblTotal4;
    private javax.swing.JLabel lblTotal5;
    private javax.swing.JLabel lblTotal6;
    private javax.swing.JLabel showTotal;
    private javax.swing.JTextField txtTotal1;
    private javax.swing.JTextField txtTotal4;
    private javax.swing.JTextField txtTotal6;
    // End of variables declaration//GEN-END:variables

    public JTable getInventarioTable() {
        return inventarioTable;
    }

    public void setInventarioTable(JTable inventarioTable) {
        this.inventarioTable = inventarioTable;
    }

}
