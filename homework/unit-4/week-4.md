# Android Neko Clone

### Project overview

The purpose of this project is to create an [Android Neko Easter Egg](http://www.pocket-lint.com/news/138312-how-to-access-android-n-nougat-easter-egg) style app. Feel free to substitute cats for another creature you prefer (e.g. dogs, aliens, pokemon).

![android neko easter e](http://cdn.pocket-lint.com/r/s/650x/assets/images/phpkcnwps.jpg)

### Requirements

* Use `IntentService`, `BroadcastReceiver` and `AlarmManager` to display a notification to the user than a new cat has arrived. Every time a new cat arrives, add it to the user's collection (SQLite database).
* The app must have at least one `Activity` -- more if it makes sense. The activity should display all of the cats that have been collected so far in a grid-layout [RecyclerView](https://developer.android.com/reference/android/support/v7/widget/GridLayoutManager.html).
    * Each `RecyclerView` item should include an icon/image (try a google search for [open source icon packs](http://www.flaticon.com/free-icons/cat_1667)) of the cat and the cat's name.
    * Clicking on the item allows the user to edit the cat's name. The edited name is then stored to the database and displayed whenever the user opens the app in the future.
    * Include at least 5 unique cats that can be collected, more if you'd like.
* Use [Cupboard](https://guides.codepath.com/android/Easier-SQL-with-Cupboard) to store the collected animals in a SQLite database. You may find it helpful to review the [Intro to Databases](../intro-to-databases) lesson from earlier this unit.
* Use [Picasso](https://github.com/square/picasso) to load and display images.
* The app should look great in both landscape and portrait modes.
* The app should not crash or hang during normal use.
* The code should be semantically clean, well organized and adhere to the Google Code Style Guide.
* Each team must use a Trello board to plan and track work on this project. Please submit a link to your team's Trello board by the end of class today using the meeting form below.

### Bonus features
* Utilize OOP concepts to include additional classes of creatures extending from a common parent class. Each creature sub-class should contain unique fields that are displayed (e.g. `numberOfLegs`, `favoriteFood`, etc...).
* Implement a details screen that opens up when the `RecyclerView` item is clicked. The details screen allows the user to view and edit additional data for the selected creature.
* Implement a "treats" screen where the user can select treats that cause creatures to arrive more frequently.

### Submission

Students will work **in teams** to complete this project over the next **two weeks**. All code should be completed, pushed and merged by **Saturday 12/17 at 9pm**. Check Slack for the submission form link.

### Meeting Agenda

* Review project requirements as a team.
* Nominate a tech lead - preference goes to members who haven't served yet as leads on their previous teams.
* Define what creature you will be displaying in your project and any other details relevant to the features you're completing.
* Create a project Trello board using the [AC 3.3 Sprint Template](https://trello.com/b/pz8oJNK2/ac-3-3-sprint-template). Make sure both team members have edit access to the board and that the visibility is set to 'Public'.
* Discuss and decide on feature cards for the project and add them to the Trello board backlog. Give each feature a priority and an estimate and rank them by priority in the backlog.
* Assign each feature to a team member. Refer to the estimation values to balance features equally across the team, keeping priorities, blockers and related tasks in mind.
* Decide when and where your team will meet throughout the week for in-person working sessions and pair programming.
* Decide on a time for a daily (Sat - Weds) stand-up, and decide whether the stand-up will be held in person or on Slack.
* Create a team Slack channel.
* Create a Github repo and add all team members as collaborators.
* Create a new Android Studio project and push it to the repo.
* Use any additional time to start researching and/or implementing features.
* [Submit your meeting notes and a link to your Trello board and Github repo by the end of class today](https://goo.gl/forms/axiF0IdMPt0sESDJ3).
