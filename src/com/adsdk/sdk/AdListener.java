package com.adsdk.sdk;

public interface AdListener {

	public void adClicked();

	public void adClosed(Ad ad, boolean completed);

	/**
	 * This method is called if an error occurred while loading the ad
	 * 
	 * @param e
	 */
	// public void adLoadFailed(RequestException e);

	/**
	 * This method is called after loading the ad successfully
	 * 
	 * @param e
	 */
	public void adLoadSucceeded(Ad ad);

	/**
	 * This method is called after the ad was shown
	 * 
	 * @param e
	 */
	public void adShown(Ad ad, boolean succeeded);

	/**
	 * This method is called when the ad loading has failed an no ad is
	 * displayed.
	 */
	public void noAdFound();

}
