
package decorador;


public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Last Name,Age,Salary\nMario,Vicente,22,200000\nGustavo,Ruano,23,500000\nIker,Alberto,19,100000000";
        DSDecorador encoded = new CDecorador(
                                new EDecorador(
                                    new FDataSource("C:\\Users\\iaguz\\Documents\\NetBeansProjects\\Decorador\\src\\main\\java\\decorador\\out\\OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FDataSource("C:\\Users\\iaguz\\Documents\\NetBeansProjects\\Decorador\\src\\main\\java\\decorador\\out\\OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
