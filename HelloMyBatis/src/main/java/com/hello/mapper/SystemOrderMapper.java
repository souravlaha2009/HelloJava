package com.hello.mapper;

import com.hello.model.SystemOrder;
import java.util.List;

public interface SystemOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_order
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_order
     *
     * @mbg.generated
     */
    int insert(SystemOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_order
     *
     * @mbg.generated
     */
    SystemOrder selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_order
     *
     * @mbg.generated
     */
    List<SystemOrder> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SystemOrder record);
}