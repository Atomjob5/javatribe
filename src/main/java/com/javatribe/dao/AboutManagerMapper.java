<<<<<<< HEAD
package com.javatribe.dao;

import java.util.List;

import com.javatribe.pojo.AboutManager;

public interface AboutManagerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AboutManager record);

    int insertSelective(AboutManager record);

    AboutManager selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AboutManager record);

    int updateByPrimaryKey(AboutManager record);
    
    
=======
package com.javatribe.dao;

import java.util.List;

import com.javatribe.pojo.AboutManager;

public interface AboutManagerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AboutManager record);

    int insertSelective(AboutManager record);

    AboutManager selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AboutManager record);

    int updateByPrimaryKey(AboutManager record);
    
    
>>>>>>> 606757e18a5290dc7b1c5524ce5edd08e14e318d
}