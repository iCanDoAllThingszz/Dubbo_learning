package pojo;/**
 * @Author:zhoayu
 * @Date:2024/10/31 09:46
 * @Description:pojo
 * @version:1.0
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName Emp
 * @Description //TODO 
 * @Author zhaoyu
 * @Date 2024/10/31
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp implements Serializable {
    private Integer id;

    private String name;

    private String photo;

    private Integer did;
}

 