
package JuegoHistoria;

import java.util.Scanner;

public class ClaseJuegoEntornos {

	 static Scanner scanner = new Scanner(System.in);
		public static void main(String[] args) {

			System.out.println("Bienvenido a la historia donde tÃº eres el protagonista!");
			System.out.println("");

			System.out.println("PodrÃ¡s elegir entre varias opciones para decidir el rumbo de tu aventura.");
			System.out.println("");
			
			System.out.println("La historia comienza a las 9 de la maÃ±ana del 15 de diciembre de 1995 en el hospital Infanta SofÃ­a de Madrid, "
					+ "hacia un frio helador y aÃºn no habÃ­a salido el sol.");
			System.out.println("Hoy era un dÃ­a especial, Ingrid Baker estaba a punto de dar a luz. El mÃ©dico anteriormente le habÃ­a avisado que iba a tener dos mellizos, un niÃ±o y una niÃ±a.");
			System.out.println("");
			
			System.out.println("Debido a esta situaciÃ³n, el padre; Richard Williams, decidiÃ³ dejar a Ingrid y cortar el contacto con ella y sus futuros hijos.");
			System.out.println("");

			System.out.println("El embarazo iba muy bien, pero iba a suceder un imprevisto desafortunado que cambiarÃ­a drÃ¡sticamente el devenir de la historia, "
					+ "y eres tÃº quiÃ©n debe decidir quÃ© rumbo tomar. Este dÃ­a marcarÃ¡ tu vida y a partir de ahÃ­ depende de ti y de tus actos en quiÃ©n tÃº decidas ser.");
			System.out.println("");
			
			System.out.println("Llega el momento de tomar tu primera decisiÃ³n. Estas en la una encrucijada antes de nacer.");
			System.out.println("");
			
			System.out.println("1.- Ingrid sobreviva al parto pero eso involucrarÃ­a que tu hermano fallezca.");
			System.out.println("2.- Decidir salvar a tu hermano, tendrÃ¡ como consecuencia la muerte de Ingrid.");
			int eleccion = scanner.nextInt();
			
			if (eleccion ==1){
				
				
			} else {
				
				
			}
			
		}

		
		static void opcion9() {

			System.out.println("Decides salir a buscar a Aiden. Tras seguir sus pisadas por el bosque, le encuentras.");
			System.out.println("");
			System.out.println("ComenzÃ¡is a dar un paseo y a hablar sobre lo que ha ocurrido.");
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

			System.out.println("Decides ir a ayudarle, la rama en la que estaba sujeto Aiden se rompe, provocando que os caigÃ¡is los dos por el precipicio.");
			System.out.println("Tras la caÃ­da, Aiden tiene un muerte instantÃ¡nea y tÃº sobrevives.");
		}

		static void opcion12() {

			System.out.println("Decides no ayudar a tu hermano, por tanto tu hermano muere.");
			System.out.println("Tras su caÃ­da, los ciervos te empiezan a acorralar mÃ¡s y terminas cayendo, provocando tu muerte tambiÃ©n.");
		}

		static void opcion10() {

			System.out.println("Decides esperar que vuelva tu hermano. ");
			System.out.println("Al siguiente dÃ­a la policÃ­a acude al orfanato para comunicarte una terrible noticia, tu hermano a fallecido tras caerse por un barranco.");
			System.out.println("");
		}
		static void opcion1() {


			System.out.println("Has decidido salvar a Ingrid, tu hermano no ha conseguido sobrevivir al parto.");
			System.out.println("");
			System.out.println("3 aÃ±os despuÃ©sâ€¦");	
			System.out.println("");

			System.out.println("Desde que eras pequeÃ±a, el doctor Nathan Dawkins y tu madre vieron algo especial en ti, no eras como las demÃ¡s niÃ±as. Comenzaron a ver sucesos extraÃ±os que ocurrÃ­an a tu alrededor. TenÃ­as un amigo â€œimaginarioâ€� llamado Aiden."
					+ "	Ingrid muriÃ³ debido a una depresiÃ³n tras la muerte de tu hermano.");
			System.out.println("A partir de ese entonces, Nathan se hizo de cargo de tu custodia.");
			System.out.println("");
			System.out.println("15 aÃ±os despuÃ©sâ€¦");
			System.out.println("");


			System.out.println("Con el paso del tiempo Nathan descubriÃ³ que Aiden, es una entidad vinculada a ti. Es un ser inmaterial, con poderes telequinÃ©ticos que hace que tengas contacto con el mundo de los espirÃ­tus.");
			System.out.println("");
			System.out.println("Al ser â€œun peligro para la sociedadâ€�, la CNP estÃ¡ informada sobre su existencia.");
			System.out.println("La CNP han encontrando un portal multidimensional en unas instalaciones abandonas, en el que parecÃ­a haber entidades malignas."
					+ "Debido a ello, la CNP contactÃ³ contigo para que pudieses ayudar a la exterminaciÃ³n del portal.");
			System.out.println("");
			System.out.println("Decides:");
			System.out.println("1.-Colaborar para que se cierre el portal.");
			System.out.println("2.-No colaborar.");

			int eleccion1 = scanner.nextInt();

			if (eleccion1 == 1){

				
			} else {

		
			}


		}
      
