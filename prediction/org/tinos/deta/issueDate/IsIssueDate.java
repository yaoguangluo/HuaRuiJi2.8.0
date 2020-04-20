package org.tinos.deta.issueDate;
import java.util.Date;
//Theory: Euclid
//Application: Yaoguang.luo
public class IsIssueDate{
	public boolean isIssueDate(Date issueOut) {
		long issueOutLong= issueOut.getTime();
		long currentLong= new Date().getTime();
		return currentLong< issueOutLong? true: false;	
	}
	
	public boolean isIssueDatewithSwapGTC(Date issueOutGTC, long offsetUTC8) {
		long issueOutLong= issueOutGTC.getTime();
		long currentLong= new Date().getTime()+ offsetUTC8;
		return currentLong< issueOutLong? true: false;	
	}
}