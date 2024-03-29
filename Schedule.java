/*
 * Schedule.java brings up a clickable 24*7 grid.
 * each item in the grid, when clicked, opens a LabStats object
 * where the user can enter how many tutors/GAs/proctors for that time block
 */
package senior.project;

import java.awt.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author Orc 9
 */
public class Schedule extends javax.swing.JFrame {

    /**
     * Constructor called by frontScreen.java
     * filename is the complete path for the file location
     * if isNew==true, then a file is created with the path and 
     * overwrites a file if they share the same path and file name
     */
    public Schedule(boolean isNew, String fileName)
    {
        //Netbeans initialize
        initComponents();
        //store path in instance variable
        path = fileName;
        //if creating new file
        if(isNew)
        {
            //create a 2D array of new LabStats objects
            for(int i=0; i<7; i++)
                for(int j=0; j<24; j++)
                    labWindows[i][j] = new LabStats();
            //make a new file
            PrintWriter newFile = null;
            try {
                newFile = new PrintWriter(path);
                newFile.close();
            } catch (FileNotFoundException ex) {
                //Logger.getLogger(Schedule.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("ERROR!");
            }
        }
        //else, open a file with given path
        else
        {
            Scanner inputStream = null;
            //FileInputStream needs to be checked when initialized
            try
            {
                //initialize file input stream from name of file provided by user
                inputStream = new Scanner(new FileInputStream(path));
            }
            catch(FileNotFoundException e)
            {
                //throw exception and kill the program if the file can't be found
                System.out.println("ERROR: FILE NOT FOUND!");
                System.exit(0);
            }
            //initialize LabStats objects based on file
            for(int i=0; i<7; i++)
                for(int j=0; j<24; j++)
                    labWindows[i][j] = new LabStats(inputStream.nextInt(),inputStream.nextInt(),inputStream.nextInt(),inputStream.nextInt(),inputStream.nextInt(),inputStream.nextInt(),inputStream.nextInt(),inputStream.nextInt());
        }
    }
    //default constructor not used
    public Schedule() {/**
        path = "test.sch";
        for(int i=0; i<7; i++)
            for(int j=0; j<24; j++)
                labWindows[i][j] = new LabStats();*/
//        initComponents();
//        
//        path = "test.sch";
//        if(false)
//        {
//            for(int i=0; i<7; i++)
//                for(int j=0; j<24; j++)
//                    labWindows[i][j] = new LabStats();
//            PrintWriter newFile = null;
//            try {
//                newFile = new PrintWriter(path);
//                newFile.close();
//            } catch (FileNotFoundException ex) {
//                //Logger.getLogger(Schedule.class.getName()).log(Level.SEVERE, null, ex);
//                System.out.println("ERROR!");
//            }
//        }
//        else
//        {
//            Scanner inputStream = null;
//            //FileInputStream needs to be checked when initialized
//            try
//            {
//                //initialize file input stream from name of file provided by user
//                inputStream = new Scanner(new FileInputStream(path));
//            }
//            catch(FileNotFoundException e)
//            {
//                //throw exception and kill the program if the file can't be found
//                System.out.println("ERROR: FILE NOT FOUND!");
//                System.exit(0);
//            }
//            for(int i=0; i<7; i++)
//                for(int j=0; j<24; j++)
//                    labWindows[i][j] = new LabStats(inputStream.nextInt(),inputStream.nextInt(),inputStream.nextInt(),inputStream.nextInt(),inputStream.nextInt(),inputStream.nextInt(),inputStream.nextInt(),inputStream.nextInt());
//        }
//        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel169 = new javax.swing.JPanel()
        {
            public void paint(Graphics g)
            {
                drawingArea.display(g);
            }
        };
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(1000, 1020));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Monday");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sunday");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Wednesday");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tuesday");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Friday");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Thursday");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Saturday");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("2am");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("midnight");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("6am");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("4am");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("10am");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("8am");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("2pm");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("noon");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("6pm");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("4pm");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("8pm");

        jPanel169.setBackground(new java.awt.Color(255, 255, 255));
        jPanel169.setPreferredSize(new java.awt.Dimension(0, 907));
        jPanel169.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel169MouseMoved(evt);
            }
        });
        jPanel169.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel169FocusGained(evt);
            }
        });
        jPanel169.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel169MouseClicked(evt);
            }
        });
        jPanel169.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jPanel169ComponentMoved(evt);
            }
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jPanel169ComponentResized(evt);
            }
        });

        javax.swing.GroupLayout jPanel169Layout = new javax.swing.GroupLayout(jPanel169);
        jPanel169.setLayout(jPanel169Layout);
        jPanel169Layout.setHorizontalGroup(
            jPanel169Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel169Layout.setVerticalGroup(
            jPanel169Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 907, Short.MAX_VALUE)
        );

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("10pm");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("midnight");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel169, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel169, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel10)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel9)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel12)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel11)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel14)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel13)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel16)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel15)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel18)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel17)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel20)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel19)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel169FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel169FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel169FocusGained

    private void jPanel169MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel169MouseMoved
        // TODO add your handling code here:
        //when cursor moves over the grid, update the colors
        drawingArea.fillRects(jPanel169.getGraphics());
    }//GEN-LAST:event_jPanel169MouseMoved

    private void jPanel169MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel169MouseClicked
        // TODO add your handling code here:
        //when the mouse clicks on a rectangle, get the x and y coordinate,
        //and use integer division to determine the appropriate LabStats object
        int x = (int)this.jPanel169.getMousePosition().getX()/105;
        int y = (int)this.jPanel169.getMousePosition().getY()/38;
        //System.out.println(x+"   "+y);
        //open the LabStats object's window
        labWindows[x][y].setVisible(true);
    }//GEN-LAST:event_jPanel169MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void jPanel169ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel169ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel169ComponentMoved

    private void jPanel169ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel169ComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel169ComponentResized

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        //when the window closes, open the file, and print all of the LabStats
        //objects' variables to the file
        //System.out.println("Closing");
        PrintWriter file = null;
        try {
            file = new PrintWriter(path);
            for(int i=0; i<7; i++)
                for(int j=0; j<24; j++)
                {
                    file.print(labWindows[i][j]);
                    file.println();     //print a new line for each object for readability of file
                }
            file.close();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Schedule.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR!");
        }
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Schedule().setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel169;
    // End of variables declaration//GEN-END:variables
    //private variables
    private MyJPanel drawingArea = new MyJPanel();
    private LabStats[][] labWindows = new LabStats[7][24];
    private String path;
    
    //display panel
    //used to draw on the jPanel
    public class MyJPanel extends javax.swing.JPanel
    {
        //draws grid lines and calls method to color rectangles
        public void display (Graphics g)
        {
            //line color = black (0,0,0)
            g.setColor(new Color(0,0,0));
            //draw horizontal, then vertical lines
            for(int i=1; i<24; i++)
                g.drawLine(0, 38*i, 879, 38*i);
            for(int i=1; i<7; i++)
                g.drawLine(105*i, 0, 105*i, 1000);
            //call method to color rectangles
            fillRects(g);
        }
        
        //colors rectangles on the grid
        private void fillRects(Graphics g)
        {
            //color all of the rectangles
            for(int i=0; i<7; i++)
                for(int j=0; j<24; j++)
                {
                    //if the lab is open, color with green
                    //else, color with light red
                    if(labWindows[i][j].getIsOpen())
                        g.setColor(new Color(50,255,50)); //green
                    else
                        g.setColor(new Color(255,150,150)); //light red
                    
                    //see if this is the top row or left column
                    //if yes, move the rectangle fill by 1 pixel to fit correctly
                    int x=1;
                    int y=1;
                    if(i==0)
                        x--;
                    if(j==0)
                        y--;
                    //fill the rectangles accordingly
                    g.fillRect(105*i+x, 38*j+y, 105-x, 38-y);
                    //if this is the last column, fill the rectangles a little further
                    //since the last column is 7 pixels wider than the middle columns
                    if(i==6)
                        g.fillRect(105*i+x, 38*j+y, 111, 38-y);
                }
        }
    }
}