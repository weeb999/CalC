import java.awt.*;
public class Calc extends javax.swing.JFrame {
    
    String operators = null;
    double number1 =0, number2 = 0;
    

    
    public Calc() {
        initComponents();
        
        buans.setBackground(Color.yellow);
        
        bu1.setBackground(Color.black);
        bu1.setForeground(Color.white);
        bu2.setBackground(Color.black);
        bu2.setForeground(Color.white);
        bu3.setBackground(Color.black);
        bu3.setForeground(Color.white);
        bu4.setBackground(Color.black);
        bu4.setForeground(Color.white);
        bu5.setBackground(Color.black);
        bu5.setForeground(Color.white);
        bu6.setBackground(Color.black);
        bu6.setForeground(Color.white);
        bu7.setBackground(Color.black);
        bu7.setForeground(Color.white);
        bu8.setBackground(Color.black);
        bu8.setForeground(Color.white);
        bu9.setBackground(Color.black);
        bu9.setForeground(Color.white);
        bu0.setBackground(Color.black);
        bu0.setForeground(Color.white);
        
        buadd.setBackground(Color.gray);
        buadd.setForeground(Color.white);
        busub.setBackground(Color.gray);
        busub.setForeground(Color.white);
        bumulti.setBackground(Color.gray);
        bumulti.setForeground(Color.white);
        budivi.setBackground(Color.gray);
        budivi.setForeground(Color.white);
        label.setForeground(Color.gray);
        
        budel.setBackground(Color.darkGray);
        budel.setForeground(Color.white);
        buc.setBackground(Color.darkGray);
        buc.setForeground(Color.white);
        
        budot.setBackground(Color.orange);
        budot.setForeground(Color.black);
        
    }

   
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jButton16 = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        tf = new javax.swing.JTextField();
        buans = new javax.swing.JButton();
        buadd = new javax.swing.JButton();
        bu8 = new javax.swing.JButton();
        bu9 = new javax.swing.JButton();
        bu7 = new javax.swing.JButton();
        bu4 = new javax.swing.JButton();
        bu5 = new javax.swing.JButton();
        bu6 = new javax.swing.JButton();
        bu1 = new javax.swing.JButton();
        bu2 = new javax.swing.JButton();
        bu3 = new javax.swing.JButton();
        bu0 = new javax.swing.JButton();
        budot = new javax.swing.JButton();
        budel = new javax.swing.JButton();
        buc = new javax.swing.JButton();
        busub = new javax.swing.JButton();
        bumulti = new javax.swing.JButton();
        budivi = new javax.swing.JButton();

        jButton16.setText("jButton16");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        label.setBackground(new java.awt.Color(1, 240, 240));
        label.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("CALCULATOR");

