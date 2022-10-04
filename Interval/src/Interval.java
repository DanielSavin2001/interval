/**
 *  @author Daniel
 *
 * Abstractetoestandsinvarianten/publieke invarianten: (WE PRATEN HIER ALLEEN OVER DE GETTER, PUBLIEKE DOC)
 * 
 *
 *  @invar De bovengrens is gelijk aan de ondergrens plus de lengte.
 *  	| getBovengrens() == getOndergrens() + getLengte()
 *
 *	@invar De bovenggrens is niet kleiner dan de ondergrens.
 *	| getOndergrens() <= getBovengrens()
 *
 */


public class Interval {
	/**
	 * representatie-invarianten/private invarianten: (ALLEEN VOOR PRIVATE VELDEN)
	 * 
	 * @invar De breedte is niet negatief.
	 *    | 0 <= breedte
	 */
	private int ondergrens;
	private int breedte;

	
	/**
	 * 
	 *  @pre | waarde <= getLengte()
	 *  @post | getOndergrens() == waarde
	 *  @post | getLengte() == old(getLengte())
	 */
	void setOndergrens(int waarde) {
		this.ondergrens = waarde;
	}
	
	public int getBovengrens() {
		return getOndergrens() + getLengte();
	}

	/**
	 * @pre | getOndergrens() <= waarde 
	 * @post | getLengte() == waarde
	 * @post | getOndergrens() == old(getOndergrens())
	 */
	void setBovengrens(int waarde) {
		this.breedte = waarde - this.ondergrens;
	}

	
	public int getLengte() {
		return this.breedte;
	}
	

	public int getOndergrens() {
		return this.ondergrens;
	}

	/**
	 * Stelt de breedte van dit interval in.
	 * 
	 * @throws IllegalArgumentException als de gegeven waarde is niet negatief.
	 * 		| 0 < waarde
	 * 
	 * 
	 * @post De lengte van dit interval is gelijk aan de gegeven waarvoor 
	 * 			| getLengte() == waarde
	 * @post De ondergrens is ongewijzigd gebleven.
	 *  		| getOndergrens()  == old(getOndergrens())
	 * @post De bovengrens is gelijk aan de ondergrens plus de breedte
	 * 			| getBovengrens() == getOndergrens() + getLengte()
	 */
	public void setBreedte(int waarde) {
		if(waarde< 0) {
			throw new IllegalArgumentException("'Waarde' is negatief");
		}
	  this.breedte = waarde;	
	}
	
	
	/**
	 * 
	 * @pre  | ondergrens <= breedte
	 * @post | getOndergrens() == ondergrens
	 * @post | getLengte() == breedte
	 */
	public Interval(int ondergrens, int breedte) {
		this.ondergrens = ondergrens;
		this.breedte = breedte;

	}
	
	


}
