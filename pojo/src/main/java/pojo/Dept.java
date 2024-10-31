package pojo;/**
 * @Author:zhoayu
 * @Date:2024/10/31 09:44
 * @Description:pojo
 * @version:1.0
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName Dept
 * @Description //TODO 
 * @Author zhaoyu
 * @Date 2024/10/31
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept implements Serializable {
    private Integer id;
    private String name;
}

 