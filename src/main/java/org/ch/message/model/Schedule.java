package org.ch.message.model;

import java.util.Date;

public class Schedule {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column message_schedule.schedule_seq
	 * @mbg.generated  Mon Dec 17 14:03:03 KST 2018
	 */
	private Integer scheduleSeq;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column message_schedule.calendar_seq
	 * @mbg.generated  Mon Dec 17 14:03:03 KST 2018
	 */
	private Integer calendarSeq;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column message_schedule.schedule_date
	 * @mbg.generated  Mon Dec 17 14:03:03 KST 2018
	 */
	private Date scheduleDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column message_schedule.schedule_content
	 * @mbg.generated  Mon Dec 17 14:03:03 KST 2018
	 */
	private String scheduleContent;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column message_schedule.removed
	 * @mbg.generated  Mon Dec 17 14:03:03 KST 2018
	 */
	private String removed;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column message_schedule.reg_time
	 * @mbg.generated  Mon Dec 17 14:03:03 KST 2018
	 */
	private Date regTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column message_schedule.mod_time
	 * @mbg.generated  Mon Dec 17 14:03:03 KST 2018
	 */
	private Date modTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column message_schedule.notifications
	 * @mbg.generated  Mon Dec 17 14:03:03 KST 2018
	 */
	private String notifications;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column message_schedule.schedule_seq
	 * @return  the value of message_schedule.schedule_seq
	 * @mbg.generated  Mon Dec 17 14:03:03 KST 2018
	 */
	public Integer getScheduleSeq() {
		return scheduleSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column message_schedule.schedule_seq
	 * @param scheduleSeq  the value for message_schedule.schedule_seq
	 * @mbg.generated  Mon Dec 17 14:03:03 KST 2018
	 */
	public void setScheduleSeq(Integer scheduleSeq) {
		this.scheduleSeq = scheduleSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column message_schedule.calendar_seq
	 * @return  the value of message_schedule.calendar_seq
	 * @mbg.generated  Mon Dec 17 14:03:03 KST 2018
	 */
	public Integer getCalendarSeq() {
		return calendarSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column message_schedule.calendar_seq
	 * @param calendarSeq  the value for message_schedule.calendar_seq
	 * @mbg.generated  Mon Dec 17 14:03:03 KST 2018
	 */
	public void setCalendarSeq(Integer calendarSeq) {
		this.calendarSeq = calendarSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column message_schedule.schedule_date
	 * @return  the value of message_schedule.schedule_date
	 * @mbg.generated  Mon Dec 17 14:03:03 KST 2018
	 */
	public Date getScheduleDate() {
		return scheduleDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column message_schedule.schedule_date
	 * @param scheduleDate  the value for message_schedule.schedule_date
	 * @mbg.generated  Mon Dec 17 14:03:03 KST 2018
	 */
	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column message_schedule.schedule_content
	 * @return  the value of message_schedule.schedule_content
	 * @mbg.generated  Mon Dec 17 14:03:03 KST 2018
	 */
	public String getScheduleContent() {
		return scheduleContent;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column message_schedule.schedule_content
	 * @param scheduleContent  the value for message_schedule.schedule_content
	 * @mbg.generated  Mon Dec 17 14:03:03 KST 2018
	 */
	public void setScheduleContent(String scheduleContent) {
		this.scheduleContent = scheduleContent;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column message_schedule.removed
	 * @return  the value of message_schedule.removed
	 * @mbg.generated  Mon Dec 17 14:03:03 KST 2018
	 */
	public String getRemoved() {
		return removed;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column message_schedule.removed
	 * @param removed  the value for message_schedule.removed
	 * @mbg.generated  Mon Dec 17 14:03:03 KST 2018
	 */
	public void setRemoved(String removed) {
		this.removed = removed;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column message_schedule.reg_time
	 * @return  the value of message_schedule.reg_time
	 * @mbg.generated  Mon Dec 17 14:03:03 KST 2018
	 */
	public Date getRegTime() {
		return regTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column message_schedule.reg_time
	 * @param regTime  the value for message_schedule.reg_time
	 * @mbg.generated  Mon Dec 17 14:03:03 KST 2018
	 */
	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column message_schedule.mod_time
	 * @return  the value of message_schedule.mod_time
	 * @mbg.generated  Mon Dec 17 14:03:03 KST 2018
	 */
	public Date getModTime() {
		return modTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column message_schedule.mod_time
	 * @param modTime  the value for message_schedule.mod_time
	 * @mbg.generated  Mon Dec 17 14:03:03 KST 2018
	 */
	public void setModTime(Date modTime) {
		this.modTime = modTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column message_schedule.notifications
	 * @return  the value of message_schedule.notifications
	 * @mbg.generated  Mon Dec 17 14:03:03 KST 2018
	 */
	public String getNotifications() {
		return notifications;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column message_schedule.notifications
	 * @param notifications  the value for message_schedule.notifications
	 * @mbg.generated  Mon Dec 17 14:03:03 KST 2018
	 */
	public void setNotifications(String notifications) {
		this.notifications = notifications;
	}

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

	private Calendar calendar;
}