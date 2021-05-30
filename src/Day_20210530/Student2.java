package Day_20210530;

public class Student2 {
	private String name;
	private int chinsesScore;
	private int englishScore;
	private int mathScore;

	public Student2(int chinsesScore, int englishScore, int mathScore) {
		super();
		this.chinsesScore = chinsesScore;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the chinsesScore
	 */
	public int getChinsesScore() {
		return chinsesScore;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public Student2(String name, int chinsesScore, int englishScore,
			int mathScore) {
		super();
		this.name = name;
		this.chinsesScore = chinsesScore;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	/**
	 * @param chinsesScore
	 *            the chinsesScore to set
	 */
	public void setChinsesScore(int chinsesScore) {
		this.chinsesScore = chinsesScore;
	}

	/**
	 * @return the englishScore
	 */
	public int getEnglishScore() {
		return englishScore;
	}

	/**
	 * @param englishScore
	 *            the englishScore to set
	 */
	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}

	/**
	 * @return the mathScore
	 */
	public int getMathScore() {
		return mathScore;
	}

	/**
	 * @param mathScore
	 *            the mathScore to set
	 */
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	// 总分
	public int totalScore() {
		return chinsesScore + englishScore + mathScore;
	}
}
