package cn.edu.xmu.javaee.productdemo.mapper.generator;

import cn.edu.xmu.javaee.productdemo.mapper.generator.po.GoodsPo;
import cn.edu.xmu.javaee.productdemo.mapper.generator.po.GoodsPoExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface GoodsPoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oomall_goods
     *
     * @mbg.generated
     */
    @Delete({
        "delete from oomall_goods",
        "where `id` = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oomall_goods
     *
     * @mbg.generated
     */
    @Insert({
        "insert into oomall_goods (`name`, `creator_id`, ",
        "`creator_name`, `modifier_id`, ",
        "`modifier_name`, `gmt_create`, ",
        "`gmt_modified`)",
        "values (#{name,jdbcType=VARCHAR}, #{creatorId,jdbcType=BIGINT}, ",
        "#{creatorName,jdbcType=VARCHAR}, #{modifierId,jdbcType=BIGINT}, ",
        "#{modifierName,jdbcType=VARCHAR}, #{gmtCreate,jdbcType=TIMESTAMP}, ",
        "#{gmtModified,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(GoodsPo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oomall_goods
     *
     * @mbg.generated
     */
    @InsertProvider(type=GoodsPoSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(GoodsPo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oomall_goods
     *
     * @mbg.generated
     */
    @SelectProvider(type=GoodsPoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="creator_id", property="creatorId", jdbcType=JdbcType.BIGINT),
        @Result(column="creator_name", property="creatorName", jdbcType=JdbcType.VARCHAR),
        @Result(column="modifier_id", property="modifierId", jdbcType=JdbcType.BIGINT),
        @Result(column="modifier_name", property="modifierName", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    List<GoodsPo> selectByExample(GoodsPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oomall_goods
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "`id`, `name`, `creator_id`, `creator_name`, `modifier_id`, `modifier_name`, ",
        "`gmt_create`, `gmt_modified`",
        "from oomall_goods",
        "where `id` = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="creator_id", property="creatorId", jdbcType=JdbcType.BIGINT),
        @Result(column="creator_name", property="creatorName", jdbcType=JdbcType.VARCHAR),
        @Result(column="modifier_id", property="modifierId", jdbcType=JdbcType.BIGINT),
        @Result(column="modifier_name", property="modifierName", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    GoodsPo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oomall_goods
     *
     * @mbg.generated
     */
    @UpdateProvider(type=GoodsPoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GoodsPo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oomall_goods
     *
     * @mbg.generated
     */
    @Update({
        "update oomall_goods",
        "set `name` = #{name,jdbcType=VARCHAR},",
          "`creator_id` = #{creatorId,jdbcType=BIGINT},",
          "`creator_name` = #{creatorName,jdbcType=VARCHAR},",
          "`modifier_id` = #{modifierId,jdbcType=BIGINT},",
          "`modifier_name` = #{modifierName,jdbcType=VARCHAR},",
          "`gmt_create` = #{gmtCreate,jdbcType=TIMESTAMP},",
          "`gmt_modified` = #{gmtModified,jdbcType=TIMESTAMP}",
        "where `id` = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(GoodsPo row);
}