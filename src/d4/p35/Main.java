package d4.p35;

public class Main {
    public static void main(String[] args) {
        String oldStr = "Java의 가장 큰 특징은 플랫폼에 독립적이라는 것입니다.\n"
                + "소스코드를 기계어로 컴파일하여 링크하는..... Java는 이와 다르게\n"
                + "이 특성으로 인해 Java는 태생적인 강한\r\n";

        String newStr = oldStr.replace("Java", "자바");
        System.out.println("oldstr : " + oldStr);
        System.out.println("newStr : " + newStr);
    }
}
