public class Method {
    public static void main(String[] args) throws Exception 
    {
        sayHelloWorld();
        sayHello();
        sayHello("ana");
        sayHello("ana", "hyuna");
        var a = 100;
        var b = 200;
        var c = sum(a,b); //tambah

        System.out.println(c);

        sayCongrats("Ana", 80,90,79,80);

        System.out.println(factorialRecursive(10));
    }

    static void sayHelloWorld()
    {
        System.out.println("Hello world");
    }
    static void sayHello(String firstName, String lastName)
    {
        System.out.println("Hi " + firstName + " " + lastName);
    }

    static int sum(int value1, int value2)
    {
        var total = value1 + value2;
        return total;
    }
    static void sayCongrats(String name, int... values)
    {
        int total = 0;
        for (var value : values)
        {
            total += value;
        }
        int finalValue = total / values.length;
        if (finalValue >= 75)
        {
            System.out.println("Selamat " + name + ", Anda lulus");
        } else
        {
            System.out.println("Coba lagi");
        }
    }
    static void sayHello()
    {
        System.out.println("Hello");
    }

    static void sayHello(String firstName) 
    {
        System.out.println("Hello " + firstName);
    }
    static int factorialRecursive(int value)
    {
        if (value == 1)
        {
            return 1;
        } else
        {
            return value * factorialRecursive(value-1);
        }
    }
    
}
 
