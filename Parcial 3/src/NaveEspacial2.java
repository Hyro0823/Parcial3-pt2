
abstract class NaveEspacial2 {
	public static final int numArmas = 6;
	public String pais;

	public NaveEspacial2(String pais, double peso, double altura, double capacidadTransporte, String funcion,
			int caballosFuerza, boolean destruida) {
		// TODO Auto-generated constructor stub
	}

	// Clase para naves espaciales tripuladas
    class NaveTripulada extends NaveEspacial2 {
        public NaveTripulada(String pais, double peso, double altura, double capacidadTransporte, String funcion,
				int caballosFuerza, boolean destruida) {
			super(pais, peso, altura, capacidadTransporte, funcion, caballosFuerza, destruida);
			// TODO Auto-generated constructor stub
		}

		protected int numPasajeros;
        
        public NaveTripulada(String pais, double peso, double altura, double capacidadTransporte, 
                              String funcion, int caballosFuerza, boolean destruida, int numPasajeros) {
            super(pais, peso, altura, capacidadTransporte, funcion, caballosFuerza, destruida);
            this.numPasajeros = numPasajeros;
        }
        
        public int getNumPasajeros() {
            return numPasajeros;
        }
        
        public String getInfoNave1() {
            return "Nave de transporte de " + pais + " con " + numPasajeros + " pasajeros.";
        }
        public int getNumArmas() {
            return numArmas;
        }
        
        public String getInfoNave() {
            return "Nave de combate de " + pais + " con " + numArmas + " armas.";
        }
    }
    	public String getInfoNave1() {
	// TODO Auto-generated method stub
	return null;
    		}	
    }
    
