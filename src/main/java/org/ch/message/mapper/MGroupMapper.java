package org.ch.message.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ch.message.model.MGroup;

@Mapper
public interface MGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Mon Dec 17 12:03:26 KST 2018
     */
    int deleteByPrimaryKey(Integer groupSeq);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Mon Dec 17 12:03:26 KST 2018
     */
    int insert(MGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Mon Dec 17 12:03:26 KST 2018
     */
    int insertSelective(MGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Mon Dec 17 12:03:26 KST 2018
     */
    MGroup selectByPrimaryKey(Integer groupSeq);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Mon Dec 17 12:03:26 KST 2018
     */
    int updateByPrimaryKeySelective(MGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Mon Dec 17 12:03:26 KST 2018
     */
    int updateByPrimaryKey(MGroup record);
}