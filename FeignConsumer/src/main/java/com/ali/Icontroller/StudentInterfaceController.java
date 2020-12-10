package com.ali.Icontroller;

import com.ali.entity.Student;
import com.ali.entity.StudentInfo;
import com.ali.entity.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("studentProvider")
public interface StudentInterfaceController {
    @GetMapping("/selectOne")
    Student getStudent(@RequestParam("id") int id) ;

    @GetMapping("/getStudentInfo")
    StudentInfo getStudentInfo(@RequestParam("uid") int uid) ;

    @PostMapping("updateStu")
    Student updateStu(@RequestBody Student student);

//    @RequestLine(value = "POST /updateStudent")
//    Student updateStudent(@Param("student") Student student,@Param ("user")User user);
}
