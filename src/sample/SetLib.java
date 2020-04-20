package sample;

import java.util.StringTokenizer;

public class SetLib{
	public SetLib() {
		//String libname=".dll";
		String libpath= System.getProperty("java.library.path");
		if(libpath==null||libpath.length()==0){
			throw new RuntimeException("lib path is null");
		}
		System.out.println(System.getProperty("java.library.path"));
		//	String path= null;
		StringTokenizer st=new StringTokenizer(libpath, System.getProperty("path.separator"));
		if(st.hasMoreElements()) {
			//	path=st.nextToken();
		}else {
			throw new RuntimeException("cant split libpath:"+ libpath);
		}
		//InputStream is= ConvertWord2HM
	}

	public static void main(String []args) {
		new SetLib();
	}
}