        tf.setFont(new java.awt.Font("Tahoma", 0, 18));
        tf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfActionPerformed(evt);
            }
        });

        buans.setText("ANS");
        buans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buansActionPerformed(evt);
            }
        });

        buadd.setText("+");
        buadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buaddActionPerformed(evt);
            }
        });

        bu8.setText("8");
        bu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu8ActionPerformed(evt);
            }
        });

        bu9.setText("9");
        bu9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu9ActionPerformed(evt);
            }
        });

        bu7.setText("7");
        bu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu7ActionPerformed(evt);
            }
        });

        bu4.setText("4");
        bu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu4ActionPerformed(evt);
            }
        });

        bu5.setText("5");
        bu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu5ActionPerformed(evt);
            }
        });

        bu6.setText("6");
        bu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu6ActionPerformed(evt);
            }
        });

        bu1.setText("1");
        bu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu1ActionPerformed(evt);
            }
        });

        bu2.setText("2");
        bu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu2ActionPerformed(evt);
            }
        });

        bu3.setText("3");
        bu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu3ActionPerformed(evt);
            }
        });

        bu0.setText("0");
        bu0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu0ActionPerformed(evt);
            }
        });

        budot.setText(".");
        budot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                budotActionPerformed(evt);
            }
        });

        budel.setText("DEL");
        budel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                budelActionPerformed(evt);
            }
        });

        buc.setText("C");
        buc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bucActionPerformed(evt);
            }
        });

        busub.setText("-");
        busub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busubActionPerformed(evt);
            }
        });

        bumulti.setText("*");
        bumulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bumultiActionPerformed(evt);
            }
        });

        budivi.setText("/");
        budivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                budiviActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tf)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(budel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buc, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(busub, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bumulti, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(budivi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bu0, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(budot, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bu1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bu2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(bu3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bu4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bu7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bu5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bu8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bu9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bu6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buadd, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buans, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buans, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(budel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buc, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(busub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bumulti, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(budivi, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bu8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bu9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bu7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bu5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bu6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bu4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bu2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bu3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bu1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bu0, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(budot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label)
                .addContainerGap())
        );

        pack();
    }

    private void tfActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void bu9ActionPerformed(java.awt.event.ActionEvent evt) {
        
        tf.setText(tf.getText()+"9");
    }

    private void bu6ActionPerformed(java.awt.event.ActionEvent evt) {
    
        tf.setText(tf.getText()+"6");
    }

    private void bu3ActionPerformed(java.awt.event.ActionEvent evt) {
        
        tf.setText(tf.getText()+"3");
    }

    private void budotActionPerformed(java.awt.event.ActionEvent evt) {
        
        tf.setText(tf.getText()+".");
    }

    private void bucActionPerformed(java.awt.event.ActionEvent evt) {
        
        
        String s = tf.getText();
        
        tf.setText(s.substring(0,s.length()-1));
    }

    private void buaddActionPerformed(java.awt.event.ActionEvent evt) {
        number1 = Double.parseDouble(tf.getText()) ;
        tf.setText("");
        operators = "+";
    }

    private void buansActionPerformed(java.awt.event.ActionEvent evt) {
         number2 = Double.parseDouble(tf.getText()) ;
         
         double result = 0;
         
         if(operators=="+")
             result=number1+number2;
         else if(operators=="-")
             result=number1-number2;
         else if(operators=="*")
             result=number1*number2;
         else if(operators=="/")
             result=number1/number2;
         
         tf.setText(result+"");
         
         operators=null;         
    }

    private void bu7ActionPerformed(java.awt.event.ActionEvent evt) {
        tf.setText(tf.getText()+"7");
    }

    private void bu0ActionPerformed(java.awt.event.ActionEvent evt) {
        tf.setText(tf.getText()+"0");
    }

    private void busubActionPerformed(java.awt.event.ActionEvent evt) {
        number1 = Double.parseDouble(tf.getText()) ;
        tf.setText("");
        operators = "-";
    }

    private void bu1ActionPerformed(java.awt.event.ActionEvent evt) {
        tf.setText(tf.getText()+"1");
    }

    private void bu4ActionPerformed(java.awt.event.ActionEvent evt) {
        tf.setText(tf.getText()+"4");
    }

    private void bu5ActionPerformed(java.awt.event.ActionEvent evt) {
        tf.setText(tf.getText()+"5");
    }

    private void bu2ActionPerformed(java.awt.event.ActionEvent evt) {
        tf.setText(tf.getText()+"2");
    }

    private void bu8ActionPerformed(java.awt.event.ActionEvent evt) {
        tf.setText(tf.getText()+"8");
    }

    private void bumultiActionPerformed(java.awt.event.ActionEvent evt) {
        number1 = Double.parseDouble(tf.getText()) ;
        tf.setText("");
        operators = "*";
    }

    private void budiviActionPerformed(java.awt.event.ActionEvent evt) {
        number1 = Double.parseDouble(tf.getText()) ;
        tf.setText("");
        operators = "/";
        }
    

    private void budelActionPerformed(java.awt.event.ActionEvent evt) {
        tf.setText("");
    }    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton bu0;
    private javax.swing.JButton bu1;
    private javax.swing.JButton bu2;
    private javax.swing.JButton bu3;
    private javax.swing.JButton bu4;
    private javax.swing.JButton bu5;
    private javax.swing.JButton bu6;
    private javax.swing.JButton bu7;
    private javax.swing.JButton bu8;
    private javax.swing.JButton bu9;
    private javax.swing.JButton buadd;
    private javax.swing.JButton buans;
    private javax.swing.JButton buc;
    private javax.swing.JButton budel;
    private javax.swing.JButton budivi;
    private javax.swing.JButton budot;
    private javax.swing.JButton bumulti;
    private javax.swing.JButton busub;
    private javax.swing.JButton jButton16;
    private javax.swing.JLabel label;
    private javax.swing.JTextField tf;
    
}
