package d5.p61;

import java.util.Stack;

public class StackExample {
    static void main() {
        Stack<Coin> coinBox = new Stack<>();

        coinBox.push(new Coin(20));
        coinBox.push(new Coin(70));
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(130));

        while(!coinBox.isEmpty()) {
            Coin coin = coinBox.pop();
            System.out.println("꺼내온 동전 : " + coin.getValue() + " 원");
        }
    }
}
