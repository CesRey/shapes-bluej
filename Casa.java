
class Casa
{
    //variables de instancia
        Circle ventana;
        Triangle techo;
        Square pared;
        Square puerta;
        
    //Constructor
    Casa()
    {
        ventana = new Circle();
        techo = new Triangle();
        pared = new Square();
        puerta = new Square();
    }
    
    //Funcion que muestra las figuras
    void dibujalacasa()
    {
        ventana.makeVisible();
        techo.makeVisible();
        pared.makeVisible();
        puerta.makeVisible();
    }
    
    //Acomoda las figuras de tal forma que se haga una casa
    void cambiarcolor()
    {
        ventana.changeColor("red");
        techo.changeColor("black");
        pared.changeColor("green");
        puerta.changeColor("blue");
    }
    
    void cambiarTamaño()
    {
        techo.changeSize(75,125);
        pared.changeSize(80);
    }
    
    void unirPiezas()
    {
        techo.moveHorizontal(100);
        ventana.moveVertical(-25);
        ventana.moveHorizontal(115);
        pared.moveVertical(40);
        pared.moveHorizontal(50);
        puerta.moveVertical(90);
        puerta.moveHorizontal(75);
    }
}
