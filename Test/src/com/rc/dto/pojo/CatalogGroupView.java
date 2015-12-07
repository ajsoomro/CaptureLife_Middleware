package com.rc.dto.pojo;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties; //Ignores certain unwanted fields
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.rc.dto.base.BaseDTO;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true) // Ignores unwanted fields that we do not want passed to the client side (11/28)
public class CatalogGroupView extends BaseDTO {

	private String identifier;
	private String resourceId;
	private String name;
	private String shortDescription;
	private String uniqueID;
	private String thumbnail;
	private String productsURL;
	private List<String> parentCatalogGroupID;
	
	//11/25
	private String metaKeyword;
	private String metaDescription;
	private String title;
	private String fullImage;
	private String fullImageAltDescription;
	//
	
	//11/30
	private String suggestionView;
	private String entry;
	private String term;
	private String frequency;
	
	public String getResourceId() {
		System.out.println("Tagged7");
		return resourceId;
	}
	@JsonProperty("resourceId")
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	
	public String getName() {
		return name;
	}
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	@JsonProperty("shortDescription")
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getUniqueID() {
		return uniqueID;
	}
	@JsonProperty("uniqueID")
	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	@JsonProperty("thumbnail")
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getIdentifier() {
		return identifier;
	}
	@JsonProperty("identifier")
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getProductsURL() {
		return productsURL;
	}
	@JsonProperty("productsURL")
	public void setProductsURL(String productsURL) {
		this.productsURL = productsURL;
	}
	public List<String> getParentCatalogGroupID() {
		return parentCatalogGroupID;
	}
	@JsonProperty("parentCatalogGroupID")
	public void setParentCatalogGroupID(List<String> parentCatalogGroupID) {
		this.parentCatalogGroupID = parentCatalogGroupID;
	}
	
	//11/25
	public String getMetaKeyword() {	//getCategoriesybyType
		return metaKeyword;
	}
	@JsonProperty("metaKeyword")
	public void setMetaKeyword(String metaKeyword) {
		this.metaKeyword = metaKeyword;
	}
	
	public String getMetaDescription() { 	//getCategoriesybyType
		return metaDescription;
	}
	@JsonProperty("metaDescription")
	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}
	
	public String getTitle() {	//getCategoriesybyType
		return title;
	}
	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getFullImage() {	//getCategoriesybyType
		System.out.println("T10");
		return fullImage;
	}
	@JsonProperty("fullImage")
	public void setFullImage(String fullImage) {
		this.fullImage = fullImage;
	}
	
	
	public String getFullImageAltDescription() {		//getCategoriesybyType
		System.out.println("T8");
		return fullImageAltDescription;
	}
	@JsonProperty("fullImageAltDescription")
	public void setFullImageAltDescription(String fullImageAltDescription) {
		System.out.println("T9");
		this.fullImageAltDescription = fullImageAltDescription;
	}
	
	//
	
	//11/30
	public String getSuggestionView(){
		return suggestionView;
	}
	@JsonProperty("suggestionView")
	public void setSuggestionView(String suggestionView){
		this.suggestionView = suggestionView;
	}
	
	public String getEntry(){
		return entry;
	}
	@JsonProperty("entry")
	public void setEntry(String entry){
		this.entry = entry;
	}
	
	public String getTerm(){
		return term;
	}
	@JsonProperty("term")
	public void setTerm(String term){
		this.term = term;
	}
	
	public String getFrequency(){
		return frequency;
	}
	@JsonProperty("frequency")
	public void setFrequency(String frequency){
		this.frequency = frequency;
	}
	
	
	
	
}
