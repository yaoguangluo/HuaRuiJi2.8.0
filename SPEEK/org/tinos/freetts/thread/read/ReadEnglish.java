package org.tinos.freetts.thread.read;
import java.util.Iterator;
import java.util.List;
import com.sun.speech.freetts.VoiceManager;
public class ReadEnglish extends Thread implements Runnable{
	public String text = "";
	public int finish = 1;
	public com.sun.speech.freetts.Voice v;
	private String voiceName = "kevin16";
	private VoiceManager vm;
	private List<String> setsForGet; 
	public ReadEnglish(){ 
		vm = VoiceManager.getInstance();
		v = vm.getVoice(voiceName);
		v.setPitch(20.f);//20
		v.setDurationStretch(0.5f);//0.3
		v.setRate(100f);//100
		v.setVolume(1f);//1\
	}
	
	public void read(String string){
		v.allocate();
		v.speak(string);
	//	v.deallocate();
	}

	public void run() {
		if(finish == 1) {
			this.read(this.text);	
		}
		if(finish == 2) {
			Iterator<String> iterator = setsForGet.iterator();
			String readString = "";
			int c = 0;
			while(iterator.hasNext() && finish == 2) {
				readString += ";"+iterator.next();
				if(c++ == 20) {
					c=0;
					this.read(readString);	
					readString=" ";
				}
			}
			if(c!=0) {
				this.read(readString);	
			}
		}
		finish=0;
	}
	
	public void setPreReadText(String text) {
		if(text.length()==0) {
			return;
		}
		finish=1;
		this.text = text;
	}
	
	public void setPreReadList(List<String> setsForGet) {
		if(setsForGet.size()==0) {
			return;
		}
		finish=2;
		this.setsForGet = setsForGet;
	}
}