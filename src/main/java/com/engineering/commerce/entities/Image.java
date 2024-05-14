package com.engineering.commerce.entities;

public class Image {
	private String url;
	private Dimensions dimensions;

	public String getUrl() {
		return url;
	}

	public Dimensions getDimensions() {
		return dimensions;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setDimensions(Dimensions dimensions) {
		this.dimensions = dimensions;
	}

	public static class Dimensions {
		private int w;
		private int h;

		public int getW() {
			return w;
		}

		public int getH() {
			return h;
		}

		public void setW(int w) {
			this.w = w;
		}

		public void setH(int h) {
			this.h = h;
		}
	}
}