package ui;

import com.customer.app.controller.CustomerLoginController;
import com.customer.app.dto.CustomerLoginDTO;
public class LoginPage {

    public static void main(String args[]){
        CustomerLoginController customerLoginController = new CustomerLoginController();
        CustomerLoginDTO customerLoginDTO = new CustomerLoginDTO();
        customerLoginDTO.setUserName("john");
        customerLoginDTO.setPassword("john1231");
        try {
            String msg = customerLoginController.authenticate(customerLoginDTO);
            System.out.println(msg);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in login!!!!!!");
        }
    }
}
