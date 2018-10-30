package com.infy.vo;

import com.infy.controller.DtoTest;

import static org.junit.Assert.*;

/**
 * Created by rishi.khurana on 9/14/2018.
 */
public class EmployeeDetailsTest extends DtoTest<EmployeeDetails>{
    @Override
    protected EmployeeDetails getInstance() {
        return new EmployeeDetails();
    }
}