import java.util.Hashtable;
import java.util.Scanner;
public class Command {
	static Hashtable <String, Receptor1> all1;
	static Hashtable <String, Receptor2> all2;
	public static void main(String[] args) {
		all1 = new Hashtable<String, Receptor1>();
		Emp emp = Emp.obterInstancia();
		Res res = Res.obterInstancia();
		Dev dev = Dev.obterInstancia();
		Obs obs = Obs.obterInstancia();
		all1.put("emp",emp);
		all1.put("res", res);
		all1.put("dev", dev);
		all1.put("obs", obs);
		all2 = new  Hashtable<String, Receptor2>();
		Usu usu = Usu.obterInstancia();
		Rtf rtf = Rtf.obterInstancia();
		Liv liv = Liv.obterInstancia();
		all2.put("usu", usu);
		all2.put("rtf", rtf);
		all2.put("liv", liv);
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira o comando");
		String entrada = ler.nextLine();
		String comando = entrada.substring(0, 2);
			while(comando != "sai"){
				if(comando == "sai") {
					return;
				}
				if(all1.containsKey(ler)){
					Receptor1 x;	
					x = all1.get(ler);
					String id1 = entrada.substring(4,6);
					String id2 = entrada.substring(8, 10);
					int idUsuario = Integer.parseInt(id1);
					int idLivro = Integer.parseInt(id2);
					x.execute(idUsuario, idLivro);
				}
				else {
					Receptor2 x;
					x = all2.get(ler);
					String id1 = entrada.substring(4,6);
					int idUsuario = Integer.parseInt(id1);
					x.execute(idUsuario);
				}
				ler = new Scanner(System.in);
				System.out.println("Insira o comando");
				entrada = ler.nextLine();
				comando = entrada.substring(0, 2);
		}
	}
}


