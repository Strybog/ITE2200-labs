/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.composite;

import java.util.List;

/**
 *
 * @author amritaramnauth
 */

/**
 * Component interface that defines common operations for both simple (leaf) and
 * complex objects (composite) of a composition
 */

public interface Employee {

  // prints employee details to console
  public void showEmployeeDetails();

  // adds an employee element to a container
  public void addEmployee(Employee e);

  // removes an employee element from a container
  public void removeEmployee(Employee e);

  // retrieves employee elements from a container
  public List<Employee> getEmployees();
}
