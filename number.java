
public class number {

	public static void main(String[] args) {
		System.out.println("7");
		System.out.println(3.15);
		System.out.println("3" + 4 + "5" + 2);//문자3과 정수4를 더한 34에 문자 5를 더하면 345가 되고 마지막으로 정수 2를 더해서 3452가출력됨
		System.out.println("3" + (4 + 2) + "5");//괄호부터 계산함 그래서 365가 출력됨
		System.out.println("3" + 4 + 2 + "5");//3452 순서대로
		System.out.println( 4 + 2 + "5");//먼저 정수4랑 정수2를 더하면 6이 나오고 문자5를 더하면 65 출력됨
		System.out.println("3 + 5 = " + "16/2");
		System.out.println("3 + 5 = " + 16/2);

	}

}
