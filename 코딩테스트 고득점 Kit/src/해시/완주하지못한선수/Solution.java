package 해시.완주하지못한선수;

import java.util.Arrays;

class Solution {
	public static void main(String[] args) {

		Solution test = new Solution();
		String runner;
		String[] participantList;
		String[] completionList;

		// 테스트1
		participantList = new String[] { "leo", "kiki", "eden" };
		completionList = new String[] { "eden", "kiki" };
		runner = test.solution(participantList, completionList);
		System.out.println("Test 1 : " + runner);

		// 테스트2
		participantList = new String[] { "marina", "josipa", "nikola", "vinko", "filipa" };
		completionList = new String[] { "josipa", "filipa", "marina", "nikola" };
		runner = test.solution(participantList, completionList);
		System.out.println("Test 2 : " + runner);

		// 테스트3
		participantList = new String[] { "mislav", "stanko", "mislav", "ana" };
		completionList = new String[] { "stanko", "ana", "mislav" };
		runner = test.solution(participantList, completionList);
		System.out.println("Test 3 : " + runner);

	}

	public String solution(String[] participantList, String[] completionList) {

		String answer = "";

		for (int i = 0; i < participantList.length; i++) {

			if (isContainedCompletion(participantList[i], completionList) == false) {
				return participantList[i];
			}
		}

		answer = findSameName(participantList);

		return answer;
	}

	private boolean isContainedCompletion(String participant, String[] completionList) {

		for (int i = 0; i < completionList.length; i++) {

			if (completionList[i].equals(participant)) {
				return true;
			}
		}

		return false;
	}

	private String findSameName(String[] participantList) {

		String sameName = "";

		for (int i = 0; i < participantList.length; i++) {
			if (isSameName(participantList[i], participantList)) {
				return participantList[i];
			}

		}

		return sameName;
	}

	private boolean isSameName(String participant, String[] participantList) {

		for (int i = 0; i < participantList.length; i++) {
			if (participant.equals(participantList[i])) {
				return true;
			}
		}
		return false;
	}
}