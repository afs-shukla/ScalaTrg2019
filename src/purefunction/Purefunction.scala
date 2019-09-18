package purefunction

import fundamental.{Employee, EmployeeUtil}

object Purefunction extends App{

val employees = EmployeeUtil.createEmployee(30)

  def findEmp(emps:List[Employee], amt:BigDecimal) : List[String] = {
    employees.filter (  _.sal >= amt).map (  _.empName)
  }

  println(findEmp(employees,80000))
  println(findEmp(employees,80000))
  println(findEmp(employees,80000))
  println(findEmp(employees,80000))
  println(findEmp(employees,80000))
  println(findEmp(employees,80000))



}
