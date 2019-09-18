package fundamental

import scala.annotation.tailrec
import scala.language.postfixOps
object EmployeeUtil {

  val empNames = List("Harish","Nagesh","Karim", "Sanu","Satish", "Kishore", "Kumar", "Geeta", "Rajani","Kunal","Joseph","anuj")
  val empAges = List(20,44,22,34,55,43,23,35,37,38,39,49)
  val empSal = List(20000,50000,34000,55000,64000,25000,36000,70000,52000,67000,80000,78000)
    val r = new scala.util.Random
    val randName = empNames(r.nextInt(11))


    def createEmployee(count:Int) : List[Employee] = {
      @tailrec
      def emplHelper(remCount:Int, emps:List[Employee]):List[Employee] ={
        println(s"${remCount} and ${emps}")
        remCount match {
          case 0 => emps
          case _ => {
            val rNameInx = r.nextInt(11)
            val rAgeInx = r.nextInt(11)
            val rSalInx = r.nextInt(11)
            emplHelper(remCount-1,Employee(empNames(rNameInx), empAges(rAgeInx), empSal(rSalInx))::emps)
          }
        }
      }
      emplHelper(count,List.empty)

    }

  def empSalFilter80000(employee: Employee) :Boolean = {
    if (employee.sal >= 80000) true else false
  }

  def calcBonous(employee: Employee) : BigDecimal => (String, BigDecimal) = {

    (percentage:BigDecimal) => (employee.empName, (employee.sal)*percentage/100)

  }

}
