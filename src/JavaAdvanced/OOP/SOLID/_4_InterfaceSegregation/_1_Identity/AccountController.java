package JavaAdvanced.OOP.SOLID._4_InterfaceSegregation._1_Identity;


import JavaAdvanced.OOP.SOLID._4_InterfaceSegregation._1_Identity.interfaces.Account;

public class AccountController {
    private final Account manager;

    public AccountController(Account manager) {
        this.manager = manager;
    }
    public void changePassword(String oldPass,String newPass){
        this.manager.changePassword(oldPass,newPass);
    }
}
