package demo.service;/**
 * @Author:zhoayu
 * @Date:2024/10/31 18:14
 * @Description:demo.service
 * @version:1.0
 */

import mapper.DeptMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import pojo.Dept;

import java.util.List;

/**
 * @ClassName DubboServiceImpl
 * @Description //TODO 
 * @Author zhaoyu
 * @Date 2024/10/31
 */
@Service
public class DeptDubboServiceImpl implements DeptDubboService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findAllDepts() {
        return deptMapper.findAllDepts();
    }
}

 