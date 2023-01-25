package study_2023_1_week4;
import java.util.*;

/**
 * @author anna
 * @date 2023.01.25
 * @summary
 * BOJ-silver1 128MB/2s ()
 * a,b로만 이루어진 문자열
 * a 모두 연속으로 만들기 위해 필요한 최소 교환 횟수
 * 처음과 끝은 이어져있음
 * 
 * S : 문자열, 길이 최대 1,000
 **/
public class Main_1522_문자열교환 {

	static String S;
	static int N = 1001;
	static int A = 0, B = 0;
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		S = scann.next();
		// a 갯수 세기
		for (int i = 0; i < S.length(); i++) {
			if(S.charAt(i)=='a') A++;
		}
		// 0부터  끝까지 쭉 돌면서, 교환해야하는 b 갯수 체크
		for (int i = 0; i < S.length(); i++) {
			B = 0;
			for (int j = i; j < i+A; j++) {
				int t = j%S.length(); //양끝이 이어져있는 원형이므로
				if(S.charAt(t)=='b') B++;
			}
			N = Math.min(N, B);
		}
		System.out.println(N);
	}
}
