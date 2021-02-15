/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    char[] Lettre = {'a','b','c','d','e','f','g','h','i','j','k',
            'l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char[] decLettre = {'z','y','x','w','v','u','t','s','r','q','p','o','n',
                       'm','l','k','j','i','h','g','f','e','d','c','b','a'};
    char[][] matrice = new char[26][26]; // cette "matrice" pour la remplir avec une matrice de vigenere
    
     ReadFille readfille= new ReadFille();
     Cesar cear = new Cesar();
     WritteFille writtefille=new WritteFille();
        
    public Home() {
        initComponents();
        setColor(btn_1); 
        ind_1.setOpaque(true);
        resetColor(new JPanel[]{btn_2,btn_3,btn_4}, new JPanel[]{ind_2,ind_3, ind_4});
        jProgressBar1.setValue(50);
    }
    

    public static int v,i;// ndir type static ma3nah 9ima ta3ho mowahada fi ga3 les class
    public static String Methode;
    public static double [][] Data,DataX;
    
    public   void  saisie()//function of get data
            
    { 
        
           
      
       
      
      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        side_pane = new javax.swing.JPanel();
        btn_1 = new javax.swing.JPanel();
        ind_1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btn_2 = new javax.swing.JPanel();
        ind_2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btn_3 = new javax.swing.JPanel();
        ind_3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_4 = new javax.swing.JPanel();
        ind_4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btn_5 = new javax.swing.JPanel();
        ind_5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        comboBoxMethode = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        comboBoxType = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        consol = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        Alpha2_lemdaMax = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Alpha1_lemda0 = new javax.swing.JTextField();
        Key = new javax.swing.JTextField();
        Alpha2_lemdaMin = new javax.swing.JTextField();
        Alpha1_lemdaMax = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        pas_solition = new javax.swing.JTextField();
        LemdaMin = new javax.swing.JTextField();
        Lemda0 = new javax.swing.JTextField();
        Alpha2_lemda0 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        LemdaMax = new javax.swing.JTextField();
        Alpha1_lemdaMin = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        TextClear = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();

        jButton3.setBackground(java.awt.SystemColor.textHighlight);
        jButton3.setFont(new java.awt.Font("Lao UI", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Moinder_Careé");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        side_pane.setBackground(new java.awt.Color(23, 35, 51));
        side_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_1.setBackground(new java.awt.Color(23, 35, 51));
        btn_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_1MousePressed(evt);
            }
        });

        ind_1.setOpaque(false);
        ind_1.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_1Layout = new javax.swing.GroupLayout(ind_1);
        ind_1.setLayout(ind_1Layout);
        ind_1Layout.setHorizontalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_1Layout.setVerticalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Home");
        jLabel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel8MouseDragged(evt);
            }
        });
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_1Layout = new javax.swing.GroupLayout(btn_1);
        btn_1.setLayout(btn_1Layout);
        btn_1Layout.setHorizontalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_1Layout.createSequentialGroup()
                .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel8)
                .addGap(0, 49, Short.MAX_VALUE))
        );
        btn_1Layout.setVerticalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_1Layout.createSequentialGroup()
                .addGroup(btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        side_pane.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 120, -1));

        btn_2.setBackground(new java.awt.Color(23, 35, 51));
        btn_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_2MouseReleased(evt);
            }
        });

        ind_2.setOpaque(false);
        ind_2.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_2Layout = new javax.swing.GroupLayout(ind_2);
        ind_2.setLayout(ind_2Layout);
        ind_2Layout.setHorizontalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_2Layout.setVerticalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Settings");
        jLabel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel9MouseDragged(evt);
            }
        });

        javax.swing.GroupLayout btn_2Layout = new javax.swing.GroupLayout(btn_2);
        btn_2.setLayout(btn_2Layout);
        btn_2Layout.setHorizontalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_2Layout.createSequentialGroup()
                .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel9)
                .addGap(0, 40, Short.MAX_VALUE))
        );
        btn_2Layout.setVerticalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_2Layout.createSequentialGroup()
                .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 120, -1));

        btn_3.setBackground(new java.awt.Color(23, 35, 51));
        btn_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_3MousePressed(evt);
            }
        });

        ind_3.setOpaque(false);
        ind_3.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_3Layout = new javax.swing.GroupLayout(ind_3);
        ind_3.setLayout(ind_3Layout);
        ind_3Layout.setHorizontalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_3Layout.setVerticalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Users");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_3Layout = new javax.swing.GroupLayout(btn_3);
        btn_3.setLayout(btn_3Layout);
        btn_3Layout.setHorizontalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_3Layout.createSequentialGroup()
                .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btn_3Layout.setVerticalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_3Layout.createSequentialGroup()
                .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 120, -1));

        btn_4.setBackground(new java.awt.Color(23, 35, 51));
        btn_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_4MousePressed(evt);
            }
        });

        ind_4.setOpaque(false);
        ind_4.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_4Layout = new javax.swing.GroupLayout(ind_4);
        ind_4.setLayout(ind_4Layout);
        ind_4Layout.setHorizontalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_4Layout.setVerticalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Profile");

        javax.swing.GroupLayout btn_4Layout = new javax.swing.GroupLayout(btn_4);
        btn_4.setLayout(btn_4Layout);
        btn_4Layout.setHorizontalGroup(
            btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_4Layout.createSequentialGroup()
                .addComponent(ind_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel11)
                .addGap(0, 48, Short.MAX_VALUE))
        );
        btn_4Layout.setVerticalGroup(
            btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_4Layout.createSequentialGroup()
                .addComponent(ind_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 120, -1));

        btn_5.setBackground(new java.awt.Color(23, 35, 51));
        btn_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_5MouseReleased(evt);
            }
        });

        ind_5.setOpaque(false);
        ind_5.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_5Layout = new javax.swing.GroupLayout(ind_5);
        ind_5.setLayout(ind_5Layout);
        ind_5Layout.setHorizontalGroup(
            ind_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_5Layout.setVerticalGroup(
            ind_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Draw");

        javax.swing.GroupLayout btn_5Layout = new javax.swing.GroupLayout(btn_5);
        btn_5.setLayout(btn_5Layout);
        btn_5Layout.setHorizontalGroup(
            btn_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_5Layout.createSequentialGroup()
                .addComponent(ind_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel17)
                .addGap(0, 55, Short.MAX_VALUE))
        );
        btn_5Layout.setVerticalGroup(
            btn_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_5Layout.createSequentialGroup()
                .addComponent(ind_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 120, -1));

        getContentPane().add(side_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 590));

        jPanel2.setBackground(new java.awt.Color(71, 120, 197));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(123, 156, 225));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jTextField1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1.setPreferredSize(new java.awt.Dimension(2, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Search_18px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(747, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 950, 50));

        jPanel3.setBackground(new java.awt.Color(71, 120, 197));

        jPanel4.setBackground(new java.awt.Color(120, 168, 252));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(84, 127, 206));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Contacts_25px.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Calendar_25px.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Lock_25px.png"))); // NOI18N

        jProgressBar1.setBackground(new java.awt.Color(84, 127, 206));
        jProgressBar1.setForeground(new java.awt.Color(0, 204, 204));
        jProgressBar1.setPreferredSize(new java.awt.Dimension(146, 10));
        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Water_25px.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Secured_Letter_25px_2.png"))); // NOI18N

        jLabel29.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        jLabel29.setText("by MimoGustavo@gmail.com");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel15)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(508, 508, 508)
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1)))
                .addGap(40, 40, 40))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel29)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, -1, 130));

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Exit_25px.png"))); // NOI18N
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_exitMousePressed(evt);
            }
        });
        jPanel4.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, 46));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/Untitled-1.png"))); // NOI18N
        jLabel2.setToolTipText("");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -30, 100, 150));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        jLabel30.setText("by MimoGustavo@gmail.com");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 52)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("04");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("May 2018");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Friday 23 Feb ");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Méthode");

        comboBoxMethode.setBackground(javax.swing.UIManager.getDefaults().getColor("MenuItem.selectionBackground"));
        comboBoxMethode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboBoxMethode.setForeground(new java.awt.Color(255, 255, 255));
        comboBoxMethode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cesar", "Vigenere" }));
        comboBoxMethode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxMethodeActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Type");

        comboBoxType.setBackground(javax.swing.UIManager.getDefaults().getColor("MenuItem.selectionBackground"));
        comboBoxType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxType.setForeground(new java.awt.Color(255, 255, 255));
        comboBoxType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cryptage", "Décryptage" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel13))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel25))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxMethode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jLabel16)
                    .addContainerGap(633, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(312, 312, 312))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(comboBoxMethode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(comboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(236, 236, 236)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addGap(285, 285, 285)))
        );

        comboBoxType.getAccessibleContext().setAccessibleParent(jProgressBar1);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 300, 540));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(242, 247, 247));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Launch dates for the items listed ");

        consol.setColumns(30);
        consol.setFont(new java.awt.Font("Raavi", 0, 10)); // NOI18N
        consol.setRows(5);
        jScrollPane2.setViewportView(consol);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                        .addGap(113, 113, 113))))
        );

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Lao UI", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Multiply_25px.png"))); // NOI18N
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.setOpaque(false);
        jButton6.setSelected(true);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Lao UI", 0, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/add-new-document.png"))); // NOI18N
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.setOpaque(false);
        jButton7.setSelected(true);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(120, 168, 252));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setBackground(new java.awt.Color(123, 156, 225));
        jTextField2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("si DELTA < 0");
        jTextField2.setBorder(null);
        jTextField2.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField2.setPreferredSize(new java.awt.Dimension(2, 20));
        jPanel8.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 300, 20));

        Alpha2_lemdaMax.setBackground(new java.awt.Color(123, 156, 225));
        Alpha2_lemdaMax.setForeground(new java.awt.Color(255, 255, 255));
        Alpha2_lemdaMax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Alpha2_lemdaMax.setBorder(null);
        Alpha2_lemdaMax.setCaretColor(new java.awt.Color(255, 255, 255));
        Alpha2_lemdaMax.setPreferredSize(new java.awt.Dimension(2, 20));
        jPanel8.add(Alpha2_lemdaMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 40, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("The Text  Clear ");
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        Alpha1_lemda0.setBackground(new java.awt.Color(123, 156, 225));
        Alpha1_lemda0.setForeground(new java.awt.Color(255, 255, 255));
        Alpha1_lemda0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Alpha1_lemda0.setBorder(null);
        Alpha1_lemda0.setCaretColor(new java.awt.Color(255, 255, 255));
        Alpha1_lemda0.setPreferredSize(new java.awt.Dimension(2, 20));
        jPanel8.add(Alpha1_lemda0, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 40, 30));

        Key.setBackground(new java.awt.Color(123, 156, 225));
        Key.setFont(Key.getFont());
        Key.setForeground(new java.awt.Color(255, 255, 255));
        Key.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Key.setText("musique");
        Key.setBorder(null);
        Key.setCaretColor(new java.awt.Color(255, 255, 255));
        Key.setPreferredSize(new java.awt.Dimension(2, 20));
        Key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeyActionPerformed(evt);
            }
        });
        jPanel8.add(Key, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 100, 30));

        Alpha2_lemdaMin.setBackground(new java.awt.Color(123, 156, 225));
        Alpha2_lemdaMin.setForeground(new java.awt.Color(255, 255, 255));
        Alpha2_lemdaMin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Alpha2_lemdaMin.setBorder(null);
        Alpha2_lemdaMin.setCaretColor(new java.awt.Color(255, 255, 255));
        Alpha2_lemdaMin.setPreferredSize(new java.awt.Dimension(2, 20));
        Alpha2_lemdaMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alpha2_lemdaMinActionPerformed(evt);
            }
        });
        jPanel8.add(Alpha2_lemdaMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 40, 30));

        Alpha1_lemdaMax.setBackground(new java.awt.Color(123, 156, 225));
        Alpha1_lemdaMax.setForeground(new java.awt.Color(255, 255, 255));
        Alpha1_lemdaMax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Alpha1_lemdaMax.setBorder(null);
        Alpha1_lemdaMax.setCaretColor(new java.awt.Color(255, 255, 255));
        Alpha1_lemdaMax.setPreferredSize(new java.awt.Dimension(2, 20));
        jPanel8.add(Alpha1_lemdaMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 40, 30));

        jTextField10.setBackground(new java.awt.Color(123, 156, 225));
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setBorder(null);
        jTextField10.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField10.setPreferredSize(new java.awt.Dimension(2, 20));
        jPanel8.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 300, 10));

        pas_solition.setBackground(new java.awt.Color(123, 156, 225));
        pas_solition.setForeground(new java.awt.Color(255, 255, 255));
        pas_solition.setBorder(null);
        pas_solition.setCaretColor(new java.awt.Color(255, 255, 255));
        pas_solition.setPreferredSize(new java.awt.Dimension(2, 20));
        jPanel8.add(pas_solition, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 100, 20));

        LemdaMin.setBackground(new java.awt.Color(123, 156, 225));
        LemdaMin.setFont(LemdaMin.getFont());
        LemdaMin.setForeground(new java.awt.Color(255, 255, 255));
        LemdaMin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LemdaMin.setBorder(null);
        LemdaMin.setCaretColor(new java.awt.Color(255, 255, 255));
        LemdaMin.setPreferredSize(new java.awt.Dimension(2, 20));
        jPanel8.add(LemdaMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 100, 30));

        Lemda0.setBackground(new java.awt.Color(123, 156, 225));
        Lemda0.setFont(Lemda0.getFont());
        Lemda0.setForeground(new java.awt.Color(255, 255, 255));
        Lemda0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Lemda0.setBorder(null);
        Lemda0.setCaretColor(new java.awt.Color(255, 255, 255));
        Lemda0.setPreferredSize(new java.awt.Dimension(2, 20));
        jPanel8.add(Lemda0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 100, 30));

        Alpha2_lemda0.setBackground(new java.awt.Color(123, 156, 225));
        Alpha2_lemda0.setForeground(new java.awt.Color(255, 255, 255));
        Alpha2_lemda0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Alpha2_lemda0.setBorder(null);
        Alpha2_lemda0.setCaretColor(new java.awt.Color(255, 255, 255));
        Alpha2_lemda0.setPreferredSize(new java.awt.Dimension(2, 20));
        jPanel8.add(Alpha2_lemda0, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 40, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("α_1");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, 19));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("α_1");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, -1, 19));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("α_2");
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, -1, 19));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("α_2");
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, 19));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("α_2");
        jPanel8.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, -1, 19));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("α_1");
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, 19));

        jTextField4.setBackground(new java.awt.Color(123, 156, 225));
        jTextField4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("si DELTA==0");
        jTextField4.setBorder(null);
        jTextField4.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField4.setPreferredSize(new java.awt.Dimension(2, 20));
        jPanel8.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 300, 20));

        jTextField5.setBackground(new java.awt.Color(123, 156, 225));
        jTextField5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("si DELTA > 0");
        jTextField5.setBorder(null);
        jTextField5.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField5.setPreferredSize(new java.awt.Dimension(2, 20));
        jPanel8.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 300, 20));

        LemdaMax.setBackground(new java.awt.Color(123, 156, 225));
        LemdaMax.setFont(LemdaMax.getFont());
        LemdaMax.setForeground(new java.awt.Color(255, 255, 255));
        LemdaMax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LemdaMax.setBorder(null);
        LemdaMax.setCaretColor(new java.awt.Color(255, 255, 255));
        LemdaMax.setPreferredSize(new java.awt.Dimension(2, 20));
        jPanel8.add(LemdaMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 100, 30));

        Alpha1_lemdaMin.setBackground(new java.awt.Color(123, 156, 225));
        Alpha1_lemdaMin.setForeground(new java.awt.Color(255, 255, 255));
        Alpha1_lemdaMin.setBorder(null);
        Alpha1_lemdaMin.setCaretColor(new java.awt.Color(255, 255, 255));
        Alpha1_lemdaMin.setPreferredSize(new java.awt.Dimension(2, 20));
        Alpha1_lemdaMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alpha1_lemdaMinActionPerformed(evt);
            }
        });
        jPanel8.add(Alpha1_lemdaMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 40, 30));

        jButton4.setBackground(java.awt.SystemColor.textHighlight);
        jButton4.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/edit.png"))); // NOI18N
        jButton4.setText("Run");
        jButton4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.setOpaque(false);
        jButton4.setSelected(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 100, 40));

        TextClear.setBackground(new java.awt.Color(123, 156, 225));
        TextClear.setFont(TextClear.getFont());
        TextClear.setForeground(new java.awt.Color(255, 255, 255));
        TextClear.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextClear.setText("I love to listen to the radio all day");
        TextClear.setBorder(null);
        TextClear.setCaretColor(new java.awt.Color(255, 255, 255));
        TextClear.setPreferredSize(new java.awt.Dimension(2, 20));
        TextClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextClearActionPerformed(evt);
            }
        });
        jPanel8.add(TextClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 500, 50));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Key");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addGap(22, 22, 22))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 650, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MousePressed
        // TODO add your handling code here:
        setColor(btn_1); 
        ind_1.setOpaque(true);
        resetColor(new JPanel[]{btn_2,btn_3,btn_4}, new JPanel[]{ind_2,ind_3, ind_4});
    }//GEN-LAST:event_btn_1MousePressed

    private void btn_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MousePressed
        // TODO add your handling code here:
         setColor(btn_3); 
        ind_3.setOpaque(true);
        resetColor(new JPanel[]{btn_2,btn_1,btn_4}, new JPanel[]{ind_2,ind_1, ind_4});
    }//GEN-LAST:event_btn_3MousePressed

    private void btn_4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MousePressed
        // TODO add your handling code here:
          setColor(btn_4); 
        ind_4.setOpaque(true);
        resetColor(new JPanel[]{btn_2,btn_3,btn_1}, new JPanel[]{ind_2,ind_3, ind_1});
    }//GEN-LAST:event_btn_4MousePressed

    private void btn_2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseReleased
        // TODO add your handling code here:
          setColor(btn_2); 
        ind_2.setOpaque(true);
        resetColor(new JPanel[]{btn_1,btn_3,btn_4}, new JPanel[]{ind_1,ind_3, ind_4});
    }//GEN-LAST:event_btn_2MouseReleased

    int xx,xy;
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        //drag this pane
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        
        //source to drag
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void btn_exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMousePressed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_btn_exitMousePressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        
        Methode="Acp_Norme"; 
        v=2;// deux varible
       
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel9MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseDragged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel9MouseDragged

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseDragged

    private void btn_5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_5MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_5MouseReleased

    private void Alpha2_lemdaMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alpha2_lemdaMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Alpha2_lemdaMinActionPerformed

    private void Alpha1_lemdaMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alpha1_lemdaMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Alpha1_lemdaMinActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
     /*   YourType varName = (YourType)comboBox.getSelectedItem();`
     `*/
         
        String methode = comboBoxMethode.getSelectedItem().toString();
        String type = comboBoxType.getSelectedItem().toString();
        
        String textClearValue = TextClear.getText();
        String keyValue = Key.getText();
        
        writtefille.writefille("fille_a",textClearValue);//save textClear in fille A
        
        if((textClearValue=="")||(keyValue=="")){
        
        }
        else{
        
        if(methode=="Cesar"){
        
            if(type=="Cryptage"){
                
                consol.setText(consol.getText()+ System.lineSeparator()+">>> Successfully "+methode+" Cryped to ::  "+cear.crypt(3,readfille.readFille()));
                
                
            
            }
            else if(type=="Décryptage"){
                
                consol.setText(consol.getText()+ System.lineSeparator()+">>> Successfully "+methode+" Décryped to ::  "+cear.decrypt(3,textClearValue));
            
            }
        }
        else if(methode=="Vigenere"){
            
               Vigenere vigener = new Vigenere(textClearValue,keyValue, matrice,Lettre);
               matrice = vigener.CreateMatrice();//remplire la matrice par l'appelation du fonction CreateMatrice();
              
                
               
            
             if(type=="Cryptage"){
                 
                  String cryptedText = vigener.VigenereCrypte();// récéption du text crypté par l'appelation du fonction "VigenereCrypte()" à travers l'objet vigenere
                  String longKey = vigener.longKey; // obtenir le key Éte
                
                consol.setText(consol.getText()+ System.lineSeparator()+">>> Successfully "+methode+" Cryped to ::  "+cryptedText);
                
                
            
            }
            else if(type=="Décryptage"){
                
                  String  DecryptedText = vigener.VigenereCrypte();// récéption du text crypté par l'appelation du fonction "VigenereCrypte()" à travers l'objet vigenere
                  String longKey = vigener.longKey; // obtenir le key Éte
                
                consol.setText(consol.getText()+ System.lineSeparator()+">>> Successfully "+methode+" Décryped to ::  "+DecryptedText);            
            }
        }
        
        }
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TextClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextClearActionPerformed

    private void KeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KeyActionPerformed

    private void comboBoxMethodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxMethodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxMethodeActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
   
    
    private void setColor(JPanel pane)
    {
        pane.setBackground(new Color(41,57,80));
    }
    
    private void resetColor(JPanel [] pane, JPanel [] indicators)
    {
        for(int i=0;i<pane.length;i++){
           pane[i].setBackground(new Color(23,35,51));
           
        } for(int i=0;i<indicators.length;i++){
           indicators[i].setOpaque(false);           
        }
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alpha1_lemda0;
    private javax.swing.JTextField Alpha1_lemdaMax;
    private javax.swing.JTextField Alpha1_lemdaMin;
    private javax.swing.JTextField Alpha2_lemda0;
    private javax.swing.JTextField Alpha2_lemdaMax;
    private javax.swing.JTextField Alpha2_lemdaMin;
    private javax.swing.JTextField Key;
    private javax.swing.JTextField Lemda0;
    private javax.swing.JTextField LemdaMax;
    private javax.swing.JTextField LemdaMin;
    private javax.swing.JTextField TextClear;
    private javax.swing.JPanel btn_1;
    private javax.swing.JPanel btn_2;
    private javax.swing.JPanel btn_3;
    private javax.swing.JPanel btn_4;
    private javax.swing.JPanel btn_5;
    private javax.swing.JLabel btn_exit;
    private javax.swing.JComboBox comboBoxMethode;
    private javax.swing.JComboBox comboBoxType;
    private javax.swing.JTextArea consol;
    private javax.swing.JPanel ind_1;
    private javax.swing.JPanel ind_2;
    private javax.swing.JPanel ind_3;
    private javax.swing.JPanel ind_4;
    private javax.swing.JPanel ind_5;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField pas_solition;
    private javax.swing.JPanel side_pane;
    // End of variables declaration//GEN-END:variables
}
