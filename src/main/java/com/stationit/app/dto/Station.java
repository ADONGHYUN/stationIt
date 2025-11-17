package com.stationit.app.dto;

public record Station(
	    String name,     // 역 이름
	    double latitude, // 위도
	    double longitude, // 경도
	    String lineName, // 노선 이름 (추가)
	    int stationOrder // 노선 순서 (추가)
	) {}