
abstract class NaveEspacial {
	
	    protected String pais;
	    protected double peso;
	    protected double altura;
	    protected double capacidadTransporte;
	    protected String funcioncumple;
	    protected int caballosFuerza;
	    protected boolean navedestruida;
	    
	    public NaveEspacial(String pais, double peso, double altura, double capacidadTransporte, 
	                        String funcion, int caballosFuerza, boolean destruida) {
	        this.pais = pais;
	        this.peso = peso;
	        this.altura = altura;
	        this.capacidadTransporte = capacidadTransporte;
	        this.funcioncumple = funcion;
	        this.caballosFuerza = caballosFuerza;
	        this.navedestruida = destruida;
	    }
	    
	    public String getPais() {
	        return pais;
	    }
	    
	    public double getPeso() {
	        return peso;
	    }
	    
	    public double getAltura() {
	        return altura;
	    }
	    
	    public double getCapacidadTransporte() {
	        return capacidadTransporte;
	    }
	    
	    public String getFuncion() {
	        return funcioncumple;
	    }
	    
	    public int getCaballosFuerza() {
	        return caballosFuerza;
	    }
	    
	    public boolean estaDestruida() {
	        return navedestruida;
	    }
	    
	    // Método abstracto para obtener información específica de la nave
	    public abstract String getInfoNave();
	}

	
	class VehiculoLanzadera extends NaveEspacial {
	    public VehiculoLanzadera(String pais, double peso, double altura, double capacidadTransporte, String funcion,
				int caballosFuerza, boolean destruida) {
			super(pais, peso, altura, capacidadTransporte, funcion, caballosFuerza, destruida);
		}

		protected int numPasajeros;
	    
	    public VehiculoLanzadera(String pais, double peso, double altura, double capacidadTransporte, 
	                          String funcion, int caballosFuerza, boolean destruida, int numPasajeros) {
	        super(pais, peso, altura, capacidadTransporte, funcion, caballosFuerza, destruida);
	        this.numPasajeros = numPasajeros;
	    }
	    
	    public int getNumPasajeros() {
	        return numPasajeros;
	    }
	    
	    public String getInfoNave() {
	        return "Nave de transporte de " + pais + " con " + numPasajeros + " pasajeros.";
	    }
	}

	// Clase para naves no tripuladas o roboticas
	class NavesNotripuladas extends NaveEspacial {
	    public NavesNotripuladas(String pais, double peso, double altura, double capacidadTransporte, String funcion,
				int caballosFuerza, boolean destruida) {
			super(pais, peso, altura, capacidadTransporte, funcion, caballosFuerza, destruida);
		}

		protected int numArmas;
	    
	    public NavesNotripuladas(String pais, double peso, double altura, double capacidadTransporte, 
	                       String funcion, int caballosFuerza, boolean destruida, int numArmas) {
	        super(pais, peso, altura, capacidadTransporte, funcion, caballosFuerza, destruida);
	        this.numArmas = numArmas;
	    }
	    
	    // Clase abstracta para naves espaciales
	    abstract class NaveEspacial {
	        protected String pais;
	        protected double peso;
	        protected double altura;
	        protected double capacidadTransporte;
	        protected String funcion;
	        protected int caballosFuerza;
	        protected boolean destruida;
	        
	        public NaveEspacial(String pais, double peso, double altura, double capacidadTransporte, 
	                            String funcion, int caballosFuerza, boolean destruida) {
	            this.pais = pais;
	            this.peso = peso;
	            this.altura = altura;
	            this.capacidadTransporte = capacidadTransporte;
	            this.funcion = funcion;
	            this.caballosFuerza = caballosFuerza;
	            this.destruida = destruida;
	        }
	        
	        public String getPais() {
	            return pais;
	        }
	        
	        public double getPeso() {
	            return peso;
	        }
	        
	        public double getAltura() {
	            return altura;
	        }
	        
	        public double getCapacidadTransporte() {
	            return capacidadTransporte;
	        }
	        
	        public String getFuncion() {
	            return funcion;
	        }
	        
	        public int getCaballosFuerza() {
	            return caballosFuerza;
	        }
	        
	        public boolean estaDestruida() {
	            return destruida;
	        }
	        
	        // Método abstracto para obtener información específica de la nave
	        public abstract String getInfoNave();
	    }

	    // Clase para naves espaciales de combate
	    class NaveCombate extends NaveEspacial {
	        protected int numArmas;
	        
	        public NaveCombate(String pais, double peso, double altura, double capacidadTransporte, 
	                           String funcion, int caballosFuerza, boolean destruida, int numArmas) {
	            super(pais, peso, altura, capacidadTransporte, funcion, caballosFuerza, destruida);
	            this.numArmas = numArmas;
	        }
	        
	        public int getNumArmas() {
	            return numArmas;
	        }
	        
	        public String getInfoNave() {
	            return "Nave de combate de " + pais + " con " + numArmas + " armas.";
	        }
	    }
	public String getInfoNave() {
		// TODO Auto-generated method stub
		return null;
	}
}
