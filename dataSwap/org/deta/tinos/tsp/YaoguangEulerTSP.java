package org.deta.tinos.tsp;
import java.util.ArrayList;
import java.util.List;
/*
 output like be
4:4<-0:0->1:1
11:21<-1:20->3:23
4:4<-12:2->19:1
8:28<-3:23->1:20
1:1<-4:4->6:6
8:28<-15:25->11:21
10:10<-6:6->4:4
12:2<-17:7->19:1
15:25<-8:28->3:23
17:7<-19:1->12:2
12:12<-10:10->11:11
12:12<-11:11->10:10
13:13<-12:12->11:11
14:14<-13:13->12:12
15:15<-14:14->13:13
16:16<-15:15->14:14
17:17<-16:16->15:15
18:18<-17:17->16:16
19:19<-18:18->17:17
20:20<-19:19->18:18
21:21<-20:20->19:19
22:22<-21:21->20:20
23:23<-22:22->21:21
24:24<-23:23->22:22
25:25<-24:24->23:23
26:26<-25:25->24:24
27:27<-26:26->25:25
28:28<-27:27->26:26
29:29<-28:28->27:27
30:30<-29:29->28:28
31:31<-30:30->29:29
32:32<-31:31->30:30
33:33<-32:32->31:31
34:34<-33:33->32:32
35:35<-34:34->33:33
36:36<-35:35->34:34
37:37<-36:36->35:35
38:38<-37:37->36:36
39:39<-38:38->37:37
37:37<-39:39->38:38
22:22<-31:21->21:21
3:23<-11:21->15:25
4:4<-1:1->0:0
 */
