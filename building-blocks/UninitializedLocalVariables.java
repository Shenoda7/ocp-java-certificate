public class UninitializedLocalVariables {
	public static void main(String[] args) {
		UninitializedLocalVariables x = new UninitializedLocalVariables();
		x.findAnswer(true);
	}

	public void findAnswer(boolean check) {
		int answer;
		int otherAnswer;
		int onlyOneBranch;

		if (check) {
			onlyOneBranch = 1;
			answer = 2;
		}
		else {
			answer = 1;
		}

		System.out.println(answer);
		System.out.println(onlyOneBranch);
	}
}
