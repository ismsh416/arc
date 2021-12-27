/*
 * package com.evoke.controller;
 * 
 * import java.util.Date;
 * 
 * import org.springframework.format.annotation.DateTimeFormat; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.validation.BindException; import
 * org.springframework.validation.annotation.Validated; import
 * org.springframework.web.bind.annotation.ExceptionHandler; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.RequestParam; import
 * org.springframework.web.bind.annotation.RestController; import
 * org.springframework.web.context.request.WebRequest;
 * 
 * import com.evoke.entity.DataInput; import com.evoke.entity.TestData;
 * 
 * @RestController public class TestConroller {
 * 
 * @GetMapping("/echo") public String accept() { return "WELCOME "; }
 * 
 * @GetMapping // @DateTimeFormat(pattern="yyyy-MM-dd") public String
 * accept1(@RequestParam("startDate") @DateTimeFormat(pattern = "yyyy-MM-dd")
 * Date startDate,
 * 
 * @RequestParam("endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date
 * endDate) { return "startDate :: " + startDate + "  AND  endDate :: " +
 * endDate; }
 * 
 * @GetMapping("/get") public String accepte2(DataInput input) {
 * System.out.println("input :: " + input); return "startDate :: " +
 * input.getStartDate() + "  AND  endDate :: " + input.getEndDate(); }
 * 
 * @GetMapping("/var") public String accepte3(TestData input) {
 * System.out.println("input :: " + input); return "var :: " + input.getVar() +
 * "  AND  var1 :: " + input.getVar1(); }
 * 
 * @ExceptionHandler(BindException.class) public final ResponseEntity<Object>
 * handleAllExceptions(Exception ex, WebRequest request) {
 * System.out.println(":::::::::::::::: CALLING EXCEPTION ::::::::::::"); 
 * return new ResponseEntity<Object>("INVALID DATE FORMATE",
 * HttpStatus.INTERNAL_SERVER_ERROR); } }
 */