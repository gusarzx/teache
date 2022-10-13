package project1;

//модификаторы доступа: public protected-(виден внутри класса и наследованных) private-(виден внутри класса)
public class Transport {

    public float speed;
    public int weight;
    public String color;
    public byte[] coordiante;

    public void setValues(float _speed, int _weight, String _color, byte[] _coordiante) {
        speed = _speed;
        weight = _weight;
        color = _color;
        coordiante = _coordiante;

    }

    public String getValues() {
        String info = "Object speed: " + speed + ". Weight: " + weight + ". Color: " + color + ".\n";
        String infoCoordiantes = "Cordinates: \n";
        for (int i = 0; i < coordiante.length; i++) {
            infoCoordiantes += coordiante[i] + "\n";
        }
        return info + infoCoordiantes;
    }
}
