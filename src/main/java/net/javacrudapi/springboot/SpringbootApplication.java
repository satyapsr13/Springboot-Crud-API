package net.javacrudapi.springboot;

import net.javacrudapi.springboot.model.Employee;
import net.javacrudapi.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootApplication.class, args);


    }

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {

        Employee employee=new Employee();
        employee.setFirstName("Satya ");
        employee.setLastName("Prakash");
        employee.setEmailId("satyapsr14@gmail.com");
        employeeRepository.save(employee);

        Employee employee1=new Employee();
        employee1.setFirstName("Prem ");
        employee1.setLastName("Jatt");
        employee1.setEmailId("prem@gmail.com");
        employeeRepository.save(employee1);
    }

//    employeeRepository.save()
}
