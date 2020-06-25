package StringDemo;

public class StringApi {

    public static void main(String[] args) {
        String string="Hello,Boy!";
        String a=" code hello    ";

        //检查字符或者字符串第一次出现的位置
        System.out.println(string.indexOf('B'));
        System.out.println(string.indexOf("ll"));

        //获取子串
        System.out.println(string.substring(0,5));

        //去除前后两端空白字符
        System.out.println(a.trim());

        //查找某一个位置的字符
        System.out.println(a.charAt(3));

        //判断源字符串是否以""开始或者结束，大小写敏感
        System.out.println(string.startsWith("Hel"));
        System.out.println(a.endsWith("  "));

        //转换成大写字母或者小写字母
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());

        //其他类型转成String
        System.out.println(String.valueOf(10).charAt(1));
        System.out.println(String.valueOf('a').toUpperCase());

        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(' ');

    }
}
