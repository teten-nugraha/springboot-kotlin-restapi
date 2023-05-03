package id.restfulapi.springkotlin.repository

import id.restfulapi.springkotlin.models.Employee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository: JpaRepository<Employee, Long>{
}