package org.henry.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.henry.model.user;
import org.henry.model.userExample;

public interface userMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Aug 29 13:52:21 CST 2017
     */
    int countByExample(userExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Aug 29 13:52:21 CST 2017
     */
    int deleteByExample(userExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Aug 29 13:52:21 CST 2017
     */
    int deleteByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Aug 29 13:52:21 CST 2017
     */
    int insert(user record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Aug 29 13:52:21 CST 2017
     */
    int insertSelective(user record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Aug 29 13:52:21 CST 2017
     */
    List<user> selectByExample(userExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Aug 29 13:52:21 CST 2017
     */
    user selectByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Aug 29 13:52:21 CST 2017
     */
    int updateByExampleSelective(@Param("record") user record, @Param("example") userExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Aug 29 13:52:21 CST 2017
     */
    int updateByExample(@Param("record") user record, @Param("example") userExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Aug 29 13:52:21 CST 2017
     */
    int updateByPrimaryKeySelective(user record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Aug 29 13:52:21 CST 2017
     */
    int updateByPrimaryKey(user record);
}