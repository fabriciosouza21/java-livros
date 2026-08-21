package item22;

import java.io.ObjectStreamConstants;

public class item22 {

    static void main() {
        IO.println("User interface only to define Types");

        // essa interface não é um bom exemplo de interface esse padrão é chamadao de constant interface pattern.
        int baseWireHandle = ObjectStreamConstants.baseWireHandle;

        double boltzmannConstant = PhysicalConstants.BOLTZMANN_CONSTANT;

        double boltzmannConstantI = IPhysicalConstants.BOLTZMANN_CONSTANT;



    }
}
