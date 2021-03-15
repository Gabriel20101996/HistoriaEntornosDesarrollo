package JuegoHistoria;

import java.util.Scanner;

public class ClaseJuegoEntornos {

	 static Scanner scanner = new Scanner(System.in);
		public static void main(String[] args) {

			System.out.println("Bienvenido a la historia donde tú eres el protagonista!");
			System.out.println("");

			System.out.println("Podrás elegir entre varias opciones para decidir el rumbo de tu aventura.");
			System.out.println("");
			
			System.out.println("La historia comienza a las 9 de la mañana del 15 de diciembre de 1995 en el hospital Infanta Sofía de Madrid, "
					+ "hacia un frio helador y aún no había salido el sol.");
			System.out.println("Hoy era un día especial, Ingrid Baker estaba a punto de dar a luz. El médico anteriormente le había avisado que iba a tener dos mellizos, un niño y una niña.");
			System.out.println("");
			
			System.out.println("Debido a esta situación, el padre; Richard Williams, decidió dejar a Ingrid y cortar el contacto con ella y sus futuros hijos.");
			System.out.println("");

			System.out.println("El embarazo iba muy bien, pero iba a suceder un imprevisto desafortunado que cambiaría drásticamente el devenir de la historia, "
					+ "y eres tú quién debe decidir qué rumbo tomar. Este día marcará tu vida y a partir de ahí depende de ti y de tus actos en quién tú decidas ser.");
			System.out.println("");
			
			System.out.println("Llega el momento de tomar tu primera decisión. Estas en la una encrucijada antes de nacer.");
			System.out.println("");
			
			System.out.println("1.- Ingrid sobreviva al parto pero eso involucraría que tu hermano fallezca.");
			System.out.println("2.- Decidir salvar a tu hermano, tendrá como consecuencia la muerte de Ingrid.");
			int eleccion = scanner.nextInt();
			
			if (eleccion ==1){
				
				
			} else {
				
				
			}
			
		}

		
		static void opcion9() {

			System.out.println("Decides salir a buscar a Aiden. Tras seguir sus pisadas por el bosque, le encuentras.");
			System.out.println("");
			System.out.println("Comenzáis a dar un paseo y a hablar sobre lo que ha ocurrido.");
			System.out.println("En mitad de la charla, cerca de un precipicio, una manada de ciervos os empiezan a acorralar.");
			System.out.println("Aiden se tropieza y se queda colgando de una rama.");
			System.out.println("");
			System.out.println("Decides:");
			System.out.println("1.- Ayudarle");
			System.out.println("2.- No ayudarle");

			int eleccionBosque = scanner.nextInt();

			if (eleccionBosque == 1) {
				
				opcion11();
			} else {
				
				opcion12();
			}
		}

		static void opcion11() {

			System.out.println("Decides ir a ayudarle, la rama en la que estaba sujeto Aiden se rompe, provocando que os caigáis los dos por el precipicio.");
			System.out.println("Tras la caída, Aiden tiene un muerte instantánea y tú sobrevives.");
		}

		static void opcion12() {

			System.out.println("Decides no ayudar a tu hermano, por tanto tu hermano muere.");
			System.out.println("Tras su caída, los ciervos te empiezan a acorralar más y terminas cayendo, provocando tu muerte también.");
		}

		static void opcion10() {

			System.out.println("Decides esperar que vuelva tu hermano. ");
			System.out.println("Al siguiente día la policía acude al orfanato para comunicarte una terrible noticia, tu hermano a fallecido tras caerse por un barranco.");
			System.out.println("");

		static void opcion1() {


			System.out.println("Has decidido salvar a Ingrid, tu hermano no ha conseguido sobrevivir al parto.");
			System.out.println("");
			System.out.println("3 años después…");	
			System.out.println("");

			System.out.println("Desde que eras pequeña, el doctor Nathan Dawkins y tu madre vieron algo especial en ti, no eras como las demás niñas. Comenzaron a ver sucesos extraños que ocurrían a tu alrededor. Tenías un amigo “imaginario” llamado Aiden."
					+ "	Ingrid murió debido a una depresión tras la muerte de tu hermano.");
			System.out.println("A partir de ese entonces, Nathan se hizo de cargo de tu custodia.");
			System.out.println("");
			System.out.println("15 años después…");
			System.out.println("");


			System.out.println("Con el paso del tiempo Nathan descubrió que Aiden, es una entidad vinculada a ti. Es un ser inmaterial, con poderes telequinéticos que hace que tengas contacto con el mundo de los espirítus.");
			System.out.println("");
			System.out.println("Al ser “un peligro para la sociedad”, la CNP está informada sobre su existencia.");
			System.out.println("La CNP han encontrando un portal multidimensional en unas instalaciones abandonas, en el que parecía haber entidades malignas."
					+ "Debido a ello, la CNP contactó contigo para que pudieses ayudar a la exterminación del portal.");
			System.out.println("");
			System.out.println("Decides:");
			System.out.println("1.-Colaborar para que se cierre el portal.");
			System.out.println("2.-No colaborar.");

			int eleccion1 = scanner.nextInt();

			if (eleccion1 == 1){

				
			} else {

		
			}


		}
}
