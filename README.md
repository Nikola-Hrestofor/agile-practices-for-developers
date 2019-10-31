# Командный тренинг «Культура, процесс и инженерные практики Agile в продуктовой разработке»
_Как поменять себя и процесс, чтобы втаскивать успешные продукты в большой компании._

24 ак. часа, 18 астр. часов.
10.2019, ekr@bk.ru,
Wifi: ekr@bk.ru/P@ssw0rd

![Председатель правления Райффайзенбанка видит банк будущего как сеть автономных предпринимательских команд.](https://github.com/eugene-krivosheyev/agile-practices-for-developers/blob/master/vision.png?raw=true)

# Цели тренинга – участникам:
- [ ] *понять*
- [ ] *попробовать своими руками*
- [ ] *принять*
- [ ] *видеть первые шаги внедрения*
## ключевых процессных и инженерных практик:
### Продуктовая бизнес-модель
- [x] *Ценности* продуктовой разработки
- [x] *Видение продукта*
### Культура и процесс
- [x] *Производственная культура* и осознание личной и командной культур
- [x] *Коллективная ответственность за результат* спринта
- [x] Желаемые *принципы и метрики производства* в продуктовой разработке
- [x] Принцип *Just in Time поставок* и практика *Time Boxing*
- [x] *Кросс-функциональность* команды + T-shaping
- [x] PBI *DoD*
- [ ] Командное *планирование спринта*
- [ ] Командный *Sprint review*
- [ ] Как померить *метрики*, характеризующие качество, через rework
- [ ] *Информационные радиаторы*
- [ ] *Парная разработка* в формате Driver + Navigator
### Работа с требованиями
- [ ] Понимание ценности в формате *User Story*
- [ ] *Декомпозиция* пользовательских историй
- [ ] Ключевые внешние *NFRs*
### Инженерные практики обеспечения внешнего качества
- [ ] *ATDD*, *Front-end tests*, *BDD*
- [ ] *Автоматизированное тестирование* и базовые техники *тест-дизайна* и *анализа покрытия*
- [ ] *Системные, интеграционные и модульные тесты* и изоляция окружения с помощью *тест-дублеров*
- [ ] *Нагрузочное тестирование*
### Инженерные практики обеспечения внутреннего качества
- [ ] *Внутренняя модель качества* из обоснованных внутренних NFRs
- [ ] *TDD*
- [ ] *Trunk based development*, *Feature Toggling*
- [ ] Принципы принятия *архитектурных решений и микро-дизайна* в условиях неопределенности и time boxing
- [ ] *Рефакторинг*, *внутреннее качество продукта* и *технический долг*
- [ ] *Code Review*
### Инженерные практики ускорения поставок
- [ ] *Автоматическая сборки* релиза
- [ ] *CI*
- [ ] *Статический анализ кода*
- [ ] *Версионирование схемы БД*
- [ ] *CD*
- [ ] *Культура DevOps* и *Continouos Feedback*
- [ ] *Infrastructure as a Code*: провиженинг стендов
- [ ] *Контейнеризация*
- [ ] *SRE* и мониторинг *системных- и продуктовых метрик*

# Программа
## 1. Зачем мы собрались? (0.5 часа всего / _из них_ 0.25 часа практики и обсуждений)
- [x] Знакомство с тренером
- [x] Договоренности
- [x] Выбор PO и разбивка по командам по "бразильской системе" в соотвествии с принципами Scrum
- [ ] Самостоятельный обзор тренинга и парковка проблем участников от команд
- [ ] Раздача флешек с дистрибутивами и копирование на машины разработчиков
- [x] Создана и запушена ветка этого потока

## Что такое продуктовый бизнес? (1/0.5)
- [x] Как вы определяете бизнес по разработке цифровых продуктов?
- [x] Важнейшие особенности сегодня
- Снижение лояльности к брендам
- В запутанных системах бизнес-рынок-клиенты нельзя ничего предсказать
- [x] Подходы к неопределенности по модели Cynefin
- [x] Ключевые метрики продуктового бизнеса
### Декларируем наши команды на разделение бизнес-ценностей
- [x] Как вы поймете, что сделали бизнесу хорошо? Манифест команды.
- [x] На какие trade-offs придется пойти?

## Что продуктовый бизнес ждет от _производственной культуры_ (1/0.5)
- [x] Понятие культуры компании
- [x] Роль производственной культуры компании
- [x] Групповая практика на определение производственной культуры по Шнайдеру
### Декларируем наши команды на соответствие критериям
- [x] Как вы "продадите" свою команду бизнесу, что бы выбрали именно вас? 
- [x] Манифест команды + trade-offs
```
Мы поможем двигать продукт вперёд по бизнес-метрикам к успеху 
за счёт быстрых эффективных проверок новых гипотез и анализа текущего использования. 
Мы обеспечим качество продукта в условиях непрерывного потока изменений 
за счёт осмысленного применения современных инженерных практик. 
Наше преимущество - быстрая реакция на любые изменения, 
это удаётся нам за счёт сознательного развития высокоадаптивной внутренней культуры. 
```

## Что продуктовый бизнес ждет от производственной системы (1.5/0.5)
- [x] Подход SLA к балансу бизнес-метрик: scope, time, quality, price, ?. Time-boxing.
- [x] Подход к запасам. JIT. Запасы в IT-разработке.
- [x] Подход к rework. Измерение внешнего и внутреннего качества через метрику rework
- [x] Подход к структуре команд: feature teams vs matrix. Свойства feature team
- [x] Подход к формализации/самоуправлению
- [x] Подход к описанию процесса: процедурный/декларативный. Практика PBI DoD
- [x] Подход к ответственности
- [x] Подход к коммуникациям
- [x] Подход к экспертизе: фокусировка или кросс-функциональность. Практика Star Map.
### Декларируем наши команды на соответствие критериям
- [x] Star Map
- [x] Манифест команды + trade-offs
- [x] Self-check: получился командный rugby scrum spring или водопадик-like sprint?

## Что продуктовый бизнес ждет от внутрикомандного процесса (1/0.5)
- [ ] Подход к внутреннему качеству системы. Сервис vs Проект.
- [ ] Подход к обоснованности архитектуры через системное мышление: как обосновать инженерные решения (принятие trade-off и специализация). Демо обоснованности микро-дизайна
- [ ] Подход к эволюции архитектуры: upfront/эволюционность+инкрементальность. Принципы Lean: откладывай@делегируй
### Проектируем желаемый продуктовым бизнесом процесс
- [x] PBI DoD как артефакт внутренней модели качества

## Sprint PRODDEV-01: продуктовая модель (1/0.5)
- [x] Как сформулировать гипотезу продуктовой бизнес-модели? Формальные/неформальные подходы
- [x] На какие ключевые вопросы должна отвечать продуктовая гипотеза?
- [x] Зачем нужна metaphor/vision?
### Формулируем гипотезы продуктовой бизнес-модели
#### Даны
- [x] Структура Lean Canvas
- [x] Выбранный PO
#### Когда команды проведут
- [x] Дизайн продуктовой гипотезы в формате Lean Canvas
- [x] Фокусировка с помощью vision
- [x] Меппинг на архитектурные риски
- [x] Scope решения в терминах epics
#### Тогда на дебрифе
- [x] Кросс-ревью метафор
- [x] Кросс-ревью продуктовых моделей
- [x] Выбор родуктовой гипотезы для реализации в рабочей системе
- [x] PO сформирует итоговые vision и epics
#### Ретро

---

## Ретроспектива по вчерашнему дню (0.5/0.5)
- [x] Закрытые цели тренинга, burndown
- [x] Персональные инсайты
- [x] 𝚫+
- [x] Take-away actions

## Sprint PRODDEV-02: беклог как выражение продуктовой стратегии (1/0.5)
- [x] Что такое беклог? Какие ключевые свойства?
- [x] Элементы беклога – единица планирования и результ процесса коммуникации
- [x] Как происходит управление элементами беклога? Порядок внесения новых элементов, уточнение и жизненный цикл.
- [x] Элементы беклога: Themes, Epics, User Stories.
- [x] Как задавать NFRs: свойства историй и антипаттерны: системные/инфраструктурные stories
- [x] Почему важно декомпозировать истории? Как обеспечить "тонкую нарезку" инкрементов?
### Первичный дизайн беклога
#### Даны
- [ ] Практика [User Story Mapping](https://medium.com/@priyank.it/user-story-mapping-product-backlog-creation-7ea9a54f7f0e)
- [ ] [http://storiesonboard.com/](http://storiesonboard.com/)
- [ ] Практики декомпозиции историй
#### Когда
- [ ] Команды проведут USM
- [ ] Получат беклог
#### Тогда на дебрифе
- [ ] Команды применяют BPI DoD для верхушки беклога
#### Ретро

## Переход к разработке: дизайн процесса через выбор практик (1/0.5)
- [ ] Современное отношение к дизайну процессов: от императивности и формальности к декларативности и гибкости
- [ ] Выбор практик как process design core
- [ ] Практика Pair Programming
- [ ] Практика TDD
- [ ] Практика [информационных радиаторов](http://84.201.134.115:8085/telemetry.action?filter=project&projectKey=DBO)
- [ ] Практика Simple Design
- [ ] Практика Refactoring
- [ ] [Как DevOps помогает продуктовой разработке](https://paper.dropbox.com/doc/Delivery-Pipeline-ci-cd-devops--AbaLMZphhnvfm0spHme2SHkYAg-OBLCVRSkMek24U7IXIHbq)
### Проектируем модель зрелости процесса через практики
#### Даны уровни зрелости процесса с т.з. продуктового бизнеса
1. Уровень: хоть как-то получаем хоть какой-то результат на prod
1. Уровень: управляем внешним качеством
1. Уровень: управляем внутренним качеством
1. Уровень: управляем TTM
1. Уровень: управляем успехом продукта
#### Когда
- [ ] Команды расставят практики из целей тренинга по уровням (+неуказанные)
#### Тогда на дебрифе
- [ ] Кросс-ревью командных моделей зрелости
- [ ] Мерж в единый процессный беклог: долг по внедрению практик для дальнейшей проработки в рамках тренинга
- [ ] BPI DoD
#### Ретро
- [ ] Пробуем на практике в _экстремальном формате_ XP

## Sprint DEV-00 (0.5/0)
- [ ] Обзор конвейера CI/CD через инфраструктуру IaaC
- [ ] Обзор архитектуры заготовки приложения
- [ ] Демо поставки изменения по конвейеру CI/CD

## Sprint DEV-01 (1.5/1)
- [ ] Что такое ATDD и BDD
- [ ] Введение в Cucumber
- [ ] Базовые техники тест-дизайна: структура системного теста
- [ ] Введение в Selenium
### Даны
- [ ] Обзор системы автосборки, CI и анализа кода
- [ ] Беклог
- [ ] Legacy codebase и инфраструктура
### Когда
- [ ] Команды проводят Sprint Planning
- [ ] Команды проводят декомпозицию User Stories
- [ ] Команды фиксируют NFRs
- [ ] Команды проводят спринт
- [ ] Парная работа в формате Driver + Navigator
- [ ] Помощь тренера по решению блокеров
### Тогда
- [ ] Sprint Review
- [ ] Добавление технического долга в беклог
- [ ] Retro с учетом процессных метрик (ttm, rework, дефекты, трудоемкость)

## Sprint DEV-02 (1.5/1)
- [ ] Введение в практику TDD для микро-дизайна
- [ ] Pair Programming и TDD как _technical feedback practices_
- [ ] Базовые техники тест-дизайна: структура интеграционных тестов
- [ ] Типы тест-дублеров для изоляции окружения
- [ ] Рассчет тестового покрытия
### Даны
- [ ] Включение системы расчета покрытия в систему автосборки и CI
- [ ] Беклог
- [ ] Legacy codebase и инфраструктура
### Когда
- [ ] Команды проводят Sprint Planning
- [ ] Команды проводят декомпозицию User Stories
- [ ] Команды фиксируют NFRs
- [ ] Команды проводят спринт
- [ ] Парная работа в формате Driver + Navigator
- [ ] Помощь тренера по решению блокеров
### Тогда
- [ ] Sprint Review
- [ ] Добавление технического долга в беклог
- [ ] Retro с учетом процессных метрик (ttm, rework, дефекты, трудоемкость)

## Sprint DEV-03 (1.5/1)
- [ ] Совместная работа с единой кодовой базой: шаблоны владения по Эвансу
- [ ] Совместная работа с единой кодовой базой: шаблоны Trunk based development + Feature Toggling
- [ ] Практика Code Review
- [ ] Практика автоматизированного code review со статическими анализаторами в CI
- [ ] Практика расчета мутационного покрытия в системе автосборки
### Даны
- [ ] Беклог
- [ ] Legacy codebase и инфраструктура
- [ ] Настроен Quality Gate в Sonar
### Когда
- [ ] Команды проводят Sprint Planning
- [ ] Команды проводят декомпозицию User Stories
- [ ] Команды фиксируют NFRs
- [ ] Команды проводят спринт
- [ ] Парная работа в формате Driver + Navigator
- [ ] Помощь тренера по решению блокеров
### Тогда
- [ ] Sprint Review
- [ ] Добавление технического долга в беклог
- [ ] Retro с учетом процессных метрик (ttm, rework, дефекты, трудоемкость)

---

## Ретроспектива по вчерашнему дню (0.5/0.5)
- [ ] Закрытые цели тренинга, burndown
- [ ] Персональные инсайты
- [ ] 𝚫+
- [ ] Take-away actions

## Sprint DEV-04 (1.5/1)
- [ ] Метафора технического долга как _инертности_ пордукта
- [ ] Сервис vs Проект
- [ ] Внутренняя модель качества из обоснованных внутренних NFRs
- [ ] Принципы принятия архитектурных решений и микро-дизайна в условиях неопределенности и time boxing. Принципы Lean
- [ ] Технический долг и рефакторинг
- [ ] Simple Design и Refactoring как _technical design practices_
### Даны
- [ ] Включение статического анализа в инфраструктуру CI
- [ ] Беклог
- [ ] Legacy codebase и инфраструктура
### Когда
- [ ] Команды проводят Sprint Planning
- [ ] Команды проводят декомпозицию User Stories
- [ ] Команды фиксируют NFRs
- [ ] Команды проводят спринт
- [ ] Парная работа в формате Driver + Navigator
- [ ] Помощь тренера по решению блокеров
### Тогда
- [ ] Sprint Review
- [ ] Добавление технического долга в беклог
- [ ] Retro с учетом процессных метрик (ttm, rework, дефекты, трудоемкость)

## Sprint DEV-05 (1.5/1)
- [ ] Переход к CD
- [ ] Включение инструмента версионирования схемы БД в инфраструктуру CD
- [ ] Культура DevOps и практика Continuous Feedback
- [ ] Практика SRE и мониторинг системных- и продуктовых метрик
### Даны
- [ ] Беклог
- [ ] Legacy codebase и инфраструктура
### Когда
- [ ] Команды проводят Sprint Planning
- [ ] Команды проводят декомпозицию User Stories
- [ ] Команды фиксируют NFRs
- [ ] Команды проводят спринт
- [ ] Парная работа в формате Driver + Navigator
- [ ] Помощь тренера по решению блокеров
### Тогда
- [ ] Sprint Review
- [ ] Добавление технического долга в беклог
- [ ] Retro с учетом процессных метрик (ttm, rework, дефекты, трудоемкость)

## Sprint DEV-06 (1.5/1)
- [ ] Контейнеризация стендов тестового и производственного окружения
- [ ] Infrastructure as a Code: провиженинг физических и контейнеризованных стендов
- [ ] Введение в нагрузочное тестирование и профайлинг
### Даны
- [ ] Беклог
- [ ] Legacy codebase и инфраструктура
### Когда
- [ ] Команды проводят Sprint Planning
- [ ] Команды проводят декомпозицию User Stories
- [ ] Команды фиксируют NFRs
- [ ] Команды проводят спринт
- [ ] Парная работа в формате Driver + Navigator
- [ ] Помощь тренера по решению блокеров
### Тогда
- [ ] Sprint Review
- [ ] Добавление технического долга в беклог
- [ ] Retro с учетом процессных метрик (ttm, rework, дефекты, трудоемкость)

## Финальная ретроспектива (0.5/0.5)
### Даны
- Полученные на тренинге знания
- Полученные на тренинге практический опыт
- Полученные на тренинге артефакты
### Когда
- [ ] Кросс-командная ретроспектива тренинга
### Тогда
- [ ] Закрытые цели тренинга, burndown
- [ ] Инсайты
- [ ] 𝚫+
- [ ] *Обоснованные* next actions на производстве
### Заключение
- Инертность системы для продуктового бизнеса
- [ ] _technical design practices_
- [ ] _technical feedback practices_
