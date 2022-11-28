public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        var dog = 8.0; // Для выполнениия задачии 3 присвоено значение double
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;
        cat =  cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача 3
        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat =  cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        friend += 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        // Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        // Задачи 6 и 7
        System.out.println("Задачи 6 и 7");
        var Jotaro = 78.2;
        var Dio = 82.7;
        System.out.println(" Вес Jotaro " + Jotaro + " кг ");
        System.out.println(" Вес Dio " + Dio + " кг ");
        var AllWeight = Jotaro + Dio;
        System.out.println(" Общиий вес боксеров " + AllWeight + " кг ");
        var DifferenceWeight = Dio - Jotaro;// 1 вариант задачи 7
        System.out.println(" Разниица в весе " + DifferenceWeight + " кг ");
        var DifferenceWeight2 = Dio % Jotaro;// 2 вариант задачи 7
        System.out.println(" Разница в весе " + DifferenceWeight2 + " кг ");
        // Задача 8
        System.out.println("Задача 8");
        var AllWorktime = 640.0;// присвоено ззначениие double для выполненииия 2 условия
        var Employees = 640 / 8;
        System.out.println(" Всего работников в компании " + Employees + " человек ");// первая задача в условии
        var AdditionalEmpployees = Employees + 94;
        var WorktimeEmployee = AllWorktime / AdditionalEmpployees;
        System.out.println(" Если в компании работает " + AdditionalEmpployees + " человек, то всего " + WorktimeEmployee + " часов работы может быть поделено между сотрудниками ");
    }
}