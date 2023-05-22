package GestionZoo;

	
	public class aves_rapaces extends TierraYAire{

		private int participantes;
		
		protected aves_rapaces() {
			super();
			this.participantes = 0;
		}
		
		protected aves_rapaces(int numEntradas, int numGuias, double duracion, double recorrido, boolean espectaculo, int espectaculos, int participantes) {
			super(numEntradas, numGuias, duracion, recorrido, espectaculo, espectaculos);
			this.participantes = participantes;
		}
		
		
		protected int getParticipantes() {
			return participantes;
		}

		protected void setParticipantes(int participantes) {
			this.participantes = participantes;
		}

		
		public String toString() {
			return "Numero de entradas: " + getNumEntradas() + "\n\tNumero de Guias: " + getNumGuias() + "\n\tDuracion: " + getDuracion() + "m"
			   + "\n\tRecorrido : " + getRecorrido() + "km" + "\n\t" + mensajeEspectaculo() + " (" + getEspectaculos() + ")" + "\n\tParticipantes en el espectaculo: "
			   + getParticipantes() + "\n\t\tTotal a pagar: " + calcPrecio() + " euros";
		}
		
		public String toFichero() {
			return "AR" + ";" + super.toFichero() + ";" + getParticipantes();
		}
	}

