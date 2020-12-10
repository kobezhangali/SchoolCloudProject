package com.ali.Icontroller;

import com.ali.entity.Teacher;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("teacherprovider")
public interface TeacherInterfaceController {
    @GetMapping("/selectOne")
    Teacher getTeacher(@RequestParam("id") int id) ;

    @GetMapping("getAllTeacher")
    List<Teacher> getAllTeacher();
}
