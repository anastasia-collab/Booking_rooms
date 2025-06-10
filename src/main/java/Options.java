public enum Options {
    ALL_ROOMS(1, "Показать все комнаты ", ()-> System.out.println("Опция 1")),
    ROOMS_FOR_BOOKING(2, "Показать свободные для бронирования комнаты ", ()-> System.out.println("Опция 2")),
    BOOKING(3, "Забронировать комнату ", ()-> System.out.println("Опция 3")),
    SHOW_ALL_BOOKING(4, "Показать все забронированные комнаты", ()-> System.out.println("Опция 4")),
    CANCEL_BOOKING(5, "Отменить бронирование", ()-> System.out.println("Опция 5")),
    EXIT(0, "Выход из приложения ", ()-> System.out.println("Опция 0"));

    private final int number;
    private final String description;
    private final Runnable runnable;

    Options(int number, String description, Runnable runnable){
        this.number = number;
        this.description = description;
        this.runnable = runnable;
    }
    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public static Options getByNumber(int number){
        for(Options option : values()){
            if(option.getNumber()==number){
                return option;
            }
        }
        throw new IllegalArgumentException("Неверный номер операции");
    }
}
//[1] Показать все номера
//
//[2] Показать доступные номера
//
//[3] Забронировать номер
//
//[4] Показать все бронирования
//
//[5] Отменить бронирование
//
//[0] Выход