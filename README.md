# Практикум SDET: задание UI

## Тестируемый сайт
[GlobalSQA Banking Project Manager](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager)

---

## TS1: Успешное добавление клиента
**Приоритет**: Средний  
**Модуль**: Создание клиента  

### Предусловия
- Открыта стартовая страница функций менеджера

### Шаги
1. Открыть сайт
2. Нажать вкладку "Add Customer"
3. Сгенерировать 10-значный номер (1234567890)
4. Заполнить поле Post Code сгенерированным номером
5. Разбить Post Code на 5 двузначных чисел: 12, 34, 56, 78, 90
6. Преобразовать числа в буквы по схеме:
   - 12 → m
   - 34 → i 
   - 56 → e
   - 78 → a
   - 90 → m
7. Заполнить поле First Name полученным словом "mieam"
8. Перемешать буквы для Last Name: "emima"
9. Нажать кнопку "Add Customer"

### Ожидаемый результат
- Появилось сообщение "Customer added successfully with customer id :{id}"

---

## TS2: Сортировка клиентов по имени
**Приоритет**: Средний  
**Модуль**: Сортировка  

### Предусловия
- В системе существует минимум 2 клиента с разными именами
- Открыта вкладка "Customers"

### Шаги
1. Получить список First Name из таблицы (пример: [A, B, C])
2. Нажать на заголовок First Name (сортировка Z→A)
3. Программно отсортировать исходный список по убыванию
4. Сравнить UI-список с программно отсортированным
5. Повторно нажать на заголовок First Name (сортировка A→Z)
6. Программно отсортировать исходный список по возрастанию
7. Сравнить UI-список с программно отсортированным

### Ожидаемый результат
- При первой сортировке имена отображаются по возрастанию (A→Z)
- При повторной сортировке имена отображаются по убыванию (Z→A)

---

## TS3: Удаление клиента
**Приоритет**: Средний  
**Модуль**: Удаление клиента  

### Предусловия
- В системе существует минимум 3 клиента (пример: Albus, Neville, Voldemort)
- Открыта вкладка "Customers"

### Шаги
1. Получить список всех имен клиентов
2. Вычислить длину каждого имени (пример: 5, 7, 9)
3. Рассчитать среднее арифметическое длин (7)
4. Найти имя с длиной, ближайшей к среднему (Neville)
5. Запомнить Account Number выбранного клиента (пример: 101310141015)
6. Нажать кнопку "Delete" для выбранного клиента

### Ожидаемый результат
- Учетная запись с Account Number 101310141015 больше не отображается в таблице

---

### Тест-кейсы в виде таблицы:

