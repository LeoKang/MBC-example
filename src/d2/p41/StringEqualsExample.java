package d2.p41;

public class StringEqualsExample {
    public static void main(String[] args) {
        String strVar1 = "JBEdu";
        String strVar2 = "JBEdu";

        if (strVar1 == strVar2) {
            System.out.println("참조가 같음");
        } else {
            System.out.println("참조가 다름");
        }

        if (strVar1.equals(strVar2)) {
            System.out.println("두 문자열이 같음");
        }

        String strVar3 = new String("JBEdu");
        String strVar4 = new String("JBEdu");

        System.out.println(strVar1.hashCode());
        System.out.println(strVar2.hashCode());
        System.out.println(strVar3.hashCode());
        System.out.println(strVar4.hashCode());

        if (strVar3 == strVar4) {
            System.out.println("참조가 같음");
        } else {
            System.out.println("참조가 다름");
        }

        if (strVar3.equals(strVar4)) {
            System.out.println("두 문자열이 같음");
        }
    }
}
