package 정렬.K번째수;

import java.util.Arrays;

class Solution {

	public static void main(String[] args) {
		Solution test = new Solution();

		int[] array = new int[] { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = new int[][] { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		int[] result = solution(array, commands);

		System.out.println(result);

	}

	public static int[] solution(int[] array, int[][] commands) {

		// commands크기마다 처리값이 나오므로 answer크기를 정할 수 있다.
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {

			// 첫번째값에서 두번째값자른 값만큼의 test배열을 선언한다.
			int[] test = new int[(commands[i][1] - commands[i][0]) + 1];

			for (int j = 0; j < test.length; j++) {
				// test배열을 기준으로 array배열을 나눈다.
				test[j] = array[j + commands[i][0] - 1];
			}

			// 새롭게 정렬된 array배열
			Arrays.sort(test);
			
			// array배열의 k번째수를 구한다.
			answer[i] = test[commands[i][2] - 1];
		}

		return answer;
	}
}