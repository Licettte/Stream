## Задание  SkillBox

Реализуйте метод `findPlanesLeavingInTheNextTwoHours`, который должен вернуть список рейсов, вылетающих в ближайшие два часа.

findPlanesLeavingInTheNextTwoHours(Airport.getInstance())
        

## Задание  Neoflex

## Duplicates

### Постановка задачи

Реализуйте метод `findAllDuplicates`, который должен возвращать список значений, которые повторяются `numberOfDuplicates`
раз.

К примеру:

```java
findAllDuplicates(asList(-1,1,3,2,2,2,5,6,-1,3,6),2);
```

должен возвращать «-1, 3 и 6», поскольку эти значения повторяются «numberOfDuplicates = 2» раз, но не «2», которое
повторяется 3 раза.

……………………………………………………………………………………………………………………………………

```java
findAllDuplicates(asList(-1,-1,2,2,null,null),2);
```

_Пустые значения не учитываются:_

должен вернуть `-1 и 2`.

_Метод не должен возвращать значение  `null` (если передается null, возвращайте пустой список)._
## Задание  Neoflex
## evenAndOddNumbers

### Постановка задачи

Необходимо реализовать метод `findFromCollection` (в классе `EvenAndOddFinder`) принимающий `List<Set<String>> input`,
который должен возвращать `Map<CharacterType, Set<String>>` - `Map` с распределенными сетами, состоящими из строк с
четным и нечетным количеством символов.

Где:

`CharacterType` это перечисление из двух элементов, четное(`EVEN`) и нечетное(`ODD`)

К примеру:

```java
Set<String> set1 = инициализация ...;

Set<String> set2 = инициализация ...;

findFromCollection(Arrays.asList(set1, set2));
```

должен вернуть

```java
{ODD=[сет из строк с нечетным количеством символов], EVEN=[сет из строк с четным количеством символов]}
```
_Метод не должен возвращать значение  `null`. Если передается `null`, возвращайте:_
```java
{ODD=[], EVEN=[]}
```
_Метод может принимать `null` вместо `Set<String>` внутри списка._
_Метод может принимать `null` и `""` элементы._
## Задание  Neoflex

## integerSum

### Постановка задачи

Необходимо реализовать метод `integerSum` (в классе `integerSum.ListOperation`), который должен возвращать сумму целых значений из
списка строк.

К примеру:

```java
integerSum(Arrays.asList("1 больше чем -1","сегодня 1 апреля 2021 года"));
```

должен вернуть

```java
2022
```
## Задание  Neoflex
## maximumElements
### Постановка задачи

Необходимо реализовать метод `getThreeMaximum` (в классе `FindTheMaximumElements`), который должен возвращать 3
максимальных значения BigDecimal из списка строк.

К примеру:

```java
getThreeMaximum(Arrays.asList("2","15","654","11","94","-200","89","-1","0"));
```

должен вернуть 89, 94, 654 - список значений `BigDecimal`

_Метод не должен возвращать значение  `null` (если передается null, возвращайте пустой список)._
_Пустые значения не учитываются._
