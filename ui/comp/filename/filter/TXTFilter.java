package comp.filename.filter;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class TXTFilter implements FilenameFilter{
	@SuppressWarnings("unused")
	private Pattern pattern;
	public TXTFilter(String filter) {
		this.pattern = Pattern.compile(filter);
	}
	public boolean accept(File dir, String name) {
		return true;
	}
}