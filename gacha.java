import java.util.Random;
import java.util.Scanner;


class gacha
{
    public static void main(String[] args)
    {
        int Num = 1;
        int miss = 0;

        System.out.println("モバレガチャの時間だよ！\n0はタンク\n1はファイター\n2はアサシン\n3はメイジ\n4はハンター\n5はサポート");
        while (true)
        {
            
            System.out.println(Num+"回目");
            Num += 1;
            //乱数を取得
            Random rand = new Random();
            int num = rand.nextInt(5) ;
            //System.out.println(num);

            //入力できる
            Scanner scanner = new Scanner(System.in);
            System.out.println("君が欲しいキャラは出るかな？\n0~5の好きな数字を入力してね！");
            String why = scanner.next();
            int hoge = Integer.parseInt(why);



            //入力範囲の設定
            if (hoge<0||hoge>=6)
            {
                System.out.println("その数字は間違ってるよ！もう一度入力してね");
                miss ++;
                if (miss>2)
                {
                    System.out.println("あなたは間違えすぎました");
                    break;
                }
                continue;
                

            }
            //ガチャの中身
            if(hoge==0)
            {
                if(num==0)
                {
                    System.out.println("ティグラル");
                }
                if(num==1)
                {
                    System.out.println("ガイ");
                }
                if(num==2)
                {
                    System.out.println("フランコ");
                }
                if(num==3)
                {
                    System.out.println("クッフラー");
                }
                if(num==4)
                {
                    System.out.println("ミノタウロス");
                }
            }
            if(hoge==1)
            {   
                if(num==0)
                {
                    System.out.println("シュウ");
                }
                if(num==1)
                {
                    System.out.println("パキート");
                }
                if(num==2)
                {
                    System.out.println("ルビー");
                }
                if(num==3)
                {
                    System.out.println("ベイン");
                }
                if(num==4)
                {
                    System.out.println("フォヴィウス");
                }
            }
            if(hoge==2)
            {
                if(num==0)
                {
                    System.out.println("ハーリー");
                }
                if(num==1)
                {
                    System.out.println("カリナ");
                }
                if(num==2)
                {
                    System.out.println("隼");
                }
                if(num==3)
                {
                    System.out.println("子龍");
                }
                if(num==4)
                {
                    System.out.println("ファニー");
                }
            }
            if(hoge==3)
            {
                if(num==0)
                {
                    System.out.println("アリス");
                }
                if(num==1)
                {
                    System.out.println("ナナ");
                }
                if(num==2)
                {
                    System.out.println("グールド");
                }
                if(num==3)
                {
                    System.out.println("マファセス");
                }
                if(num==4)
                {
                    System.out.println("星夢");
                }
            }
            if(hoge==4)
            {
                if(num==0)
                {
                    System.out.println("クラウド");
                }
                if(num==1)
                {
                    System.out.println("琥珀");
                }
                if(num==2)
                {
                    System.out.println("キャリー");
                }
                if(num==3)
                {
                    System.out.println("ハナビ");
                }
                if(num==4)
                {
                    System.out.println("ライラ");
                }
            }
            if(hoge==5)
            {
                if(num==0)
                {
                    System.out.println("フローラ");
                }
                if(num==1)
                {
                    System.out.println("アンジェラ");
                }
                if(num==2)
                {
                    System.out.println("エスタス");
                }
                if(num==3)
                {
                    System.out.println("ラファエル");
                }
                if(num==4)
                {
                    System.out.println("マチルダ");
                }
            }
            if (Num>5)
            {
                System.out.println("君が欲しいキャラは出たかな？\nじゃあな！");
                break;
            }



        }
        
    }
}
   

