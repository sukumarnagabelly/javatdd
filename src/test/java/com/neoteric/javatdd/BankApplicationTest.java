package com.neoteric.javatdd;

import com.neoteric.javatdd.model1.Account;
import com.neoteric.javatdd.model1.BankApplication;
import com.neoteric.javatdd.service1.BankService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankApplicationTest {
    @Test
    public void amountGreaterThan5000(){
        BankApplication details=new BankApplication();
       details.firstName="sukumar";
       details.age=26;
       details.lastName="nagabelly";
       details.nameOfBank="sbi";
       details.address="hyderabad";
       details.depositAmount=6000;
        Account    account=new Account();
       account.accountNo=123456789;
       details.contactNumber=8185882881L;
       details.date="6-7-2024";
        BankService service=new BankService();
        account=service.getaccount(details);
        Assertions.assertNotNull(account.ifscCode);
        Assertions.assertNotNull(account.pin);
        Assertions.assertNotNull(account.accountNo);


//        System.out.println("details.firstName:"+details.firstName);
//        System.out.println(details.lastName);
//        System.out.println(details.nameOfBank);
//        System.out.println(details.address);
//        System.out.println(account.accountNo);git
//        System.out.println(details.contactNumber);
//        System.out.println(details.date);
       // System.out.println();

    }
    @Test
    public void amountlessthan5000() {
        BankApplication details = new BankApplication();
        details.firstName = "sukumar";
        details.age = 26;
        details.lastName = "nagabelly";
        details.nameOfBank = "sbi";
        details.address = "hyderabad";
        details.depositAmount = 4000;
        Account account = new Account();
        account.accountNo = 123456789;
        details.contactNumber = 8185882881L;
        details.date = "6-7-2024";
        BankService service = new BankService();
        account = service.getaccount(details);
        Assertions.assertNull(account);



    }
}
