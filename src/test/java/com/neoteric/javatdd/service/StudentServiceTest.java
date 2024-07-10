package com.neoteric.javatdd.service;

import com.neoteric.javatdd.model.Address;
import com.neoteric.javatdd.model.Admission;
import com.neoteric.javatdd.model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentServiceTest {


        @Test
        public  void  test(){
            Student student=new Student();
            student.firstName="sukumar";
            student.age=4;
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
            Assertions.assertEquals(1000,admission.fee);
        }
    }
