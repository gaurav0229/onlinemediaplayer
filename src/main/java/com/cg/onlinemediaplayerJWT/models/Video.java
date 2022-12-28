package com.cg.onlinemediaplayerJWT.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(	name = "video_tbl")
public class Video {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="video_id")
	private int videoId;

	@Column(name= "title", nullable = false, length = 255)
	private String title;
	
	@Column(name= "ytId", nullable = false, length = 255)
	private String ytId;
	
	@Column(name= "description",nullable = false, length = 255)
	private String description;
	
	@Column(name= "category", nullable = false, length = 255)
	private String category;
	
	@Column(name= "tag", nullable = false, length = 255)
	private String tag;

	public Video() {
		super();
	}

	public Video(int videoId, String title, String ytId, String description, String category, String tag) {
		super();
		this.videoId = videoId;
		this.title = title;
		this.ytId = ytId;
		this.description = description;
		this.category = category;
		this.tag = tag;
	}

	public int getVideoId() {
		return videoId;
	}

	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getYtId() {
		return ytId;
	}

	public void setYtId(String ytId) {
		this.ytId = ytId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return "Video [videoId=" + videoId + ", title=" + title + ", ytId=" + ytId + ", description=" + description
				+ ", category=" + category + ", tag=" + tag + "]";
	}

	
	
	
	
	
	
}