package project1;

//модификаторы доступа: public protected-(виден внутри класса и наследованных) private-(виден внутри класса)
public class Transport {

    public float speed;
    public int weight;
    public String color;
    public byte[] coordiante;


    // конструктор для класса
    public Transport(float _speed, int _weight, String _color, byte[] _coordiante) {
        System.out.println("Object created");
        setValues(_speed, _weight, _color, _coordiante);
        System.out.println(getValues());
    }

    public Transport(int _weight, byte[] _coordiante) {
        weight = _weight;
        coordiante = _coordiante;
        System.out.println(getValues());
    }


    public void setValues(float _speed, int weight, String _color, byte[] _coordiante) {
        speed = _speed;
        this.weight = weight;
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

