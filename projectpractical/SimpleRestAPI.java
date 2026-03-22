// package com.example.demo;

// import org.springframework.web.bind.annotation.*;

// @RestController
// public class StudentController {

  
//     @GetMapping("/get")
//     public String getStudent() {
//         return "GET: Student fetched";
//     }


//     @PostMapping("/post")
//     public String addStudent() {
//         return "POST: Student added";
//     }

//     @PutMapping("/put")
//     public String updateStudent() {
//         return "PUT: Student updated";
//     }

 
//     @DeleteMapping("/delete")
//     public String deleteStudent() {
//         return "DELETE: Student deleted";
//     }
// }
// import com.sun.net.httpserver.HttpServer;
// import com.sun.net.httpserver.HttpExchange;
// import com.sun.net.httpserver.HttpHandler;

// import java.io.IOException;
// import java.io.OutputStream;
// import java.net.InetSocketAddress;

// public class SimpleRestAPI {

//     static String student = "No Student";

//     public static void main(String[] args) throws Exception {

//         HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

//         server.createContext("/student", new StudentHandler());

//         server.setExecutor(null);
//         server.start();

//         System.out.println("Server started at http://localhost:8000/student");
//     }

//     static class StudentHandler implements HttpHandler {

//         @Override
//         public void handle(HttpExchange exchange) throws IOException {

//             String method = exchange.getRequestMethod();
//             String response = "";

//             switch (method) {
//                 case "GET":
//                     response = "GET Student: " + student;
//                     break;

//                 case "POST":
//                     student = "Atharva";
//                     response = "POST Student Created: " + student;
//                     break;

//                 case "PUT":
//                     student = "Atharva Gupta";
//                     response = "PUT Student Updated: " + student;
//                     break;

//                 case "DELETE":
//                     student = "No Student";
//                     response = "DELETE Student Removed";
//                     break;

//                 default:
//                     response = "Unsupported HTTP Method";
//             }

//             exchange.sendResponseHeaders(200, response.length());
//             OutputStream os = exchange.getResponseBody();
//             os.write(response.getBytes());
//             os.close();
//         }
//     }
// }


import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    List<String> students = new ArrayList<>();

    // GET - Fetch all students
    @GetMapping
    public List<String> getStudents() {
        return students;
    }

    // POST - Add a new student
    @PostMapping
    public String addStudent(@RequestBody String name) {
        students.add(name);
        return "Student added";
    }

    // PUT - Update a student
    @PutMapping("/{index}")
    public String updateStudent(@PathVariable int index,
                                @RequestBody String name) {
        students.set(index, name);
        return "Student updated";
    }

    // DELETE - Remove a student
    @DeleteMapping("/{index}")
    public String deleteStudent(@PathVariable int index) {
        students.remove(index);
        return "Student deleted";
    }
}






Server started at http://localhost:8000/student

GET Student: No Student
POST Student Created: Atharva Gupta
GET Student: Atharva Gupta
PUT Student Updated: Atharva Gupta
GET Student: Atharva Gupta
DELETE Student Removed
GET Student: No Student
