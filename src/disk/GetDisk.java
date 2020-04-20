package disk;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class GetDisk{
	public String getSerialNumber(String drive) {
		String result = "";
		try {
			File file = File.createTempFile("realhowto",".vbs");
			file.deleteOnExit();
			FileWriter fw = new java.io.FileWriter(file);
			String vbs = "Set objFSO = CreateObject(\"Scripting.FileSystemObject\")\n"
					+"Set colDrives = objFSO.Drives\n"
					+"Set objDrive = colDrives.item(\"" + drive + "\")\n"
					+"Wscript.Echo objDrive.SerialNumber";// see note
			fw.write(vbs);
			fw.close();
			Process p = Runtime.getRuntime().exec("cscript //NoLogo " + file.getPath());
			BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line;
			while ((line = input.readLine()) != null) {
				result += line;
			}
			input.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return result.trim();
	}
	public String getKey() {
		String s=getSerialNumber("A");
		s+=getSerialNumber("B");
		s+=getSerialNumber("C");
		s+=getSerialNumber("D");
		s+=getSerialNumber("E");
		s+=getSerialNumber("F");
		s+=getSerialNumber("G");
		s+=getSerialNumber("H");
		s+=getSerialNumber("I");
		s+=getSerialNumber("J");
		s+=getSerialNumber("K");
		s+=getSerialNumber("L");
		s+=getSerialNumber("M");
		s+=getSerialNumber("N");
		s+=getSerialNumber("O");
		s+=getSerialNumber("P");
		s+=getSerialNumber("Q");
		s+=getSerialNumber("R");
		s+=getSerialNumber("S");
		s+=getSerialNumber("T");
		s+=getSerialNumber("U");
		s+=getSerialNumber("V");
		s+=getSerialNumber("W");;
		s+=getSerialNumber("X");
		s+=getSerialNumber("Y");
		s+=getSerialNumber("Z");
		return s;	
	}
	
	public static void main(String[] argv) {
		System.out.println(new GetDisk().getKey().replaceAll(" ", ""));	
	}
}
