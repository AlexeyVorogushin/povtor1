public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задача 2");
        var h = 4;
        dog = dog + h;
        cat = cat + h;
        paper = paper + h;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задача 3");
        cat = cat - 3.5;
        dog = dog - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println("Задача 6");
        var manOne = 78.2;
        var manTwo = 82.7;
        var res = manTwo + manOne;
        System.out.println("Общая масса двух бойцов равна " + res + " кг.");
        var rez = manTwo - manOne;
        System.out.println("Разница между массами бойцов равна " + rez + " кг");
        System.out.println("Задача 7");
        var rex = manTwo % manOne;
        System.out.println("Остаток от деления равен " + rex);
        System.out.println("Задача 8.1");
        var hour = 640;
        var rab = hour / 8;
        System.out.println("Всего работников в компании " + rab + " человек");
        System.out.println("Задача 8.2");
        var rabot = rab + 94;
        var rec = hour / rabot;
        System.out.println("Если в компании работает " + rabot + " человек, то всего " + rec + " часа работы может быть поделено между сотрудниками");

    }
}