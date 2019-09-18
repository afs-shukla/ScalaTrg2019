package highorderfunction

import fundamental.EmployeeUtil

object HighOrderFunction extends App{

  val employees = EmployeeUtil.createEmployee(30)


 //println( employees filter( (emp) => emp.salGTFilter(80000)))

 println( employees filter ((emp) => emp.sal >=80000))


 println(employees filter (EmployeeUtil.empSalFilter80000))

// function returns function
  println( employees map (EmployeeUtil.calcBonous) map ( f => f(10) ))



}
