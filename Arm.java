package vandekerkhove.ARMS;

import vandekerkhove.ENUMS.Limb;
import vandekerkhove.ENUMS.Side;
import vandekerkhove.PAD.FootPad;

public abstract class Arm {
	private String serialNumber;
	private Side side;
	private Limb upper;
	private Limb lower;
	private FootPad pad;
	
	public Arm(String serialNumber) {
		this.serialNumber= serialNumber;
	}
	public abstract boolean armCheck();
	

}
