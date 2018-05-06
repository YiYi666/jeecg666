package com.jeecg.task.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.lang.String;
import java.lang.Double;
import java.lang.Integer;
import java.math.BigDecimal;
import javax.xml.soap.Text;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;

/**   
 * @Title: Entity
 * @Description: 今日反馈
 * @author onlineGenerator
 * @date 2018-05-02 15:51:38
 * @version V1.0   
 *
 */
@Entity
@Table(name = "feedback", schema = "")
@SuppressWarnings("serial")
public class FeedbackEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.Integer id;
	/**姓名*/
	private java.lang.String createName;
	/**创建人登录名称*/
	private java.lang.String createBy;
	/**创建日期*/
	private java.util.Date createDate;
	/**更新人名称*/
	private java.lang.String updateName;
	/**更新人登录名称*/
	private java.lang.String updateBy;
	/**更新日期*/
	private java.util.Date updateDate;
	/**课程名称*/
	@Excel(name="课程名称",width=15)
	private java.lang.String fbCourse;
	/**作业日期*/
	@Excel(name="作业日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date fbDate;
	/**速度*/
	@Excel(name="速度",width=15,dicCode="fb_speed")
	private java.lang.String fbSpeed;
	/**难度*/
	@Excel(name="难度",width=15,dicCode="difficulty")
	private java.lang.String fbDifficulty;
	/**感受*/
	@Excel(name="感受",width=15,dicCode="fb_feel")
	private java.lang.String fbFeel;
	/**问题*/
	@Excel(name="问题",width=15)
	private java.lang.String fbProblem;
	/**建议*/
	@Excel(name="建议",width=15)
	private java.lang.String fbAdvise;
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  主键
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name ="ID",nullable=false,length=20)
	public java.lang.Integer getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  主键
	 */
	public void setId(java.lang.Integer id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  姓名
	 */

	@Column(name ="CREATE_NAME",nullable=true,length=50)
	public java.lang.String getCreateName(){
		return this.createName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  姓名
	 */
	public void setCreateName(java.lang.String createName){
		this.createName = createName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人登录名称
	 */

	@Column(name ="CREATE_BY",nullable=true,length=50)
	public java.lang.String getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人登录名称
	 */
	public void setCreateBy(java.lang.String createBy){
		this.createBy = createBy;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  创建日期
	 */

	@Column(name ="CREATE_DATE",nullable=true,length=20)
	public java.util.Date getCreateDate(){
		return this.createDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  创建日期
	 */
	public void setCreateDate(java.util.Date createDate){
		this.createDate = createDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人名称
	 */

	@Column(name ="UPDATE_NAME",nullable=true,length=50)
	public java.lang.String getUpdateName(){
		return this.updateName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人名称
	 */
	public void setUpdateName(java.lang.String updateName){
		this.updateName = updateName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人登录名称
	 */

	@Column(name ="UPDATE_BY",nullable=true,length=50)
	public java.lang.String getUpdateBy(){
		return this.updateBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人登录名称
	 */
	public void setUpdateBy(java.lang.String updateBy){
		this.updateBy = updateBy;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  更新日期
	 */

	@Column(name ="UPDATE_DATE",nullable=true,length=20)
	public java.util.Date getUpdateDate(){
		return this.updateDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  更新日期
	 */
	public void setUpdateDate(java.util.Date updateDate){
		this.updateDate = updateDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  课程名称
	 */

	@Column(name ="FB_COURSE",nullable=false,length=32)
	public java.lang.String getFbCourse(){
		return this.fbCourse;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  课程名称
	 */
	public void setFbCourse(java.lang.String fbCourse){
		this.fbCourse = fbCourse;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  作业日期
	 */

	@Column(name ="FB_DATE",nullable=true,length=32)
	public java.util.Date getFbDate(){
		return this.fbDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  作业日期
	 */
	public void setFbDate(java.util.Date fbDate){
		this.fbDate = fbDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  速度
	 */

	@Column(name ="FB_SPEED",nullable=false,length=32)
	public java.lang.String getFbSpeed(){
		return this.fbSpeed;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  速度
	 */
	public void setFbSpeed(java.lang.String fbSpeed){
		this.fbSpeed = fbSpeed;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  难度
	 */

	@Column(name ="FB_DIFFICULTY",nullable=false,length=32)
	public java.lang.String getFbDifficulty(){
		return this.fbDifficulty;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  难度
	 */
	public void setFbDifficulty(java.lang.String fbDifficulty){
		this.fbDifficulty = fbDifficulty;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  感受
	 */

	@Column(name ="FB_FEEL",nullable=false,length=32)
	public java.lang.String getFbFeel(){
		return this.fbFeel;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  感受
	 */
	public void setFbFeel(java.lang.String fbFeel){
		this.fbFeel = fbFeel;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  问题
	 */

	@Column(name ="FB_PROBLEM",nullable=true,length=300)
	public java.lang.String getFbProblem(){
		return this.fbProblem;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  问题
	 */
	public void setFbProblem(java.lang.String fbProblem){
		this.fbProblem = fbProblem;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  建议
	 */

	@Column(name ="FB_ADVISE",nullable=true,length=300)
	public java.lang.String getFbAdvise(){
		return this.fbAdvise;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  建议
	 */
	public void setFbAdvise(java.lang.String fbAdvise){
		this.fbAdvise = fbAdvise;
	}
}
