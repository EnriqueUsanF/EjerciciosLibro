package clasesUnidadDiez;

public class StackOfIntegers {
	private int[] valores;
    private int tamanio;
    public static final int capacidadDefecto = 16;

    public StackOfIntegers() {
        this(capacidadDefecto);
    }

    public StackOfIntegers(int capacidad) {
        valores = new int[capacidad];
    }

    public void push(int value) {
        if (tamanio >= valores.length) {
            int[] temp = new int[valores.length * 2];
            System.arraycopy(valores, 0, temp, 0, valores.length);
            valores = temp;
        }
        valores[tamanio++] = value;
    }

    public int pop() {
        return valores[--tamanio];
    }

    public int peek() {
        return valores[tamanio - 1];
    }

    public boolean empty() {
        return tamanio == 0;
    }

    public int getSize() {
        return tamanio;
    }
}
