package com.engineering.commerce.entities;

import java.util.List;

public class ProductCategory {
	private String key;
	private String name;
	private String slug;
	private String description;
//	private List<ProductCategoryReference> ancestors;
	private String orderHint;
	private String externalId;
	private String metaTitle;
	private String metaDescription;
	private String metaKeywords;
	private List<Asset> assets;

	public String getKey() {
		return key;
	}

	public String getName() {
		return name;
	}

	public String getSlug() {
		return slug;
	}

	public String getDescription() {
		return description;
	}

	public String getOrderHint() {
		return orderHint;
	}

	public String getExternalId() {
		return externalId;
	}

	public String getMetaTitle() {
		return metaTitle;
	}

	public String getMetaDescription() {
		return metaDescription;
	}

	public String getMetaKeywords() {
		return metaKeywords;
	}

	public List<Asset> getAssets() {
		return assets;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setOrderHint(String orderHint) {
		this.orderHint = orderHint;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public void setMetaTitle(String metaTitle) {
		this.metaTitle = metaTitle;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	public void setAssets(List<Asset> assets) {
		this.assets = assets;
	}

}