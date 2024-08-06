# Проект яндекс Практикум "Автоматизатор тестирования на Java" Спринт 6.



# Технологии проекта

* Java 11
* JUnit 4
* Maven
* Mockito
* Jacoco

### Как запускать:

`mvn clean test`

## Описание проекта:

Необходимо покрыть юнит тестами созданные классы по параметрам.

## Техническое задание

* Класс Lion не должен зависеть от класса Feline. Используй принцип инъекции зависимостей.
* Напиcать моки с помощью Mockito.
* Напиcать тесты на классы Feline, Cat и Lion.
* Необходимо реализовать параметризованные тесты.
* Оцени покрытие с помощью Jacoco: оно должно быть не менее 100% для классов Feline, Cat и Lion.

## Дополнительное задание

1. Необходимо создать класс льва Алекса из мультфильма «Мадагаскар». Он будет наследником обычного льва. Помимо обычных методов у него есть свои:

* getFriends() возвращает список имён его друзей — зебры Марти, бегемотихи Глории и жирафа Мелман.
* getPlaceOfLiving() возвращает место, где он живёт — Нью-Йоркский зоопарк.
* Также нужно переопределить метод getKittens(), потому что у Алекса нет львят. А ещё — написать свой конструктор, так как в классе Lion нет дефолтного конструктора.
* Алекс самец, поэтому в конструктор класса Lion всегда будет передаваться одно и то же значение.

2. Необходимо покрыть тестами созданный класс.