package org.deta.tinos.http;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.deta.tinos.stable.Stable;
public class HttpUnicode{
	//这个函数在作者去年开发股市分析软件的时候从雪球等网站采样抓数据，发现有GBK 
	//utf-8 gb2312 ascii 等格式数据比较混乱，于是进行统一格式处理。
	public String getJson(String urlString, String jsonString) 
			throws IOException{
		String code= Stable.STRING_EMPTY;
		URL url= new URL(urlString);
		HttpURLConnection connection= (HttpURLConnection)url.openConnection();
		connection.setRequestMethod(Stable.HTTP_GET);
		connection
		.setRequestProperty(Stable.CONTENT_TYPE, Stable.APPLICATION_JSON_UTF8); 
		connection.setDoOutput(true);
		connection.setInstanceFollowRedirects(false);
		StringBuffer sbuffer= new StringBuffer();
		sbuffer.append(jsonString);
		OutputStream os= connection.getOutputStream();
		os.write(sbuffer.toString().getBytes());
		os.flush(); 
		StringBuilder stringBuilder= new StringBuilder();
		BufferedReader bufferedReader= null;
		try {
			InputStream inputStream= connection.getInputStream();
			int caherset_size= connection.getHeaderFields().size();
			for(int i= 0; i< caherset_size; i++) {
				String temp= connection.getHeaderField(i);
				if(temp.contains(Stable.CHARSET)) {
					if(temp.toUpperCase().contains(Stable.CHARSET_GBK)) {
						code= Stable.CHARSET_GBK;
					}	
					if(temp.toUpperCase().contains(Stable.CHARSET_UTF_8)
							|| temp.toUpperCase().contains(Stable.CHARSET_UTF8)) {
						code= Stable.CHARSET_UTF_8;
					}
					if(temp.toUpperCase().contains(Stable.CHARSET_GB2312)) {
						code= Stable.CHARSET_GB2312;
					}
					if(temp.toUpperCase().contains(Stable.CHARSET_ASCII)) {
						code= Stable.CHARSET_ASCII;
					}
					if(temp.toUpperCase().contains(Stable.CHARSET_UNICODE)) {
						code= Stable.CHARSET_UNICODE;
					}
					if(temp.toUpperCase().contains(Stable.CHARSET_ISO_8859_1)) {
						code= Stable.CHARSET_ISO_8859_1;
					}
				}
			}
			if (null!= inputStream) {
				bufferedReader
				=  new BufferedReader(new InputStreamReader(inputStream, code));   
				String lines;
				while ((lines= bufferedReader.readLine()) != null) {
					stringBuilder.append(lines); 	
				}
			} else {
				stringBuilder.append(Stable.STRING_EMPTY);
			}
		} catch (IOException ex) {
			//throw ex;
		} finally {
			if (null!= bufferedReader) {
				try {
					bufferedReader.close();
				} catch (IOException ex) {
					//throw ex;
				}
			}
		}
		return new String(stringBuilder.toString().getBytes(), Stable.CHARSET_UTF_8);	
	}

	public String postXML(String urlString,String XMLString) throws IOException{
		URL url= new URL(urlString);
		HttpURLConnection connection= (HttpURLConnection)url.openConnection();
		connection.setRequestMethod(Stable.HTTP_POST);
		connection.setRequestProperty(Stable.CONTENT_TYPE, Stable.APPLICATION_XML);
		connection.setDoOutput(true);
		connection.setInstanceFollowRedirects(false);
		StringBuffer stringBuffer= new StringBuffer();
		stringBuffer.append(XMLString);
		OutputStream outputStream= connection.getOutputStream();
		outputStream.write(stringBuffer.toString().getBytes());
		outputStream.flush();
		String requestBody= Stable.STRING_EMPTY;
		StringBuilder stringBuilder= new StringBuilder();
		BufferedReader bufferedReader= null;
		try {
			InputStream inputStream= connection.getInputStream();
			if (null!= inputStream) {
				bufferedReader
				= new BufferedReader(new InputStreamReader(inputStream));
				char[] charBuffer= new char[128];
				int bytesRead= -1;
				while ((bytesRead= bufferedReader.read(charBuffer)) > 0) {
					stringBuilder.append(charBuffer, 0, bytesRead);
				}
			} else {
				stringBuilder.append(Stable.STRING_EMPTY);
			}
		} catch (IOException ex) {
			throw ex;
		} finally {
			if (null!= bufferedReader) {
				try {
					bufferedReader.close();
				} catch (IOException ex) {
					throw ex;
				}
			}
		}
		requestBody= stringBuilder.toString();
		return requestBody;
	}

