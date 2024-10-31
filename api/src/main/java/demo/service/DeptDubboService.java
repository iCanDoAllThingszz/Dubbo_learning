package demo.service;

import pojo.Dept;

import java.util.List;

/**
 * @Author:zhoayu
 * @Date:2024/10/31 18:10
 * @Description:demo.service
 * @version:1.0
 */

public interface DeptDubboService {

    List<Dept> findAllDepts();
}
