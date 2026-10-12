//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Videojuegos j1 = new Videojuegos();
    j1.nombre = "Minecraft";
    j1.genero = "Sandbox";
    j1.version = "1.20";
    j1.activo = false;

    Videojuegos j2 = new Videojuegos();
    j2.nombre = "Overwatch";
    j2.genero = "Shooter";
    j2.version = "2.5";
    j2.activo = false;

    Videojuegos j3 = new Videojuegos();
    j3.nombre = "Dragon Ball Xenoverse 2";
    j3.genero = "Acción / Lucha";
    j3.version = "1.21";
    j3.activo = false;

    j1.iniciar();
    j1.mostrarInformacion();

    j2.mostrarVersion();
    j3.mostrarInformacion();

}
