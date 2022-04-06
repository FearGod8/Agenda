import java.util.*;
public class ZPersona {
	static ArrayList<Persona> Arrpersona = new ArrayList<Persona>();
	private Persona objPersona;

	public ZPersona() {
	}

	public void agregar(String nom, String ap, String tel, String correo, String fechaN) {
		objPersona = new Persona();
		objPersona.setNombre(nom);
		objPersona.setApellidos(ap);
		objPersona.setTelefono(tel);
		objPersona.setCorreo(correo);
		objPersona.setFechaN(fechaN);
		Arrpersona.add(objPersona);
	}

	public ArrayList Datos() {
		return Arrpersona;
	}
}