| **Тестируемый сайт**: [GlobalSQA Banking Project Manager](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager)   |           |                  |                                                                                   |     |                                                                                                                                                                                                                |                                                                         |                                                                            |                       |
|--------------------------------------------------------------------------------------------------------------------------------------|-----------|------------------|-----------------------------------------------------------------------------------|-----|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------|----------------------------------------------------------------------------|-----------------------|
| Роль: Менеджер                                                                                                                       |           |                  |                                                                                   |     |                                                                                                                                                                                                                |                                                                         |                                                                            |                       |
| Идентификатор                                                                                                                        | Приоритет | Модуль           | Заглавие                                                                          | Шаг | Описание шага                                                                                                                                                                                                  | Тестовые данные                                                         | Ожидаемый результат                                                        | Фактический результат |
| TS1                                                                                                                                  | Средний   | Создание клиента | Успешное добавление клиента                                                       | 1   | Открыть сайт                                                                                                                                                                                                   | https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager | Открылась страница функций менеджера                                       |                       |
|                                                                                                                                      |           |                  |                                                                                   | 2   | Нажать вкладку "Add Customer"                                                                                                                                                                                |                                                                         | Открылась вкладка с добавлением клиента                                    |                       |
|                                                                                                                                      |           |                  |                                                                                   | 3   | Сгенерировать номер из 10 цифр                                                                                                                                                                                 |                                                                         | 1234567890                                                                 |                       |
|                                                                                                                                      |           |                  |                                                                                   | 4   | Заполнить поле Post Code сненерированным номером                                                                                                                                                               | 1234567890                                                              | В поле Post Code отображается "1234567890"                               |                       |
|                                                                                                                                      |           |                  |                                                                                   | 5   | Разбить Post Code на 5 двузначных чисел                                                                                                                                                                        | 1234567890                                                              | 12, 34, 56, 78, 90                                                         |                       |
|                                                                                                                                      |           |                  |                                                                                   | 6   | Преобразовать числа в буквы и записать в слово:<br>12 → m<br>34 → i<br>56 → e<br>78 → a<br>90 → m                                                                                                              | 12, 34, 56, 78, 90                                                      | mieam                                                                      |                       |
|                                                                                                                                      |           |                  |                                                                                   | 7   | Заполнить поле First Name созданным словом                                                                                                                                                                     | mieam                                                                   | В поле First Name отображается "mieam"                                   |                       |
|                                                                                                                                      |           |                  |                                                                                   | 8   | Перемашать Fisrt Name                                                                                                                                                                                          | mieam                                                                   | emima                                                                      |                       |
|                                                                                                                                      |           |                  |                                                                                   | 9   | Заполнить поле Last Name созданным словом                                                                                                                                                                      | emima                                                                   | В поле Last Name отображается "emima"                                    |                       |
|                                                                                                                                      |           |                  |                                                                                   | 10  | Нажать кнопку "Add Customer"                                                                                                                                                                                 |                                                                         | Появилось сообщение ""Customer added successfully with customer id :{id}"" |                       |
| TS2                                                                                                                                  | Средний   | Сортировка       | Сортировка клиентов по имени                                                      | 1   | Нажать вкладку "Customers"                                                                                                                                                                                   |                                                                         | Открылась вкладка с списком клиентов                                       |                       |
|                                                                                                                                      |           |                  |                                                                                   | 2   | Получить список First Name из таблицы                                                                                                                                                                          |                                                                         | [A, B, C]                                                                  |                       |
|                                                                                                                                      |           |                  |                                                                                   | 3   | 1. Нажать на заголовок First Name (сортировка A→Z)<br>2. Отсортировать исходный список имен * по возрастанию программно (A→Z)<br>3. Сравнить фактический список в UI с программно отсортрованным списком       | [A, B, C]                                                               | Имена отсортированы по возрастанию (A→Z)                                   |                       |
|                                                                                                                                      |           |                  |                                                                                   | 4   | 1. Повторно нажать на заголовок First Name (сортировка Z→A)<br>2. Отсортировать исходный список имен * по убыванию программно (Z→A)<br>3. Сравнить фактический список в UI с программно отсортрованным списком | [C, B, A]                                                               | Имена отсортированы по убыванию (Z→A)                                      |                       |
| TS3                                                                                                                                  | средний   | удаление клиента | Удаление клиента с самой близкой длиной к среднему арифметическому длин всех имен | 1   | Получить список всех имен клиентов из таблицы                                                                                                                                                                  |                                                                         | Albus, Neville, Voldemort                                                  |                       |
|                                                                                                                                      |           |                  |                                                                                   | 2   | Вычислить длину каждого имени                                                                                                                                                                                  | Albus, Neville, Voldemort                                               | 5, 7, 9                                                                    |                       |
|                                                                                                                                      |           |                  |                                                                                   | 3   | Найти среднее арифметическое длин имен                                                                                                                                                                         | 5, 7, 9                                                                 | 7                                                                          |                       |
|                                                                                                                                      |           |                  |                                                                                   | 4   | Найти имя, длина которого ближе всего к среднему                                                                                                                                                               | 7                                                                       |  Neville                                                                   |                       |
|                                                                                                                                      |           |                  |                                                                                   | 5   | Сохранить Account Numbe клиента                                                                                                                                                                                |  Neville                                                                | 101310141015                                                            |                       |
|                                                                                                                                      |           |                  |                                                                                   | 6   | Нажать кнопку "Delete" напротив найденного клиента                                                                                                                                                               | 101310141015                                                         | Account Number клиента больше не отображается.<br>                         |                       |