public class YaoguangEulerTSP{  
	public static int small= 1000000000;
	public static int te= 0;
	public static void main(String []argv){
		int []x= new int[43];
		int []y= new int[43];
		x[0]= 0;y[0]= 0;
		x[1]= 1;y[1]= 20;
		x[2]= 12;y[2]= 2;
		x[3]= 3;y[3]= 23;
		x[4]= 4;y[4]= 4;
		x[5]= 15;y[5]= 25;
		x[6]= 6;y[6]= 6;
		x[7]= 17;y[7]= 7;
		x[8]= 8;y[8]= 28;
		x[9]= 19;y[9]= 1;
		x[10]= 10;y[10]= 10;
		x[11]= 11;y[11]= 11;
		x[12]= 12;y[12]= 12;
		x[13]= 13;y[13]= 13;
		x[14]= 14;y[14]= 14;
		x[15]= 15;y[15]= 15;
		x[16]= 16;y[16]= 16;
		x[17]= 17;y[17]= 17;
		x[18]= 18;y[18]= 18;
		x[19]= 19;y[19]= 19;
		x[20]= 20;y[20]= 20;
		x[21]= 21;y[21]= 21;
		x[22]= 22;y[22]= 22;
		x[23]= 23;y[23]= 23;
		x[24]= 24;y[24]= 24;
		x[25]= 25;y[25]= 25;
		x[26]= 26;y[26]= 26;
		x[27]= 27;y[27]= 27;
		x[28]= 28;y[28]= 28;
		x[29]= 29;y[29]= 29;
		x[30]= 30;y[30]= 30;
		x[31]= 31;y[31]= 31;
		x[32]= 32;y[32]= 32;
		x[33]= 33;y[33]= 33;
		x[34]= 34;y[34]= 34;
		x[35]= 35;y[35]= 35;
		x[36]= 36;y[36]= 36;
		x[37]= 37;y[37]= 37;
		x[38]= 38;y[38]= 38;
		x[39]= 39;y[39]= 39;
		x[40]= 31;y[40]= 21;
		x[41]= 11;y[41]= 21;
		x[42]= 1;y[42]= 1;
		/*
       x[41]= 1;y[41]= 1;
/*
       x[42]= 1;y[42]= 1;
     /*
       x[43]= 43;y[43]= 33;
       x[44]= 1;y[44]= 1;
      /*
       x[45]= 45;y[45]= 35;
       x[46]= 46;y[46]= 36;
       x[47]= 47;y[47]= 37;
       x[48]= 48;y[48]= 38;
       x[49]= 49;y[49]= 39;
       x[50]= 1;y[50]= 1;
		 */
		node first= new node();
		first.x= 0;
		first.y= 0;
		first.used= 0;
		List<node>nodes= new ArrayList<node>();
		if(x.length> 13&& x.length<= 41){
			findpath(first, x, y, nodes);
		}else if(x.length<= 13){
			findrandom(first, x, y, nodes);
		}else{
			findstate(first, x, y, nodes);
		}
		System.out.print(1);
		sort(nodes, first.x, first.y, x.length);
		System.out.print(2);
	}
	public static void findstate(node first, int[]x
			, int[]y, List<node> nodes){
		for(int i=0;i<x.length;i++){
			//find less 2 node
			int dis[]= new int [x.length];
			for(int j= 0;j < x.length;j++){
				dis[j]= Math.abs(x[j] - x[i]) 
						+ Math.abs(y[j] - y[i]);
			}
			int small= 9999999;
			int f= 0;
			int s= 0;
			int t= 0;
			for(int j= 0; j< dis.length; j++){
				if(dis[j]< small){
					small= dis[j];
					f= j;
				}
			}
			small= 9999999;
			for(int j= 0; j< dis.length; j++){
				if(dis[j]< small&& j!= f){
					//int find=0;
					//for(int k=0;k<nodes.size();k++)
					//{
					//if(nodes.get(k).index==j )
					//{
					//  if(nodes.get(k).prev.index==j 
					//|| nodes.get(k).next.index!=j)
					//  {
					small= dis[j];
					s= j;
					//  }
					//}
					//}
					if(nodes.size()==0){
						small= dis[j];
						s= j;
					}
				}
			}
			small=9999999;
			for(int j= 0;j<dis.length;j++){
				if(dis[j]<small&& j!= f&& j!= s){
					small= dis[j];
					t= j;
					/*
                        if(nodes.get(k).index==j)
                        {
                            //if(nodes.get(k).prev.index != s 
                            //&& nodes.get(k).next.index != s){
                                if(nodes.get(k).prev==null 
                                || nodes.get(k).next==null)
                                {
                                    find+=1;
                                }
                          //  }
                        }
					 */
					if(nodes.size()== 0){
						small= dis[j];
						t= j;
					}
				}
			}
			node n=new node();
			n.x=x[i];
			n.y=y[i];
			n.index=i;
			n.next=new node();
			n.next.x=x[s];
			n.next.y=y[s];
			n.next.index=s;
			n.next.prev=n;
			n.prev=new node();
			n.prev.x=x[t];
			n.prev.y=y[t];
			n.prev.index=t;
			n.prev.next=n;
			nodes.add(n);
			//s value=
		}
	}
	public static void findrandom(node first, int[]x, int[]y
			, List<node> nodes){
		int min= 999999999;
		int big= 0;
		for(int i= 0; i<x.length; i++){
			node first_copy= new node();
			first_copy.x= first.x;
			first_copy.y= first.y;
			first_copy.used= first.used;
			first_copy.total_dis= first.total_dis;
			first_copy.next= first.next;
			first_copy.prev= first.prev;
			int find= find(first_copy,i,x,y);
			if(find== 0){
				te++;
				node next= new node();
				next.x= x[i];
				next.y= y[i];
				int dis= Math.abs(x[i] - first.x) 
						+ Math.abs(y[i] - first.y);
				next.total_dis= first_copy.total_dis + dis;
				next.used= first_copy.used+1;
				first_copy.next= next;
				next.prev= first_copy;
				first_copy= first_copy.next;
				int findSmall= findSmall(first_copy,x,y);
				if(findSmall== 1){
					nodes.add(first_copy);
				}
				int cc= 0;
				if(first_copy.total_dis>big){
					cc+= 1;
					big= first_copy.total_dis;
				}else if(first_copy.total_dis< min){
					cc+= 1;
					min= first_copy.total_dis;
				}
				if(cc>0)
					findrandom(first_copy, x, y,nodes);
			}
		}
	}

