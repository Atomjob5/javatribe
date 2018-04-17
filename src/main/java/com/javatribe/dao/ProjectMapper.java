<<<<<<< HEAD
package com.javatribe.dao;

import com.javatribe.pojo.Project;

public interface ProjectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Project record);

    int insertSelective(Project record);

    Project selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKeyWithBLOBs(Project record);

    int updateByPrimaryKey(Project record);
=======
package com.javatribe.dao;

import com.javatribe.pojo.Project;

public interface ProjectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Project record);

    int insertSelective(Project record);

    Project selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKeyWithBLOBs(Project record);

    int updateByPrimaryKey(Project record);
>>>>>>> 606757e18a5290dc7b1c5524ce5edd08e14e318d
}