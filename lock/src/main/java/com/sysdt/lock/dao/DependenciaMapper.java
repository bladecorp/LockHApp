package com.sysdt.lock.dao;

import com.sysdt.lock.model.Dependencia;
import com.sysdt.lock.model.DependenciaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DependenciaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dependencia
     *
     * @mbggenerated Sun Sep 25 09:26:29 CDT 2016
     */
    int countByExample(DependenciaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dependencia
     *
     * @mbggenerated Sun Sep 25 09:26:29 CDT 2016
     */
    int deleteByExample(DependenciaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dependencia
     *
     * @mbggenerated Sun Sep 25 09:26:29 CDT 2016
     */
    int insert(Dependencia record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dependencia
     *
     * @mbggenerated Sun Sep 25 09:26:29 CDT 2016
     */
    int insertSelective(Dependencia record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dependencia
     *
     * @mbggenerated Sun Sep 25 09:26:29 CDT 2016
     */
    List<Dependencia> selectByExample(DependenciaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dependencia
     *
     * @mbggenerated Sun Sep 25 09:26:29 CDT 2016
     */
    int updateByExampleSelective(@Param("record") Dependencia record, @Param("example") DependenciaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dependencia
     *
     * @mbggenerated Sun Sep 25 09:26:29 CDT 2016
     */
    int updateByExample(@Param("record") Dependencia record, @Param("example") DependenciaExample example);
}