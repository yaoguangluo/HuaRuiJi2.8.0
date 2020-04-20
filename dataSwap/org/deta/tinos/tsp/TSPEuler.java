package org.deta.tinos.tsp;
import java.util.ArrayList;
import java.util.List;
//Attension, this is designed 
//by yaoguang luo and follow BSD license.
/*
output will be, and  time<1sec
x:0y:0
x:39y:39
x:38y:38
x:37y:37
x:36y:36
x:35y:35
x:34y:34
x:33y:33
x:32y:32
x:31y:31
x:30y:30
x:29y:29
x:28y:28
x:27y:27
x:26y:26
x:25y:25
x:24y:24
x:23y:23
x:22y:22
x:21y:21
x:20y:20
x:19y:19
x:18y:18
x:17y:17
x:16y:16
x:15y:15
x:14y:14
x:13y:13
x:12y:12
x:11y:11
x:10y:10
x:3y:23
x:1y:20
x:8y:28
x:15y:25
x:17y:7
x:19y:1
x:12y:2
x:6y:6
x:4y:4
x:1y:1
the shortest distance:242
 */
public class TSPEuler{
	public static int small= 1000000000;
	public static int te= 0;
	public static void main(String[] argv){
		int []x= new int[41];
		int []y= new int[41];
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
		x[40]= 1;y[40]= 1;
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
		first.x=0;
		first.y=0;
		first.used=0;
		List<node>nodes= new ArrayList<node>();
		if(x.length>13){
			findpath(first,x,y,nodes);
		}else{
			findrandom(first,x,y,nodes);
		}
		System.out.print(1);
		sort(nodes,first.x,first.y,x.length);
		System.out.print(2);
	}
	public static void findrandom(node first, int[]x
			, int[]y, List<node> nodes){
		int min=999999999;
		int big=0;
		for(int i=0;i<x.length;i++){
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
				if(first_copy.total_dis>big){
					cc+= 1;
					big= first_copy.total_dis;
				}else if(first_copy.total_dis< min){
					cc+= 1;
					min= first_copy.total_dis;
				}
				if(cc>0) {
					findrandom(first_copy, x, y, nodes);	
				}
			}
		}
	}

	public static void sort( List<node> nodes,int x, int y, int N){
		node temp= nodes.get(nodes.size()- 1);
		node temp1= nodes.get(nodes.size()- 1);
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
		for(int i1= 0;i1< out.length; i1++){
			if(out[i1]!= null){
				System.out.println("x:"+ out[i1].x
						+ "y:"+ out[i1].y);
			}
		}
		System.out.println("the shortest distance:"
				+ out[out.length- 1].total_dis);
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
			if(temp.x== x[x.length- 1]&& temp.y== y[y.length- 1]){
				if(temp.used!= x.length){
					return 1;
				}
			}
			if(temp.x== x[0]&& temp.y== y[0]){
				if(temp.used!= 0){
					return 1;
				}
			}
		}
		while(temp1.next!= null){
			temp1= temp1.next;
			if (temp1.x== x[i]&& temp1.y== y[i]) {
				return 1;
			}
			if(temp1.x== x[x.length- 1]
					&& temp1.y== y[y.length- 1]){
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
		if(temp.x!= x[0]|| temp.y!= y[0]){
			return 1;
		}
		return 0;
	}
	public static int findSmall(node first,int []x,int []y){
		while(first.next!= null) {
			first= first.next;
		}
		if(first.x== x[x.length- 1]&& first.y== y[y.length- 1]){
			if(first.used== x.length- 1){
				if(first.total_dis< small){
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
			int find= find(first,i,x,y);
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
			int find= find(first_copy,i,x,y);
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
				int findSmall= findSmall(first_copy,x,y);
				if(findSmall== 1){
					nodes.add(first_copy);
				}
				int cc=0;
				if(first_copy.total_dis>= big*1){
					cc+= 1;
					//big=first_copy.total_dis;
				}else
					if(first_copy.total_dis <= min*1){
						cc+= 1;
						//min=first_copy.total_dis;
					}
				if(cc>0) {
					findpath(first_copy, x, y,nodes);   
				}
			}//
		}
	}
}