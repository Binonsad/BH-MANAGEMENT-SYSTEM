package boardinghousemanagement;

/**
 *
 * @author User
 */
public class BoardingHouseManagement {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Loading_Screen l =new Loading_Screen();
          l.setVisible(true);
          BoardingHouseManagement m= new BoardingHouseManagement();
     
    
                try 
                  {
                for(int x=0;x<=100;x++)
                      {
              Thread.sleep(110);
              l.jprogress.setText(Integer.toString(x)+"%");
              l.jbar.setValue(x);
            
                 if(x==100)
                     {
                   l.setVisible(false);
                 
            
                     }
                     }
                   } 
                 catch (Exception e) 
                 {
                 }
                
        Admin_Log_in LoginFrame = new Admin_Log_in();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
                
    }
    
}
