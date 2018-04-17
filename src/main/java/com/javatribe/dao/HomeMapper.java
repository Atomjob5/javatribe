<<<<<<< HEAD
package com.javatribe.dao;

import com.javatribe.pojo.Home;

public interface HomeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Home record);

    int insertSelective(Home record);

    Home selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Home record);

    int updateByPrimaryKeyWithBLOBs(Home record);

    int updateByPrimaryKey(Home record);
=======
package com.javatribe.dao;

import com.javatribe.pojo.Home;

public interface HomeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Home record);

    int insertSelective(Home record);

    Home selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Home record);

    int updateByPrimaryKeyWithBLOBs(Home record);

    int updateByPrimaryKey(Home record);
>>>>>>> 606757e18a5290dc7b1c5524ce5edd08e14e318d
}