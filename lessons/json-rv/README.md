## JsonWeather
#### Exercises in writing POJOs that represent json data

Slides: https://goo.gl/a3kUdQ

## Instructions:

Clone the repo:

```git clone https://github.com/ekchang/JsonWeather.git```

Navigate to `JsonWeather/app/src/main/assets`. There are four json files there.

 - `coord` (SIMPLE)
 - `city` (NORMAL)
 - `forecast` (MEDIUM)
 - `five_day_forecast` (WTF)
 
Write the necessary POJOs required to represent each json file. You are encouraged to tackle them in this order.
 
Validate your answers inside `MainWeatherExercise` by running:

```JsonValidator.validate(MyClass.class, SIMPLE);``` 

for each json file.

#### RecyclerView exercise

Make sure your git status is clean. Switch to `git checkout rv_exercise`. Your task is to build a RecyclerView that can display a List of Weather objects.

- Take a look at `assets/five_day_forecast.json` and inspect the kind of data you get from Weather objects
- Create a layout that can display a weather icon, the title, and description of the weather forecast.

![weather-mock](weather_app_mock.png)