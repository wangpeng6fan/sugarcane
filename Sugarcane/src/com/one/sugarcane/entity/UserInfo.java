package com.one.sugarcane.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="USERINFO")
public class UserInfo {
	private Integer userID;
	private String userName;
	private String userEmail;
	private int userGender;			//�Ա�
	private String userEducation;	//ѧ��
	private String userWork;		//ְҵ
	private String userPhoneNumber;	//�绰
	private String birthday;		//����
	private String address_province;//ʡ
	private String address_city;	//��
	private String address_area;	//��
	private Set<GradeLevel>gradeLevel = new HashSet<GradeLevel>();	//�꼶ˮƽ
	private UserLogin userLogin;
	private Set<UserHobby>userHobby = new HashSet<UserHobby>();		//��Ȥ����
	@Id
	@GeneratedValue(generator="a")
	@GenericGenerator(name="a",strategy="identity")
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public int getUserGender() {
		return userGender;
	}
	public void setUserGender(int userGender) {
		this.userGender = userGender;
	}
	public String getUserEducation() {
		return userEducation;
	}
	public void setUserEducation(String userEducation) {
		this.userEducation = userEducation;
	}
	public String getUserWork() {
		return userWork;
	}
	public void setUserWork(String userWork) {
		this.userWork = userWork;
	}
	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}
	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAddress_province() {
		return address_province;
	}
	public void setAddress_province(String address_province) {
		this.address_province = address_province;
	}
	public String getAddress_city() {
		return address_city;
	}
	public void setAddress_city(String address_city) {
		this.address_city = address_city;
	}
	public String getAddress_area() {
		return address_area;
	}
	public void setAddress_area(String address_area) {
		this.address_area = address_area;
	}
	@OneToMany(mappedBy="userInfo",targetEntity=GradeLevel.class,cascade=CascadeType.MERGE)
	public Set<GradeLevel> getGradeLevel() {
		return gradeLevel;
	}
	public void setGradeLevel(Set<GradeLevel> gradeLevel) {
		this.gradeLevel = gradeLevel;
	}
	@OneToOne(mappedBy="userInfo")
	public UserLogin getUserLogin() {
		return userLogin;
	}
	public void setUserLogin(UserLogin userLogin) {
		this.userLogin = userLogin;
	}
	@OneToMany(mappedBy="userInfo",targetEntity=UserHobby.class,cascade=CascadeType.MERGE)
	public Set<UserHobby> getUserHobby() {
		return userHobby;
	}
	public void setUserHobby(Set<UserHobby> userHobby) {
		this.userHobby = userHobby;
	}
	public UserInfo() {}
	public UserInfo(String userName, String userEmail, int userGender, String userEducation, String userWork, String userPhoneNumber,
			String birthday, String address_province, String address_city, String address_area,
			Set<GradeLevel> gradeLevel, UserLogin userLogin, Set<UserHobby> userHobby) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userGender = userGender;
		this.userEducation = userEducation;
		this.userWork = userWork;
		this.userPhoneNumber = userPhoneNumber;
		this.birthday = birthday;
		this.address_province = address_province;
		this.address_city = address_city;
		this.address_area = address_area;
		this.gradeLevel = gradeLevel;
		this.userLogin = userLogin;
		this.userHobby = userHobby;
	}
	
}
