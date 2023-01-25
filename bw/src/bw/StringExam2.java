package bw;

import java.util.Scanner;

public class StringExam2 {
	public static void main(String[] args) {
		 // 알파벳의 총 갯수는 26개
        // 물론 대문자,소문자 합치면 52개
        int alphabet[] = new int[26];
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        
        for(int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
            alphabet[ch - 'a']++;
        }
        
        // 아스키코드에서 영어소문자는 
        // 97 = 'a' 부터  ----- 122 = 'z' 까지입니다.
        
        // 만약에 영어대문자부터 하고 싶다면
        // 65 = 'A' 부터 ----- 90 = 'Z' 까지입니다.
        
        for(int i = 0; alphabet.length >i; i++) {
        	if (alphabet[i] != 0)
            System.out.print((char)(97+i) + ":" + alphabet[i] + " ");
        }
        
        
        //3. 만 나이 계산기( 올해 기준 +- 100살)
        
        //1. 계산식(하드 코딩) -> 올해까지만 사용
        //1-1) 2000년 이후 23년 이전 출생  ->(23- 태어난 년도)+1
        //1-2) 1922년 이후 2000년 이전 출생 ->(123 - 태어난 년도)
        
        	System.out.println("생년월일>");
        	String birth = sc.nextLine();
        	
        	int birthNo = Integer.parseInt(birth.substring(0, 2));
        	
        	if(birthNo <= 23) {//1-1) 2000년 이후 23년 이전 출생  ->(23- 태어난 년도)+1
        		System.out.println("나이 : " + (23-birthNo)+1);
        	}else if(birthNo >23) {//1-2) 1922년 이후 2000년 이전 출생 ->(123 - 태어난 년도)
        		System.out.println("나이 : " + (123-birthNo));
        	}
        //계산식(일반화)
        //Calendar, date(simpledateFormat) => 오늘 날짜, 년도
        //1-1) 2000년 이후 23년 이전 출생  ->(기준 년도- 태어난 년도)+1
        //1-2) 1922년 이후 2000년 이전 출생 ->(기준 년도 - 태어난 년도)
        
        
		//StringBuilder
        //String 단점 보완
		
        String a = "a";
        a +="a";
        a +="a";
        a +="a";
        a +="a";
        
        StringBuilder sb = new StringBuilder();
        sb.append("aaa"); //"aaa"
        sb.append(11);
        sb.append(false);
        
        System.out.println(sb);
		
	}
}
