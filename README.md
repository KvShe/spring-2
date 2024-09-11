Электронная очередь

1. Класс `TicketNumberGenerator` - bean (singleton), у которого есть метод `createNewNumber()`
    - Метод `createNewNumber()` возвращает строки вида "Ticket #X", где X - UUID `UUID.randomUUID.toString()`
2. Создать класс Ticket (not bean) с полями:
    - `String number` - ticket number
    - `LocalDateTime createdAt` - дата создания
3. Класс `Scoreboard` - bean (singleton), у которого есть поле `ticketNumberGenerator` и метод `newTicket()`, который создаёт
   объект класса `Ticket` со значениями полей:
    - `number` - результат вызова `TicketNumberGenerator()`
    - `createdAt` - `LocalDataTime.now()`
