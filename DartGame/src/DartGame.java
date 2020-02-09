import java.util.*;
public class DartGame {
	
	class Solution {
	  public int solution(String dartResult) {
	      int answer = 0;
	      int length = dartResult.length();
	      String s = dartResult;
	      int[] number = new int[3];
	      char[] cha = new char[length];
	      
	      for(int i=0; i<length; i++){
	          cha[i]=s.charAt(i);
	      }
	     
	      
	      int count=0;
	      for(int i=0; i<length; i++){
	          
	            if(cha[i]=='1' && cha[i+1]=='0'){number[count]=10;i++;}
	            else if(cha[i]>='0'&&cha[i]<='9'){
	              number[count]=(int)cha[i]-48;    
	            }
	          
	            if(cha[i]=='S'){number[count]=(int)Math.pow(number[count],1);
	                            if(i+1>=length){break;}
	                            else if(cha[i+1]!='*' && cha[i+1]!='#'){count++; }
	                           }
	            else if(cha[i]=='D'){number[count]=(int)Math.pow(number[count],2);
	                            if(i+1>=length){break;}
	                            else if(cha[i+1]!='*' && cha[i+1]!='#'){count++; }
	                                }
	            else if(cha[i]=='T'){number[count]=(int)Math.pow(number[count],3);
	                            if(i+1>=length){break;}
	                            else if(cha[i+1]!='*' && cha[i+1]!='#'){count++; }
	                                }
	            
	            if(cha[i]=='*'){
	                if(count==0){
	                    number[count] = number[count]*2;
	                }
	                else{
	                    number[count] = number[count]*2;
	                    number[count-1] = number[count-1]*2;
	                }
	                count++;
	            }
	            else if(cha[i]=='#'){
	                if(count==0){
	                    number[count] = number[count]*(-1);
	                }
	                else{
	                    number[count] = number[count]*(-1);
	                }
	                count++;
	            }
	      }
	      answer = number[0]+number[1]+number[2];
	      return answer;
	  }
	}
}
