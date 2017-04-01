package org.gitlab.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GitlabRepositoryFile {
	public static String URL = "/files";

	@JsonProperty("file_name")
	private String fileName;
	@JsonProperty("file_path")
	private String filePath;
	private String size;
	private String encoding;
	private String content;
	private String ref;
	@JsonProperty("blob_id")
	private String blobId;
	@JsonProperty("commit_id")
	private String commitId;
	@JsonProperty("last_commit_id")
	private String lastCommitId;
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getEncoding() {
		return encoding;
	}
	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getBlobId() {
		return blobId;
	}
	public void setBlobId(String blobId) {
		this.blobId = blobId;
	}
	public String getCommitId() {
		return commitId;
	}
	public void setCommitId(String commitId) {
		this.commitId = commitId;
	}
	public String getLastCommitId() {
		return lastCommitId;
	}
	public void setLastCommitId(String lastCommitId) {
		this.lastCommitId = lastCommitId;
	}



}
