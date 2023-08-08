package com.trip.finalProject.trip.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class TripVO {
	
	//map
	private String mapId;
	private int mapNo;
	private String mapName;
	private double mapLat;
	private double mapIng;
	private String postId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date uploadDate;
	
	//member
	private String memberId;
	private String memberName;
	private String password;
	private String authority;
	private int punishCount;

	//file
	private String fileId;
	private String originImg;
	private String savedImg;
	private int fileNo;
	
	//trip_record
	private String writerId;
	private String tripTitle;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startDay;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date endDay;
	private String tripDisclose;
	private String tripSave;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date registDay;
	private String tripReview;
	private String tripShare;
	private String tmainOriginImg;
	private String tmainSavedImg;
	
	
}