	public static void sort( List<node> nodes,int x, int y,int N){
		if(N> 41){
			for(int i= 0; i< nodes.size(); i++){
				System.out.println(nodes.get(i).prev.x+ ":"+nodes.get(i).prev.y+
						"<-"+nodes.get(i).x+ ":"+ nodes.get(i).y+ "->"
						+ nodes.get(i).next.x+ ":"+nodes.get(i).next.y);
			}
			return;
		}
		node temp= nodes.get(nodes.size()-1);
		node temp1= nodes.get(nodes.size()-1);
		System.out.println("the short one");
		node []out= new node[N];
		while(temp!= null){
			out[temp.used]= temp;
			temp= temp.prev;
		}
		while(temp1!= null){
			out[temp1.used]= temp1;
			temp1= temp1.next;
		}
		for(int i1= 0; i1< out.length; i1++){
			if(out[i1]!= null){
				System.out.println("x:"+ out[i1].x
						+ "y:"+out[i1].y);
			}
		}
		System.out.println("the shortest distance:"
				+ out[out.length-1].total_dis);
	}

	public static int find(node first, int i, int[] x, int[] y){
		if(first.x== x[i]&& first.y== y[i]){
			return 1;
		}
		node temp= first;
		node temp1= first;
		while(temp.prev!= null){
			temp= temp.prev;
			if(temp.x== x[i]&& temp.y== y[i]){
				return 1;
			}
			if(temp.x==x[x.length-1]&& temp.y==y[y.length-1]){
				if(temp.used!=x.length){
					return 1;
				}
			}
			if(temp.x==x[0]&& temp.y==y[0]){
				if(temp.used != 0){
					return 1;
				}
			}
		}
		while(temp1.next!= null){
			temp1= temp1.next;
			if (temp1.x== x[i]&& temp1.y== y[i]) {
				return 1;
			}
			if(temp1.x== x[x.length- 1]&& temp1.y== y[y.length- 1]){
				if(temp1.used!= x.length){
					return 1;
				}
			}
			if(temp1.x== x[0]&& temp1.y== y[0]){
				if(temp1.used!= 0){
					return 1;
				}
			}
		}
		if(temp.used!= 0){
			return 1;
		}
		if(temp.x!=x[0]|| temp.y!=y[0]){
			return 1;
		}
		return 0;
	}
	public static int findSmall(node first, int []x, int []y){
		while(first.next!=null) {
			first= first.next;
		}
		if(first.x== x[x.length-1]&& first.y== y[y.length-1]){
			if(first.used== x.length- 1){
				if(first.total_dis<small){
					small= first.total_dis;
					return 1;
				}
			}
		}
		return 0;
	}

	public static void findpath(node first, int[]x
			, int[]y, List<node> nodes){
		int min= 999999999;
		int big= 0;
		for(int i= 0; i< x.length; i++){
			int find= find(first, i, x, y);
			if(find== 0) {
				int dis= Math.abs(x[i]- first.x)
						+ Math.abs(y[i]- first.y);
				int total_dis= first.total_dis+ dis;
				if (total_dis>= big) {
					big= total_dis;
				}
				if (total_dis<= min) {
					min= total_dis;
				}
			}
		}
		for(int i= 0; i< x.length; i++){
			node first_copy= new node();
			first_copy.x= first.x;
			first_copy.y= first.y;
			first_copy.used= first.used;
			first_copy.total_dis= first.total_dis;
			first_copy.next= first.next;
			first_copy.prev= first.prev;
			int find= find(first_copy, i, x, y);
			if(find== 0){
				te++;
				node next= new node();
				next.x= x[i];
				next.y= y[i];
				int dis= Math.abs(x[i]- first.x) 
						+ Math.abs(y[i]- first.y);
				next.total_dis= first_copy.total_dis+ dis;
				next.used= first_copy.used+ 1;
				first_copy.next= next;
				next.prev= first_copy;
				first_copy= first_copy.next;
				int findSmall= findSmall(first_copy, x, y);
				if(findSmall== 1){
					nodes.add(first_copy);
				}
				int cc= 0;
				if(first_copy.total_dis>= big*1){
					cc+= 1;
					//big=first_copy.total_dis;
				}else if(first_copy.total_dis<= min*1){
					cc+= 1;
					//min=first_copy.total_dis;
				}
				if(cc> 0) {
					findpath(first_copy, x, y,nodes);   
				}
			}//
		}
	}
}