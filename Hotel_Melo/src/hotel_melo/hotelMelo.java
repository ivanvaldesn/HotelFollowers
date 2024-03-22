
package hotel_melo;


public class hotelMelo {
    public static void main(String[] args) {
        
        
            System.out.println("Facturación por alimentos 24 de marzo de 2024 , Hotel Melo");
            System.out.println("----------------------------------");
    
            
            //Creamos los empleados
            Recepcionist recepcionist = new Recepcionist();
            Chef chef= new Chef("Frances");
            
            //Creamos un cliente tipo guest
            Guest guest1= new Guest();
            Inventory inventoryGuest1 = new Inventory(guest1,0) ;
            
            //Creamosun cliente soccerPlayer
            SoccerPlayer soccerPlayer=new SoccerPlayer();
            Inventory inventorySoccerPlayer = new Inventory(soccerPlayer,0);
            
            
            soccerPlayer.orderFood(chef,inventorySoccerPlayer,recepcionist);
            recepcionist.generateFoodBill(inventorySoccerPlayer);
            
            
    }
}
