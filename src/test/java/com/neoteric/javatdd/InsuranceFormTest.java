package com.neoteric.javatdd;

import com.neoteric.javatdd.model3.Address1;
import com.neoteric.javatdd.model3.Insurance;
import com.neoteric.javatdd.model3.InsuranceForm;
import com.neoteric.javatdd.service3.InsuranceService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InsuranceFormTest {
    @Test
    public void InsuranceFormtest(){
        InsuranceForm details1=new InsuranceForm();
        details1.fullName="sukumar nagabelly";
        details1.DateOfBirth="23-2-1998";
        details1.gender="male";
        details1.emailAddress="sukumarnagabelly@gmail.com";
        details1.phoneNumber=8185882881l;
        details1.age=26;
        Address1 address1=new Address1();
        address1.area="kphb";
        address1.city="hyderabad";
        address1.flatNo="101";
        address1.pincode="506015";
        address1.street="hitechcity";
        details1.address=address1;
        InsuranceService service=new InsuranceService();
       Insurance insurance =service.getinsurance(details1);
        Assertions.assertNotNull(insurance.policyNumber);
        Assertions.assertNotNull(insurance.chosenFrequency);


//        System.out.println( details.fullName);
//        System.out.println( details.DateOfBirth);
//        System.out.println(details.gender);
//        System.out.println(details.phoneNumber);
//        System.out.println(details.policyNumber);


    }
}
