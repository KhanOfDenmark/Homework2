public class Main {
    public static void main(String[] args) {
        //Task#1
        System.out.println("***");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("***");

        //Task#2
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("***");

        //Task#3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("***");

        //Task#4
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        System.out.println("***");

        //Task#5
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        System.out.println("***");

        //Task#6
        var theBoxer1 = 78.2;
        var theBoxer2 = 82.7;
        var sum = theBoxer1 + theBoxer2;
        System.out.println(sum);
        var dif = theBoxer2 - theBoxer1;
        System.out.println(dif);
        System.out.println("***");

        //Task#7
        var rem = theBoxer2 % theBoxer1;
        System.out.println(rem);
        System.out.println("***");

        //Task#8.1
        var totalTime = 640;
        var workTime = 8;
        var workers = totalTime / workTime;
        System.out.println("Всего работников в компании — "+workers+" человек");
        System.out.println("---");
        //Task#8.2
        var moreWorkers = workers + 94;
        totalTime = moreWorkers * workTime;
        System.out.println("Если в компании работает "+moreWorkers+" человек, то всего "+totalTime+" часов работы может быть поделено между сотрудниками");
    }
}