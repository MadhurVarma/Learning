package com.SpringBoot.JDBC.Dao.Impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.SpringBoot.JDBC.Dao.CourseDao;
import com.SpringBoot.JDBC.Model.Course;



@Repository

public class CourseDaoImpl extends JdbcDaoSupport implements CourseDao {

	@Autowired
	DataSource datasource;

	@PostConstruct
	private void initialize() {
		setDataSource(datasource);
	}

	@Override
	public void add(Course course) {
		String sql = "INSERT INTO Course"
				+ "(COURSE_ID, COURSE_NAME, COURSE_DESC, SKILL_REQD, CREATED_ON, LAST_UPDATED_ON) VALUES(?,?,?,?,?,?)";
		// Object[] args = new
		// Object[]{course.getCourseId(),course.getCourseName(),course.getCourseDesc(),course.getSkillReqd(),course.getCreatedOn(),course.getLastUpdatedOn()};
		getJdbcTemplate().update(sql, new Object[] { course.getCourseId(), course.getCourseName(),
				course.getCourseDesc(), course.getSkillReqd(), course.getCreatedOn(), course.getLastUpdatedOn() });

	}
	@Override
	public void addBatch(List<Course> coursebatch)
	{
		String sql="INSERT INTO Course" + "(COURSE_ID, COURSE_NAME, COURSE_DESC, SKILL_REQD, CREATED_ON, LAST_UPDATED_ON) VALUES(?,?,?,?,?,?)";	
		getJdbcTemplate().batchUpdate(sql, new BatchPreparedStatementSetter()
		{
			public void setValues(PreparedStatement ps, int i) throws SQLException
			{
				Course course= coursebatch.get(i);
				ps.setInt(1, course.getCourseId());
				ps.setString(2, course.getCourseName());
				ps.setString(3,course. getCourseDesc());
				ps.setString(4, course.getSkillReqd());
				ps.setTimestamp(5, course.getCreatedOn());
				ps.setTimestamp(6, course.getLastUpdatedOn());
				
			}
			
			public int getBatchSize()
			{
				return coursebatch.size();
			}
			
		});
	}
	@Override
	public List<Course> selectall(){
		String sql="SELECT * FROM COURSE";
		List<Map<String,Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<Course> result =new ArrayList<Course>();
		for(Map<String,Object> row :rows)
		{
			Course course = new Course();
			course.setCourseId((Integer)row.get("COURSE_ID"));
			course.setCourseName((String)row.get("COURSE_NAME"));
			course.setCourseDesc((String)row.get("COURSE_DESC"));
			course.setSkillReqd((String)row.get("SKILL_REQD"));
			course.setCreatedOn((Timestamp)row.get("CREATED_ON"));
			course.setLastUpdatedOn((Timestamp)row.get("LAST_UPDATED_ON"));
			result.add(course);
			
		}
		
		return result;
	}
	
	@Override
	public Course selectone(int courseid){
		String sql="SELECT * FROM COURSE WHERE COURSE_ID=?";
		getJdbcTemplate().queryForObject(sql, new Object[]{courseid}, new RowMapper<Course>()
		{
			public Course mapRow(ResultSet rs, int rownumber) throws SQLException
			{
				Course course=new Course();
				course.setCourseId(rs.getInt("COURSE_ID"));
				course.setCourseName(rs.getString("COURSE_NAME"));
				course.setCourseDesc(rs.getString("COURSE_DESC"));
				course.setSkillReqd(rs.getString("SKILL_REQD"));
				course.setCreatedOn(rs.getTimestamp("CREATED_ON"));
				course.setLastUpdatedOn(rs.getTimestamp("LAST_UPDATED_ON"));
				
			}
			return course;
			
		});
		
		
	}	

}