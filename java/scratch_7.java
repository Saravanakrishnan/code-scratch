import java.util.List;

import static java.util.Arrays.asList;

class Scratch {

	public static void main(String[] args) {

		List<Bean> a = asList(
				new Bean("1"),
				new Bean(),
				new Bean("3"),
				new Bean("4"),
				new Bean("5"),
				new Bean("6"));

		int sum = a.stream().filter(bean -> bean.getNum() != null)
				.map(Bean::getNum)
				.map(Integer::valueOf)
				.reduce(0, Integer::sum);

		System.out.println("sum => " + sum);

		int total = 100;
		total = a.stream().filter(bean -> bean.getNum() != null)
				.map(Bean::getNum)
				.map(Integer::valueOf)
				.reduce(total, Integer::sum);
		System.out.println("total => " + total);


	}
}

class Bean {
	private String num;

	public Bean() {
	}

	public Bean(String num) {
		this.num = num;
	}

	String getNum() {
		return num;
	}

	void setNum(String num) {
		this.num = num;
	}
}
