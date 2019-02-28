package SteckTest;

public class Main
{
    public static void main(String[] args)
    {
        MyStec<Character> stec= new MyStec<>();
        stec.push("Юрий");
        stec.push("Виталий");
        stec.push("Михаил");
        stec.push("Аркадий");
        System.out.println(stec.size());
        System.out.println(stec.peek());
        System.out.println(stec.pop());
        System.out.println(stec.peek());
        System.out.println(stec.size());
        stec.pop();
        stec.pop();
        stec.pop();
        System.out.println(stec.size());

    }
}
