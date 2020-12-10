package com.ali.Icontroller;

import com.ali.entity.CourseAll;
import com.ali.entity.CourseInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("courseprovider")
public interface CourseInterfaceController {
    @GetMapping("getCourseInfo")
    List<CourseInfo> getCourseInfo(@RequestParam("uid")int uid);
    @GetMapping("getCourseByUC")
    CourseInfo getCourseByUC(@RequestParam("uid")int uid,@RequestParam("couid")int couid);
    @GetMapping("getCourseAll")
    List<CourseAll> getCourseAll();
}
