package demo.controller;/**
 * @Author:zhoayu
 * @Date:2024/10/31 18:24
 * @Description:demo.controller
 * @version:1.0
 */

import demo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.Dept;

import java.util.List;

/**
 * @ClassName DeptController
 * @Description //TODO 
 * @Author zhaoyu
 * @Date 2024/10/31
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping("/depts")
    public List<Dept> findAllDepts(){
         return deptService.findAllDepts();
    }

}

 