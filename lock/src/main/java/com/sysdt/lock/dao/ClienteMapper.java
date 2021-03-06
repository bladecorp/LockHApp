package com.sysdt.lock.dao;

import com.sysdt.lock.model.Cliente;
import com.sysdt.lock.model.ClienteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClienteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cliente
     *
     * @mbggenerated Sat Jul 23 14:42:17 CDT 2016
     */
    int countByExample(ClienteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cliente
     *
     * @mbggenerated Sat Jul 23 14:42:17 CDT 2016
     */
    int deleteByExample(ClienteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cliente
     *
     * @mbggenerated Sat Jul 23 14:42:17 CDT 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cliente
     *
     * @mbggenerated Sat Jul 23 14:42:17 CDT 2016
     */
    int insert(Cliente record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cliente
     *
     * @mbggenerated Sat Jul 23 14:42:17 CDT 2016
     */
    int insertSelective(Cliente record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cliente
     *
     * @mbggenerated Sat Jul 23 14:42:17 CDT 2016
     */
    List<Cliente> selectByExample(ClienteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cliente
     *
     * @mbggenerated Sat Jul 23 14:42:17 CDT 2016
     */
    Cliente selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cliente
     *
     * @mbggenerated Sat Jul 23 14:42:17 CDT 2016
     */
    int updateByExampleSelective(@Param("record") Cliente record, @Param("example") ClienteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cliente
     *
     * @mbggenerated Sat Jul 23 14:42:17 CDT 2016
     */
    int updateByExample(@Param("record") Cliente record, @Param("example") ClienteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cliente
     *
     * @mbggenerated Sat Jul 23 14:42:17 CDT 2016
     */
    int updateByPrimaryKeySelective(Cliente record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cliente
     *
     * @mbggenerated Sat Jul 23 14:42:17 CDT 2016
     */
    int updateByPrimaryKey(Cliente record);
}