	public String postJsonWithSercurity(String urlString
			, String jsonString) throws IOException{
		URL url= new URL(urlString);
		HttpURLConnection connection= (HttpURLConnection)url.openConnection();
		connection.setRequestMethod(Stable.HTTP_POST);
		connection.setRequestProperty(Stable.CONTENT_TYPE, Stable.APPLICATION_JSON);
		connection.setDoOutput(true);
		connection.setInstanceFollowRedirects(false);
		StringBuffer sbuffer= new StringBuffer();
		sbuffer.append(jsonString);
		OutputStream os= connection.getOutputStream();
		os.write(sbuffer.toString().getBytes());
		os.flush();
		String requestBody= Stable.STRING_EMPTY;
		StringBuilder stringBuilder= new StringBuilder();
		BufferedReader bufferedReader= null;
		try {
			InputStream inputStream= connection.getInputStream();
			if (null!= inputStream) {
				bufferedReader
				= new BufferedReader(new InputStreamReader(inputStream));
				char[] charBuffer= new char[128];
				int bytesRead= -1;
				while ((bytesRead= bufferedReader.read(charBuffer)) > 0) {
					stringBuilder.append(charBuffer, 0, bytesRead);
				}
			} else {
				stringBuilder.append(Stable.STRING_EMPTY);
			}
		} catch (IOException ex) {
			throw ex;
		} finally {
			if (null!= bufferedReader) {
				try {
					bufferedReader.close();
				} catch (IOException ex) {
					throw ex;
				}
			}
		}
		requestBody= stringBuilder.toString();
		return requestBody;
	}

	public String postXMLWithSercurity(String urlString, String XMLString)
			throws IOException{
		URL url= new URL(urlString);
		HttpURLConnection connection= (HttpURLConnection)url.openConnection();
		connection.setRequestMethod(Stable.HTTP_POST);
		connection.setRequestProperty(Stable.CONTENT_TYPE, Stable.APPLICATION_XML);
		connection.setDoOutput(true);
		connection.setInstanceFollowRedirects(false);
		StringBuffer sbuffer= new StringBuffer();
		sbuffer.append(XMLString);
		OutputStream os= connection.getOutputStream();
		os.write(sbuffer.toString().getBytes());
		os.flush();
		String requestBody= Stable.STRING_EMPTY;
		StringBuilder stringBuilder= new StringBuilder();
		BufferedReader bufferedReader= null;
		try {
			InputStream inputStream= connection.getInputStream();
			if (null!= inputStream) {
				bufferedReader= new BufferedReader
						(new InputStreamReader(inputStream));
				char[] charBuffer= new char[128];
				int bytesRead= -1;
				while ((bytesRead= bufferedReader.read(charBuffer)) > 0) {
					stringBuilder.append(charBuffer, 0, bytesRead);
				}
			} else {
				stringBuilder.append(Stable.STRING_EMPTY);
			}
		} catch (IOException ex) {
			throw ex;
		} finally {
			if (null!= bufferedReader) {
				try {
					bufferedReader.close();
				} catch (IOException ex) {
					throw ex;
				}
			}
		}
		requestBody= stringBuilder.toString();
		return requestBody;
	}

	public String getStatusFromString(String response) {
		for(int i=0;i<response.length();i++){
		}
		return null;
	}

	public String getHTML(String urlString, Object object) throws IOException {
		URL url= new URL(urlString);
		HttpURLConnection connection= (HttpURLConnection)url.openConnection();
		connection.setRequestMethod(Stable.HTTP_GET);
		connection.setDoOutput(true);
		connection.setInstanceFollowRedirects(false);
		StringBuilder stringBuilder= new StringBuilder();
		BufferedReader bufferedReader= null;
		String code= Stable.CHARSET_GB2312;
		try {
			InputStream inputStream= connection.getInputStream();
			int caherset_size= connection.getHeaderFields().size();
			for(int i= 0; i< caherset_size; i++) {
				String temp= connection.getHeaderField(i);
				if(temp.contains(Stable.CHARSET)|| temp.contains(Stable.TYPE) ) {
					if(temp.toUpperCase().contains(Stable.CHARSET_GBK)) {
						code= Stable.CHARSET_GBK;
					}	
					if(temp.toUpperCase().contains(Stable.CHARSET_UTF_8)
							|| temp.toUpperCase().contains(Stable.CHARSET_UTF8)) {
						code= Stable.CHARSET_UTF_8;
					}
					if(temp.toUpperCase().contains(Stable.CHARSET_GB2312)) {
						code= Stable.CHARSET_GB2312;
					}
					if(temp.toUpperCase().contains(Stable.CHARSET_ASCII)) {
						code= Stable.CHARSET_ASCII;
					}
					if(temp.toUpperCase().contains(Stable.CHARSET_UNICODE)) {
						code= Stable.CHARSET_UNICODE;
					}
					if(temp.toUpperCase().contains(Stable.CHARSET_ISO_8859_1)) {
						code= Stable.CHARSET_ISO_8859_1;
					}
				}
			}
			if (null!= inputStream) {
				bufferedReader= new BufferedReader(new InputStreamReader(inputStream,code));   
				char[] charBuffer= new char[128];
				int bytesRead= -1;
				while ((bytesRead= bufferedReader.read(charBuffer)) > 0) {
					stringBuilder.append(charBuffer, 0, bytesRead);
				}
			} else {
				stringBuilder.append(Stable.STRING_EMPTY);
			}
		} catch (IOException ex) {
		} finally {
			if (null!= bufferedReader) {
				try {
					bufferedReader.close();
				} catch (IOException ex) {
				}
			}
		}
		String out= new String(stringBuilder.toString().getBytes(), Stable.CHARSET_UTF_8);
		return out;	
	}
}