
abstract class NaveEspacial3 {
	public String pais;

	public NaveEspacial3(String pais, double peso, double altura, double capacidadTransporte, String funcion,
			int caballosFuerza, boolean puedeAterrizar) {
	}

	// Clase para naves espaciales de exploración sobre el tiempo
		abstract class NaveExploracionTiempo extends NaveEspacial3 {
		    protected boolean puedeAterrizar;
		    
		    public NaveExploracionTiempo(String pais, double peso, double altura, double capacidadTransporte, 
		                           String funcion, int caballosFuerza, boolean destruida, boolean puedeAterrizar) {
		        super(pais, peso, altura, capacidadTransporte, funcion, caballosFuerza, puedeAterrizar);

		    	}
		    protected int numPasajeros;
	        
	        public void NaveExploracionTimepo(String pais, double peso, double altura, double capacidadTransporte, 
	                              String funcion, int caballosFuerza, boolean destruida, int numPasajeros) 
	        {
	            this.numPasajeros = numPasajeros;
	        }
	        
	        public int getNumPasajeros() {
	            return numPasajeros;
	        }
	        
	        public String getInfoNave2() {
	            return "Nave de transporte de " + pais + " con " + numPasajeros + " pasajeros.";
	        }
	        
	        public String getInfoNave() {
	            return "Nave de combate de " + pais + " con ";
	        }
	    }
	public String getInfoNave2() {
		// TODO Auto-generated method stub
		return null;
		}
	}

