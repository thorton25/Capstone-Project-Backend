package com.capstone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capstone.dao.ReportMapper;
import com.capstone.entity.Report;


@Controller @RequestMapping("/report")
public class ReportController {

	@Autowired
	ReportMapper reportMapper;
	
	private static final String REPORT = "Report";
	private static final String REPORTLIST = "ListReports";
	
	@RequestMapping("/listOfReports")
	public String showListOfReports(Model model){
		model.addAttribute("reportList", reportMapper.getAllReports());
		return REPORTLIST;
	}
	
	@RequestMapping("/showFormForAdd")
	public String addReport(Model model){
		model.addAttribute("report", new Report());
		return REPORT;
	}
	
	@RequestMapping("/saveProcess")
	public String saveReport(@ModelAttribute("report") Report report){
		if(report.getREPORTID() == null){
			reportMapper.saveReport(report);
		}else{
			reportMapper.updateReport(report);
		}
		
		return "redirect:/report/listOfReports";
	}
	
	@RequestMapping("/displayUpdateForm")
	public String showUpdateForm(@RequestParam("reportId") int REPORTID, Model model){
		model.addAttribute("report", reportMapper.findById(REPORTID));
		return REPORT;
	}
	
	@RequestMapping("/displayDeleteForm")
	public String deleteReport(@RequestParam("reportId") int REPORTID){
		reportMapper.deleteReport(REPORTID);
		return "redirect:/report/listOfReports";
	}
}
