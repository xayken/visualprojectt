import java.io.*;
import javax.swing.*;

public class WriteReadDataJList extends javax.swing.JFrame {


    DefaultListModel<String> listModel;
    boolean flag;
    private JPanel panel1;
    private JButton button1;

    public WriteReadDataJList() {
        initComponents();
        listModel = new DefaultListModel<>();
        flag = true;

    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        String str = jTextField1.getText();
        if (str.equals("") || str.equalsIgnoreCase("Type Here")) {
            jTextField1.setText("Type Here");
        } else {

            listModel.addElement(str);
            jList1.setModel(listMode1);
            jTextField1.setText("");
            flag = true;
        }

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        int val = jList1.getModel().getSize();
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("List.txt");
            writer.println(val);
            for (int i = 0; i < val; i++) {
                writer.println(jList1.getModel().getElementat(i));
            }

        } catch (Exception e) {
            System.out.println("" + e);
        } finally {
            writer.close();

        }

    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

        listModel.removeAllElements();
        jlist1.setModel(listModel);


    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        if (flag) {
            BufferedReader br = null;

            try {
                br = new BufferedReader(new FileReader("List.txt"));
                int val = Integer.parseInt(br.readLine());

                for (int i = 0; i < val; i++) {

                    String ss = br.readLine();
                    listMOdel.addElement(ss);

                }

                JList1.setModel(listModel);

                flag = false;
            } catch (Exception e) {
                System.out.println("" + e);

            } finally {
                try {
                    br.close();

                } catch (Exception e) {

                    System.out.println("" + e);

                }

            }


        }


    }
}

