package ru.zhuravlev.homeworks.homework10;

public class Box {
    private final int length;
    private final int width;
    private final int height;
    private String color;
    private boolean open;
    private String itemIn;

    public Box(int length, int width, int height, String color) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Перекрасили коробку в " + color + " цвет.");
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public String getItemIn() {
        return itemIn;
    }

    public void setItemIn(String itemIn) {
        this.itemIn = itemIn;
    }


    public void info() {
        String openInfo = isOpen() ? "открыта" : "закрыта";
        String itemInfo;
        if (getItemIn() == null) {
            itemInfo = "ничего";
        } else {
            itemInfo = getItemIn();
        }
        System.out.println("Размеры коробки:"
                + "\nдлинна - " + getLength() + "\nширина - " + getWidth() + "\nвысота - " + getHeight()
                + "\nЦвет коробки: " + getColor()
                + "\nКоробка открыта/закрыта? - " + openInfo
                + "\nЧто внутри коробки? - " + itemInfo
        );
    }

    public void open() {
        if (!isOpen()) {
            setOpen(true);
            System.out.println("Открыли коробку");
        } else {
            System.out.println("Коробка уже открыта");
        }
    }

    public void close() {
        if (isOpen()) {
            setOpen(false);
            System.out.println("Закрыли коробку");
        } else {
            System.out.println("Коробка уже закрыта");
        }
    }

    public void putItem(String item) {
        if (isOpen()) {
            if (itemIn == null) {
                setItemIn(item);
                System.out.println("В коробку положили: " + getItemIn());
            } else {
                System.out.println("В коробке уже лежит: " + getItemIn()
                        + "\nСначала освободите коробку.");
            }
        } else {
            System.out.println("Сначала откройте коробку.");
        }
    }

    public void getItemOut() {
        if (isOpen()) {
            if (getItemIn() != null) {
                System.out.println("Вытащили из коробки: " + getItemIn() + ". Коробка пуста");
                setItemIn(null);
            } else {
                System.out.println("Из коробки нечего вытаскивать, коробка пуста!");
            }
        } else {
            System.out.println("Сначала откройте коробку.");
        }
    }
}
