package com.yunxin.mapper;

import com.yunxin.entity.CaBank;
import com.yunxin.entity.CaBankExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface CaBankMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CA_Bank
     *
     * @mbggenerated Thu Mar 02 13:37:03 CST 2017
     */
    @SelectProvider(type=CaBankSqlProvider.class, method="countByExample")
    int countByExample(CaBankExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CA_Bank
     *
     * @mbggenerated Thu Mar 02 13:37:03 CST 2017
     */
    @DeleteProvider(type=CaBankSqlProvider.class, method="deleteByExample")
    int deleteByExample(CaBankExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CA_Bank
     *
     * @mbggenerated Thu Mar 02 13:37:03 CST 2017
     */
    @Delete({
        "delete from CA_Bank",
        "where BankCode = #{bankcode,jdbcType=NVARCHAR}"
    })
    int deleteByPrimaryKey(String bankcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CA_Bank
     *
     * @mbggenerated Thu Mar 02 13:37:03 CST 2017
     */
    @Insert({
        "insert into CA_Bank (BankCode, BankName, ",
        "Priority, GZBankCode)",
        "values (#{bankcode,jdbcType=NVARCHAR}, #{bankname,jdbcType=NVARCHAR}, ",
        "#{priority,jdbcType=INTEGER}, #{gzbankcode,jdbcType=NVARCHAR})"
    })
    int insert(CaBank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CA_Bank
     *
     * @mbggenerated Thu Mar 02 13:37:03 CST 2017
     */
    @InsertProvider(type=CaBankSqlProvider.class, method="insertSelective")
    int insertSelective(CaBank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CA_Bank
     *
     * @mbggenerated Thu Mar 02 13:37:03 CST 2017
     */
    @SelectProvider(type=CaBankSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="BankCode", property="bankcode", jdbcType=JdbcType.NVARCHAR, id=true),
        @Result(column="BankName", property="bankname", jdbcType=JdbcType.NVARCHAR),
        @Result(column="Priority", property="priority", jdbcType=JdbcType.INTEGER),
        @Result(column="GZBankCode", property="gzbankcode", jdbcType=JdbcType.NVARCHAR)
    })
    List<CaBank> selectByExample(CaBankExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CA_Bank
     *
     * @mbggenerated Thu Mar 02 13:37:03 CST 2017
     */
    @Select({
        "select",
        "BankCode, BankName, Priority, GZBankCode",
        "from CA_Bank",
        "where BankCode = #{bankcode,jdbcType=NVARCHAR}"
    })
    @Results({
        @Result(column="BankCode", property="bankcode", jdbcType=JdbcType.NVARCHAR, id=true),
        @Result(column="BankName", property="bankname", jdbcType=JdbcType.NVARCHAR),
        @Result(column="Priority", property="priority", jdbcType=JdbcType.INTEGER),
        @Result(column="GZBankCode", property="gzbankcode", jdbcType=JdbcType.NVARCHAR)
    })
    CaBank selectByPrimaryKey(String bankcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CA_Bank
     *
     * @mbggenerated Thu Mar 02 13:37:03 CST 2017
     */
    @UpdateProvider(type=CaBankSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CaBank record, @Param("example") CaBankExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CA_Bank
     *
     * @mbggenerated Thu Mar 02 13:37:03 CST 2017
     */
    @UpdateProvider(type=CaBankSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CaBank record, @Param("example") CaBankExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CA_Bank
     *
     * @mbggenerated Thu Mar 02 13:37:03 CST 2017
     */
    @UpdateProvider(type=CaBankSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CaBank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CA_Bank
     *
     * @mbggenerated Thu Mar 02 13:37:03 CST 2017
     */
    @Update({
        "update CA_Bank",
        "set BankName = #{bankname,jdbcType=NVARCHAR},",
          "Priority = #{priority,jdbcType=INTEGER},",
          "GZBankCode = #{gzbankcode,jdbcType=NVARCHAR}",
        "where BankCode = #{bankcode,jdbcType=NVARCHAR}"
    })
    int updateByPrimaryKey(CaBank record);
}