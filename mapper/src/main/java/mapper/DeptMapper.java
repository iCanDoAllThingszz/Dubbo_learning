package mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import pojo.Dept;

import java.util.List;

/**
 * @Author:zhoayu
 * @Date:2024/10/31 12:07
 * @Description:mapper
 * @version:1.0
 */
@Mapper
public interface DeptMapper {

    public List<Dept> findAllDepts();
}
