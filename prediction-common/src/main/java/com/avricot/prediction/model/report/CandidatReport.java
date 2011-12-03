package com.avricot.prediction.model.report;

import java.util.HashMap;

import org.codehaus.jackson.annotate.JsonIgnore;

import com.avricot.prediction.model.candidat.Candidat.CandidatName;
import com.avricot.prediction.model.report.tweeter.TweetReport;
import com.avricot.prediction.model.theme.Theme;

public class CandidatReport {
	private TweetReport tweetReport;
	private float insight;
	private float buzz;
	private float tendance;
	private float neg;
	private float pos;
	private float none;
	private PolarityReport negativePolarity;
	private PolarityReport positivePolarity;
	private HashMap<String, Integer> rssResult; // <String newspaperName,
												// Integer score>
	private CandidatName candidatName;
	private final HashMap<Region, Integer> geoReport = new HashMap<Region, Integer>();
	private final HashMap<Theme.ThemeName, Integer> themes = new HashMap<Theme.ThemeName, Integer>();

	@JsonIgnore
	public HashMap<String, Integer> getRssResult() {
		return rssResult;
	}

	public void setRssResult(HashMap<String, Integer> rssResult) {
		this.rssResult = rssResult;
	}

	public TweetReport getTweetReport() {
		return tweetReport;
	}

	public void setTweetReport(TweetReport tweetReport) {
		this.tweetReport = tweetReport;
	}

	@JsonIgnore
	public float getInsight() {
		return insight;
	}

	public void setInsight(float insight) {
		this.insight = insight;
	}

	public float getBuzz() {
		return buzz;
	}

	public void setBuzz(float buzz) {
		this.buzz = buzz;
	}

	public float getTendance() {
		return tendance;
	}

	public void setTendance(float tendance) {
		this.tendance = tendance;
	}

	@JsonIgnore
	public PolarityReport getNegativePolarity() {
		return negativePolarity;
	}

	public void setNegativePolarity(PolarityReport negativePolarity) {
		this.negativePolarity = negativePolarity;
	}

	@JsonIgnore
	public PolarityReport getPositivePolarity() {
		return positivePolarity;
	}

	public void setPositivePolarity(PolarityReport positivePolarity) {
		this.positivePolarity = positivePolarity;
	}

	public CandidatName getCandidatName() {
		return candidatName;
	}

	public void setCandidatName(CandidatName candidatName) {
		this.candidatName = candidatName;
	}

	public float getNeg() {
		return neg;
	}

	public void setNeg(float negative) {
		this.neg = negative;
	}

	public float getPos() {
		return pos;
	}

	public void setPos(float positive) {
		this.pos = positive;
	}

	public float getNone() {
		return none;
	}

	public void setNone(float none) {
		this.none = none;
	}

	@JsonIgnore
	public HashMap<Region, Integer> getGeoReport() {
		return geoReport;
	}

	public HashMap<Theme.ThemeName, Integer> getThemes() {
		return themes;
	}
}