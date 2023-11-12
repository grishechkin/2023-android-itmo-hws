# Вёрстка

В рамках задания нужно выбрать любой дизайн формы входа в приложение (можно найти дизайн в интернете, взять с любого приложения или придумать самим) и сделать вёрстку. Оцениваться вёрстка будет по соответствию требованиям. Красивый ui не требуется.

## Для начала проверки задания:

### Не должно быть:

 - Ошибок в xml / коде на java/kotlin
 - Любых ViewGroup внутри ConstrintLayout

 - Вложенности больше 3
   - т.е. TextView в Linear в Linear в Linear ещё допустима
   - т.е. TextView в Linear в Linear в Linear в Linear уже нет
 - Вложенных весов в вёрстке

### Должно быть:

- Поле для логина, в котором указывается почта
- Поле для пароля, должно показывать точки и иметь кнопку для временного показа
- Кнопка "Вход"

## Требования

 - Указание на неверные данные при нажатии на кнопку логина (1.5 балла)
   - Не указан логин (если нет логина) 

   - Не указан пароль (если нет пароля)
   - Неверный логин (когда ввели что-то отличное от почты) или пароль (минимум 6 символов, можно так же придумать свои правила)
   - Появление указаний на неверные данные не должно вызывать изменение положения других вьюшек
 - При нажатии на энтер в поле пароля производить нажатие на кнопку "Вход" (0.5 балла)
 - Разные темы приложения для тёмного и светлого оформления (2 балла)
   - Проверять на устройстве с Android 9+
   - Тема из системы
   - Возможность динамически сменить тему из приложения
 - Перевод (при помощи ресурсов) на другие языки (2 балла)
   - Один из языков должен быть русским или английским
   - Один из языков должен иметь письменность справа налево

### Портретная ориентация

 - Кнопка "Вход" прибита к низу экрана и видна даже при открытой клавиатуре (2 балла)

### Горизонтальная ориентация

 - Кнопка "Вход" располагается справа от полей для ввода, между полями логина и пароля или слева для RtL языков (2 балла)
=======
 - Кнопка "Вход" располагается справа от полей для ввода, между полями логина и пароля или слева для RtL языков (2 балла)
