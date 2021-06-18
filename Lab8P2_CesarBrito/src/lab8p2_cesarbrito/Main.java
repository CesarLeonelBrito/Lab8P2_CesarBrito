package lab8p2_cesarbrito;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_crear_carro = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_vin = new javax.swing.JFormattedTextField();
        jb1_seat = new javax.swing.JRadioButton();
        jb1_skoda = new javax.swing.JRadioButton();
        jb1_audi = new javax.swing.JRadioButton();
        jb1_volks = new javax.swing.JRadioButton();
        jb1_bentley = new javax.swing.JRadioButton();
        jb1_porsche = new javax.swing.JRadioButton();
        jb1_lamb = new javax.swing.JRadioButton();
        jb1_bugatti = new javax.swing.JRadioButton();
        jb2_sedan = new javax.swing.JRadioButton();
        jb2_familiar = new javax.swing.JRadioButton();
        jb2_hatch = new javax.swing.JRadioButton();
        jb2_fast = new javax.swing.JRadioButton();
        jb2_suv = new javax.swing.JRadioButton();
        tf_puertas = new javax.swing.JFormattedTextField();
        tf_color = new javax.swing.JTextField();
        jb3_combustion = new javax.swing.JRadioButton();
        jb3_electrico = new javax.swing.JRadioButton();
        tf_precio = new javax.swing.JFormattedTextField();
        jb4_ninguna = new javax.swing.JRadioButton();
        jb4_micro = new javax.swing.JRadioButton();
        jb4_convencional = new javax.swing.JRadioButton();
        jb4_enchufable = new javax.swing.JRadioButton();
        jb4_electrico = new javax.swing.JRadioButton();
        tf_pasajeros = new javax.swing.JFormattedTextField();
        tf_ensamblaje = new javax.swing.JFormattedTextField();
        jb_agregar_carro = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jd_listar_carros = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        jb_eliminar = new javax.swing.JButton();
        jb_modificar = new javax.swing.JButton();
        jd_modificar_carro = new javax.swing.JDialog();
        jb1_volks1 = new javax.swing.JRadioButton();
        jb_modificar_carro = new javax.swing.JButton();
        jb1_bentley1 = new javax.swing.JRadioButton();
        jb1_porsche1 = new javax.swing.JRadioButton();
        jb1_lamb1 = new javax.swing.JRadioButton();
        jb1_bugatti1 = new javax.swing.JRadioButton();
        jb2_sedan1 = new javax.swing.JRadioButton();
        jb2_familiar1 = new javax.swing.JRadioButton();
        jb2_hatch1 = new javax.swing.JRadioButton();
        jb2_fast1 = new javax.swing.JRadioButton();
        jb2_suv1 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        tf_puertas1 = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        tf_color1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jb3_combustion1 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jb3_electrico1 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        tf_precio1 = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        jb4_ninguna1 = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jb4_micro1 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        jb4_convencional1 = new javax.swing.JRadioButton();
        tf_vin1 = new javax.swing.JFormattedTextField();
        jb1_seat1 = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jb4_enchufable1 = new javax.swing.JRadioButton();
        jb4_electrico1 = new javax.swing.JRadioButton();
        jb1_skoda1 = new javax.swing.JRadioButton();
        tf_pasajeros1 = new javax.swing.JFormattedTextField();
        jb1_audi1 = new javax.swing.JRadioButton();
        tf_ensamblaje1 = new javax.swing.JFormattedTextField();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        jd_busqueda_especifica = new javax.swing.JDialog();
        jb_generalista = new javax.swing.JButton();
        jb_premium = new javax.swing.JButton();
        jb_deportivo = new javax.swing.JButton();
        tf_vin_search = new javax.swing.JFormattedTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tf_marca_search = new javax.swing.JTextField();
        jb_buscar_porVin = new javax.swing.JButton();
        jb_buscar_porMarca = new javax.swing.JButton();
        jd_listar_especifico = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_especifica = new javax.swing.JTable();
        crear_carro = new javax.swing.JButton();
        listar_carros = new javax.swing.JButton();
        listar_carros_especiales = new javax.swing.JButton();

        jLabel1.setText("VIN:");

        jLabel2.setText("Marca:");

        jLabel3.setText("Carroceria:");

        jLabel4.setText("Puertas:");

        jLabel5.setText("Color:");

        jLabel6.setText("Motor:");

        jLabel7.setText("Precio:");

        jLabel8.setText("Hibridación:");

        jLabel9.setText("Cantidad de Pasajeros:");

        jLabel10.setText("Ensamblaje(En Segundos):");

        tf_vin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("############"))));

        buttonGroup1.add(jb1_seat);
        jb1_seat.setText("SEAT");

        buttonGroup1.add(jb1_skoda);
        jb1_skoda.setText("Škoda");

        buttonGroup1.add(jb1_audi);
        jb1_audi.setText("Audi");

        buttonGroup1.add(jb1_volks);
        jb1_volks.setText("Volkswagen ");

        buttonGroup1.add(jb1_bentley);
        jb1_bentley.setText("Bentley");

        buttonGroup1.add(jb1_porsche);
        jb1_porsche.setText("Porsche");

        buttonGroup1.add(jb1_lamb);
        jb1_lamb.setText("Lamborghini");

        buttonGroup1.add(jb1_bugatti);
        jb1_bugatti.setText("Bugatti");

        buttonGroup2.add(jb2_sedan);
        jb2_sedan.setText("Sedán");

        buttonGroup2.add(jb2_familiar);
        jb2_familiar.setText("Familiar");

        buttonGroup2.add(jb2_hatch);
        jb2_hatch.setText("Hatchback");

        buttonGroup2.add(jb2_fast);
        jb2_fast.setText("Fastback");

        buttonGroup2.add(jb2_suv);
        jb2_suv.setText("SUV");

        tf_puertas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("############"))));

        buttonGroup3.add(jb3_combustion);
        jb3_combustion.setText("Combustión");

        buttonGroup3.add(jb3_electrico);
        jb3_electrico.setText("Eléctrico");

        tf_precio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("############"))));

        buttonGroup4.add(jb4_ninguna);
        jb4_ninguna.setText("Ninguna");

        buttonGroup4.add(jb4_micro);
        jb4_micro.setText("Microhíbrido");

        buttonGroup4.add(jb4_convencional);
        jb4_convencional.setText("Híbrido Convencional");

        buttonGroup4.add(jb4_enchufable);
        jb4_enchufable.setText("Híbrido Enchufable");

        buttonGroup4.add(jb4_electrico);
        jb4_electrico.setText("Eléctrico");

        tf_pasajeros.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("############"))));

        tf_ensamblaje.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("############"))));

        jb_agregar_carro.setText("Agregar");
        jb_agregar_carro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregar_carroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_crear_carroLayout = new javax.swing.GroupLayout(jd_crear_carro.getContentPane());
        jd_crear_carro.getContentPane().setLayout(jd_crear_carroLayout);
        jd_crear_carroLayout.setHorizontalGroup(
            jd_crear_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crear_carroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_crear_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_crear_carroLayout.createSequentialGroup()
                        .addGroup(jd_crear_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jd_crear_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_agregar_carro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_vin)
                            .addComponent(tf_puertas, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_color)
                            .addComponent(tf_precio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_pasajeros, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_ensamblaje, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jd_crear_carroLayout.createSequentialGroup()
                                .addGroup(jd_crear_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jd_crear_carroLayout.createSequentialGroup()
                                        .addComponent(jb2_sedan)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb2_familiar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb2_hatch)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb2_fast)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb2_suv))
                                    .addGroup(jd_crear_carroLayout.createSequentialGroup()
                                        .addComponent(jb3_combustion)
                                        .addGap(46, 46, 46)
                                        .addComponent(jb3_electrico))
                                    .addGroup(jd_crear_carroLayout.createSequentialGroup()
                                        .addComponent(jb4_ninguna)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb4_micro)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb4_convencional)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb4_enchufable))
                                    .addGroup(jd_crear_carroLayout.createSequentialGroup()
                                        .addComponent(jb1_seat)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb1_skoda)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb1_audi)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb1_volks)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb1_bentley)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb1_porsche)))
                                .addGap(0, 20, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crear_carroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jd_crear_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crear_carroLayout.createSequentialGroup()
                                .addComponent(jb4_electrico)
                                .addGap(302, 302, 302))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crear_carroLayout.createSequentialGroup()
                                .addComponent(jb1_lamb)
                                .addGap(61, 61, 61)
                                .addComponent(jb1_bugatti)
                                .addGap(207, 207, 207))))))
        );
        jd_crear_carroLayout.setVerticalGroup(
            jd_crear_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crear_carroLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jd_crear_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_vin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crear_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jb1_seat)
                    .addComponent(jb1_skoda)
                    .addComponent(jb1_audi)
                    .addComponent(jb1_volks)
                    .addComponent(jb1_bentley)
                    .addComponent(jb1_porsche))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_crear_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb1_lamb)
                    .addComponent(jb1_bugatti))
                .addGap(18, 18, 18)
                .addGroup(jd_crear_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jb2_sedan)
                    .addComponent(jb2_familiar)
                    .addComponent(jb2_hatch)
                    .addComponent(jb2_fast)
                    .addComponent(jb2_suv))
                .addGap(18, 18, 18)
                .addGroup(jd_crear_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_puertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crear_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crear_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jb3_combustion)
                    .addComponent(jb3_electrico))
                .addGap(18, 18, 18)
                .addGroup(jd_crear_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crear_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jb4_ninguna)
                    .addComponent(jb4_micro)
                    .addComponent(jb4_convencional)
                    .addComponent(jb4_enchufable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb4_electrico)
                .addGap(18, 18, 18)
                .addGroup(jd_crear_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_pasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crear_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_ensamblaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jb_agregar_carro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VIN", "Categoria", "Marca", "Color", "Motor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtable);
        if (jtable.getColumnModel().getColumnCount() > 0) {
            jtable.getColumnModel().getColumn(0).setResizable(false);
            jtable.getColumnModel().getColumn(1).setResizable(false);
            jtable.getColumnModel().getColumn(2).setResizable(false);
            jtable.getColumnModel().getColumn(3).setResizable(false);
            jtable.getColumnModel().getColumn(4).setResizable(false);
        }

        jb_eliminar.setText("Eliminar");
        jb_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_eliminarActionPerformed(evt);
            }
        });

        jb_modificar.setText("Modificar");
        jb_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_listar_carrosLayout = new javax.swing.GroupLayout(jd_listar_carros.getContentPane());
        jd_listar_carros.getContentPane().setLayout(jd_listar_carrosLayout);
        jd_listar_carrosLayout.setHorizontalGroup(
            jd_listar_carrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_listar_carrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_listar_carrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE))
                .addContainerGap())
        );
        jd_listar_carrosLayout.setVerticalGroup(
            jd_listar_carrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listar_carrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        buttonGroup5.add(jb1_volks1);
        jb1_volks1.setText("Volkswagen ");

        jb_modificar_carro.setText("Modificar");
        jb_modificar_carro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificar_carroActionPerformed(evt);
            }
        });

        buttonGroup5.add(jb1_bentley1);
        jb1_bentley1.setText("Bentley");

        buttonGroup5.add(jb1_porsche1);
        jb1_porsche1.setText("Porsche");

        buttonGroup5.add(jb1_lamb1);
        jb1_lamb1.setText("Lamborghini");

        buttonGroup5.add(jb1_bugatti1);
        jb1_bugatti1.setText("Bugatti");

        buttonGroup6.add(jb2_sedan1);
        jb2_sedan1.setText("Sedán");

        buttonGroup6.add(jb2_familiar1);
        jb2_familiar1.setText("Familiar");

        buttonGroup6.add(jb2_hatch1);
        jb2_hatch1.setText("Hatchback");

        buttonGroup6.add(jb2_fast1);
        jb2_fast1.setText("Fastback");

        buttonGroup6.add(jb2_suv1);
        jb2_suv1.setText("SUV");

        jLabel11.setText("Carroceria:");

        tf_puertas1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("############"))));

        jLabel12.setText("Puertas:");

        jLabel13.setText("Color:");

        buttonGroup7.add(jb3_combustion1);
        jb3_combustion1.setText("Combustión");

        jLabel14.setText("Motor:");

        buttonGroup7.add(jb3_electrico1);
        jb3_electrico1.setText("Eléctrico");

        jLabel15.setText("Precio:");

        tf_precio1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("############"))));

        jLabel16.setText("Hibridación:");

        buttonGroup8.add(jb4_ninguna1);
        jb4_ninguna1.setText("Ninguna");

        jLabel17.setText("Cantidad de Pasajeros:");

        buttonGroup8.add(jb4_micro1);
        jb4_micro1.setText("Microhíbrido");

        jLabel18.setText("Ensamblaje(En Segundos):");

        buttonGroup8.add(jb4_convencional1);
        jb4_convencional1.setText("Híbrido Convencional");

        tf_vin1.setEditable(false);
        tf_vin1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("############"))));

        buttonGroup5.add(jb1_seat1);
        jb1_seat1.setText("SEAT");

        jLabel19.setText("VIN:");

        jLabel20.setText("Marca:");

        buttonGroup8.add(jb4_enchufable1);
        jb4_enchufable1.setText("Híbrido Enchufable");

        buttonGroup8.add(jb4_electrico1);
        jb4_electrico1.setText("Eléctrico");

        buttonGroup5.add(jb1_skoda1);
        jb1_skoda1.setText("Škoda");

        tf_pasajeros1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("############"))));

        buttonGroup5.add(jb1_audi1);
        jb1_audi1.setText("Audi");

        tf_ensamblaje1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("############"))));

        javax.swing.GroupLayout jd_modificar_carroLayout = new javax.swing.GroupLayout(jd_modificar_carro.getContentPane());
        jd_modificar_carro.getContentPane().setLayout(jd_modificar_carroLayout);
        jd_modificar_carroLayout.setHorizontalGroup(
            jd_modificar_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificar_carroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_modificar_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_modificar_carroLayout.createSequentialGroup()
                        .addGroup(jd_modificar_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jd_modificar_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_modificar_carro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_vin1)
                            .addComponent(tf_puertas1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_color1)
                            .addComponent(tf_precio1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_pasajeros1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_ensamblaje1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jd_modificar_carroLayout.createSequentialGroup()
                                .addGroup(jd_modificar_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jd_modificar_carroLayout.createSequentialGroup()
                                        .addComponent(jb2_sedan1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb2_familiar1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb2_hatch1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb2_fast1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb2_suv1))
                                    .addGroup(jd_modificar_carroLayout.createSequentialGroup()
                                        .addComponent(jb3_combustion1)
                                        .addGap(46, 46, 46)
                                        .addComponent(jb3_electrico1))
                                    .addGroup(jd_modificar_carroLayout.createSequentialGroup()
                                        .addComponent(jb4_ninguna1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb4_micro1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb4_convencional1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb4_enchufable1))
                                    .addGroup(jd_modificar_carroLayout.createSequentialGroup()
                                        .addComponent(jb1_seat1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb1_skoda1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb1_audi1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb1_volks1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb1_bentley1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb1_porsche1)))
                                .addGap(0, 20, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modificar_carroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jd_modificar_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modificar_carroLayout.createSequentialGroup()
                                .addComponent(jb4_electrico1)
                                .addGap(302, 302, 302))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modificar_carroLayout.createSequentialGroup()
                                .addComponent(jb1_lamb1)
                                .addGap(61, 61, 61)
                                .addComponent(jb1_bugatti1)
                                .addGap(207, 207, 207))))))
        );
        jd_modificar_carroLayout.setVerticalGroup(
            jd_modificar_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificar_carroLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jd_modificar_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tf_vin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_modificar_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jb1_seat1)
                    .addComponent(jb1_skoda1)
                    .addComponent(jb1_audi1)
                    .addComponent(jb1_volks1)
                    .addComponent(jb1_bentley1)
                    .addComponent(jb1_porsche1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_modificar_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb1_lamb1)
                    .addComponent(jb1_bugatti1))
                .addGap(18, 18, 18)
                .addGroup(jd_modificar_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jb2_sedan1)
                    .addComponent(jb2_familiar1)
                    .addComponent(jb2_hatch1)
                    .addComponent(jb2_fast1)
                    .addComponent(jb2_suv1))
                .addGap(18, 18, 18)
                .addGroup(jd_modificar_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_puertas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_modificar_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tf_color1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_modificar_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jb3_combustion1)
                    .addComponent(jb3_electrico1))
                .addGap(18, 18, 18)
                .addGroup(jd_modificar_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf_precio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_modificar_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jb4_ninguna1)
                    .addComponent(jb4_micro1)
                    .addComponent(jb4_convencional1)
                    .addComponent(jb4_enchufable1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb4_electrico1)
                .addGap(18, 18, 18)
                .addGroup(jd_modificar_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tf_pasajeros1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_modificar_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tf_ensamblaje1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jb_modificar_carro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jb_generalista.setText("Generalista");
        jb_generalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_generalistaActionPerformed(evt);
            }
        });

        jb_premium.setText("Premium");
        jb_premium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_premiumActionPerformed(evt);
            }
        });

        jb_deportivo.setText("Deportivo");
        jb_deportivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_deportivoActionPerformed(evt);
            }
        });

        tf_vin_search.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("############"))));

        jLabel21.setText("Buscar por VIN");

        jLabel22.setText("Buscar por Marca");

        jb_buscar_porVin.setText("Buscar");
        jb_buscar_porVin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_buscar_porVinActionPerformed(evt);
            }
        });

        jb_buscar_porMarca.setText("Buscar");
        jb_buscar_porMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_buscar_porMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_busqueda_especificaLayout = new javax.swing.GroupLayout(jd_busqueda_especifica.getContentPane());
        jd_busqueda_especifica.getContentPane().setLayout(jd_busqueda_especificaLayout);
        jd_busqueda_especificaLayout.setHorizontalGroup(
            jd_busqueda_especificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_busqueda_especificaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jd_busqueda_especificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb_buscar_porMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_marca_search)
                    .addComponent(jb_buscar_porVin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_vin_search)
                    .addGroup(jd_busqueda_especificaLayout.createSequentialGroup()
                        .addComponent(jb_generalista, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addComponent(jb_premium, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(jb_deportivo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
            .addGroup(jd_busqueda_especificaLayout.createSequentialGroup()
                .addGroup(jd_busqueda_especificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_busqueda_especificaLayout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(jLabel21))
                    .addGroup(jd_busqueda_especificaLayout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLabel22)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_busqueda_especificaLayout.setVerticalGroup(
            jd_busqueda_especificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_busqueda_especificaLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jd_busqueda_especificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_premium, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_generalista, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_deportivo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(tf_vin_search, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_buscar_porVin)
                .addGap(62, 62, 62)
                .addComponent(jLabel22)
                .addGap(39, 39, 39)
                .addComponent(tf_marca_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_buscar_porMarca)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jt_especifica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VIN", "Categoria", "Marca", "Color", "Motor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jt_especifica);
        if (jt_especifica.getColumnModel().getColumnCount() > 0) {
            jt_especifica.getColumnModel().getColumn(0).setResizable(false);
            jt_especifica.getColumnModel().getColumn(1).setResizable(false);
            jt_especifica.getColumnModel().getColumn(2).setResizable(false);
            jt_especifica.getColumnModel().getColumn(3).setResizable(false);
            jt_especifica.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jd_listar_especificoLayout = new javax.swing.GroupLayout(jd_listar_especifico.getContentPane());
        jd_listar_especifico.getContentPane().setLayout(jd_listar_especificoLayout);
        jd_listar_especificoLayout.setHorizontalGroup(
            jd_listar_especificoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listar_especificoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        jd_listar_especificoLayout.setVerticalGroup(
            jd_listar_especificoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listar_especificoLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        crear_carro.setText("Crear Nuevo Carro");
        crear_carro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_carroActionPerformed(evt);
            }
        });

        listar_carros.setText("Listar Todos");
        listar_carros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listar_carrosActionPerformed(evt);
            }
        });

        listar_carros_especiales.setText("Listar Con Filtro");
        listar_carros_especiales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listar_carros_especialesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(crear_carro, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(listar_carros, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(listar_carros_especiales, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crear_carro, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listar_carros, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listar_carros_especiales, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(227, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crear_carroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_carroActionPerformed
        // TODO add your handling code here:
        jd_crear_carro.setModal(true);
        jd_crear_carro.pack();
        jd_crear_carro.setLocationRelativeTo(this);
        jd_crear_carro.setVisible(true);
    }//GEN-LAST:event_crear_carroActionPerformed

    private void jb_agregar_carroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregar_carroActionPerformed
        // TODO add your handling code here:
        try {
            int vin, puertas, precio, pasajeros, ensamblaje;
            String marca = "", carroceria = "", motor = "", hibridacion = "", color, categoria = "";
            vin = Integer.parseInt(tf_vin.getText());
            puertas = Integer.parseInt(tf_puertas.getText());
            precio = Integer.parseInt(tf_precio.getText());
            pasajeros = Integer.parseInt(tf_pasajeros.getText());
            ensamblaje = Integer.parseInt(tf_ensamblaje.getText());
            color = tf_color.getText();
            if (jb1_seat.isSelected()) {
                marca = "SEAT";
                categoria = "Autos generalistas";
            } else if (jb1_skoda.isSelected()) {
                marca = "Škoda";
                categoria = "Autos generalistas";
            } else if (jb1_audi.isSelected()) {
                marca = "Audi";
                categoria = "Autos premium";
            } else if (jb1_volks.isSelected()) {
                marca = "Volkswagen";
                categoria = "Autos premium";
            } else if (jb1_bentley.isSelected()) {
                marca = "Bentley";
                categoria = "Autos premium";
            } else if (jb1_porsche.isSelected()) {
                marca = "Porsche";
                categoria = "Autos deportivos";
            } else if (jb1_lamb.isSelected()) {
                marca = "Lamborghini";
                categoria = "Autos deportivos";
            } else if (jb1_bugatti.isSelected()) {
                marca = "Bugatti";
                categoria = "Autos deportivos";
            }

            if (jb2_sedan.isSelected()) {
                carroceria = "Sedán";
            } else if (jb2_familiar.isSelected()) {
                carroceria = "Familiar";
            } else if (jb2_hatch.isSelected()) {
                carroceria = "Hatchback";
            } else if (jb2_fast.isSelected()) {
                carroceria = "Fastback";
            } else if (jb2_suv.isSelected()) {
                carroceria = "SUV";
            }

            if (jb3_combustion.isSelected()) {
                motor = "Combustión";
            } else if (jb3_electrico.isSelected()) {
                motor = "Eléctrico";
            }

            if (jb4_ninguna.isSelected()) {
                hibridacion = "Ninguna";
            } else if (jb4_micro.isSelected()) {
                hibridacion = "Microhíbrido";
            } else if (jb4_enchufable.isSelected()) {
                hibridacion = "Híbrido Enchufable";
            } else if (jb4_convencional.isSelected()) {
                hibridacion = "Híbrido Convencional";
            } else if (jb4_electrico.isSelected()) {
                hibridacion = "Eléctrico";
            }

            Dba db = new Dba("./base.accdb");
            db.conectar();
            try {
                db.query.execute("insert into carros values('" + vin + "', '" + categoria + "', '" + marca + "', '" + carroceria + "', " + puertas + ", '" + color + "', '" + motor + "', '" + precio
                        + "', '" + hibridacion + "', '" + pasajeros + "', '" + ensamblaje + "')");
                /*db.query.execute("INSERT INTO carros"
                        + " (vin,categoria,marca,carroceria,puertas,color,motor,precio,hibridacion,pasajeros,ensamblaje)"
                        + " VALUES ('" + vin + "', '" + categoria + "', '" + marca + "', '" + carroceria + "', '" + puertas + "', '" + color + "', '" + motor + "', '" + precio
                        + "', '" + hibridacion + "', '" + pasajeros + "', '" + ensamblaje + "')");*/
                db.commit();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            db.desconectar();

            tf_vin.setText("");
            tf_puertas.setText("");
            tf_precio.setText("");
            tf_pasajeros.setText("");
            tf_ensamblaje.setText("");
            tf_color.setText("");
            JOptionPane.showMessageDialog(this, "Se ha agregado exitosamente");
            jd_crear_carro.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error");
        }
    }//GEN-LAST:event_jb_agregar_carroActionPerformed

    private void listar_carrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listar_carrosActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel modelo = (DefaultTableModel) jtable.getModel();
            modelo.setRowCount(0);
            Dba db = new Dba("./base.accdb");
            db.conectar();
            try {
                db.query.execute("select* from carros");
                ResultSet rs = db.query.getResultSet();
                while (rs.next()) {
                    int vin = rs.getInt(1);
                    String categoria = rs.getString(2);
                    String marca = rs.getString(3);
                    String color = rs.getString(6);
                    String motor = rs.getString(7);
                    Object[] nuevo = {vin, categoria, marca, color, motor};
                    modelo.addRow(nuevo);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            db.desconectar();
            jtable.setModel(modelo);
            jd_listar_carros.setModal(true);
            jd_listar_carros.pack();
            jd_listar_carros.setLocationRelativeTo(this);
            jd_listar_carros.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error");
        }
    }//GEN-LAST:event_listar_carrosActionPerformed

    private void jb_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eliminarActionPerformed
        // TODO add your handling code here:
        try {
            if (jtable.getSelectedRow() >= 0) {
                int po = jtable.getSelectedRow();
                int vin = (int) jtable.getValueAt(po, 0);
                Dba db = new Dba("./base.accdb");
                db.conectar();
                try {
                    db.query.execute("delete from carros where vin=" + vin);
                    db.commit();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                db.desconectar();
                DefaultTableModel modelo = (DefaultTableModel) jtable.getModel();
                modelo.removeRow(po);
                jtable.setModel(modelo);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error");
        }
    }//GEN-LAST:event_jb_eliminarActionPerformed

    private void jb_modificar_carroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificar_carroActionPerformed
        // TODO add your handling code here:
        try {
            int puertas, precio, pasajeros, ensamblaje;
            String marca = "", carroceria = "", motor = "", hibridacion = "", color, categoria = "";
            puertas = Integer.parseInt(tf_puertas1.getText());
            precio = Integer.parseInt(tf_precio1.getText());
            pasajeros = Integer.parseInt(tf_pasajeros1.getText());
            ensamblaje = Integer.parseInt(tf_ensamblaje1.getText());
            color = tf_color1.getText();
            if (jb1_seat1.isSelected()) {
                marca = "SEAT";
                categoria = "Autos generalistas";
            } else if (jb1_skoda1.isSelected()) {
                marca = "Škoda";
                categoria = "Autos generalistas";
            } else if (jb1_audi1.isSelected()) {
                marca = "Audi";
                categoria = "Autos premium";
            } else if (jb1_volks1.isSelected()) {
                marca = "Volkswagen";
                categoria = "Autos premium";
            } else if (jb1_bentley1.isSelected()) {
                marca = "Bentley";
                categoria = "Autos premium";
            } else if (jb1_porsche1.isSelected()) {
                marca = "Porsche";
                categoria = "Autos deportivos";
            } else if (jb1_lamb1.isSelected()) {
                marca = "Lamborghini";
                categoria = "Autos deportivos";
            } else if (jb1_bugatti1.isSelected()) {
                marca = "Bugatti";
                categoria = "Autos deportivos";
            }

            if (jb2_sedan1.isSelected()) {
                carroceria = "Sedán";
            } else if (jb2_familiar1.isSelected()) {
                carroceria = "Familiar";
            } else if (jb2_hatch1.isSelected()) {
                carroceria = "Hatchback";
            } else if (jb2_fast1.isSelected()) {
                carroceria = "Fastback";
            } else if (jb2_suv1.isSelected()) {
                carroceria = "SUV";
            }

            if (jb3_combustion1.isSelected()) {
                motor = "Combustión";
            } else if (jb3_electrico1.isSelected()) {
                motor = "Eléctrico";
            }

            if (jb4_ninguna1.isSelected()) {
                hibridacion = "Ninguna";
            } else if (jb4_micro1.isSelected()) {
                hibridacion = "Microhíbrido";
            } else if (jb4_enchufable1.isSelected()) {
                hibridacion = "Híbrido Enchufable";
            } else if (jb4_convencional1.isSelected()) {
                hibridacion = "Híbrido Convencional";
            } else if (jb4_electrico1.isSelected()) {
                hibridacion = "Eléctrico";
            }

            int numeroVIN = (int) jtable.getValueAt(poCarro, 0);
            Dba db = new Dba("./base.accdb");
            db.conectar();
            try {
                db.query.execute("update carros "
                        + "set categoria='" + categoria + "'"
                        + "where vin=" + numeroVIN);
                db.query.execute("update carros "
                        + "set marca='" + marca + "'"
                        + "where vin=" + numeroVIN);
                db.query.execute("update carros "
                        + "set carroceria='" + carroceria + "'"
                        + "where vin=" + numeroVIN);
                db.query.execute("update carros "
                        + "set puertas='" + puertas + "'"
                        + "where vin=" + numeroVIN);
                db.query.execute("update carros "
                        + "set color='" + color + "'"
                        + "where vin=" + numeroVIN);
                db.query.execute("update carros "
                        + "set motor='" + motor + "'"
                        + "where vin=" + numeroVIN);
                db.query.execute("update carros "
                        + "set precio='" + precio + "'"
                        + "where vin=" + numeroVIN);
                db.query.execute("update carros "
                        + "set hibridacion='" + hibridacion + "'"
                        + "where vin=" + numeroVIN);
                db.query.execute("update carros "
                        + "set pasajeros='" + pasajeros + "'"
                        + "where vin=" + numeroVIN);
                db.query.execute("update carros "
                        + "set ensamblaje='" + ensamblaje + "' "
                        + "where vin=" + numeroVIN);
                db.commit();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            db.desconectar();

            DefaultTableModel modelo = (DefaultTableModel) jtable.getModel();
            Object[] nuevo = {numeroVIN, categoria, marca, color, motor};
            modelo.insertRow(poCarro, nuevo);
            modelo.removeRow(poCarro + 1);
            jtable.setModel(modelo);

            JOptionPane.showMessageDialog(this, "Se ha modificado exitosamente");
            jd_modificar_carro.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error");
        }
    }//GEN-LAST:event_jb_modificar_carroActionPerformed

    private void jb_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificarActionPerformed
        // TODO add your handling code here:
        try {
            if (jtable.getSelectedRow() >= 0) {
                int vin1 = 0, puertas = 0, precio = 0, pasajeros = 0, ensamblaje = 0;
                String marca = "", carroceria = "", motor = "", hibridacion = "", color = "", categoria = "";
                poCarro = jtable.getSelectedRow();
                int vin = (int) jtable.getValueAt(poCarro, 0);
                Dba db = new Dba("./base.accdb");
                db.conectar();
                try {
                    db.query.execute("select* from carros where vin=" + vin);
                    ResultSet rs = db.query.getResultSet();
                    while (rs.next()) {
                        vin1 = rs.getInt(1);
                        categoria = rs.getString(2);
                        marca = rs.getString(3);
                        carroceria = rs.getString(4);
                        puertas = rs.getInt(5);
                        color = rs.getString(6);
                        motor = rs.getString(7);
                        precio = rs.getInt(8);
                        hibridacion = rs.getString(9);
                        pasajeros = rs.getInt(10);
                        ensamblaje = rs.getInt(11);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                db.desconectar();

                if (marca.equals("SEAT")) {
                    jb1_seat1.setSelected(true);
                } else if (marca.equals("Škoda")) {
                    jb1_skoda1.setSelected(true);
                } else if (marca.equals("Audi")) {
                    jb1_audi1.setSelected(true);
                } else if (marca.equals("Volkswagen")) {
                    jb1_volks1.setSelected(true);
                } else if (marca.equals("Bentley")) {
                    jb1_bentley1.setSelected(true);
                } else if (marca.equals("Porsche")) {
                    jb1_porsche1.setSelected(true);
                } else if (marca.equals("Lamborghini")) {
                    jb1_lamb1.setSelected(true);
                } else if (marca.equals("Bugatti")) {
                    jb1_bugatti1.setSelected(true);
                }

                if (carroceria.equals("Sedán")) {
                    jb2_sedan1.setSelected(true);
                } else if (carroceria.equals("Familiar")) {
                    jb2_familiar1.setSelected(true);
                } else if (carroceria.equals("Hatchback")) {
                    jb2_hatch1.setSelected(true);
                } else if (carroceria.equals("Fastback")) {
                    jb2_fast1.setSelected(true);
                } else if (carroceria.equals("SUV")) {
                    jb2_suv1.setSelected(true);
                }

                if (motor.equals("Combustión")) {
                    jb3_combustion1.setSelected(true);
                } else if (motor.equals("Eléctrico")) {
                    jb3_electrico1.setSelected(true);
                }

                if (hibridacion.equals("Ninguna")) {
                    jb4_ninguna1.setSelected(true);
                } else if (hibridacion.equals("Microhíbrido")) {
                    jb4_micro1.setSelected(true);
                } else if (hibridacion.equals("Híbrido Enchufable")) {
                    jb4_enchufable1.setSelected(true);
                } else if (hibridacion.equals("Híbrido Convencional")) {
                    jb4_convencional1.setSelected(true);
                } else if (hibridacion.equals("Eléctrico")) {
                    jb4_electrico1.setSelected(true);
                }

                tf_vin1.setText(String.valueOf(vin1));
                tf_puertas1.setText(String.valueOf(puertas));
                tf_precio1.setText(String.valueOf(precio));
                tf_pasajeros1.setText(String.valueOf(pasajeros));
                tf_ensamblaje1.setText(String.valueOf(ensamblaje));
                tf_color1.setText(color);

                jd_modificar_carro.setModal(true);
                jd_modificar_carro.pack();
                jd_modificar_carro.setLocationRelativeTo(this);
                jd_modificar_carro.setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error");
        }
    }//GEN-LAST:event_jb_modificarActionPerformed

    private void jb_generalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_generalistaActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel modelo = (DefaultTableModel) jt_especifica.getModel();
            modelo.setRowCount(0);
            Dba db = new Dba("./base.accdb");
            db.conectar();
            try {
                db.query.execute("select* from carros");
                ResultSet rs = db.query.getResultSet();
                while (rs.next()) {
                    if (rs.getString(2).equals("Autos generalistas")) {
                        int vin = rs.getInt(1);
                        String categoria = rs.getString(2);
                        String marca = rs.getString(3);
                        String color = rs.getString(6);
                        String motor = rs.getString(7);
                        Object[] nuevo = {vin, categoria, marca, color, motor};
                        modelo.addRow(nuevo);
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            db.desconectar();
            jt_especifica.setModel(modelo);
            jd_listar_especifico.setModal(true);
            jd_listar_especifico.pack();
            jd_listar_especifico.setLocationRelativeTo(this);
            jd_listar_especifico.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error");
        }
    }//GEN-LAST:event_jb_generalistaActionPerformed

    private void listar_carros_especialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listar_carros_especialesActionPerformed
        // TODO add your handling code here:
        jd_busqueda_especifica.setModal(true);
        jd_busqueda_especifica.pack();
        jd_busqueda_especifica.setLocationRelativeTo(this);
        jd_busqueda_especifica.setVisible(true);
    }//GEN-LAST:event_listar_carros_especialesActionPerformed

    private void jb_premiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_premiumActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel modelo = (DefaultTableModel) jt_especifica.getModel();
            modelo.setRowCount(0);
            Dba db = new Dba("./base.accdb");
            db.conectar();
            try {
                db.query.execute("select* from carros");
                ResultSet rs = db.query.getResultSet();
                while (rs.next()) {
                    if (rs.getString(2).equals("Autos premium")) {
                        int vin = rs.getInt(1);
                        String categoria = rs.getString(2);
                        String marca = rs.getString(3);
                        String color = rs.getString(6);
                        String motor = rs.getString(7);
                        Object[] nuevo = {vin, categoria, marca, color, motor};
                        modelo.addRow(nuevo);
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            db.desconectar();
            jt_especifica.setModel(modelo);
            jd_listar_especifico.setModal(true);
            jd_listar_especifico.pack();
            jd_listar_especifico.setLocationRelativeTo(this);
            jd_listar_especifico.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error");
        }
    }//GEN-LAST:event_jb_premiumActionPerformed

    private void jb_deportivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_deportivoActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel modelo = (DefaultTableModel) jt_especifica.getModel();
            modelo.setRowCount(0);
            Dba db = new Dba("./base.accdb");
            db.conectar();
            try {
                db.query.execute("select* from carros");
                ResultSet rs = db.query.getResultSet();
                while (rs.next()) {
                    if (rs.getString(2).equals("Autos deportivos")) {
                        int vin = rs.getInt(1);
                        String categoria = rs.getString(2);
                        String marca = rs.getString(3);
                        String color = rs.getString(6);
                        String motor = rs.getString(7);
                        Object[] nuevo = {vin, categoria, marca, color, motor};
                        modelo.addRow(nuevo);
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            db.desconectar();
            jt_especifica.setModel(modelo);
            jd_listar_especifico.setModal(true);
            jd_listar_especifico.pack();
            jd_listar_especifico.setLocationRelativeTo(this);
            jd_listar_especifico.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error");
        }
    }//GEN-LAST:event_jb_deportivoActionPerformed

    private void jb_buscar_porVinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_buscar_porVinActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel modelo = (DefaultTableModel) jt_especifica.getModel();
            modelo.setRowCount(0);
            int ingresado = Integer.parseInt(tf_vin_search.getText());
            Dba db = new Dba("./base.accdb");
            db.conectar();
            try {
                db.query.execute("select* from carros");
                ResultSet rs = db.query.getResultSet();
                while (rs.next()) {
                    if (rs.getInt(1) == ingresado) {
                        int vin = rs.getInt(1);
                        String categoria = rs.getString(2);
                        String marca = rs.getString(3);
                        String color = rs.getString(6);
                        String motor = rs.getString(7);
                        Object[] nuevo = {vin, categoria, marca, color, motor};
                        modelo.addRow(nuevo);
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            db.desconectar();
            jt_especifica.setModel(modelo);
            tf_vin_search.setText("");
            jd_listar_especifico.setModal(true);
            jd_listar_especifico.pack();
            jd_listar_especifico.setLocationRelativeTo(this);
            jd_listar_especifico.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error");
        }
    }//GEN-LAST:event_jb_buscar_porVinActionPerformed

    private void jb_buscar_porMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_buscar_porMarcaActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel modelo = (DefaultTableModel) jt_especifica.getModel();
            modelo.setRowCount(0);
            String ingresado = tf_marca_search.getText();
            Dba db = new Dba("./base.accdb");
            db.conectar();
            try {
                db.query.execute("select* from carros");
                ResultSet rs = db.query.getResultSet();
                while (rs.next()) {
                    if (rs.getString(3).equalsIgnoreCase(ingresado)) {
                        int vin = rs.getInt(1);
                        String categoria = rs.getString(2);
                        String marca = rs.getString(3);
                        String color = rs.getString(6);
                        String motor = rs.getString(7);
                        Object[] nuevo = {vin, categoria, marca, color, motor};
                        modelo.addRow(nuevo);
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            db.desconectar();
            jt_especifica.setModel(modelo);
            tf_marca_search.setText("");
            jd_listar_especifico.setModal(true);
            jd_listar_especifico.pack();
            jd_listar_especifico.setLocationRelativeTo(this);
            jd_listar_especifico.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error");
        }
    }//GEN-LAST:event_jb_buscar_porMarcaActionPerformed

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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.JButton crear_carro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton jb1_audi;
    private javax.swing.JRadioButton jb1_audi1;
    private javax.swing.JRadioButton jb1_bentley;
    private javax.swing.JRadioButton jb1_bentley1;
    private javax.swing.JRadioButton jb1_bugatti;
    private javax.swing.JRadioButton jb1_bugatti1;
    private javax.swing.JRadioButton jb1_lamb;
    private javax.swing.JRadioButton jb1_lamb1;
    private javax.swing.JRadioButton jb1_porsche;
    private javax.swing.JRadioButton jb1_porsche1;
    private javax.swing.JRadioButton jb1_seat;
    private javax.swing.JRadioButton jb1_seat1;
    private javax.swing.JRadioButton jb1_skoda;
    private javax.swing.JRadioButton jb1_skoda1;
    private javax.swing.JRadioButton jb1_volks;
    private javax.swing.JRadioButton jb1_volks1;
    private javax.swing.JRadioButton jb2_familiar;
    private javax.swing.JRadioButton jb2_familiar1;
    private javax.swing.JRadioButton jb2_fast;
    private javax.swing.JRadioButton jb2_fast1;
    private javax.swing.JRadioButton jb2_hatch;
    private javax.swing.JRadioButton jb2_hatch1;
    private javax.swing.JRadioButton jb2_sedan;
    private javax.swing.JRadioButton jb2_sedan1;
    private javax.swing.JRadioButton jb2_suv;
    private javax.swing.JRadioButton jb2_suv1;
    private javax.swing.JRadioButton jb3_combustion;
    private javax.swing.JRadioButton jb3_combustion1;
    private javax.swing.JRadioButton jb3_electrico;
    private javax.swing.JRadioButton jb3_electrico1;
    private javax.swing.JRadioButton jb4_convencional;
    private javax.swing.JRadioButton jb4_convencional1;
    private javax.swing.JRadioButton jb4_electrico;
    private javax.swing.JRadioButton jb4_electrico1;
    private javax.swing.JRadioButton jb4_enchufable;
    private javax.swing.JRadioButton jb4_enchufable1;
    private javax.swing.JRadioButton jb4_micro;
    private javax.swing.JRadioButton jb4_micro1;
    private javax.swing.JRadioButton jb4_ninguna;
    private javax.swing.JRadioButton jb4_ninguna1;
    private javax.swing.JButton jb_agregar_carro;
    private javax.swing.JButton jb_buscar_porMarca;
    private javax.swing.JButton jb_buscar_porVin;
    private javax.swing.JButton jb_deportivo;
    private javax.swing.JButton jb_eliminar;
    private javax.swing.JButton jb_generalista;
    private javax.swing.JButton jb_modificar;
    private javax.swing.JButton jb_modificar_carro;
    private javax.swing.JButton jb_premium;
    private javax.swing.JDialog jd_busqueda_especifica;
    private javax.swing.JDialog jd_crear_carro;
    private javax.swing.JDialog jd_listar_carros;
    private javax.swing.JDialog jd_listar_especifico;
    private javax.swing.JDialog jd_modificar_carro;
    private javax.swing.JTable jt_especifica;
    private javax.swing.JTable jtable;
    private javax.swing.JButton listar_carros;
    private javax.swing.JButton listar_carros_especiales;
    private javax.swing.JTextField tf_color;
    private javax.swing.JTextField tf_color1;
    private javax.swing.JFormattedTextField tf_ensamblaje;
    private javax.swing.JFormattedTextField tf_ensamblaje1;
    private javax.swing.JTextField tf_marca_search;
    private javax.swing.JFormattedTextField tf_pasajeros;
    private javax.swing.JFormattedTextField tf_pasajeros1;
    private javax.swing.JFormattedTextField tf_precio;
    private javax.swing.JFormattedTextField tf_precio1;
    private javax.swing.JFormattedTextField tf_puertas;
    private javax.swing.JFormattedTextField tf_puertas1;
    private javax.swing.JFormattedTextField tf_vin;
    private javax.swing.JFormattedTextField tf_vin1;
    private javax.swing.JFormattedTextField tf_vin_search;
    // End of variables declaration//GEN-END:variables
    int poCarro;
}
