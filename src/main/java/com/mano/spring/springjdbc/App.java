package com.mano.spring.springjdbc;

import com.mano.spring.springjdbc.business.EmployeeBusiness;
import com.mano.spring.springjdbc.business.EmployeeBusinessimpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("configmetadata.xml");
        EmployeeBusiness employeeBusiness=(EmployeeBusinessimpl)context.getBean("employeeBusinessimpl");
        
        employeeBusiness.printEmployeeHikes();
        
        ((AbstractApplicationContext) context).close();
    }
}
