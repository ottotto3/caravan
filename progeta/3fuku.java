class Main {
  public static void main(String[] args) {
    hello();
  }

  public static void hello() {
    // "Hello World"を、"Hello Java"に書き換えてください
    System.out.println("Hello Java");
  }

  public static void main(String[] args) {
    // printDataメソッドを呼び出してください
    printData();
  }
  // printDataメソッドを定義してください
    public static void printData() {
    System.out.println("私の名前はKate Jonesです");
  }

  public static void main(String[] args) {
    // 引数に「Kate Jones」を渡してください
    printData("Kate Jones");

    // 引数に「John Christopher Smith」を渡してください
    printData("John Christopher Smith");

  }

  // 引数を受け取るようにしてください
  public static void printData(String name) {
    // 「私の名前は◯◯です」と出力されるように書き換えてください
    System.out.println("私の名前は" + name + "です");

  }
  public static void main(String[] args) {
    // それぞれ年齢に関する引数を追加してください
    printData("Kate Jones", 15);
    printData("John Christopher Smith", 26);
  }

  // 年齢に関する引数を受け取れるようにしてください
  public static void printData(String name, int age) {
    System.out.println("私の名前は" + name + "です");
    // 「年齢は◯◯歳です」と出力してください
    System.out.println("年齢は" + age + "歳です");

  }

  public static void main(String[] args) {
    // fullNameメソッドの結果を変数nameに代入してください
    fullName("Kate", "Jones");

    // printDataの引数を書き換えてください
    printData("Kate Jones", 27);

    // こちらは書き換えないでください
    printData("John Christopher Smith", 65);

  }

  public static void printData(String name, int age) {
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
  }

  // fullNameメソッドを定義してください
  public static String fullName(String firstName, String lastName){
    return firstName + " " + lastName;
  }

  // 変数numbersに、与えられた数字の配列を代入してください
  int[] numbers = {1, 4, 6, 9, 13, 16};

  int oddSum = 0;
  int evenSum = 0;

  // for文を用いて、配列numbersの偶数の和と奇数の和を求めてください
  for (int number: numbers) {
    if (number % 2 == 0) {
      evenSum += number;
    } else {
      oddSum += number;
    }
  }

  System.out.println("奇数の和は" + oddSum + "です");
  System.out.println("偶数の和は" + evenSum + "です");
}
}
