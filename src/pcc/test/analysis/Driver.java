package pcc.test.analysis;

import pcc.analysis.ChangeCounterUtils;

public class Driver {
	public static void main(String[] args){
		StubVersion1 version1 = new StubVersion1();
		StubVersion2 version2 = new StubVersion2();
		
		System.out.println("### Export Change Lables ###");
		ChangeCounterUtils.exportChangeLabels("testAnalysis", version1, version2);
		
		System.out.println("### Get Line Changes Report ###");
		String report = ChangeCounterUtils.getLineChangesReport(version1, version2);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(report);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("### Get LLOC ###");
		int lloc = ChangeCounterUtils.getLLOC(version1);
		System.out.println("LLOC: " + lloc);
		
		System.out.println("### Get LOC Changes ###");
		report = ChangeCounterUtils.getLOCChanges(version1, version2);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(report);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}
