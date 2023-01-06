import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JListFrame {

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt){
        int val = jList1.getModel().getSize();
        PrintWriter writer null;
        try{
            writer = new PrintWriter("List.txt");
            writer.println(val);
            for(int i=0; i<val; i++){

                writer.println(jList1.getModel().getElementAt(i));

            }


        }catch (IOException ex){

            Logger.getLogger(JListFrame.class.getName()).log(Level.SEVERE, null, ex);

        }finally{
            try{

                writer.close();

            }catch (Exception ex) {

                Logger.getLogger(JListFrame.class.getName()).log(Level.SEVERE, null, ex);

            }

        }

        BufferedWriter bw = null;
        FileWriter file = null;
        try{
            file = new FileWriter("List.txt", false);
            bw = new BufferedWriter(file);
            bw.write(""+val);
            for(int i=0; i<val; i++){
                bw.write("\n");
                bw.write(""+jList1.getModel().getElementAt(i));


            }


        }catch (IOException ex) {



        }



    }


}
