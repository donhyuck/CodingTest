package 해시.완주하지못한선수;

class Solution {
	public static void main(String[] args) {

		Solution test = new Solution();
		String runner;
		String[] participant;
		String[] completion;

		// 테스트1
		participant = new String[] { "leo", "kiki", "eden" };
		completion = new String[] { "eden", "kiki" };
		runner = test.solution(participant, completion);
		System.out.println("Test 1 : " + runner);

		// 테스트2
		participant = new String[] { "marina", "josipa", "nikola", "vinko", "filipa" };
		completion = new String[] { "josipa", "filipa", "marina", "nikola" };
		runner = test.solution(participant, completion);
		System.out.println("Test 2 : " + runner);

		// 테스트3
		participant = new String[] { "mislav", "stanko", "mislav", "ana" };
		completion = new String[] { "stanko", "ana", "mislav" };
		runner = test.solution(participant, completion);
		System.out.println("Test 3 : " + runner);

	}

	public String solution(String[] participant, String[] completion) {
		String answer = "";
		return answer;
	}
}