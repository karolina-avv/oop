package vandekerkhove.ARMS;

import vandekerkhove.ENUMS.Limb;
import vandekerkhove.ENUMS.Side;
import vandekerkhove.ENUMS.Status;
import vandekerkhove.PAD.LeftFootPad;

public class LeftArm extends Arm {
	public LeftArm(String serialNumber) {
		super(serialNumber);
	}
	
	private String serialNumber= "LA-01";
	private Status status= Status.ONLINE;
	private Side side= Side.LEFT;
	private LeftFootPad pad;
	private Limb upper=Limb.Upper;
	private Limb lower= Limb.Lower;
	
	
	public boolean armCheck() {
		return false;
	}


		
}
