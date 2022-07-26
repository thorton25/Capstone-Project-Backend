package com.capstone.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.capstone.entity.Report;
import com.capstone.util.MyBatisUtil;


@Repository
public class ReportMapper {
	
	public void saveReport(Report report){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.insert("insertReport", report);
		session.commit();
		session.close();
	}
	
	public void updateReport(Report report){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.update("updateReport", report);
		session.commit();
		session.close();
	}
	
	public void deleteReport(int reportId){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.delete("deleteReports", reportId);
		session.commit();
		session.close();
	}
	
	public List<Report> getAllReports(){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<Report> reportsList = session.selectList("getAllReports");
		session.commit();
		session.close();
		return reportsList;
	}
	
	public Report findById(int REPORTID){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Report report = (Report) session.selectOne("findById", REPORTID);
		session.commit();
		session.close();
		return report;
	}
}
