import com.alberto.utils.SuperMarketUtils;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(SuperMarketUtils.generarNombreAleatorio());
            System.out.println(SuperMarketUtils.generarProductoAleatorio());
        }
    }
}
