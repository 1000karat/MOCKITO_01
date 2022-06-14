public class Manager {
    private Poster[] items = new Poster[0];
    private int defaultLength = 10;

    public Manager() {
    }

    public Manager(int defaultLength) {
        this.defaultLength = defaultLength;
    }

    public void add(Poster newItem) {
        //создаём новый массив, вычисляем длинну + 1
        Poster[] tmp = new Poster[items.length + 1];
        //копируем: откуда копируем, с какой позиции начинаем, куда копируем, с какой позиции копируем, сколько копируем
        System.arraycopy(items, 0, tmp, 0, items.length);
        //последняя ячейка
        tmp[tmp.length - 1] = newItem;
        if (tmp.length > defaultLength) {
            return;
        }
        this.items = tmp;
    }

    public Poster[] findAll() {
        return items;
    }

    public Poster[] findLast() {
        Poster[] result = new Poster[items.length];
        // перебираем массив в прямом порядке и кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}