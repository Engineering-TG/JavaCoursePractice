package com.engineering.commerce.entities;

import java.util.List;

public class Asset {
	private String key;
	private List<Source> sources;

	public String getKey() {
		return key;
	}

	public List<Source> getSources() {
		return sources;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void setSources(List<Source> sources) {
		this.sources = sources;
	}

	public static class Source {
		private String uri;

		public String getUri() {
			return uri;
		}

		public void setUri(String uri) {
			this.uri = uri;
		}
	}
}