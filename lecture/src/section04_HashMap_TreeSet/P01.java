package section04_HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class P01 { // 4-1 학급 회장(해쉬)
	
	
	public static char solution(int n, String s) {
		
		char answer=' ';
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet()) {
			
//			출력 해보기
//			System.out.println(key + " " + map.get(x));

			if(map.get(key)>max) {
				max = map.get(key);
				answer = key;
			}
		}
		
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		
		System.out.println(solution(n, s));
	}


}