      static void opcion2() {
		
		System.out.println("Decidir salvar a tu hermano, tendrÃ¡ como consecuencia la muerte de Ingrid.");
		System.out.println("");
		System.out.println("Al tomar esta decisiÃ³n, has conseguido salvar a tu hermano Aiden. En contrapartida, tu madre Ingrid no ha logrado sobrevivir al parto.");
		System.out.println("Este trÃ¡gico acontecimiento provoca que Aiden y tu os crieis juntos en un orfanato.");
		System.out.println("");
		System.out.println("17 aÃ±os despuÃ©s...");
		System.out.println("");
		System.out.println("En el orfanato, te hiciste amiga de uan chica muy similar a ti, Zoe Smith.");
		System.out.println("Era sin duda tu mejor amiga del lugar y al tener ambas un carÃ¡cter muy parecido, os apoyabais en los momentos difÃ­ciles. ");
		System.out.println("Zoe habÃ­a perdido a sus padres por un accidente de trÃ¡fico y llevaba unos pocos aÃ±os en el orfanato. Pero desde que entablasteis conversaciÃ³n por primera vez, se generÃ³ una clara complicidad y habiais forjado una fuerte y cercana amistad.");
		System.out.println("");
		System.out.println("Al principio Aiden la veÃ­a con ojos de rechazo ya que sentÃ­a un distanciamiento progresivo contigo por dicha relaciÃ³n de amistad.");
		System.out.println("Aiden era un chico introvertido, serio, independiente, que no se habrÃ­a fÃ¡cilmente ante otras personas y en el fondo se sentÃ­a solo. ");
		System.out.println("Por ello, veÃ­a a Zoe como una enemiga y aÃºn no habÃ­a hablado con ella ni una sola vez.");
		System.out.println("");
		System.out.println("Un dÃ­a conseguiste convencer a Aiden de que Zoe no era el problema y le pediste que le diera una oportunidad para que se diera cuenta que ella tambiÃ©n podrÃ­a ser buena amiga de ambos y de esta manera fortalecer el vÃ­nculo con tu hermano.");
		System.out.println("Con el paso del tiempo, tanto tu como Aiden y Zoe empezastÃ©is a compartir buenos momentos en el orfanato y formasteis un grupo unido y cÃ³mplice.");
		System.out.println("Pero poco a poco, Aiden se empezÃ³ a enamorar de Zoe y a tener fuertes sentimientos por ella.");
		System.out.println("");
		System.out.println("DespuÃ©s de un largo periodo de reflexiÃ³n por parte de tu hermano, decide confesar sus sentimientos a Zoe.");
		System.out.println("Aunque Zoe se sintiÃ³ muy halagada por las palabras tan sentidas de Aiden, ella no sentÃ­a lo mismo por Ã©l.");
		System.out.println("Aiden se quedÃ³ en shock. Al principio estaba totalmente paralizado y no movÃ­a ni un mÃºsculo.");
		System.out.println("Pero rÃ¡pidamente se puso a temblar, y se exclamÃ³ con un llanto desconsolado diciendo que ya no querÃ­a ser mÃ¡s su amigo.");
		System.out.println("Seguidamente a ello, Aiden se fue a su habitaciÃ³n sin mirar a nadie.");
		System.out.println("");
		System.out.println("Esa misma noche, Aiden se consigue fugar del orfanato sin mirar atrÃ¡s, perdiÃ©ndose en los entresijos del bosque.");
		System.out.println("");
		System.out.println("Decides:");
		System.out.println("1.-Salir al bosque a buscar a Aiden.");
		System.out.println("2.-Esperar en el orfanato a que vuelva.");
		
		int eleccionBosque=scanner.nextInt();
		
		if(eleccionBosque==1) {
			
		} else {
			
		}
		
	}
}

