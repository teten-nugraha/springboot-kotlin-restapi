package id.restfulapi.springkotlin.exception

import org.springframework.http.HttpStatus

class EmployeeNotFoundException(val statusCode: HttpStatus, val reason: String) : Exception()