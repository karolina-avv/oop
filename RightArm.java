package vandekerkhove.ARMS;

import vandekerkhove.ENUMS.Limb;
import vandekerkhove.ENUMS.Side;
import vandekerkhove.ENUMS.Status;
import vandekerkhove.PAD.RightFootPad;

public class RightArm extends Arm {
	public RightArm(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}
	private String serialNumber= "RA-02";
	private Status status= Status.ONLINE; 
	private Side side= Side.RIGHT;
	private RightFootPad pad;
	private Limb upper=Limb.Upper;
	private Limb lower= Limb.Lower;
	@Override
	public boolean armCheck() {
		// TODO Auto-generated method stub
		return false;
	}


}
