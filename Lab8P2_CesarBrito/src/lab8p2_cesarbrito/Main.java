package lab8p2_cesarbrito;

import javax.swing.JOptionPane;

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
        jb_agregar_clase = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
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

        jb_agregar_clase.setText("Agregar");
        jb_agregar_clase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregar_claseActionPerformed(evt);
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
                            .addComponent(jb_agregar_clase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jb_agregar_clase, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        crear_carro.setText("Crear Nuevo Carro");
        crear_carro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_carroActionPerformed(evt);
            }
        });

        listar_carros.setText("Listar Todos");

        listar_carros_especiales.setText("Listar Con Filtro");

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

    private void jb_agregar_claseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregar_claseActionPerformed
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
    }//GEN-LAST:event_jb_agregar_claseActionPerformed

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
    private javax.swing.JButton crear_carro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jb1_audi;
    private javax.swing.JRadioButton jb1_bentley;
    private javax.swing.JRadioButton jb1_bugatti;
    private javax.swing.JRadioButton jb1_lamb;
    private javax.swing.JRadioButton jb1_porsche;
    private javax.swing.JRadioButton jb1_seat;
    private javax.swing.JRadioButton jb1_skoda;
    private javax.swing.JRadioButton jb1_volks;
    private javax.swing.JRadioButton jb2_familiar;
    private javax.swing.JRadioButton jb2_fast;
    private javax.swing.JRadioButton jb2_hatch;
    private javax.swing.JRadioButton jb2_sedan;
    private javax.swing.JRadioButton jb2_suv;
    private javax.swing.JRadioButton jb3_combustion;
    private javax.swing.JRadioButton jb3_electrico;
    private javax.swing.JRadioButton jb4_convencional;
    private javax.swing.JRadioButton jb4_electrico;
    private javax.swing.JRadioButton jb4_enchufable;
    private javax.swing.JRadioButton jb4_micro;
    private javax.swing.JRadioButton jb4_ninguna;
    private javax.swing.JButton jb_agregar_clase;
    private javax.swing.JDialog jd_crear_carro;
    private javax.swing.JButton listar_carros;
    private javax.swing.JButton listar_carros_especiales;
    private javax.swing.JTextField tf_color;
    private javax.swing.JFormattedTextField tf_ensamblaje;
    private javax.swing.JFormattedTextField tf_pasajeros;
    private javax.swing.JFormattedTextField tf_precio;
    private javax.swing.JFormattedTextField tf_puertas;
    private javax.swing.JFormattedTextField tf_vin;
    // End of variables declaration//GEN-END:variables
}
