package com.capstone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_report")
public class Report {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "REPORTID")
	private Long id;
	
	@Column (name = "REPORTNAME")
	private String name;
	
	@Column (name = "HISTORYMAXDAYS")
	private Integer historyMaxDays;
	
	@Column (name = "NONSPOOLFILE")
	private Integer nonSpoolFile;
	
	@Column (name = "DESCRIPTION")
	private String description;
	
	@Column (name = "TITLE")
	private String title;
	
	@Column (name = "ABSTRACT")
	private String abstrct;
	
	@Column (name = "EXPIRATIONDAYS")
	private Integer expirationDays;
	
	@Column (name = "SKIPPAGES")
	private Integer skipPages;
	
	@Column (name = "UPLOADEDFILENAME")
	private String uploadedFileName;
	
	@Column (name = "CREATIONDATE")
	private String creationDate;
	
	@Column (name = "ALLOWPRNT")
	private String allowPrint;
	
	@Column (name = "ADDEDBY")
	private String addedBy;
	
	@Column (name = "MODIFIEDBY")
	private String modifiedBy;
	
	@Column (name = "AS400ID")
	private Integer as400Id;
	
	@Column (name = "STATUS")
	private char status;
	
	@Column (name = "DELETEDBY")
	private String deletedBy;
	
	@Column (name = "MULTIREPORTS")
	private String multiReports;
	
	@Column (name = "FILENAME")
	private String fileName;
	
	@Column (name = "ALLOWOVERRIDES")
	private Integer allowOverrides;
	
	@Column (name = "NUMCOLUMNS")
	private Integer numCols;
	
	@Column (name = "CONFIDENTIAL")
	private String confidential;
	
	@Column (name = "BIREPORT")
	private String biReport;
	
	@Column (name = "HELPURL")
	private String helpUrl;
	
	@Column (name = "HELP")
	private String help;
	
	@Column (name = "DETAILDESCRIPTION")
	private String detailDescription;
	
	@Column (name = "COMBINE_PDF_REPORT")
	private Integer combinePdfReport;
	
	public Report() {
		
	}

	public Report(Long id, String name, Integer historyMaxDays, Integer nonSpoolFile, String description,
			String title, String abstrct, Integer expirationDays, Integer skipPages, String uploadedFileName,
			String creationDate, String allowPrint, String addedBy, String modifiedBy, Integer as400Id, char status,
			String deletedBy, String multiReports, String fileName, Integer allowOverrides, Integer numCols,
			String confidential, String biReport, String helpUrl, String help, String detailDescription,
			Integer combinePdfReport) {
		super();
		this.id = id;
		this.name = name;
		this.historyMaxDays = historyMaxDays;
		this.nonSpoolFile = nonSpoolFile;
		this.description = description;
		this.title = title;
		this.abstrct = abstrct;
		this.expirationDays = expirationDays;
		this.skipPages = skipPages;
		this.uploadedFileName = uploadedFileName;
		this.creationDate = creationDate;
		this.allowPrint = allowPrint;
		this.addedBy = addedBy;
		this.modifiedBy = modifiedBy;
		this.as400Id = as400Id;
		this.status = status;
		this.deletedBy = deletedBy;
		this.multiReports = multiReports;
		this.fileName = fileName;
		this.allowOverrides = allowOverrides;
		this.numCols = numCols;
		this.confidential = confidential;
		this.biReport = biReport;
		this.helpUrl = helpUrl;
		this.help = help;
		this.detailDescription = detailDescription;
		this.combinePdfReport = combinePdfReport;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHistoryMaxDays() {
		return historyMaxDays;
	}

	public void setHistoryMaxDays(Integer historyMaxDays) {
		this.historyMaxDays = historyMaxDays;
	}

	public Integer getNonSpoolFile() {
		return nonSpoolFile;
	}

	public void setNonSpoolFile(Integer nonSpoolFile) {
		this.nonSpoolFile = nonSpoolFile;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAbstrct() {
		return abstrct;
	}

	public void setAbstrct(String abstrct) {
		this.abstrct = abstrct;
	}

	public Integer getExpirationDays() {
		return expirationDays;
	}

	public void setExpirationDays(Integer expirationDays) {
		this.expirationDays = expirationDays;
	}

	public Integer getSkipPages() {
		return skipPages;
	}

	public void setSkipPages(Integer skipPages) {
		this.skipPages = skipPages;
	}

	public String getUploadedFileName() {
		return uploadedFileName;
	}

	public void setUploadedFileName(String uploadedFileName) {
		this.uploadedFileName = uploadedFileName;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getAllowPrint() {
		return allowPrint;
	}

	public void setAllowPrint(String allowPrint) {
		this.allowPrint = allowPrint;
	}

	public String getAddedBy() {
		return addedBy;
	}

	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Integer getAs400Id() {
		return as400Id;
	}

	public void setAs400Id(Integer as400Id) {
		this.as400Id = as400Id;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public String getDeletedBy() {
		return deletedBy;
	}

	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}

	public String getMultiReports() {
		return multiReports;
	}

	public void setMultiReports(String multiReports) {
		this.multiReports = multiReports;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Integer getAllowOverrides() {
		return allowOverrides;
	}

	public void setAllowOverrides(Integer allowOverrides) {
		this.allowOverrides = allowOverrides;
	}

	public Integer getNumCols() {
		return numCols;
	}

	public void setNumCols(Integer numCols) {
		this.numCols = numCols;
	}

	public String getConfidential() {
		return confidential;
	}

	public void setConfidential(String confidential) {
		this.confidential = confidential;
	}

	public String getBiReport() {
		return biReport;
	}

	public void setBiReport(String biReport) {
		this.biReport = biReport;
	}

	public String getHelpUrl() {
		return helpUrl;
	}

	public void setHelpUrl(String helpUrl) {
		this.helpUrl = helpUrl;
	}

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public String getDetailDescription() {
		return detailDescription;
	}

	public void setDetailDescription(String detailDescription) {
		this.detailDescription = detailDescription;
	}

	public Integer getCombinePdfReport() {
		return combinePdfReport;
	}

	public void setCombinePdfReport(Integer combinePdfReport) {
		this.combinePdfReport = combinePdfReport;
	}

	
	

}
