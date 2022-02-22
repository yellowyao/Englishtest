package suep.yao;

import suep.yao.main.Phrase;
import suep.yao.utils.getPhrase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Yao_English {
    public static void main(String[] args) {
        List<Phrase> allPhrase = getPhrase.getAllPhrase();
        Scanner scanner = new Scanner(System.in);
        Scanner scannerB = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            int grade = 0;//初始化成绩
            ArrayList<Integer> err = new ArrayList<>();//储存错误题号
            ArrayList<String> errString = new ArrayList<>();//储存错误答案
            System.out.println("输入你要测验的短语的个数:");
            int num = scannerB.nextInt();//获取个数
            System.out.println("要测验的短语个数为:" + num);
            System.out.println("短语汉译英开始:");
            for (int i = 0; i < num; i++) {
                int id = random.nextInt(256);//随机取题号
                Phrase phrase = allPhrase.get(id);//获取短语
                System.out.print((i + 1) + "." + phrase.getChinese() + ":");
                String english = scanner.nextLine();//获取输入的数据
                //判断是否正确幷更改分数或储存错误答案
                if (english.equals(phrase.getEnglish())) {
                    grade++;
                } else {
                    err.add(id);
                    errString.add(english);
                }
            }
            System.out.println("本次成绩为:" + grade);
            if (err.isEmpty()) {
                System.out.println("恭喜你此次测验满分！！！！！");
            } else {
                System.out.println("错误的短语为:");
                for (int i = 0; i < err.size(); i++) {
                    System.out.println(allPhrase.get(err.get(i)));
                    System.out.println("你输入的短语为:" + errString.get(i));
                }
            }
            System.out.println("输入-1结束本次测验，其他继续");
            if (scannerB.nextInt() == -1) {
                break;
            }
        }
    }
}
