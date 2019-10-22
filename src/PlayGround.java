public class PlayGround {

    public static void main(String[] args) {
        run();
    }

    static void run() {
        System.out.println("Java SE 8 Programmer I");
        new RunTest().run(new Teste());
    }
}

class RunTest {

    void run(Generic objeto) {
        objeto.imprimir();
        objeto.vamoVerEntao();
    }
}

abstract class Generic<E> {
    abstract void imprimir();

    void vamoVerEntao() {
        System.out.println(this.getClass().toString());
    }
}

class Teste extends Generic<Teste> {

    @Override
    void imprimir() {
        System.out.println("foe");
    }
}
