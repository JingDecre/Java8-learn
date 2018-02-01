package com.example.entity;

import java.util.Date;

/**
 * 节假日-entity
 * 
 * @author hongyi.zeng
 * @version 0.0.1
 * @since 2015年7月20日 上午9:34:36
 */
public class AttHoliday implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;
	
	// Fields
	private Integer id;//主键

	private String holidayNo;//节假日编号
	private String holidayName;//节假日名称
	private Date startDatetime;//开始日期时间
	private Date endDatetime;//结束日期时间
	private Boolean isAllTheHolidays;//是否全部人放假-（false：否/0，true：是/1）
	private String remark;//备注

	// Constructors
	public AttHoliday()
	{
	}

	public AttHoliday(Integer id, String holidayNo, String holidayName) {
		this.id = id;
		this.holidayNo = holidayNo;
		this.holidayName = holidayName;
	}

	// Property accessors
	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getHolidayNo()
	{
		return holidayNo;
	}

	public void setHolidayNo(String holidayNo)
	{
		this.holidayNo = holidayNo;
	}

	public String getHolidayName()
	{
		return holidayName;
	}

	public void setHolidayName(String holidayName)
	{
		this.holidayName = holidayName;
	}

	public Date getStartDatetime()
	{
		return startDatetime;
	}

	public void setStartDatetime(Date startDatetime)
	{
		this.startDatetime = startDatetime;
	}

	public Date getEndDatetime()
	{
		return endDatetime;
	}

	public void setEndDatetime(Date endDatetime)
	{
		this.endDatetime = endDatetime;
	}

	public Boolean getIsAllTheHolidays()
	{
		return isAllTheHolidays;
	}

	public void setIsAllTheHolidays(Boolean isAllTheHolidays)
	{
		this.isAllTheHolidays = isAllTheHolidays;
	}

	public String getRemark()
	{
		return remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

}
