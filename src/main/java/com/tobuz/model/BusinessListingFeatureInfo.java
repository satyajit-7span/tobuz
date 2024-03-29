package com.tobuz.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class BusinessListingFeatureInfo extends BaseEntity{
	
	@ManyToOne
	private BusinessListing businessListing;
	
	@ManyToOne
	private BusinessFeature businessFeature;
	
	public BusinessListing getBusinessListing() {
		return businessListing;
	}

	public void setBusinessListing(BusinessListing businessListing) {
		this.businessListing = businessListing;
	}

	public BusinessFeature getBusinessFeature() {
		return businessFeature;
	}

	public void setBusinessFeature(BusinessFeature businessFeature) {
		this.businessFeature = businessFeature;
	}
	
	/*
	 * public static BusinessListingFeatureInfo
	 * getBusinessListngFeatureInfos(BusinessListing businessListing,BusinessFeature
	 * businessFeature){ return
	 * BusinessListingFeatureInfo.find.where().and(Expr.eq("businessListing",
	 * businessListing),Expr.eq("businessFeature", businessFeature)).eq("isActive",
	 * Boolean.TRUE).setMaxRows(1).findUnique(); } public static
	 * List<BusinessListingFeatureInfo>
	 * getBusinessListngByFeatureInfos(BusinessFeature businessFeature){ return
	 * BusinessListingFeatureInfo.find.where().eq("businessFeature",
	 * businessFeature).eq("isActive", Boolean.TRUE).findList(); } public static
	 * List<BusinessListingFeatureInfo>
	 * getBusinessFeaturesByListingInfos(BusinessListing businessListing){ return
	 * BusinessListingFeatureInfo.find.where().eq("businessListing",
	 * businessListing).eq("isActive", Boolean.TRUE).findList(); }
	 */
	/*
	 * public static BusinessListingFeatureInfo
	 * createBusinessFeatureListingInfo(BusinessListing
	 * businessListing,BusinessFeature businessFeature) { BusinessListingFeatureInfo
	 * featureInfo = getBusinessListngFeatureInfos(businessListing,businessFeature);
	 * if(featureInfo == null) { featureInfo = new BusinessListingFeatureInfo();
	 * featureInfo.setBusinessFeature(businessFeature);
	 * featureInfo.setBusinessListing(businessListing);
	 * featureInfo.setIsActive(Boolean.TRUE); featureInfo.save(); } return
	 * featureInfo; }
	 */

}
