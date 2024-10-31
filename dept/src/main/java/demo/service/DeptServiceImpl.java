package demo.service;/**
 * @Author:zhoayu
 * @Date:2024/10/31 18:19
 * @Description:demo.code
 * @version:1.0
 */

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import pojo.Dept;

import java.util.List;

/**
 * @ClassName DeptServiceImpl
 * @Description //TODO 
 * @Author zhaoyu
 * @Date 2024/10/31
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Reference
    private DeptDubboService deptDubboService;

    @Override
    public List<Dept> findAllDepts() {
        return deptDubboService.findAllDepts();
    }
}

 