package com.neoteric.javatdd;

import com.neoteric.javatdd.model.Address;
import com.neoteric.javatdd.model.Admission;
import com.neoteric.javatdd.model.Student;
import com.neoteric.javatdd.service.StudentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentFormTest {

    @Test
    public  void  test(){
        Student student=new Student();
        student.firstName="sukumar";
        student.age=7;
        student.standard="I";
        Address address=new Address();
        address.area="kphb";
        address.city="hitechcity";
        address.flatNo="200";
        address.pincode="506015";
        student.address=address;

        StudentService service=new StudentService();
        Admission admission   =service.getAdmission(student);
        Assertions.assertNotNull(admission.rollNumber);
        Assertions.assertEquals(2000,admission.fee);
    }
}
